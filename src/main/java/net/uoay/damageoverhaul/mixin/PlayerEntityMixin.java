package net.uoay.damageoverhaul.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.uoay.damageoverhaul.Utils;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
    @Shadow
    public abstract @NotNull ItemStack getWeaponStack();

    @ModifyArg(
        method = "attack",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;sidedDamage(Lnet/minecraft/entity/damage/DamageSource;F)Z"),
        index = 1
    )
    private float applyDamageAbsorption(
        float amount,
        @Local(argsOnly = true) Entity target
    ) {
        if (target instanceof LivingEntity livingTarget) {
            amount = Utils.applyDamageAbsorption(amount, getWeaponStack(), livingTarget);
        }
        return amount;
    }
}
