package com.loremaster.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.loremaster.tutorialmod.blocks.BlockBase;
import com.loremaster.tutorialmod.blocks.RubyBlock;
import com.loremaster.tutorialmod.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	
}
