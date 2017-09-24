package com.github.mirai2333.easygame.common.loader;

import net.minecraft.item.Item;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.client.model.ModelLoader;

import com.github.mirai2333.easygame.common.item.ItemBestSword;
import com.github.mirai2333.easygame.common.item.ItemChromeIngot;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class ItemLoader {
	public static Item bestSword = new ItemBestSword().setUnlocalizedName("bestSword");
	public static Item chromeIngot = new ItemChromeIngot().setUnlocalizedName("chromeIngot");
	public static void register() {
		ForgeRegistries.ITEMS.register(bestSword.setRegistryName("best_sword"));
		ForgeRegistries.ITEMS.register(chromeIngot.setRegistryName("chrome_ingot"));
		OreDictionary.registerOre("ingotChrome", chromeIngot);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(bestSword);
		registerRender(chromeIngot);
	}
	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item,0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}
