package com.github.mirai2333.easygame.common.item;

import net.minecraft.item.Item;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class ItemLoader {
	public static Item bestSword = new ItemBestSword().setUnlocalizedName("bestSword");
	public static void register() {
		ForgeRegistries.ITEMS.register(bestSword.setRegistryName("best_sword"));
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(bestSword);
	}
	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item,0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}
