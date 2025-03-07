package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;
import net.mcreator.ismeargavno.init.IsmeargavnoModItems;

public class TaxCollectorOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double RandoTaxNumber = 0;
		RandoTaxNumber = Math.round(Mth.nextInt(RandomSource.create(), 1, 5));
		if (Math.round(RandoTaxNumber) == 1) {
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TAXCOLLECTORITEM = new ItemStack(IsmeargavnoModItems.GOLD_COIN.get()).copy();
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 64));
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Tax Collector: We need " + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxAmountOfItemsNeeded + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM + ", you have 60 seconds, or else...")),
						false);
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxTimer = 1200;
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.taxdue = true;
				_vars.syncPlayerVariables(entity);
			}
		} else if (Math.round(RandoTaxNumber) == 2) {
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TAXCOLLECTORITEM = new ItemStack(Items.DIAMOND).copy();
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 16));
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Tax Collector: We need " + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxAmountOfItemsNeeded + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM + ", you have 60 seconds, or else...")),
						false);
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxTimer = 1200;
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.taxdue = true;
				_vars.syncPlayerVariables(entity);
			}
		} else if (Math.round(RandoTaxNumber) == 3) {
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TAXCOLLECTORITEM = new ItemStack(Items.EMERALD).copy();
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 8));
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Tax Collector: We need " + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxAmountOfItemsNeeded + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM + ", you have 60 seconds, or else...")),
						false);
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxTimer = 1200;
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.taxdue = true;
				_vars.syncPlayerVariables(entity);
			}
		} else if (Math.round(RandoTaxNumber) == 4) {
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TAXCOLLECTORITEM = new ItemStack(Blocks.DIRT).copy();
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 32));
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Tax Collector: We need " + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxAmountOfItemsNeeded + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM + ", you have 60 seconds, or else...")),
						false);
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxTimer = 1200;
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.taxdue = true;
				_vars.syncPlayerVariables(entity);
			}
		} else if (Math.round(RandoTaxNumber) == 5) {
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TAXCOLLECTORITEM = new ItemStack(IsmeargavnoModItems.DOWNVOTE.get()).copy();
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxAmountOfItemsNeeded = Math.round(Mth.nextInt(RandomSource.create(), 1, 3));
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						("Tax Collector: We need " + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TaxAmountOfItemsNeeded + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM + ", you have 60 seconds, or else...")),
						false);
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.TaxTimer = 1200;
				_vars.syncPlayerVariables(entity);
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.taxdue = true;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
