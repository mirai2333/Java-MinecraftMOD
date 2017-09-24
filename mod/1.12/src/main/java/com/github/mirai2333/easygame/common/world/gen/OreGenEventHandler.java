package com.github.mirai2333.easygame.common.world.gen;

import com.github.mirai2333.easygame.common.loader.BlockLoader;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OreGenEventHandler {
	private static WorldGenerator worldGenMinable = 
			new WorldGenMinable(BlockLoader.chromiteblock.getDefaultState(),16);
	public static void register() {
		MinecraftForge.ORE_GEN_BUS.register(OreGenEventHandler.class);
	}
	@SubscribeEvent
	public static void onGenerateMinable(OreGenEvent.GenerateMinable event){
	    if (event.getType() != OreGenEvent.GenerateMinable.EventType.IRON)
	        return;

	    if (!TerrainGen.generateOre(event.getWorld(), event.getRand(), worldGenMinable, event.getPos(), OreGenEvent.GenerateMinable.EventType.CUSTOM))
	        return;

	    for (int i = 0; i < 4; i++)
	    {
	        int posX = event.getPos().getX() + event.getRand().nextInt(16);
	        int posY = 16 + event.getRand().nextInt(16);
	        int posZ = event.getPos().getZ() + event.getRand().nextInt(16);
	        BlockPos blockpos = new BlockPos(posX, posY, posZ);
	        worldGenMinable.generate(event.getWorld(), event.getRand(), blockpos);
	    }
	}
}
