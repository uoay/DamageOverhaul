package net.uoay.damageoverhaul.mixin.attribute;

import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.mob.ZombieEntity;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.uoay.damageoverhaul.DamageOverhaul.CONFIG;

@Mixin(ZombieEntity.class)
public abstract class ZombieEntityMixin {

    @Inject(method = "createZombieAttributes", at = @At("RETURN"))
    private static void addAttributes(
        CallbackInfoReturnable<DefaultAttributeContainer.Builder> info
    ) {
        info
            .getReturnValue()
            .add(EntityAttributes.SLASH_ABSORPTION, CONFIG.zombie.slash)
            .add(EntityAttributes.STRIKE_ABSORPTION, CONFIG.zombie.strike)
            .add(EntityAttributes.THRUST_ABSORPTION, CONFIG.zombie.thrust);
    }
}
