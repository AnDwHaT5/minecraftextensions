package com.minecraftextensions;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.minecraftextensions.ores.OreCerussite;
import com.minecraftextensions.ores.OreChromite;
import com.minecraftextensions.ores.OreGalena;
import com.minecraftextensions.worldgen.OreGenCerussite;
import com.minecraftextensions.worldgen.OreGenChromite;
import com.pixelmonmod.pixelmon.battles.attacks.Attack;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(name="MinecraftExtensions", modid="minecraftextensions", version="1.0.0")
public class minecraftextensions
{
	static ArrayList<Attack> attackList = new ArrayList<Attack>();
	public static Block ChromiteOre;
	public static Block CerussiteOre;
	public static Block GalenaOre;
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
		 ChromiteOre = new OreChromite(Material.rock).setBlockName("chromiteore").setBlockTextureName("minecraftextensions:chromiteore").setHardness(4).setCreativeTab(CreativeTabs.tabBlock);
		 CerussiteOre = new OreCerussite(Material.rock).setBlockName("cerussiteore").setBlockTextureName("minecraftextensions:cerussiteore").setHardness(4).setCreativeTab(CreativeTabs.tabBlock);
		 GalenaOre = new OreGalena(Material.rock).setBlockName("galenaore").setBlockTextureName("minecraftextensions:galenaore").setHardness(4).setCreativeTab(CreativeTabs.tabBlock);
		 GameRegistry.registerBlock(ChromiteOre, ChromiteOre.getUnlocalizedName().substring(5));
		 GameRegistry.registerBlock(CerussiteOre, CerussiteOre.getUnlocalizedName().substring(5));
		 GameRegistry.registerBlock(GalenaOre, GalenaOre.getUnlocalizedName().substring(5));
    }
  
  @Mod.EventHandler
  public void load(FMLInitializationEvent event) {
	  
	  
	  GameRegistry.registerWorldGenerator(new OreGenChromite(), 1);
	  GameRegistry.registerWorldGenerator(new OreGenCerussite(), 1);

  }
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event)
  {
		
	  for(int i = 0; i < attackList.size(); i++)
		{
			System.out.println(attackList.get(i));
		}
  }
  
  @Mod.EventHandler
  public void serverStarting(FMLServerStartingEvent event) {}
}
