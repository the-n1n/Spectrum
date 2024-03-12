package de.dafuqs.spectrum.compat.botania;

import de.dafuqs.spectrum.compat.*;
import de.dafuqs.spectrum.compat.botania.items.*;
import de.dafuqs.spectrum.registries.*;
import net.fabricmc.fabric.api.item.v1.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class BotaniaCompat extends SpectrumIntegrationPacks.ModIntegrationPack {

	public static Item BLACKEST_LOTUS = new BlackestLotusItem(new FabricItemSettings());

	@Override
	public void register() {
		SpectrumItems.register("blackest_lotus", BLACKEST_LOTUS, DyeColor.BLACK);
	}
	
	@Override
	public void registerClient() {

	}
	
}
