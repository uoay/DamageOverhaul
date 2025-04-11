package net.uoay.damageoverhaul;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.uoay.damageoverhaul.component.DataComponentTypes;
import net.uoay.damageoverhaul.component.type.DamageDetailsComponent;
import net.uoay.damageoverhaul.entity.EntityDamageDetails;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;

public class Utils {
    public static float applyDamageAbsorption(
        float original,
        Entity attacker,
        LivingEntity target
    ) {
        var weaponStack = attacker.getWeaponStack();
        if (weaponStack == null) {
            return modifyNoWeaponEntityAttackDamage(original, attacker, target);
        }

        var damageDetails = weaponStack.getComponents().get(DataComponentTypes.DAMAGE_DETAILS);
        if (damageDetails == null) {
            return modifyNoWeaponEntityAttackDamage(original, attacker, target);
        }

        return applyDamageAbsorption(original, damageDetails, target);
    }

    private static float applyDamageAbsorption(
        float original,
        DamageDetailsComponent damageDetails,
        LivingEntity target
    ) {
        var attributes = target.getAttributes();
        double sum = 0.0F;

        float part = damageDetails.slashProportion() * original;
        sum += (part * (1 - attributes.getValue(EntityAttributes.SLASH_ABSORPTION)));

        part = damageDetails.strikeProportion() * original;
        sum += (part * (1 - attributes.getValue(EntityAttributes.STRIKE_ABSORPTION)));

        part = damageDetails.thrustProportion() * original;
        sum += (part * (1 - attributes.getValue(EntityAttributes.THRUST_ABSORPTION)));

        return (float) sum;
    }

    private static float modifyNoWeaponEntityAttackDamage(
        float original,
        Entity attacker,
        LivingEntity target
    ) {
        return EntityDamageDetails
            .get(attacker.getType())
            .map(damageDetails -> applyDamageAbsorption(original, damageDetails, target))
            .orElse(original);
    }
}
