
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 7  @  2

+ import java.util.List;
+ import java.util.Map;
+ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
+ import net.lax1dude.eaglercraft.v1_8.EaglercraftUUID;
+ 

> CHANGE  4 : 5  @  4 : 8

~ 

> DELETE  23  @  23 : 91

> INSERT  12 : 14  @  12

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> CHANGE  4 : 6  @  4 : 5

~ 	protected static final EaglercraftUUID itemModifierUUID = EaglercraftUUID
~ 			.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");

> CHANGE  1 : 2  @  1 : 2

~ 	protected static EaglercraftRandom itemRand = new EaglercraftRandom();

> INSERT  20 : 58  @  20

+ 	public void loadPluginData(BaseData data) {
+ 		maxStackSize = data.getInt("maxStackSize");
+ 		maxDamage = data.getInt("maxDamage");
+ 		bFull3D = data.getBoolean("bFull3D");
+ 		hasSubtypes = data.getBoolean("hasSubtypes");
+ 		potionEffect = data.getString("potionEffect");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("potionEffect", potionEffect);
+ 		data.set("unlocalizedName", unlocalizedName);
+ 		data.set("hasSubtypes", hasSubtypes);
+ 		data.set("bFull3D", bFull3D);
+ 		data.set("maxDamage", maxDamage);
+ 		data.set("maxStackSize", maxStackSize);
+ 
+ 		data.setCallbackInt("getID", () -> {
+ 			return getIdFromItem(this);
+ 		});
+ 		data.setCallbackObjectWithDataArg("setMaxStackSize", (BaseData params) -> {
+ 			return setMaxStackSize(params.getInt("maxStackSize")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("setHasSubtypes", (BaseData params) -> {
+ 			return setHasSubtypes(params.getBoolean("hasSubtypes")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("setMaxDamage", (BaseData params) -> {
+ 			return setMaxDamage(params.getInt("maxDamageIn")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("setUnlocalizedName", (BaseData params) -> {
+ 			return setUnlocalizedName(params.getString("s")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("setPotionEffect", (BaseData params) -> {
+ 			return setPotionEffect(params.getString("potionEffect")).makePluginData();
+ 		});
+ 		return data;
+ 	}
+ 

> EOF
