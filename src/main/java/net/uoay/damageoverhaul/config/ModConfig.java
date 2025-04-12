package net.uoay.damageoverhaul.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

@Config(name = MOD_ID)
public class ModConfig implements ConfigData {
    @ConfigEntry.Category("common")
    public boolean displayDamageProportion = true;

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig zombie = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    public static ModConfig registerAndGetConfig() {
        AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
}
