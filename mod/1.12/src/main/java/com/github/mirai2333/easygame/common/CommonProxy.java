package com.github.mirai2333.easygame.common;

import com.github.mirai2333.easygame.common.loader.BlockLoader;
import com.github.mirai2333.easygame.common.loader.BlockSmeltLoader;
import com.github.mirai2333.easygame.common.loader.ItemLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	ItemLoader.register();
    	BlockLoader.register();
    }

    public void init(FMLInitializationEvent event)
    {
    	BlockSmeltLoader.registeSmelting();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}