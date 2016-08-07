package fr.redrelay.lockablemod.blocks;

import fr.redrelay.lockablemod.proxy.CommonProxy;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class PadlockWorkbench extends LockableModBlock {

	public PadlockWorkbench() {
		super(Material.ANVIL);
		this.setDefaultState(this.blockState.getBaseState().withProperty(BlockHorizontal.FACING, EnumFacing.NORTH));
		this.setCreativeTab(CommonProxy.LOCKABLE_CREATIVE_TAB);
	}

	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		worldIn.setBlockState(pos, state.withProperty(BlockHorizontal.FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}

	@Override
	public IBlockState getStateFromMeta(int meta){
		EnumFacing enumfacing = EnumFacing.getFront(meta);

		if (enumfacing.getAxis() == EnumFacing.Axis.Y)
		{
			enumfacing = EnumFacing.NORTH;
		}

		return this.getDefaultState().withProperty(BlockHorizontal.FACING, enumfacing);
	}

	@Override
	public int getMetaFromState(IBlockState state){
		return ((EnumFacing)state.getValue(BlockHorizontal.FACING)).getIndex();
	}

	@Override
    protected BlockStateContainer createBlockState(){
        return new BlockStateContainer(this, new IProperty[] {BlockHorizontal.FACING});
    }


}
