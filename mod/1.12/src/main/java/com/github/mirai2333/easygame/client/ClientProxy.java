package com.github.mirai2333.easygame.client;

import com.github.mirai2333.easygame.common.CommonProxy;
import com.github.mirai2333.easygame.common.block.BlockLoader;
import com.github.mirai2333.easygame.common.item.ItemLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}