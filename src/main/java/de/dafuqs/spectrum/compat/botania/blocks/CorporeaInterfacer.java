package de.dafuqs.spectrum.compat.botania.blocks;

import de.dafuqs.spectrum.blocks.pastel_network.nodes.*;
import net.minecraft.block.*;
import net.minecraft.block.entity.*;
import net.minecraft.util.math.*;

public class CorporeaInterfacer extends PastelNodeBlock {

	public CorporeaInterfacer(Settings settings) {
		super(settings, PastelNodeType.STORAGE);
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new CorporeaInterfacerBlockEntity(pos, state);
	}

}
