package net.uoay.damageoverhaul.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.uoay.damageoverhaul.datagen.lang.ChineseLanguageProvider;
import net.uoay.damageoverhaul.datagen.lang.EnglishLanguageProvider;

public class DamageOverhaulDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();
        pack.addProvider(DamageTypeTagProvider::new);
        pack.addProvider(ChineseLanguageProvider::new);
        pack.addProvider(EnglishLanguageProvider::new);
    }
}
