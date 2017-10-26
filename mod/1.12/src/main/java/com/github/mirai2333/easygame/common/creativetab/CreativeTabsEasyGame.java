package com.github.mirai2333.easygame.common.creativetab;

import com.github.mirai2333.easygame.common.loader.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsEasyGame extends CreativeTabs{
	public static CreativeTabsEasyGame TabEasyGame = new CreativeTabsEasyGame();
	public CreativeTabsEasyGame() {
		super("easygame");
		this.setBackgroundImageName("easygame.png");
	}
	public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemLoader.bestSword);
    }
}
