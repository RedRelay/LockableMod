package fr.redrelay.lockablemod.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
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
		
	}
	
	private static void registerItem(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(itemName);
		GameRegistry.register(item);
	}
}
