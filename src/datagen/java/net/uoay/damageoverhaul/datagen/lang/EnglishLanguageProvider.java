package net.uoay.damageoverhaul.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Language;
import net.uoay.damageoverhaul.PlainTranslationKeys;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributeIdentifiers;

import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {
    public EnglishLanguageProvider(
        FabricDataOutput dataOutput,
        CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup
    ) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(
        RegistryWrapper.WrapperLookup registryLookup,
        TranslationBuilder translationBuilder
    ) {
        generateConfigTranslations(translationBuilder);

        translationBuilder.add(
            EntityAttributeIdentifiers.SLASH_ABSORPTION, "Slash Absorption"
        );
        translationBuilder.add(
            EntityAttributeIdentifiers.STRIKE_ABSORPTION, "Strike Absorption"
        );
        translationBuilder.add(
            EntityAttributeIdentifiers.THRUST_ABSORPTION, "Thrust Absorption"
        );

        translationBuilder.add(PlainTranslationKeys.DAMAGE_DETAILS, "Damage Details");
        translationBuilder.add(
            PlainTranslationKeys.SLASH_PROPORTION, "Slash Proportion %1$s"
        );
        translationBuilder.add(
            PlainTranslationKeys.STRIKE_PROPORTION, "Strike Proportion %1$s"
        );
        translationBuilder.add(
            PlainTranslationKeys.THRUST_PROPORTION, "Thrust Proportion %1$s"
        );
    }

    public void generateConfigTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ConfigTranslationKeys.CONFIG_TITLE, "Damage Overhaul Options");
        translationBuilder.add(ConfigTranslationKeys.CATEGORY_COMMON, "Common");
        translationBuilder.add(
            ConfigTranslationKeys.OPTION_DISPLAY_DAMAGE_PROPORTION, "Display Damage Proportion"
        );
        translationBuilder.add(
            ConfigTranslationKeys.CATEGORY_DAMAGE_ABSORPTION, "Damage Absorption"
        );
        translationBuilder.add(
            ConfigTranslationKeys.CATEGORY_ENVIRONMENT_DAMAGE, "Environment Damage"
        );
        translationBuilder.add(ConfigTranslationKeys.OPTION_FIRE_DAMAGE, "Fire Damage");
        translationBuilder.add(ConfigTranslationKeys.OPTION_LAVA_DAMAGE, "Lava Damage");
        translationBuilder.add(
            ConfigTranslationKeys.OPTION_LIGHTNING_BOLT_DAMAGE, "Lightning Bolt Damage"
        );
        translationBuilder.add(
            ConfigTranslationKeys.OPTION_MAGMA_BLOCK_DAMAGE, "Magma Block Damage"
        );
        translationBuilder.add(ConfigTranslationKeys.OPTION_CAMPFIRE_DAMAGE, "Campfire Damage");
        translationBuilder.add(
            ConfigTranslationKeys.OPTION_SOUL_CAMPFIRE_DAMAGE, "Soul Campfire Damage"
        );
        translationBuilder.add(ConfigTranslationKeys.CATEGORY_PROJECTILE, "Projectile");
        translationBuilder.add(ConfigTranslationKeys.OPTION_FIREBALL_DAMAGE, "Fireball Damage");
        translationBuilder.add(
            ConfigTranslationKeys.OPTION_SMALL_FIREBALL_DAMAGE, "Small Fireball Damage"
        );

        var language = Language.getInstance();
        var entityTypes = ConfigTranslationKeys.getConfiguredEntityTypes();
        entityTypes.forEach(entityType ->
            translationBuilder.add(
                ConfigTranslationKeys.ofOption(entityType.getUntranslatedName()),
                language.get(entityType.getTranslationKey())
            )
        );

        var slashTranslationKeys = ConfigTranslationKeys.getSlashTranslationKeys();
        for (var key : slashTranslationKeys) {
            translationBuilder.add(key, "Slash");
        }

        var strikeTranslationKeys = ConfigTranslationKeys.getStrikeTranslationKeys();
        for (var key : strikeTranslationKeys) {
            translationBuilder.add(key, "Strike");
        }

        var thrustTranslationKeys = ConfigTranslationKeys.getThrustTranslationKeys();
        for (var key : thrustTranslationKeys) {
            translationBuilder.add(key, "Thrust");
        }

        var fireTranslationKeys = ConfigTranslationKeys.getFireTranslationKeys();
        for (var key : fireTranslationKeys) {
            translationBuilder.add(key, "Fire");
        }

        var lightningTranslationKeys = ConfigTranslationKeys.getLightningTranslationKeys();
        for (var key : lightningTranslationKeys) {
            translationBuilder.add(key, "Lightning");
        }
    }
}
