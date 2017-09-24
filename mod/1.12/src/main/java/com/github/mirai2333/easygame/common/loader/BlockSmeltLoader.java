package com.github.mirai2333.easygame.common.loader;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class BlockSmeltLoader {
	public static void registeSmelting() {
		GameRegistry.addSmelting(BlockLoader.chromiteblock,new ItemStack(ItemLoader.chromeIngot),0.5f);
	}
}
