package fr.redrelay.lockablemod.proxy;

import fr.redrelay.lockablemod.items.Items;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void onPreInit(FMLPreInitializationEvent event) {
		Items.registerItems();
	}
	
}
