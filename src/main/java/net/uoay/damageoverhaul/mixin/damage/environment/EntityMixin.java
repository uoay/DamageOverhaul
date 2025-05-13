package net.uoay.damageoverhaul.mixin.damage.environment;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.uoay.damageoverhaul.DamageOverhaul;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @ModifyArg(
        method = "baseTick",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"
        ),
        index = 2
    )
    private float modifyFireDamage(float amount) {
        if ((Object) this instanceof LivingEntity livingEntity) {
            var modifier = 1.0 - livingEntity.getAttributeValue(EntityAttributes.FIRE_ABSORPTION);
            return (float) (DamageOverhaul.CONFIG.fire_damage * modifier);
        }
        return DamageOverhaul.CONFIG.fire_damage;
    }

    @ModifyArg(
        method = "setOnFireFromLava",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"
        ),
        index = 2
    )
    private float modifyLavaDamage(float amount) {
        if ((Object) this instanceof LivingEntity livingEntity) {
            var modifier = 1.0 - livingEntity.getAttributeValue(EntityAttributes.FIRE_ABSORPTION);
            return (float) (DamageOverhaul.CONFIG.lava_damage * modifier);
        }
        return DamageOverhaul.CONFIG.lava_damage;
    }

    @ModifyArg(
        method = "onStruckByLightning",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"
        ),
        index = 2
    )
    private float modifyLightningDamage(float amount) {
        if ((Object) this instanceof LivingEntity livingEntity) {
            var modifier = 1.0 - livingEntity.getAttributeValue(EntityAttributes.LIGHTNING_ABSORPTION);
            return (float) (DamageOverhaul.CONFIG.lightning_damage * modifier);
        }
        return DamageOverhaul.CONFIG.lightning_damage;
    }
}
