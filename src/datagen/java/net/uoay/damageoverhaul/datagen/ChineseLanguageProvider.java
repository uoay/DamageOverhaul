package net.uoay.damageoverhaul.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.uoay.damageoverhaul.PlainTranslationKeys;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributeIdentifiers;

import java.util.concurrent.CompletableFuture;

public class ChineseLanguageProvider extends FabricLanguageProvider {
    protected ChineseLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(
            EntityAttributeIdentifiers.SLASH_ABSORPTION, "斩击吸收"
        );
        translationBuilder.add(
            EntityAttributeIdentifiers.STRIKE_ABSORPTION, "打击吸收"
        );

        translationBuilder.add(PlainTranslationKeys.DAMAGE_DETAILS, "伤害详情");
        translationBuilder.add(
            PlainTranslationKeys.SLASH_PROPORTION, "斩击占比 %1$s"
        );
        translationBuilder.add(
            PlainTranslationKeys.STRIKE_PROPORTION, "打击占比 %1$s"
        );
    }
}
