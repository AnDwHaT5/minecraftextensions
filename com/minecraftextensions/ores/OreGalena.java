package com.minecraftextensions.ores;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class OreGalena extends Block{

	public OreGalena(Material material) {
		super(material);
	
	}
	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
	blockIcon = p_149651_1_.registerIcon("minecraftextensions:galenaore");
	}
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
	return blockIcon;
	}
}
