package de.dafuqs.spectrum.compat.botania;

import de.dafuqs.spectrum.compat.*;
import de.dafuqs.spectrum.registries.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class BotaniaCompat extends SpectrumIntegrationPacks.ModIntegrationPack {
	
	public static Item BLACKEST_LOTUS;
	
	@Override
	public void register() {
		Item BLACKEST_LOTUS = new BlackestLotusItem(SpectrumItems.IS.of());
		SpectrumItems.register("blackest_lotus", BLACKEST_LOTUS, DyeColor.BLACK);
	}
	
	@Override
	public void registerClient() {
	
	}
	
}
