package fr.redrelay.lockablemod.items;

import fr.redrelay.lockablemod.proxy.CommonProxy;

public class Key extends LockableModItem {

	protected Key() {
		//TODO remove this line because cannot be obtained using creative inventory
		this.setCreativeTab(CommonProxy.LOCKABLE_CREATIVE_TAB);
	}
	
}
