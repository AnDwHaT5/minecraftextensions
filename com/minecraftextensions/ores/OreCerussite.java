package com.minecraftextensions.ores;

import java.util.ArrayList;

import com.pixelmonmod.pixelmon.battles.attacks.Attack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class OreCerussite extends Block{

	public OreCerussite(Material material) {
		super(material);
	
	}
	static ArrayList<Attack> attackList = new ArrayList<Attack>();
	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
	blockIcon = p_149651_1_.registerIcon("minecraftextensions:cerussiteore");
	}
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
	return blockIcon;
	}
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		for(int i = 0; i < attackList.size(); i++)
		{
			System.out.println(attackList.get(i));
		}
	return false;
	}
}
