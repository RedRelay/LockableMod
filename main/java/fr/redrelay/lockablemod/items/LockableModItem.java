package fr.redrelay.lockablemod.items;

import fr.redrelay.lockablemod.LockableMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LockableModItem extends Item{

	private static final CreativeTabs LOCKABLE_CREATIVE_TAB = new CreativeTabs(LockableMod.MODNAME) {
		
		@Override
		public Item getTabIconItem() {
			return Items.key;
		}
	};
	
	protected LockableModItem() {
		this.setCreativeTab(LOCKABLE_CREATIVE_TAB);
	}
	
}