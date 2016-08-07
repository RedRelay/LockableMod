package fr.redrelay.lockablemod.items;

import fr.redrelay.lockablemod.proxy.CommonProxy;

public class Padlock extends LockableModItem {

	protected Padlock() {
		//TODO remove this line because cannot be obtained using creative inventory
		this.setCreativeTab(CommonProxy.LOCKABLE_CREATIVE_TAB);
	}
	
}
