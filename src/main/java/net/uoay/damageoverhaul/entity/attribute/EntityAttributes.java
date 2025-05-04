package net.uoay.damageoverhaul.entity.attribute;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.DefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.uoay.damageoverhaul.DamageOverhaul;
import net.uoay.damageoverhaul.config.DamageAbsorptionConfig;
import net.uoay.damageoverhaul.mixin.DefaultAttributeContainerAccessor;

public class EntityAttributes {
    public static final RegistryEntry<EntityAttribute> SLASH_ABSORPTION = register(
        EntityAttributeIdentifiers.SLASH_ABSORPTION,
        new ClampedEntityAttribute(
            EntityAttributeIdentifiers.SLASH_ABSORPTION.toTranslationKey(),
            0.0, -5.0, 1.0
        ).setTracked(true)
    );
    public static final RegistryEntry<EntityAttribute> STRIKE_ABSORPTION = register(
        EntityAttributeIdentifiers.STRIKE_ABSORPTION,
        new ClampedEntityAttribute(
            EntityAttributeIdentifiers.STRIKE_ABSORPTION.toTranslationKey(),
            0.0, -5.0, 1.0
        ).setTracked(true)
    );
    public static final RegistryEntry<EntityAttribute> THRUST_ABSORPTION = register(
        EntityAttributeIdentifiers.THRUST_ABSORPTION,
        new ClampedEntityAttribute(
            EntityAttributeIdentifiers.THRUST_ABSORPTION.toTranslationKey(),
            0.0, -5.0, 1.0
        ).setTracked(true)
    );

    private static RegistryEntry<EntityAttribute> register(
        Identifier id,
        EntityAttribute attribute
    ) {
        return Registry.registerReference(Registries.ATTRIBUTE, id, attribute);
    }

    private static DefaultAttributeContainer newDefaultAttributeContainer(
        EntityType<? extends LivingEntity> entityType,
        DamageAbsorptionConfig damageAbsorptionConfig
    ) {
        var original = DefaultAttributeRegistry.get(entityType);
        var builder = new DefaultAttributeContainer.Builder();
        var originalInstances = ((DefaultAttributeContainerAccessor) original).getInstances();
        originalInstances.forEach((entityAttributeRegistryEntry, entityAttributeInstance) ->
            builder.add(entityAttributeInstance.getAttribute(), entityAttributeInstance.getValue())
        );
        builder.add(SLASH_ABSORPTION, damageAbsorptionConfig.slash);
        builder.add(STRIKE_ABSORPTION, damageAbsorptionConfig.strike);
        builder.add(THRUST_ABSORPTION, damageAbsorptionConfig.thrust);
        return builder.build();
    }

    private static void setDefaultAttributes() {
        var config = DamageOverhaul.CONFIG.getConfiguredEntities();
        config.forEach((entityType, damageAbsorptionConfig) ->
            FabricDefaultAttributeRegistry.register(
                entityType,
                newDefaultAttributeContainer(entityType, damageAbsorptionConfig)
            )
        );
    }

    public static void initialize() {
        setDefaultAttributes();
    }
}
