package com.github.mirai2333.easygame.common;

import com.github.mirai2333.easygame.common.block.BlockLoader;
import com.github.mirai2333.easygame.common.item.ItemLoader;

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

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}