package net.uoay.damageoverhaul.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(method = "createLivingAttributes", at = @At("RETURN"))
    private static void addAttributes(
        CallbackInfoReturnable<DefaultAttributeContainer.Builder> info
    ) {
        info
            .getReturnValue()
            .add(EntityAttributes.SLASH_ABSORPTION, -0.15)
            .add(EntityAttributes.STRIKE_ABSORPTION, -0.15);
    }
}
