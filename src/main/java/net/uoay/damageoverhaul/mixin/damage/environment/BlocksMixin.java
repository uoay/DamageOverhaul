package net.uoay.damageoverhaul.mixin.damage.environment;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.uoay.damageoverhaul.DamageOverhaul;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.function.Function;

@Mixin(Blocks.class)
public abstract class BlocksMixin {
    @ModifyArgs(
        method = "<clinit>",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/block/Blocks;register(Ljava/lang/String;Ljava/util/function/Function;Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/Block;"
        )
    )
    private static void modifyCampfire(Args args) {
        if (args.get(0).equals("campfire")) {
            var func = new Function<AbstractBlock.Settings, Block>() {
                @Override
                public Block apply(AbstractBlock.Settings settings) {
                    return new CampfireBlock(
                        true, DamageOverhaul.CONFIG.campfire_damage, settings
                    );
                }
            };
            args.set(1, func);
        } else if (args.get(0).equals("soul_campfire")) {
            var func = new Function<AbstractBlock.Settings, Block>() {
                @Override
                public Block apply(AbstractBlock.Settings settings) {
                    return new CampfireBlock(
                        false, DamageOverhaul.CONFIG.soul_campfire_damage, settings
                    );
                }
            };
            args.set(1, func);
        }
    }
}
