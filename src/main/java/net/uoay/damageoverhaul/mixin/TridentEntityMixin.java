package net.uoay.damageoverhaul.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.uoay.damageoverhaul.Utils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(TridentEntity.class)
public abstract class TridentEntityMixin {
    @Shadow
    public abstract ItemStack getWeaponStack();

    @ModifyArg(
        method = "onEntityHit",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;sidedDamage(Lnet/minecraft/entity/damage/DamageSource;F)Z"),
        index = 1
    )
    private float applyDamageAbsorption(
        float amount,
        @Local(ordinal = 0) Entity target
    ) {
        if (target instanceof LivingEntity livingEntity) {
            return Utils.applyDamageAbsorption(amount, this.getWeaponStack(), livingEntity);
        }
        return amount;
    }
}
