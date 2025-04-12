package net.uoay.damageoverhaul;

import net.fabricmc.api.ModInitializer;
import net.uoay.damageoverhaul.component.DataComponentTypes;
import net.uoay.damageoverhaul.config.ModConfig;
import net.uoay.damageoverhaul.entity.EntityDamageDetails;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DamageOverhaul implements ModInitializer {
    public static final String MOD_ID = "damage_overhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ModConfig CONFIG = ModConfig.registerAndGetConfig();

    @Override
    public void onInitialize() {
        DataComponentTypes.initialize();
        EntityAttributes.initialize();
        EntityDamageDetails.initialize();
    }
}
