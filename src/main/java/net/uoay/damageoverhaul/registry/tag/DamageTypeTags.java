package net.uoay.damageoverhaul.registry.tag;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.uoay.damageoverhaul.DamageOverhaul.MOD_ID;

public final class DamageTypeTags {
    public static final TagKey<DamageType> IS_PHYSICAL = of("is_physical");
    public static final TagKey<DamageType> IS_MAGIC = of("is_magic");

    private static TagKey<DamageType> of(String id) {
        return TagKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(MOD_ID ,id));
    }
}
