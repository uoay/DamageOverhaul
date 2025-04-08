package net.uoay.damageoverhaul.entity.attribute;

import net.minecraft.util.Identifier;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

public class EntityAttributeIdentifiers {
    public static final Identifier SLASH_ABSORPTION = of("slash_absorption");

    private static Identifier of(String path) {
        return Identifier.of(MOD_ID, "attribute." + path);
    }
}
