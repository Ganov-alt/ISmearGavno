
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.ismeargavno.world.inventory.RedditorGuiMenu;
import net.mcreator.ismeargavno.world.inventory.PhoneRigGuiMenu;
import net.mcreator.ismeargavno.world.inventory.HotDogRollerGuiMenu;
import net.mcreator.ismeargavno.world.inventory.HomelessGuiMenu;
import net.mcreator.ismeargavno.world.inventory.ForginatorGuiMenu;
import net.mcreator.ismeargavno.world.inventory.EnhancedstorageunitbloodgyuMenu;
import net.mcreator.ismeargavno.world.inventory.DistillationContainerGuiMenu;
import net.mcreator.ismeargavno.world.inventory.DeepDarkTerminalGuiMenu;
import net.mcreator.ismeargavno.world.inventory.DeepDarkStorageUnitGuiMenu;
import net.mcreator.ismeargavno.world.inventory.DankGuiMenu;
import net.mcreator.ismeargavno.world.inventory.CreditCardGuiMenu;
import net.mcreator.ismeargavno.world.inventory.CalciumRecombGuiMenu;
import net.mcreator.ismeargavno.world.inventory.AginatorGuiMenu;
import net.mcreator.ismeargavno.IsmeargavnoMod;

public class IsmeargavnoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, IsmeargavnoMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<ForginatorGuiMenu>> FORGINATOR_GUI = REGISTRY.register("forginator_gui", () -> IMenuTypeExtension.create(ForginatorGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HotDogRollerGuiMenu>> HOT_DOG_ROLLER_GUI = REGISTRY.register("hot_dog_roller_gui", () -> IMenuTypeExtension.create(HotDogRollerGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DeepDarkTerminalGuiMenu>> DEEP_DARK_TERMINAL_GUI = REGISTRY.register("deep_dark_terminal_gui", () -> IMenuTypeExtension.create(DeepDarkTerminalGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DeepDarkStorageUnitGuiMenu>> DEEP_DARK_STORAGE_UNIT_GUI = REGISTRY.register("deep_dark_storage_unit_gui", () -> IMenuTypeExtension.create(DeepDarkStorageUnitGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EnhancedstorageunitbloodgyuMenu>> ENHANCEDSTORAGEUNITBLOODGYU = REGISTRY.register("enhancedstorageunitbloodgyu", () -> IMenuTypeExtension.create(EnhancedstorageunitbloodgyuMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CalciumRecombGuiMenu>> CALCIUM_RECOMB_GUI = REGISTRY.register("calcium_recomb_gui", () -> IMenuTypeExtension.create(CalciumRecombGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AginatorGuiMenu>> AGINATOR_GUI = REGISTRY.register("aginator_gui", () -> IMenuTypeExtension.create(AginatorGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HomelessGuiMenu>> HOMELESS_GUI = REGISTRY.register("homeless_gui", () -> IMenuTypeExtension.create(HomelessGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CreditCardGuiMenu>> CREDIT_CARD_GUI = REGISTRY.register("credit_card_gui", () -> IMenuTypeExtension.create(CreditCardGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DankGuiMenu>> DANK_GUI = REGISTRY.register("dank_gui", () -> IMenuTypeExtension.create(DankGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PhoneRigGuiMenu>> PHONE_RIG_GUI = REGISTRY.register("phone_rig_gui", () -> IMenuTypeExtension.create(PhoneRigGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RedditorGuiMenu>> REDDITOR_GUI = REGISTRY.register("redditor_gui", () -> IMenuTypeExtension.create(RedditorGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DistillationContainerGuiMenu>> DISTILLATION_CONTAINER_GUI = REGISTRY.register("distillation_container_gui", () -> IMenuTypeExtension.create(DistillationContainerGuiMenu::new));
}
