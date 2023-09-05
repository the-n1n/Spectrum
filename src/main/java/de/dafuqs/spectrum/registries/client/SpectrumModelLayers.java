package de.dafuqs.spectrum.registries.client;

import de.dafuqs.spectrum.*;
import de.dafuqs.spectrum.blocks.mob_head.models.*;
import de.dafuqs.spectrum.entity.models.*;
import de.dafuqs.spectrum.render.armor.*;
import net.fabricmc.api.*;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.util.*;

@Environment(EnvType.CLIENT)
public class SpectrumModelLayers {
	
	/**
	 * Entities
	 */
	public static final EntityModelLayer WOOLY_PIG = new EntityModelLayer(SpectrumCommon.locate("egg_laying_wooly_pig"), "main");
	public static final EntityModelLayer WOOLY_PIG_HAT = new EntityModelLayer(SpectrumCommon.locate("egg_laying_wooly_pig"), "hat");
	public static final EntityModelLayer WOOLY_PIG_WOOL = new EntityModelLayer(SpectrumCommon.locate("egg_laying_wooly_pig"), "wool");
	
	public static final EntityModelLayer PRESERVATION_TURRET = new EntityModelLayer(SpectrumCommon.locate("preservation_turret"), "main");
	public static final EntityModelLayer MONSTROSITY = new EntityModelLayer(SpectrumCommon.locate("monstrosity"), "main");
	public static final EntityModelLayer LIZARD_SCALES = new EntityModelLayer(SpectrumCommon.locate("lizard"), "main");
	public static final EntityModelLayer LIZARD_FRILLS = new EntityModelLayer(SpectrumCommon.locate("lizard"), "frills");
	public static final EntityModelLayer LIZARD_HORNS = new EntityModelLayer(SpectrumCommon.locate("lizard"), "horns");
	public static final EntityModelLayer KINDLING = new EntityModelLayer(SpectrumCommon.locate("kindling"), "main");
	public static final EntityModelLayer KINDLING_ARMOR = new EntityModelLayer(SpectrumCommon.locate("kindling_armor"), "main");
	public static final EntityModelLayer KINDLING_COUGH = new EntityModelLayer(SpectrumCommon.locate("kindling_cough"), "main");
	
