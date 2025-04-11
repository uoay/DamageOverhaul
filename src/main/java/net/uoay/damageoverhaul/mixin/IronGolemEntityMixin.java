package net.uoay.damageoverhaul.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.uoay.damageoverhaul.Utils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(IronGolemEntity.class)
public class IronGolemEntityMixin {
    @ModifyArg(
        method = "tryAttack",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"),
        index = 2
    )
    private float modifyCausedDamage(float amount, @Local(argsOnly = true) Entity target) {
        if (target instanceof LivingEntity livingTarget) {
            amount = Utils.applyDamageAbsorption(
                amount,
                (IronGolemEntity) (Object) this,
                livingTarget
            );
        }
        return amount;
    }
}
