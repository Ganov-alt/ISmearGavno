package net.mcreator.ismeargavno.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ismeargavno.network.IsmeargavnoModVariables;

public class PocketDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Generated_pocket) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("ismeargavno", "pocketdimensionbetter"));
				if (template != null) {
					template.placeInWorld(_serverworld,
							BlockPos.containing(entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pocketx - 3, entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pockety,
									entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pocketz - 3),
							BlockPos.containing(entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pocketx - 3, entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pockety,
									entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pocketz - 3),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			{
				IsmeargavnoModVariables.PlayerVariables _vars = entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES);
				_vars.Generated_pocket = true;
				_vars.syncPlayerVariables(entity);
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pocketx + 10), (entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pockety + 4), (entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pocketz + 10));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pocketx + 10), (entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pockety + 4),
						(entity.getData(IsmeargavnoModVariables.PLAYER_VARIABLES).Pocketz + 10), _ent.getYRot(), _ent.getXRot());
		}
	}
}