	/**
	 * Mob Heads
	 */
	public static final EntityModelLayer AXOLOTL_BLUE_HEAD = new EntityModelLayer(SpectrumCommon.locate("axolotl_blue_head"), "main");
	public static final EntityModelLayer AXOLOTL_BROWN_HEAD = new EntityModelLayer(SpectrumCommon.locate("axolotl_brown_head"), "main");
	public static final EntityModelLayer AXOLOTL_CYAN_HEAD = new EntityModelLayer(SpectrumCommon.locate("axolotl_cyan_head"), "main");
	public static final EntityModelLayer AXOLOTL_GOLD_HEAD = new EntityModelLayer(SpectrumCommon.locate("axolotl_gold_head"), "main");
	public static final EntityModelLayer AXOLOTL_LEUCISTIC_HEAD = new EntityModelLayer(SpectrumCommon.locate("axolotl_leucistic_head"), "main");
	public static final EntityModelLayer BAT_HEAD = new EntityModelLayer(SpectrumCommon.locate("bat_head"), "main");
	public static final EntityModelLayer BEE_HEAD = new EntityModelLayer(SpectrumCommon.locate("bee_head"), "main");
	public static final EntityModelLayer BLAZE_HEAD = new EntityModelLayer(SpectrumCommon.locate("blaze_head"), "main");
	public static final EntityModelLayer CAT_HEAD = new EntityModelLayer(SpectrumCommon.locate("cat_head"), "main");
	public static final EntityModelLayer CAVE_SPIDER_HEAD = new EntityModelLayer(SpectrumCommon.locate("cave_spider_head"), "main");
	public static final EntityModelLayer CHICKEN_HEAD = new EntityModelLayer(SpectrumCommon.locate("chicken_head"), "main");
	public static final EntityModelLayer CLOWNFISH_HEAD = new EntityModelLayer(SpectrumCommon.locate("clownfish_head"), "main");
	public static final EntityModelLayer COW_HEAD = new EntityModelLayer(SpectrumCommon.locate("cow_head"), "main");
	public static final EntityModelLayer DONKEY_HEAD = new EntityModelLayer(SpectrumCommon.locate("donkey_head"), "main");
	public static final EntityModelLayer DROWNED_HEAD = new EntityModelLayer(SpectrumCommon.locate("drowned_head"), "main");
	public static final EntityModelLayer ELDER_GUARDIAN_HEAD = new EntityModelLayer(SpectrumCommon.locate("elder_guardian_head"), "main");
	public static final EntityModelLayer ENDERMAN_HEAD = new EntityModelLayer(SpectrumCommon.locate("enderman_head"), "main");
	public static final EntityModelLayer ENDERMITE_HEAD = new EntityModelLayer(SpectrumCommon.locate("endermite_head"), "main");
	public static final EntityModelLayer EVOKER_HEAD = new EntityModelLayer(SpectrumCommon.locate("evoker_head"), "main");
	public static final EntityModelLayer FOX_HEAD = new EntityModelLayer(SpectrumCommon.locate("fox_head"), "main");
	public static final EntityModelLayer FOX_ARCTIC_HEAD = new EntityModelLayer(SpectrumCommon.locate("fox_arctic_head"), "main");
	public static final EntityModelLayer GHAST_HEAD = new EntityModelLayer(SpectrumCommon.locate("ghast_head"), "main");
	public static final EntityModelLayer GLOW_SQUID_HEAD = new EntityModelLayer(SpectrumCommon.locate("glow_squid_head"), "main");
	public static final EntityModelLayer GOAT_HEAD = new EntityModelLayer(SpectrumCommon.locate("goat_head"), "main");
	public static final EntityModelLayer GUARDIAN_HEAD = new EntityModelLayer(SpectrumCommon.locate("guardian_head"), "main");
	public static final EntityModelLayer HOGLIN_HEAD = new EntityModelLayer(SpectrumCommon.locate("hoglin_head"), "main");
	public static final EntityModelLayer HORSE_HEAD = new EntityModelLayer(SpectrumCommon.locate("horse_head"), "main");
	public static final EntityModelLayer HUSK_HEAD = new EntityModelLayer(SpectrumCommon.locate("husk_head"), "main");
	public static final EntityModelLayer ILLUSIONER_HEAD = new EntityModelLayer(SpectrumCommon.locate("illusioner_head"), "main");
	public static final EntityModelLayer IRON_GOLEM_HEAD = new EntityModelLayer(SpectrumCommon.locate("iron_golem_head"), "main");
	public static final EntityModelLayer LLAMA_HEAD = new EntityModelLayer(SpectrumCommon.locate("llama_head"), "main");
	public static final EntityModelLayer MAGMA_CUBE_HEAD = new EntityModelLayer(SpectrumCommon.locate("magma_cube_head"), "main");
	public static final EntityModelLayer MOOSHROOM_BROWN_HEAD = new EntityModelLayer(SpectrumCommon.locate("mooshroom_brown_head"), "main");
	public static final EntityModelLayer MOOSHROOM_RED_HEAD = new EntityModelLayer(SpectrumCommon.locate("mooshroom_red_head"), "main");
	public static final EntityModelLayer MULE_HEAD = new EntityModelLayer(SpectrumCommon.locate("mule_head"), "main");
	public static final EntityModelLayer OCELOT_HEAD = new EntityModelLayer(SpectrumCommon.locate("ocelot_head"), "main");
	public static final EntityModelLayer PANDA_HEAD = new EntityModelLayer(SpectrumCommon.locate("panda_head"), "main");
	public static final EntityModelLayer PARROT_BLUE_HEAD = new EntityModelLayer(SpectrumCommon.locate("parrot_blue_head"), "main");
	public static final EntityModelLayer PARROT_CYAN_HEAD = new EntityModelLayer(SpectrumCommon.locate("parrot_cyan_head"), "main");
	public static final EntityModelLayer PARROT_GRAY_HEAD = new EntityModelLayer(SpectrumCommon.locate("parrot_gray_head"), "main");
	public static final EntityModelLayer PARROT_GREEN_HEAD = new EntityModelLayer(SpectrumCommon.locate("parrot_green_head"), "main");
	public static final EntityModelLayer PARROT_RED_HEAD = new EntityModelLayer(SpectrumCommon.locate("parrot_red_head"), "main");
	public static final EntityModelLayer PHANTOM_HEAD = new EntityModelLayer(SpectrumCommon.locate("phantom_head"), "main");
	public static final EntityModelLayer PIG_HEAD = new EntityModelLayer(SpectrumCommon.locate("pig_head"), "main");
	public static final EntityModelLayer PIGLIN_HEAD = new EntityModelLayer(SpectrumCommon.locate("piglin_head"), "main");
	public static final EntityModelLayer POLAR_BEAR_HEAD = new EntityModelLayer(SpectrumCommon.locate("polar_bear_head"), "main");
	public static final EntityModelLayer PUFFERFISH_HEAD = new EntityModelLayer(SpectrumCommon.locate("pufferfish_head"), "main");
	public static final EntityModelLayer RABBIT_HEAD = new EntityModelLayer(SpectrumCommon.locate("rabbit_head"), "main");
	public static final EntityModelLayer RAVAGER_HEAD = new EntityModelLayer(SpectrumCommon.locate("ravager_head"), "main");
	public static final EntityModelLayer SALMON_HEAD = new EntityModelLayer(SpectrumCommon.locate("salmon_head"), "main");
	public static final EntityModelLayer SHEEP_BLACK_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_black_head"), "main");
	public static final EntityModelLayer SHEEP_BLUE_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_blue_head"), "main");
	public static final EntityModelLayer SHEEP_BROWN_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_brown_head"), "main");
	public static final EntityModelLayer SHEEP_CYAN_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_cyan_head"), "main");
	public static final EntityModelLayer SHEEP_GRAY_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_gray_head"), "main");
	public static final EntityModelLayer SHEEP_GREEN_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_green_head"), "main");
	public static final EntityModelLayer SHEEP_LIGHT_BLUE_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_light_blue_head"), "main");
	public static final EntityModelLayer SHEEP_LIGHT_GRAY_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_light_gray_head"), "main");
	public static final EntityModelLayer SHEEP_LIME_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_lime_head"), "main");
	public static final EntityModelLayer SHEEP_MAGENTA_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_magenta_head"), "main");
	public static final EntityModelLayer SHEEP_ORANGE_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_orange_head"), "main");
	public static final EntityModelLayer SHEEP_PINK_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_pink_head"), "main");
	public static final EntityModelLayer SHEEP_PURPLE_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_purple_head"), "main");
	public static final EntityModelLayer SHEEP_RED_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_red_head"), "main");
	public static final EntityModelLayer SHEEP_WHITE_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_white_head"), "main");
	public static final EntityModelLayer SHEEP_YELLOW_HEAD = new EntityModelLayer(SpectrumCommon.locate("sheep_yellow_head"), "main");
	public static final EntityModelLayer SHULKER_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_head"), "main");
	public static final EntityModelLayer SHULKER_BLACK_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_black_head"), "main");
	public static final EntityModelLayer SHULKER_BLUE_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_blue_head"), "main");
	public static final EntityModelLayer SHULKER_BROWN_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_brown_head"), "main");
	public static final EntityModelLayer SHULKER_CYAN_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_cyan_head"), "main");
	public static final EntityModelLayer SHULKER_GRAY_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_gray_head"), "main");
	public static final EntityModelLayer SHULKER_GREEN_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_green_head"), "main");
	public static final EntityModelLayer SHULKER_LIGHT_BLUE_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_light_blue_head"), "main");
	public static final EntityModelLayer SHULKER_LIGHT_GRAY_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_light_gray_head"), "main");
	public static final EntityModelLayer SHULKER_LIME_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_lime_head"), "main");
	public static final EntityModelLayer SHULKER_MAGENTA_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_magenta_head"), "main");
	public static final EntityModelLayer SHULKER_ORANGE_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_orange_head"), "main");
	public static final EntityModelLayer SHULKER_PINK_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_pink_head"), "main");
	public static final EntityModelLayer SHULKER_PURPLE_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_purple_head"), "main");
	public static final EntityModelLayer SHULKER_RED_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_red_head"), "main");
	public static final EntityModelLayer SHULKER_WHITE_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_white_head"), "main");
	public static final EntityModelLayer SHULKER_YELLOW_HEAD = new EntityModelLayer(SpectrumCommon.locate("shulker_yellow_head"), "main");
	public static final EntityModelLayer SILVERFISH_HEAD = new EntityModelLayer(SpectrumCommon.locate("silverfish_head"), "main");
	public static final EntityModelLayer SLIME_HEAD = new EntityModelLayer(SpectrumCommon.locate("slime_head"), "main");
	public static final EntityModelLayer SNOW_GOLEM_HEAD = new EntityModelLayer(SpectrumCommon.locate("snow_golem_head"), "main");
	public static final EntityModelLayer SPIDER_HEAD = new EntityModelLayer(SpectrumCommon.locate("spider_head"), "main");
	public static final EntityModelLayer SQUID_HEAD = new EntityModelLayer(SpectrumCommon.locate("squid_head"), "main");
	public static final EntityModelLayer STRAY_HEAD = new EntityModelLayer(SpectrumCommon.locate("stray_head"), "main");
	public static final EntityModelLayer STRIDER_HEAD = new EntityModelLayer(SpectrumCommon.locate("strider_head"), "main");
	public static final EntityModelLayer TRADER_LLAMA_HEAD = new EntityModelLayer(SpectrumCommon.locate("trader_llama_head"), "main");
	public static final EntityModelLayer TURTLE_HEAD = new EntityModelLayer(SpectrumCommon.locate("turtle_head"), "main");
	public static final EntityModelLayer VEX_HEAD = new EntityModelLayer(SpectrumCommon.locate("vex_head"), "main");
	public static final EntityModelLayer VILLAGER_HEAD = new EntityModelLayer(SpectrumCommon.locate("villager_head"), "main");
	public static final EntityModelLayer VINDICATOR_HEAD = new EntityModelLayer(SpectrumCommon.locate("vindicator_head"), "main");
	public static final EntityModelLayer WANDERING_TRADER_HEAD = new EntityModelLayer(SpectrumCommon.locate("wandering_trader_head"), "main");
	public static final EntityModelLayer WITCH_HEAD = new EntityModelLayer(SpectrumCommon.locate("witch_head"), "main");
	public static final EntityModelLayer WITHER_HEAD = new EntityModelLayer(SpectrumCommon.locate("wither_head"), "main");
	public static final EntityModelLayer WOLF_HEAD = new EntityModelLayer(SpectrumCommon.locate("wolf_head"), "main");
	public static final EntityModelLayer ZOGLIN_HEAD = new EntityModelLayer(SpectrumCommon.locate("zoglin_head"), "main");
	public static final EntityModelLayer ZOMBIE_VILLAGER_HEAD = new EntityModelLayer(SpectrumCommon.locate("zombie_villager_head"), "main");
	public static final EntityModelLayer ZOMBIFIED_PIGLIN_HEAD = new EntityModelLayer(SpectrumCommon.locate("zombified_piglin_head"), "main");
	public static final EntityModelLayer FROG_TEMPERATE_HEAD = new EntityModelLayer(SpectrumCommon.locate("frog_temperate_head"), "main");
	public static final EntityModelLayer FROG_WARM_HEAD = new EntityModelLayer(SpectrumCommon.locate("frog_warm_head"), "main");
	public static final EntityModelLayer FROG_COLD_HEAD = new EntityModelLayer(SpectrumCommon.locate("frog_cold_head"), "main");
	public static final EntityModelLayer TADPOLE_HEAD = new EntityModelLayer(SpectrumCommon.locate("tadpole_head"), "main");
	public static final EntityModelLayer ALLAY_HEAD = new EntityModelLayer(SpectrumCommon.locate("allay_head"), "main");
	public static final EntityModelLayer WARDEN_HEAD = new EntityModelLayer(SpectrumCommon.locate("warden_head"), "main");
	public static final EntityModelLayer EGG_LAYING_WOOLY_PIG_HEAD = new EntityModelLayer(SpectrumCommon.locate("egg_laying_wooly_pig_head"), "main");
	public static final EntityModelLayer KINDLING_HEAD = new EntityModelLayer(SpectrumCommon.locate("kindling_head"), "main");
	public static final EntityModelLayer PRESERVATION_TURRET_HEAD = new EntityModelLayer(SpectrumCommon.locate("preservation_turret_head"), "main");
	public static final EntityModelLayer MONSTROSITY_HEAD = new EntityModelLayer(SpectrumCommon.locate("monstrosity_head"), "main");
	public static final EntityModelLayer LIZARD_HEAD = new EntityModelLayer(SpectrumCommon.locate("lizard_head"), "main");
	public static final EntityModelLayer ERASER_HEAD = new EntityModelLayer(SpectrumCommon.locate("eraser_head"), "main");

