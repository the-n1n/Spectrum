package de.dafuqs.spectrum.compat.botania.blocks;

import de.dafuqs.spectrum.blocks.pastel_network.nodes.*;
import net.fabricmc.fabric.api.transfer.v1.item.*;
import net.fabricmc.fabric.api.transfer.v1.storage.*;
import net.fabricmc.fabric.api.transfer.v1.storage.base.*;
import net.fabricmc.fabric.api.transfer.v1.transaction.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import vazkii.botania.api.corporea.*;

import java.util.*;

public class CorporeaInterfacerBlockEntity extends PastelNodeBlockEntity {

	public CorporeaInterfacerBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(blockPos, blockState);
	}

	public @Nullable Storage<ItemVariant> getConnectedStorage() {
		return new CorporeaStorage();
	}

	private CorporeaSpark getSpark() {
		return CorporeaHelper.instance().getSparkForBlock(world, pos);
	}

	public class CorporeaStorage implements ExtractionOnlyStorage<ItemVariant> {

		@Override
		public long extract(ItemVariant resource, long maxAmount, TransactionContext transaction) {
			CorporeaSpark spark = getSpark();
			CorporeaResult result = CorporeaHelper.instance().requestItem(new CorporeaRequestMatcher() {
				@Override
				public boolean test(ItemStack stack) {
					return resource.matches(stack);
				}
			}, (int) maxAmount, spark, null, true);
			List<ItemStack> stacks = result.stacks();
			int count = result.extractedCount();
			spark.onItemsRequested(stacks);

			return count;
		}

		@Override
		public Iterator<StorageView<ItemVariant>> iterator() {
			return new Iterator<>() {
				@Override
				public boolean hasNext() {
					return false;
				}

				@Override
				public StorageView<ItemVariant> next() {
					return null;
				}
			};
		}
	}

}
