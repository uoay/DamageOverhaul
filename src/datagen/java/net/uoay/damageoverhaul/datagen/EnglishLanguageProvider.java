package net.uoay.damageoverhaul.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.uoay.damageoverhaul.PlainTranslationKeys;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributeIdentifiers;

import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {
    protected EnglishLanguageProvider(
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
        translationBuilder.add(
            EntityAttributeIdentifiers.SLASH_ABSORPTION, "Slash Absorption"
        );

        translationBuilder.add(PlainTranslationKeys.DAMAGE_DETAILS, "Damage Details");
        translationBuilder.add(
            PlainTranslationKeys.SLASH_PROPORTION, "Slash Proportion %1$s"
        );
    }
}
