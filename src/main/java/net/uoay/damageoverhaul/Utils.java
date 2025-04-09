package net.uoay.damageoverhaul;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.uoay.damageoverhaul.component.DataComponentTypes;
import net.uoay.damageoverhaul.entity.attribute.EntityAttributes;

public class Utils {
    public static float applyDamageAbsorption(
        float original,
        ItemStack weaponStack,
        LivingEntity target
    ) {
        var details = weaponStack.getComponents().get(DataComponentTypes.DAMAGE_DETAILS);
        if (details == null) {
            return original;
        }
        var attributes = target.getAttributes();
        double sum = 0.0F;
        float part = details.slashProportion() * original;
        sum += (part * (1 - attributes.getValue(EntityAttributes.SLASH_ABSORPTION)));
        part = details.strikeProportion() * original;
        sum += (part * (1 - attributes.getValue(EntityAttributes.STRIKE_ABSORPTION)));
        return (float) sum;
    }
}
