package fr.redrelay.lockablemod.proxy;

import fr.redrelay.lockablemod.LockableMod;
import fr.redrelay.lockablemod.blocks.LockableModBlock;
import fr.redrelay.lockablemod.items.LockableModItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public static final CreativeTabs LOCKABLE_CREATIVE_TAB = new CreativeTabs(LockableMod.MODID) {
		
		@Override
		public Item getTabIconItem() {
			return LockableModItem.PADLOCK;
		}
	};
	
	public void onPreInit(FMLPreInitializationEvent event) {
		LockableModBlock.registerBlocks();
		LockableModItem.registerItems();
	}
	
}
