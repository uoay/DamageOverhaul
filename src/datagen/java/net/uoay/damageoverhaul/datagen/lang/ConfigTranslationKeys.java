package net.uoay.damageoverhaul.datagen.lang;

import net.minecraft.entity.EntityType;
import net.uoay.damageoverhaul.DamageOverhaul;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

public class ConfigTranslationKeys {
    public static final String CONFIG_TITLE = "text.autoconfig." + MOD_ID +".title";
    public static final String CATEGORY_COMMON = ofCategory("common");
    public static final String OPTION_DISPLAY_DAMAGE_PROPORTION = ofOption(
        "displayDamageProportion"
    );
    public static final String CATEGORY_DAMAGE_ABSORPTION = ofCategory("damage_absorption");

    public static String ofOption(String path) {
        return "text.autoconfig." + MOD_ID + ".option." + path;
    }

    public static String ofCategory(String path) {
        return "text.autoconfig." + MOD_ID +".category." + path;
    }

    public static Set<EntityType<?>> getConfiguredEntityTypes() {
        var set = new HashSet<EntityType<?>>();
        var map =  DamageOverhaul.CONFIG.getConfiguredEntities();
        map.forEach((key, value) ->
            set.add(key)
        );
        return set;
    }

    public static List<String> getStrikeTranslationKeys() {
        var entityTypes = getConfiguredEntityTypes();
        var list = new ArrayList<String>();
        for (var entityType : entityTypes) {
            list.add(ofOption(entityType.getUntranslatedName()) + ".strike");
        }
        return list;
    }

    public static List<String> getThrustTranslationKeys() {
        var entityTypes = getConfiguredEntityTypes();
        var list = new ArrayList<String>();
        for (var entityType : entityTypes) {
            list.add(ofOption(entityType.getUntranslatedName()) + ".thrust");
        }
        return list;
    }

    public static List<String> getSlashTranslationKeys() {
        var entityTypes = getConfiguredEntityTypes();
        var list = new ArrayList<String>();
        for (var entityType : entityTypes) {
            list.add(ofOption(entityType.getUntranslatedName()) + ".slash");
        }
        return list;
    }
}
