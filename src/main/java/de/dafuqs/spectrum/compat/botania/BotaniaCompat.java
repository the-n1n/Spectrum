package de.dafuqs.spectrum.compat.botania;

import de.dafuqs.spectrum.compat.*;
import de.dafuqs.spectrum.compat.botania.blocks.*;
import de.dafuqs.spectrum.compat.botania.items.*;
import de.dafuqs.spectrum.registries.*;
import net.fabricmc.fabric.api.item.v1.*;
import net.fabricmc.fabric.api.object.builder.v1.block.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class BotaniaCompat extends SpectrumIntegrationPacks.ModIntegrationPack {

	public static Item BLACKEST_LOTUS = new BlackestLotusItem(new FabricItemSettings());
	public static Block CORPOREA_INTERFACER = new CorporeaInterfacer(FabricBlockSettings.copyOf(SpectrumBlocks.STORAGE_NODE));

	@Override
	public void register() {
		SpectrumItems.register("blacktest_lotus", BLACKEST_LOTUS, DyeColor.BLACK);
		SpectrumBlocks.registerBlockWithItem("corporea_interfacer", CORPOREA_INTERFACER, new FabricItemSettings(), DyeColor.PINK);

		SpectrumBlockEntities.register("corporea_interfacer", CorporeaInterfacerBlockEntity::new, CORPOREA_INTERFACER);
	}
	
	@Override
	public void registerClient() {

	}
	
}
