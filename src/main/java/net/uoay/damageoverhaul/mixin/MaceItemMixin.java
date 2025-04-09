package net.uoay.damageoverhaul.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.MaceItem;
import net.uoay.damageoverhaul.component.DataComponentTypes;
import net.uoay.damageoverhaul.component.type.DamageDetailsComponents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MaceItem.class)
public abstract class MaceItemMixin {
    @ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item;<init>(Lnet/minecraft/item/Item$Settings;)V"))
    private static Item.Settings addDamageDetailsComponent(Item.Settings settings) {
        return settings
            .component(DataComponentTypes.DAMAGE_DETAILS, DamageDetailsComponents.STRIKE);
    }
}
