package net.uoay.damageoverhaul.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.DamageTypeTags;

import java.util.concurrent.CompletableFuture;

import static net.uoay.damageoverhaul.registry.tag.DamageTypeTags.*;

public class DamageTypeTagProvider extends FabricTagProvider<DamageType> {
    public DamageTypeTagProvider(
        FabricDataOutput output,
        CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture
    ) {
        super(output, RegistryKeys.DAMAGE_TYPE, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        configureIsPhysical();
        configureIsMagic();
    }

    private void configureIsPhysical() {
        getOrCreateTagBuilder(IS_PHYSICAL)
            .add(DamageTypes.CRAMMING)
            .add(DamageTypes.CACTUS)
            .add(DamageTypes.FALL)
            .add(DamageTypes.FLY_INTO_WALL)
            .add(DamageTypes.STALAGMITE)
            .add(DamageTypes.FALLING_BLOCK)
            .add(DamageTypes.FALLING_ANVIL)
            .add(DamageTypes.FALLING_STALACTITE)
            .add(DamageTypes.STING)
            .add(DamageTypes.MOB_ATTACK)
            .add(DamageTypes.MOB_ATTACK_NO_AGGRO)
            .add(DamageTypes.PLAYER_ATTACK)
            .add(DamageTypes.ARROW)
            .add(DamageTypes.TRIDENT)
            .add(DamageTypes.MOB_PROJECTILE);
    }

    private void configureIsMagic() {
        getOrCreateTagBuilder(IS_MAGIC)
            .forceAddTag(DamageTypeTags.WITCH_RESISTANT_TO);
    }
}
