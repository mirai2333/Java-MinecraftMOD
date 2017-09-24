package com.github.mirai2333.easygame.common.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	public static Block block = new BlockChromiteBlock().setUnlocalizedName("chromiteBlock");
	public static void register() {
		ForgeRegistries.BLOCKS.register(block.setRegistryName("chromite_block"));
		ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(block);
	}
	@SideOnly(Side.CLIENT)
	private static void registerRender(Block item) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(item), 0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}
