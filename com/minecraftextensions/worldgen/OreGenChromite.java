package com.minecraftextensions.worldgen;

import java.util.Random;

import com.minecraftextensions.minecraftextensions;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGenChromite implements IWorldGenerator {
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
{
switch (world.provider.dimensionId)
{
case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
}
}



public void generateSurface(World world, Random random, int chunkX, int chunkZ)
{
	for(int i = 0; i < 13; i++) 
	{
		int randPosX=chunkX + random.nextInt(16);
		int randPosY=random.nextInt(40);
		int randPosZ=chunkZ + random.nextInt(16);
		(new WorldGenMinable(minecraftextensions.ChromiteOre, 6)).generate(world, random, randPosX, randPosY, randPosZ);
	}
	}
}