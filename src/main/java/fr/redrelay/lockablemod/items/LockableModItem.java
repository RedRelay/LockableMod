package fr.redrelay.lockablemod.items;

import fr.redrelay.lockablemod.LockableMod;
import fr.redrelay.lockablemod.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LockableModItem extends Item{

	public static final Key KEY = new Key();
	public static final Padlock PADLOCK = new Padlock();
	
	public static void registerItems() {
		registerItem(KEY, "key");
		registerItem(PADLOCK, "padlock");
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerItemsModels(){
		ModelLoader.setCustomModelResourceLocation(KEY, 0, new ModelResourceLocation(LockableMod.MODID + ":key", "inventory"));
		ModelLoader.setCustomModelResourceLocation(PADLOCK, 0, new ModelResourceLocation(LockableMod.MODID + ":padlock", "inventory"));
	}
	
	public static void registerItem(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(LockableMod.MODID+"_"+itemName);
		GameRegistry.register(item);
	}
	
}
