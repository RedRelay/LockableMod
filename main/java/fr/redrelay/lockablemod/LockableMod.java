package fr.redrelay.lockablemod;

import fr.redrelay.lockablemod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = LockableMod.MODID, version = LockableMod.VERSION)
public class LockableMod
{
    public static final String MODID = "lockablemod";
    public static final String VERSION = "0.0";
    
    @SidedProxy(clientSide = "fr.redrelay.lockablemod.proxy.ClientProxy", serverSide = "fr.redrelay.lockablemod.proxy.CommonProxy")
	private static CommonProxy proxy;
    
    @Instance(LockableMod.MODID)
	public static LockableMod instance;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
       System.out.println("LockableMod initialized");
    }
}
