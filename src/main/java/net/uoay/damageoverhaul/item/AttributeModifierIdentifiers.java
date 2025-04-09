package net.uoay.damageoverhaul.item;

import net.minecraft.util.Identifier;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

public class AttributeModifierIdentifiers {
    public static final Identifier SLASH_ABSORPTION = of("slash_absorption");
    public static final Identifier STRIKE_ABSORPTION = of("strike_absorption");
    public static final Identifier THRUST_ABSORPTION = of("thrust_absorption");

    private static Identifier of(String path) {
        return Identifier.of(MOD_ID, "attribute.modifier." + path);
    }
}
