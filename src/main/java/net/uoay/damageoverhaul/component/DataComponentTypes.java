package net.uoay.damageoverhaul.component;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.uoay.damageoverhaul.component.type.DamageDetailsComponent;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

public class DataComponentTypes {
    public static final ComponentType<DamageDetailsComponent> DAMAGE_DETAILS = Registry.register(
        Registries.DATA_COMPONENT_TYPE,
        Identifier.of(MOD_ID, "damage_details"),
        ComponentType.<DamageDetailsComponent>builder().codec(DamageDetailsComponent.CODEC).build()
    );

    public static void initialize() {

    }
}
