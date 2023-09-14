
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  3 : 5  @  3 : 135

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
~ 

> DELETE  9  @  9 : 11

> INSERT  19 : 21  @  19

+ import net.zxmushroom63.plugins.PluginData;
+ import net.zxmushroom63.plugins.BaseData;

> INSERT  77 : 112  @  77

+ 	public void loadPluginData(BaseData data) {
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("unlocalizedName", unlocalizedName);
+ 		data.set("slipperiness", slipperiness);
+ 		data.set("blockParticleGravity", blockParticleGravity);
+ 
+ 		data.set("minX", minX);
+ 		data.set("minY", minY);
+ 		data.set("minZ", minZ);
+ 		data.set("maxX", maxX);
+ 		data.set("maxY", maxY);
+ 		data.set("maxZ", maxZ);
+ 
+ 		data.set("blockMaterial", blockMaterial.makePluginData());
+ 
+ 		data.set("enableStats", enableStats);
+ 		data.set("needsRandomTick", needsRandomTick);
+ 		data.set("isBlockContainer", isBlockContainer);
+ 		data.set("useNeighborBrightness", useNeighborBrightness);
+ 		data.set("translucent", translucent);
+ 		data.set("fullBlock", fullBlock);
+ 
+ 		data.set("lightOpacity", lightOpacity);
+ 		data.set("lightValue", lightValue);
+ 		data.set("blockHardness", blockHardness);
+ 		data.set("blockResistance", blockResistance);
+ 		data.setCallbackInt("getID", () -> {
+ 			return getIdFromBlock(this);
+ 		});
+ 		return data;
+ 	}
+ 

> CHANGE  247 : 248  @  247 : 248

~ 	public void randomTick(World world, BlockPos blockpos, IBlockState iblockstate, EaglercraftRandom random) {

> CHANGE  3 : 4  @  3 : 4

~ 	public void updateTick(World var1, BlockPos var2, IBlockState var3, EaglercraftRandom var4) {

> CHANGE  2 : 3  @  2 : 3

~ 	public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, EaglercraftRandom rand) {

> CHANGE  18 : 19  @  18 : 19

~ 	public int quantityDropped(EaglercraftRandom random) {

> CHANGE  3 : 4  @  3 : 4

~ 	public Item getItemDropped(IBlockState var1, EaglercraftRandom var2, int var3) {

> DELETE  15  @  15 : 17

> DELETE  1  @  1 : 11

> CHANGE  3 : 4  @  3 : 13

~ 

> DELETE  3  @  3 : 11

> CHANGE  252 : 253  @  252 : 253

~ 	public int quantityDroppedWithBonus(int fortune, EaglercraftRandom random) {

> INSERT  136 : 137  @  136

+ 		bootstrapStates();

> INSERT  468 : 508  @  468

+ 	public static void bootstrapStates() {
+ 		BlockBed.bootstrapStates();
+ 		BlockDirt.bootstrapStates();
+ 		BlockDoor.bootstrapStates();
+ 		BlockDoublePlant.bootstrapStates();
+ 		BlockFlowerPot.bootstrapStates();
+ 		BlockHugeMushroom.bootstrapStates();
+ 		BlockLever.bootstrapStates();
+ 		BlockLog.bootstrapStates();
+ 		BlockNewLeaf.bootstrapStates();
+ 		BlockNewLog.bootstrapStates();
+ 		BlockOldLeaf.bootstrapStates();
+ 		BlockOldLog.bootstrapStates();
+ 		BlockPistonExtension.bootstrapStates();
+ 		BlockPistonMoving.bootstrapStates();
+ 		BlockPlanks.bootstrapStates();
+ 		BlockPrismarine.bootstrapStates();
+ 		BlockQuartz.bootstrapStates();
+ 		BlockRail.bootstrapStates();
+ 		BlockRailDetector.bootstrapStates();
+ 		BlockRailPowered.bootstrapStates();
+ 		BlockRedSandstone.bootstrapStates();
+ 		BlockRedstoneComparator.bootstrapStates();
+ 		BlockRedstoneWire.bootstrapStates();
+ 		BlockSand.bootstrapStates();
+ 		BlockSandStone.bootstrapStates();
+ 		BlockSapling.bootstrapStates();
+ 		BlockSilverfish.bootstrapStates();
+ 		BlockSlab.bootstrapStates();
+ 		BlockStairs.bootstrapStates();
+ 		BlockStone.bootstrapStates();
+ 		BlockStoneBrick.bootstrapStates();
+ 		BlockStoneSlab.bootstrapStates();
+ 		BlockStoneSlabNew.bootstrapStates();
+ 		BlockTallGrass.bootstrapStates();
+ 		BlockTrapDoor.bootstrapStates();
+ 		BlockWall.bootstrapStates();
+ 		BlockWoodSlab.bootstrapStates();
+ 	}
+ 

> INSERT  43 : 47  @  43

+ 
+ 	public boolean eaglerShadersShouldRenderGlassHighlights() {
+ 		return false;
+ 	}

> EOF
