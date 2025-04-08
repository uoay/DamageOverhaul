package net.uoay.damageoverhaul;

import net.fabricmc.api.ClientModInitializer;
import net.uoay.damageoverhaul.tooltip.DamageDetailsComponentTooltip;

public class DamageOverhaulClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        DamageDetailsComponentTooltip.initialize();
    }
}
