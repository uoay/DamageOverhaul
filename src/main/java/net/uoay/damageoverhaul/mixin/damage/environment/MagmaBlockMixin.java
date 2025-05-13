package net.uoay.damageoverhaul.mixin.damage.environment;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.block.MagmaBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.uoay.damageoverhaul.DamageOverhaul;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MagmaBlock.class)
public abstract class MagmaBlockMixin {
    @ModifyArg(
        method = "onSteppedOn",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;serverDamage(Lnet/minecraft/entity/damage/DamageSource;F)V"),
        index = 1
    )
    private float modifySteppedOnDamage(float amount, @Local(argsOnly = true) Entity entity) {
        var modifier = 1.0 - ((LivingEntity) entity).getAttributeValue(EntityAttributes.FIRE_ABSORPTION);
        return (float) (DamageOverhaul.CONFIG.magma_block_damage * modifier);
    }
}
