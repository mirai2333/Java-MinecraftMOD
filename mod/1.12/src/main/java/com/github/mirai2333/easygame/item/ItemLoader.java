package com.github.mirai2333.easygame.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class ItemLoader {
	public static Item goldenEgg = new ItemGoldenEgg();
	public ItemLoader(FMLPreInitializationEvent event) {
		register(goldenEgg,"golden_egg");
	}
	public static void register(Item item,String name) {
		ForgeRegistries.ITEMS.register(goldenEgg.setRegistryName(name));
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(goldenEgg);
	}
	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(),"inventory");
		ModelLoader.setCustomModelResourceLocation(item,0,model);
	}
}
