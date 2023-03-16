package de.dafuqs.spectrum.items.trinkets;

import de.dafuqs.spectrum.SpectrumCommon;
import de.dafuqs.spectrum.energy.InkPowered;
import de.dafuqs.spectrum.energy.color.InkColor;
import de.dafuqs.spectrum.energy.color.InkColors;
import de.dafuqs.spectrum.helpers.InventoryHelper;
import de.dafuqs.spectrum.registries.SpectrumSoundEvents;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.*;

public class GlowVisionGogglesItem extends SpectrumTrinketItem implements InkPowered {
	
	public static final InkColor USED_COLOR = InkColors.LIGHT_BLUE;
	public static final int INK_COST = 20;
	public static ItemStack ITEM_COST = new ItemStack(Items.GLOW_INK_SAC, 1);
	
	public GlowVisionGogglesItem(Settings settings) {
		super(settings, SpectrumCommon.locate("unlocks/trinkets/glow_vision_goggles"));
	}
	
	@Override
	public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
		super.tick(stack, slot, entity);
		
		World world = entity.getWorld();
		if (world != null && world.getTimeOfDay() % 20 == 0) {
			if (entity instanceof ServerPlayerEntity serverPlayerEntity) {
				int lightLevelAtPlayerPos = world.getLightLevel(serverPlayerEntity.getBlockPos());
				
				if (lightLevelAtPlayerPos < 7) {
					StatusEffectInstance nightVisionInstance = serverPlayerEntity.getStatusEffect(StatusEffects.NIGHT_VISION);
					if (nightVisionInstance == null || nightVisionInstance.getDuration() < 10 * 20) { // prevent "night vision running out" flashing
						// no / short night vision => search for glow ink sac and add night vision if found
						
						boolean paid = serverPlayerEntity.isCreative();
						if (!paid) { // try pay with ink
							paid = InkPowered.tryDrainEnergy(serverPlayerEntity, USED_COLOR, INK_COST);
						}
						if (!paid) {  // try pay with item
							paid = InventoryHelper.removeFromInventoryWithRemainders(serverPlayerEntity, ITEM_COST);
						}
						
						if (paid) {
							StatusEffectInstance newNightVisionInstance = new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * SpectrumCommon.CONFIG.GlowVisionGogglesDuration);
							serverPlayerEntity.addStatusEffect(newNightVisionInstance);
							world.playSoundFromEntity(null, serverPlayerEntity, SpectrumSoundEvents.ITEM_ARMOR_EQUIP_GLOW_VISION, SoundCategory.PLAYERS, 0.2F, 1.0F);
						}
					}
				}
			}
		}
	}
	
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
		super.appendTooltip(itemStack, world, tooltip, tooltipContext);
		tooltip.add(Text.translatable("item.spectrum.glow_vision_goggles.tooltip"));
	}
	
	@Override
	public List<InkColor> getUsedColors() {
		return List.of(USED_COLOR);
	}
}
