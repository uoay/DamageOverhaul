package net.uoay.damageoverhaul.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.uoay.damageoverhaul.PlainTranslationKeys;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributeIdentifiers;

import java.util.concurrent.CompletableFuture;

public class ChineseLanguageProvider extends FabricLanguageProvider {
    public ChineseLanguageProvider(
        FabricDataOutput dataOutput,
        CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup
    ) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(
        RegistryWrapper.WrapperLookup registryLookup,
        TranslationBuilder translationBuilder
    ) {
        generateConfigTranslations(translationBuilder);
        translationBuilder.add(
            EntityAttributeIdentifiers.SLASH_ABSORPTION, "斩击吸收"
        );
        translationBuilder.add(
            EntityAttributeIdentifiers.STRIKE_ABSORPTION, "打击吸收"
        );
        translationBuilder.add(
            EntityAttributeIdentifiers.THRUST_ABSORPTION, "刺击吸收"
        );
        translationBuilder.add(PlainTranslationKeys.DAMAGE_DETAILS, "伤害详情");
        translationBuilder.add(
            PlainTranslationKeys.SLASH_PROPORTION, "斩击占比 %1$s"
        );
        translationBuilder.add(
            PlainTranslationKeys.STRIKE_PROPORTION, "打击占比 %1$s"
        );
        translationBuilder.add(
            PlainTranslationKeys.THRUST_PROPORTION, "刺击占比 %1$s"
        );
    }

    public void generateConfigTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ConfigTranslationKeys.CONFIG_TITLE, "伤害大修选项");
        translationBuilder.add(ConfigTranslationKeys.CATEGORY_COMMON, "常规");
        translationBuilder.add(ConfigTranslationKeys.OPTION_DISPLAY_DAMAGE_PROPORTION, "显示伤害占比");
        translationBuilder.add(ConfigTranslationKeys.CATEGORY_DAMAGE_ABSORPTION, "伤害吸收");

        // TODO translate entity name

        var slashTranslationKeys = ConfigTranslationKeys.getSlashTranslationKeys();
        for (var key : slashTranslationKeys) {
            translationBuilder.add(key, "斩击");
        }

        var strikeTranslationKeys = ConfigTranslationKeys.getStrikeTranslationKeys();
        for (var key : strikeTranslationKeys) {
            translationBuilder.add(key, "刺击");
        }

        var thrustTranslationKeys = ConfigTranslationKeys.getThrustTranslationKeys();
        for (var key : thrustTranslationKeys) {
            translationBuilder.add(key, "打击");
        }
    }
}
