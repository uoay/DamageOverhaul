package net.uoay.damageoverhaul;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

public class PlainTranslationKeys {
    public static final String DAMAGE_DETAILS = of("damage_details");
    public static final String SLASH_PROPORTION = of("slash_proportion");
    public static final String STRIKE_PROPORTION = of("strike_proportion");
    public static final String THRUST_PROPORTION = of("thrust_proportion");

    private static String of(String key) {
        return MOD_ID + "." + key;
    }
}
