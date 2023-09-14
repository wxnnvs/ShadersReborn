
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 4

> CHANGE  3 : 7  @  3 : 21

~ 
~ import com.google.common.collect.Lists;
~ import com.google.common.collect.Maps;
~ 

> INSERT  7 : 8  @  7

+ import net.zxmushroom63.plugins.PluginData;

> INSERT  63 : 82  @  63

+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("enchID", effectId);
+ 		data.set("weight", weight);
+ 		data.set("name", name);
+ 		return data;
+ 	}
+ 
+ 	public static PluginData makePluginDataStatic() {
+ 		PluginData data = new PluginData();
+ 		Map<ResourceLocation, Enchantment> enchMap = locationEnchantments;
+ 		for (Map.Entry<ResourceLocation, Enchantment> entry : enchMap.entrySet()) {
+ 			if (entry.getKey().resourceName != null && entry.getValue() != null) {
+ 				data.set(entry.getKey().resourceName, entry.getValue().makePluginData());
+ 			}
+ 		}
+ 		return data;
+ 	}
+ 

> EOF