	/**
	 * Armor
	 */
	public static final EntityModelLayer FEET_BEDROCK_LAYER = new EntityModelLayer(SpectrumCommon.locate("bedrock_armor"), "feet");
	public static final EntityModelLayer MAIN_BEDROCK_LAYER = new EntityModelLayer(SpectrumCommon.locate("bedrock_armor"), "main");
	public static final Identifier BEDROCK_ARMOR_LOCATION = SpectrumCommon.locate("textures/armor/bedrock_armor_main.png");
	
	public static void register() {
		EntityModelLayerRegistry.registerModelLayer(WOOLY_PIG, EggLayingWoolyPigEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(WOOLY_PIG_HAT, EggLayingWoolyPigHatEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(WOOLY_PIG_WOOL, EggLayingWoolyPigWoolEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(PRESERVATION_TURRET, PreservationTurretEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(MONSTROSITY, MonstrosityEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(LIZARD_SCALES, LizardEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(LIZARD_FRILLS, LizardEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(LIZARD_HORNS, LizardEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(KINDLING, KindlingEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(KINDLING_ARMOR, KindlingEntityModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(KINDLING_COUGH, KindlingCoughEntityModel::getTexturedModelData);
		
		EntityModelLayerRegistry.registerModelLayer(EGG_LAYING_WOOLY_PIG_HEAD, EggLayingWoolyPigHeadModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(MONSTROSITY_HEAD, MonstrosityHeadModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(KINDLING_HEAD, KindlingHeadModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(LIZARD_HEAD, LizardHeadModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(PRESERVATION_TURRET_HEAD, PreservationTurretHeadModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(WARDEN_HEAD, WardenHeadModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(ENDERMITE_HEAD, EndermiteHeadModel::getTexturedModelData);

		EntityModelLayerRegistry.registerModelLayer(FEET_BEDROCK_LAYER, () -> TexturedModelData.of(BedrockArmorModel.getModelData(), 128, 128));
		EntityModelLayerRegistry.registerModelLayer(MAIN_BEDROCK_LAYER, () -> TexturedModelData.of(BedrockArmorModel.getModelData(), 128, 128));
	}
	
}
