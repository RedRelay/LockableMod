package fr.redrelay.lockablemod.proxy;

import fr.redrelay.lockablemod.items.Items;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void onPreInit(FMLPreInitializationEvent event) {
		super.onPreInit(event);
		Items.registerItemsModels();
	}
	
}
