package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class TaxCollectorRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double amountofitems = 0;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("IRS: " + "Knock Knock, today we need " + entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM + "or else...")), false);
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).TAXCOLLECTORITEM;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) amountofitems, _player.inventoryMenu.getCraftSlots());
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("IRS: You get to live, for now..."), false);
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.taxdue = false;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("IRS: Thats not what i asked for."), false);
		}
	}
}
