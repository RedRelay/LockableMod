package fr.redrelay.lockablemod.items;

import fr.redrelay.lockablemod.LockableMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Items {

	public static final Key key = new Key();
	public static final Padlock padlock = new Padlock();
	
	private Items() {
	}
	
	public static void registerItems() {
		registerItem(key, "key");
		registerItem(padlock, "padlock");
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerItemsModels(){
		ModelLoader.setCustomModelResourceLocation(key, 0, new ModelResourceLocation(LockableMod.MODID + ":key", "inventory"));
		ModelLoader.setCustomModelResourceLocation(padlock, 0, new ModelResourceLocation(LockableMod.MODID + ":padlock", "inventory"));
	}
	
	private static void registerItem(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(LockableMod.MODID+"_"+itemName);
		GameRegistry.register(item);
	}
}
