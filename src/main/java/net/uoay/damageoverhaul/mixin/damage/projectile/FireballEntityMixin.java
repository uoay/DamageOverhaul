package net.uoay.damageoverhaul.mixin.damage.projectile;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.uoay.damageoverhaul.DamageOverhaul;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(FireballEntity.class)
public abstract class FireballEntityMixin {
    @ModifyArg(
        method = "onEntityHit",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"),
        index = 2
    )
    public float modifyFireDamage(float amount, @Local(ordinal = 0) Entity target) {
        if (target instanceof LivingEntity livingEntity) {
            var modifier = 1.0 - livingEntity.getAttributeValue(EntityAttributes.FIRE_ABSORPTION);
            return (float) (DamageOverhaul.CONFIG.fireball_damage * modifier);
        }
        return DamageOverhaul.CONFIG.fireball_damage;
    }
}
