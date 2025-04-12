package net.uoay.damageoverhaul;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

public class PlainTranslationKeys {
    public static final String DAMAGE_DETAILS = of("damage_details");
    public static final String SLASH_PROPORTION = of("slash_proportion");
    public static final String STRIKE_PROPORTION = of("strike_proportion");
    public static final String THRUST_PROPORTION = of("thrust_proportion");

    // config translation keys
    public static final String CONFIG_TITLE = "text.autoconfig." + MOD_ID +".title";
    public static final String CATEGORY_COMMON = ofCategory("common");
    public static final String OPTION_DISPLAY_DAMAGE_PROPORTION = ofOption(
        "displayDamageProportion"
    );
    public static final String CATEGORY_DAMAGE_ABSORPTION = ofCategory("damage_absorption");
    public static final String OPTION_ZOMBIE = ofOption("zombie");
    public static final String OPTION_ZOMBIE_SLASH = ofOption("zombie.slash");
    public static final String OPTION_ZOMBIE_STRIKE = ofOption("zombie.strike");
    public static final String OPTION_ZOMBIE_THRUST = ofOption("zombie.thrust");

    private static String of(String path) {
        return MOD_ID + "." + path;
    }

    public static String ofOption(String path) {
        return "text.autoconfig." + MOD_ID + ".option." + path;
    }

    public static String ofCategory(String path) {
        return "text.autoconfig." + MOD_ID +".category." + path;
    }
}
