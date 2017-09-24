package com.github.mirai2333.easygame.common.loader;

import com.github.mirai2333.easygame.common.block.BlockChromiteBlock;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class BlockLoader {
	public static Block chromiteblock = new BlockChromiteBlock().setUnlocalizedName("chromiteBlock");
	//×¢²áblocks
	public static void register() {
		ForgeRegistries.BLOCKS.register(chromiteblock.setRegistryName("chromite_block"));
		ForgeRegistries.ITEMS.register(new ItemBlock(chromiteblock).setRegistryName(chromiteblock.getRegistryName()));
		OreDictionary.registerOre("orechromite", chromiteblock);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(chromiteblock);
	}
	@SideOnly(Side.CLIENT)
	private static void registerRender(Block item) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(item), 0,
				new ModelResourceLocation(item.getRegistryName(),"normal"));
	}
}
