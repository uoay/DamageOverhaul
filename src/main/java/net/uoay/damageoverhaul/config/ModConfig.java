package net.uoay.damageoverhaul.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

import java.util.HashMap;
import java.util.Map;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

// Do not convert the snake case variable name to camel case.
// This is to make the automatically generated translation keys keep snake case.
@Config(name = MOD_ID)
public class ModConfig implements ConfigData {
    @ConfigEntry.Category("common")
    public boolean displayDamageProportion = true;

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig allay = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig armadillo = new DamageAbsorptionConfig(
        0.2F, 0.15F, -0.2F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig axolotl = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig bat = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig bee = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig blaze = new DamageAbsorptionConfig(
        0.5F, 0.5F, 0.5F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig bogged = new DamageAbsorptionConfig(
        -0.2F, -0.5F, 0.5F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig breeze = new DamageAbsorptionConfig(
        0.5F, 0.5F, 0.5F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig camel = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig cat = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig cave_spider = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig chicken = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig cod = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig cow = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig creaking = new DamageAbsorptionConfig(
        -0.3F, -0.3F, -0.3F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig creeper = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig dolphin = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig donkey = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig drowned = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig elder_guardian = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig enderman = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig endermite = new DamageAbsorptionConfig(
        0.0F, 0.0F, -0.2F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig ender_dragon = new DamageAbsorptionConfig(
        0.3F, 0.3F, 0.3F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig evoker = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig fox = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig frog = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig ghast = new DamageAbsorptionConfig(
        -0.1F, -0.2F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig giant = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig glow_squid = new DamageAbsorptionConfig(
        -0.2F, -0.1F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig goat = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig guardian = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig hoglin = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig horse = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig husk = new DamageAbsorptionConfig(
        0.0F, -0.2F, -0.2F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig illusioner = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig iron_golem = new DamageAbsorptionConfig(
        0.2F, 0.3F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig llama = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig magma_cube = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig mooshroom = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig mule = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig ocelot = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig panda = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig parrot = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig phantom = new DamageAbsorptionConfig(
        -0.2F, -0.2F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig pig = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig piglin = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig piglin_brute = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig pillager = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig player = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig polar_bear = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig pufferfish = new DamageAbsorptionConfig(
        -0.2F, -0.2F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig rabbit = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig ravager = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig salmon = new DamageAbsorptionConfig(
        -0.2F, -0.2F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig sheep = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig shulker = new DamageAbsorptionConfig(
        0.2F, 0.2F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig silverfish = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig skeleton = new DamageAbsorptionConfig(
        0.3F, 0.5F, -0.5F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig skeleton_horse = new DamageAbsorptionConfig(
        0.3F, 0.5F, -0.5F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig slime = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig sniffer = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig snow_golem = new DamageAbsorptionConfig(
        0.2F, 0.2F, 0.2F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig squid = new DamageAbsorptionConfig(
        -0.2F, -0.1F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig spider = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig stray = new DamageAbsorptionConfig(
        0.3F, 0.5F, -0.5F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig strider = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig tadpole = new DamageAbsorptionConfig(
        -0.2F, -0.1F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig trader_llama = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig tropical_fish = new DamageAbsorptionConfig(
        -0.2F, -0.1F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig turtle = new DamageAbsorptionConfig(
        0.2F, 0.2F, -0.2F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig vex = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig villager = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig vindicator = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig wandering_trader = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig warden = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig witch = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig wither = new DamageAbsorptionConfig(
        0.3F, 0.5F, -0.3F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig wither_skeleton = new DamageAbsorptionConfig(
        0.3F, 0.5F, -0.3F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig wolf = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig zoglin = new DamageAbsorptionConfig(
        0.0F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig zombie = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig zombie_horse = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig zombie_villager = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    @ConfigEntry.Category("damage_absorption")
    @ConfigEntry.Gui.CollapsibleObject
    @ConfigEntry.Gui.RequiresRestart
    public DamageAbsorptionConfig zombified_piglin = new DamageAbsorptionConfig(
        -0.2F, 0.0F, 0.0F
    );

    public Map<EntityType<? extends LivingEntity>, DamageAbsorptionConfig> getConfiguredEntities() {
        var map = new HashMap<EntityType<? extends LivingEntity>, DamageAbsorptionConfig>();
        map.put(EntityType.ALLAY, allay);
        map.put(EntityType.ARMADILLO, armadillo);
        map.put(EntityType.AXOLOTL, axolotl);
        map.put(EntityType.BAT, bat);
        map.put(EntityType.BEE, bee);
        map.put(EntityType.BLAZE, blaze);
        map.put(EntityType.BOGGED, bogged);
        map.put(EntityType.BREEZE, breeze);
        map.put(EntityType.CAMEL, camel);
        map.put(EntityType.CAT, cat);
        map.put(EntityType.CAVE_SPIDER, cave_spider);
        map.put(EntityType.CHICKEN, chicken);
        map.put(EntityType.COD, cod);
        map.put(EntityType.COW, cow);
        map.put(EntityType.CREAKING, creaking);
        map.put(EntityType.CREEPER, creeper);
        map.put(EntityType.DOLPHIN, dolphin);
        map.put(EntityType.DONKEY, donkey);
        map.put(EntityType.DROWNED, drowned);
        map.put(EntityType.ELDER_GUARDIAN, elder_guardian);
        map.put(EntityType.ENDERMAN, enderman);
        map.put(EntityType.ENDERMITE, endermite);
        map.put(EntityType.ENDER_DRAGON, ender_dragon);
        map.put(EntityType.EVOKER, evoker);
        map.put(EntityType.FOX, fox);
        map.put(EntityType.FROG, frog);
        map.put(EntityType.GHAST, ghast);
        map.put(EntityType.GIANT, giant);
        map.put(EntityType.GLOW_SQUID, glow_squid);
        map.put(EntityType.GOAT, goat);
        map.put(EntityType.GUARDIAN, guardian);
        map.put(EntityType.HOGLIN, hoglin);
        map.put(EntityType.HORSE, horse);
        map.put(EntityType.HUSK, husk);
        map.put(EntityType.ILLUSIONER, illusioner);
        map.put(EntityType.IRON_GOLEM, iron_golem);
        map.put(EntityType.LLAMA, llama);
        map.put(EntityType.MAGMA_CUBE, magma_cube);
        map.put(EntityType.MOOSHROOM, mooshroom);
        map.put(EntityType.MULE, mule);
        map.put(EntityType.OCELOT, ocelot);
        map.put(EntityType.PANDA, panda);
        map.put(EntityType.PARROT, parrot);
        map.put(EntityType.PHANTOM, phantom);
        map.put(EntityType.PIG, pig);
        map.put(EntityType.PIGLIN, piglin);
        map.put(EntityType.PIGLIN_BRUTE, piglin_brute);
        map.put(EntityType.PILLAGER, pillager);
        map.put(EntityType.PLAYER, player);
        map.put(EntityType.POLAR_BEAR, polar_bear);
        map.put(EntityType.PUFFERFISH, pufferfish);
        map.put(EntityType.RABBIT, rabbit);
        map.put(EntityType.RAVAGER, ravager);
        map.put(EntityType.SALMON, salmon);
        map.put(EntityType.SHEEP, sheep);
        map.put(EntityType.SHULKER, shulker);
        map.put(EntityType.SILVERFISH, silverfish);
        map.put(EntityType.SKELETON, skeleton);
        map.put(EntityType.SKELETON_HORSE, skeleton_horse);
        map.put(EntityType.SLIME, slime);
        map.put(EntityType.SNIFFER, sniffer);
        map.put(EntityType.SNOW_GOLEM, snow_golem);
        map.put(EntityType.SPIDER, spider);
        map.put(EntityType.SQUID, squid);
        map.put(EntityType.STRAY, stray);
        map.put(EntityType.STRIDER, strider);
        map.put(EntityType.TADPOLE, tadpole);
        map.put(EntityType.TRADER_LLAMA, trader_llama);
        map.put(EntityType.TURTLE, turtle);
        map.put(EntityType.TROPICAL_FISH, tropical_fish);
        map.put(EntityType.VEX, vex);
        map.put(EntityType.VILLAGER, villager);
        map.put(EntityType.VINDICATOR, vindicator);
        map.put(EntityType.WANDERING_TRADER, wandering_trader);
        map.put(EntityType.WARDEN, warden);
        map.put(EntityType.WITCH, witch);
        map.put(EntityType.WITHER, wither);
        map.put(EntityType.WITHER_SKELETON, wither_skeleton);
        map.put(EntityType.WOLF, wolf);
        map.put(EntityType.ZOGLIN, zoglin);
        map.put(EntityType.ZOMBIE, zombie);
        map.put(EntityType.ZOMBIE_HORSE, zombie_horse);
        map.put(EntityType.ZOMBIE_VILLAGER, zombie_villager);
        map.put(EntityType.ZOMBIFIED_PIGLIN, zombified_piglin);
        return map;
    }

    public static ModConfig registerAndGetConfig() {
        AutoConfig.register(ModConfig.class, JanksonConfigSerializer::new);
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
}
