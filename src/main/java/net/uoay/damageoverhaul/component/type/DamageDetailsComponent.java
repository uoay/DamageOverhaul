package net.uoay.damageoverhaul.component.type;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.component.ComponentsAccess;
import net.minecraft.item.Item;
import net.minecraft.item.tooltip.TooltipAppender;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.uoay.damageoverhaul.PlainTranslationKeys;

import java.util.function.Consumer;

public record DamageDetailsComponent(float slashProportion) implements TooltipAppender {
    public static final Codec<DamageDetailsComponent> CODEC = RecordCodecBuilder.create(instance ->
        instance
            .group(
                Codec
                    .floatRange(0.0F, 1.0F)
                    .fieldOf("slashProportion")
                    .forGetter(DamageDetailsComponent::slashProportion)
            )
            .apply(instance, DamageDetailsComponent::new)
    );

    @Override
    public void appendTooltip(
        Item.TooltipContext context,
        Consumer<Text> textConsumer,
        TooltipType type,
        ComponentsAccess components
    ) {
        textConsumer.accept(
            Text
                .translatable(PlainTranslationKeys.DAMAGE_DETAILS)
                .append(":")
                .formatted(Formatting.GRAY)
        );
        if (this.slashProportion != 0) {
            textConsumer.accept(ScreenTexts.space().append(Text.translatable(
                PlainTranslationKeys.SLASH_PROPORTION,
                this.slashProportion * 100 + "%"
            )).formatted(Formatting.DARK_GRAY));
        }
    }
}
