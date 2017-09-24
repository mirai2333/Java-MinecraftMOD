package com.github.mirai2333.easygame;

import org.apache.logging.log4j.Logger;

import com.github.mirai2333.easygame.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EasyGame.MODID,name = EasyGame.NAME,version = EasyGame.VERSION,acceptedMinecraftVersions = "1.12")
public class EasyGame {
	public static final String MODID = "easygame";
	public static final String NAME = "EasyGame";
	public static final String VERSION = "1.0.0";
	
	@SidedProxy(clientSide = "com.github.mirai2333.easygame.client.ClientProxy", 
            serverSide = "com.github.mirai2333.easygame.common.CommonProxy")
    public static CommonProxy proxy;
	
	private Logger logger;
	
	@Instance(MODID)
	public static EasyGame instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
	public Logger getlogger() {
		return logger;
	}
	
}
