package net.uoay.damageoverhaul.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.component.ComponentType;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.uoay.damageoverhaul.component.DataComponentTypes;
import net.uoay.damageoverhaul.component.type.DamageDetailsComponents;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;
import net.uoay.damageoverhaul.item.AttributeModifierIdentifiers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.Settings.class)
public abstract class ItemMixin {
    @Shadow
    public abstract <T> Item.Settings component(ComponentType<T> type, T value);

    @Inject(method = "sword", at = @At("HEAD"))
    public void addComponentToSword(
        ToolMaterial material,
        float attackDamage,
        float attackSpeed,
        CallbackInfoReturnable<Item.Settings> info
    ) {
        this.component(
            DataComponentTypes.DAMAGE_DETAILS,
            DamageDetailsComponents.SLASH
        );
    }

    @ModifyArg(
        method = "armor",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;attributeModifiers(Lnet/minecraft/component/type/AttributeModifiersComponent;)Lnet/minecraft/item/Item$Settings;")
    )
    public AttributeModifiersComponent addAttributeModifierToArmor(
        AttributeModifiersComponent attributeModifiersComponent,
        @Local(argsOnly = true) ArmorMaterial material,
        @Local(argsOnly = true) EquipmentType type
    ) {
        var equipmentSlot = AttributeModifierSlot.forEquipmentSlot(type.getEquipmentSlot());
        return attributeModifiersComponent
            .with(
                EntityAttributes.SLASH_ABSORPTION,
                new EntityAttributeModifier(
                    AttributeModifierIdentifiers.SLASH_ABSORPTION,
                    material.defense().getOrDefault(type, 0) * 0.01,
                    EntityAttributeModifier.Operation.ADD_VALUE
                ),
                equipmentSlot
            )
            .with(
                EntityAttributes.STRIKE_ABSORPTION,
                new EntityAttributeModifier(
                    AttributeModifierIdentifiers.STRIKE_ABSORPTION,
                    material.defense().getOrDefault(type, 0) * 0.01,
                    EntityAttributeModifier.Operation.ADD_VALUE
                ),
                equipmentSlot
            )
            .with(
                EntityAttributes.THRUST_ABSORPTION,
                new EntityAttributeModifier(
                    AttributeModifierIdentifiers.THRUST_ABSORPTION,
                    material.defense().getOrDefault(type, 0) * 0.01,
                    EntityAttributeModifier.Operation.ADD_VALUE
                ),
                equipmentSlot
            );
    }
}
