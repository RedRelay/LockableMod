package fr.redrelay.lockablemod;

import org.apache.logging.log4j.Logger;

import fr.redrelay.lockablemod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LockableMod.MODID, version = LockableMod.VERSION, name = LockableMod.MODNAME)
public class LockableMod
{
    public static final String MODID = "lockablemod";
    public static final String VERSION = "0.0";
    public static final String MODNAME = "Lockable Mod";
    
    @SidedProxy(clientSide = "fr.redrelay.lockablemod.proxy.ClientProxy", serverSide = "fr.redrelay.lockablemod.proxy.CommonProxy")
	private static CommonProxy proxy;
    
    @Instance(LockableMod.MODID)
	public static LockableMod instance;
    
    
    private Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    	proxy.onPreInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
       System.out.println("LockableMod initialized");
    }
    
    public static Logger getLogger() {
    	return instance.logger;
    }
}
