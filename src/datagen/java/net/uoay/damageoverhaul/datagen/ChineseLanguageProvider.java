package net.uoay.damageoverhaul.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.uoay.damageoverhaul.PlainTranslationKeys;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributeIdentifiers;

import java.util.concurrent.CompletableFuture;

public class ChineseLanguageProvider extends FabricLanguageProvider {
    protected ChineseLanguageProvider(
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
        translationBuilder.add(PlainTranslationKeys.CONFIG_TITLE, "伤害大修选项");
        translationBuilder.add(PlainTranslationKeys.CATEGORY_COMMON, "常规");
        translationBuilder.add(PlainTranslationKeys.OPTION_DISPLAY_DAMAGE_PROPORTION, "显示伤害占比");
        translationBuilder.add(PlainTranslationKeys.CATEGORY_DAMAGE_ABSORPTION, "伤害吸收");
        translationBuilder.add(PlainTranslationKeys.OPTION_ZOMBIE, "僵尸");
        translationBuilder.add(PlainTranslationKeys.OPTION_ZOMBIE_SLASH, "斩击");
        translationBuilder.add(PlainTranslationKeys.OPTION_ZOMBIE_STRIKE, "打击");
        translationBuilder.add(PlainTranslationKeys.OPTION_ZOMBIE_THRUST, "刺击");
    }
}
