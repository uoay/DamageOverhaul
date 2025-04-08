package net.uoay.damageoverhaul.tooltip;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.screen.ScreenTexts;
import net.uoay.damageoverhaul.component.DataComponentTypes;

public class DamageDetailsComponentTooltip {
    public static void initialize() {
        ItemTooltipCallback.EVENT.register((
            stack, tooltipContext, tooltipType, lines
        ) -> {
            var components =  stack.getComponents();
            var damageDetails = components.get(DataComponentTypes.DAMAGE_DETAILS);
            if (damageDetails != null) {
                lines.add(ScreenTexts.EMPTY);
                damageDetails.appendTooltip(tooltipContext, lines::add, tooltipType, components);
            }
        });
    }
}
