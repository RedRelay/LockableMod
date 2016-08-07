package fr.redrelay.lockablemod.blocks;

import fr.redrelay.lockablemod.LockableMod;
import fr.redrelay.lockablemod.items.LockableModItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LockableModBlock extends Block {

	public static final PadlockWorkbench PADLOCK_WORKBENCH = new PadlockWorkbench(); 
	
	protected LockableModBlock(Material materialIn) {
		super(materialIn);
	}
	
	public static void registerBlocks() {
		registerBlock(PADLOCK_WORKBENCH, "padlock_workbench");
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerBlocksModels(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(PADLOCK_WORKBENCH), 0, new ModelResourceLocation(LockableMod.MODID + ":padlock_workbench", "inventory"));
	}
	
	public static void registerBlock(Block block, String blockName) {
		block.setRegistryName(blockName);
		block.setUnlocalizedName(LockableMod.MODID+"_"+blockName);
		GameRegistry.register(block);
		ItemBlock itemBlock = new ItemBlock(block);
		LockableModItem.registerItem(itemBlock, blockName);
	}

}
