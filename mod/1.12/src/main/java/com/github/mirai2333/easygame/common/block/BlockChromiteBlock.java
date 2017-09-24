package com.github.mirai2333.easygame.common.block;

import com.github.mirai2333.easygame.common.creativetab.CreativeTabsEasyGame;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockChromiteBlock extends Block {
	public BlockChromiteBlock() {
		super(Material.ROCK);
		this.setSoundType(SoundType.STONE);
		this.setHardness(50.0f);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTabsEasyGame.TabEasyGame);
	}
}
