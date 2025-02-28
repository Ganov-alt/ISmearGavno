
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ismeargavno.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.ismeargavno.client.gui.RedditorGuiScreen;
import net.mcreator.ismeargavno.client.gui.PhoneRigGuiScreen;
import net.mcreator.ismeargavno.client.gui.HotDogRollerGuiScreen;
import net.mcreator.ismeargavno.client.gui.HomelessGuiScreen;
import net.mcreator.ismeargavno.client.gui.ForginatorGuiScreen;
import net.mcreator.ismeargavno.client.gui.EnhancedstorageunitbloodgyuScreen;
import net.mcreator.ismeargavno.client.gui.DeepDarkTerminalGuiScreen;
import net.mcreator.ismeargavno.client.gui.DeepDarkStorageUnitGuiScreen;
import net.mcreator.ismeargavno.client.gui.DankGuiScreen;
import net.mcreator.ismeargavno.client.gui.CreditCardGuiScreen;
import net.mcreator.ismeargavno.client.gui.CalciumRecombGuiScreen;
import net.mcreator.ismeargavno.client.gui.AginatorGuiScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IsmeargavnoModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(IsmeargavnoModMenus.FORGINATOR_GUI.get(), ForginatorGuiScreen::new);
		event.register(IsmeargavnoModMenus.HOT_DOG_ROLLER_GUI.get(), HotDogRollerGuiScreen::new);
		event.register(IsmeargavnoModMenus.DEEP_DARK_TERMINAL_GUI.get(), DeepDarkTerminalGuiScreen::new);
		event.register(IsmeargavnoModMenus.DEEP_DARK_STORAGE_UNIT_GUI.get(), DeepDarkStorageUnitGuiScreen::new);
		event.register(IsmeargavnoModMenus.ENHANCEDSTORAGEUNITBLOODGYU.get(), EnhancedstorageunitbloodgyuScreen::new);
		event.register(IsmeargavnoModMenus.CALCIUM_RECOMB_GUI.get(), CalciumRecombGuiScreen::new);
		event.register(IsmeargavnoModMenus.AGINATOR_GUI.get(), AginatorGuiScreen::new);
		event.register(IsmeargavnoModMenus.HOMELESS_GUI.get(), HomelessGuiScreen::new);
		event.register(IsmeargavnoModMenus.CREDIT_CARD_GUI.get(), CreditCardGuiScreen::new);
		event.register(IsmeargavnoModMenus.DANK_GUI.get(), DankGuiScreen::new);
		event.register(IsmeargavnoModMenus.PHONE_RIG_GUI.get(), PhoneRigGuiScreen::new);
		event.register(IsmeargavnoModMenus.REDDITOR_GUI.get(), RedditorGuiScreen::new);
	}
}
