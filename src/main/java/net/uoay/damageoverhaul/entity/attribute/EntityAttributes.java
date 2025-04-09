package net.uoay.damageoverhaul.entity.attribute;


import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class EntityAttributes {
    public static final RegistryEntry<EntityAttribute> SLASH_ABSORPTION = register(
        EntityAttributeIdentifiers.SLASH_ABSORPTION,
        new ClampedEntityAttribute(
            EntityAttributeIdentifiers.SLASH_ABSORPTION.toTranslationKey(),
            0.0, -5.0, 1.0
        ).setTracked(true)
    );
    public static final RegistryEntry<EntityAttribute> STRIKE_ABSORPTION = register(
        EntityAttributeIdentifiers.STRIKE_ABSORPTION,
        new ClampedEntityAttribute(
            EntityAttributeIdentifiers.STRIKE_ABSORPTION.toTranslationKey(),
            0.0, -5.0, 1.0
        ).setTracked(true)
    );

    private static RegistryEntry<EntityAttribute> register(
        Identifier id,
        EntityAttribute attribute
    ) {
        return Registry.registerReference(Registries.ATTRIBUTE, id, attribute);
    }

    public static void initialize() {}
}
