package net.uoay.damageoverhaul.entity;

import net.minecraft.entity.EntityType;
import net.uoay.damageoverhaul.component.type.DamageDetailsComponent;
import net.uoay.damageoverhaul.component.type.DamageDetailsComponents;

import java.util.HashMap;
import java.util.Optional;

public class EntityDamageDetails {
    private static final HashMap<EntityType<?>, DamageDetailsComponent> map = new HashMap<>();

    public static Optional<DamageDetailsComponent> get(EntityType<?> type) {
        return Optional.ofNullable(map.get(type));
    }

    public static void initialize() {
        map.put(EntityType.TRIDENT, DamageDetailsComponents.THRUST);
        map.put(EntityType.IRON_GOLEM, DamageDetailsComponents.STRIKE);
    }
}
