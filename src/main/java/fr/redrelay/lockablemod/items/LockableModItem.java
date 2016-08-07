package fr.redrelay.lockablemod.items;

import fr.redrelay.lockablemod.LockableMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LockableModItem extends Item{

	private static final CreativeTabs LOCKABLE_CREATIVE_TAB = new CreativeTabs(LockableMod.MODID) {
		
		@Override
		public Item getTabIconItem() {
			return Items.padlock;
		}
	};
	
	protected LockableModItem() {
		this.setCreativeTab(LOCKABLE_CREATIVE_TAB);
	}
	
}
