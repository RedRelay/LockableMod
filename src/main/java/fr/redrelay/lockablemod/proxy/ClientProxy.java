package fr.redrelay.lockablemod.proxy;

import fr.redrelay.lockablemod.blocks.LockableModBlock;
import fr.redrelay.lockablemod.items.LockableModItem;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void onPreInit(FMLPreInitializationEvent event) {
		super.onPreInit(event);
		LockableModBlock.registerBlocksModels();
		LockableModItem.registerItemsModels();
	}
	
}
