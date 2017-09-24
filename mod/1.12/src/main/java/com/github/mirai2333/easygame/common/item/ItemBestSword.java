package com.github.mirai2333.easygame.common.item;

import com.github.mirai2333.easygame.common.creativetab.CreativeTabsEasyGame;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemBestSword extends ItemSword{
	public ItemBestSword() {
		super(ToolMaterial.IRON);
		this.setCreativeTab(CreativeTabsEasyGame.TabEasyGame);
	}
}
