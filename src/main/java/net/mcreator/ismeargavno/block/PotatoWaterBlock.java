
package net.mcreator.ismeargavno.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.ismeargavno.init.IsmeargavnoModFluids;

public class PotatoWaterBlock extends LiquidBlock {
	public PotatoWaterBlock() {
		super(IsmeargavnoModFluids.POTATO_WATER.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
