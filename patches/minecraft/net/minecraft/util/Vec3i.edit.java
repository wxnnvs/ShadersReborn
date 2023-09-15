
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  3  @  3 : 4

> INSERT  1 : 4  @  1

+ import net.zxmushroom63.plugins.PluginData;
+ import net.zxmushroom63.plugins.BaseData;
+ 

> CHANGE  2 : 5  @  2 : 5

~ 	public int x;
~ 	public int y;
~ 	public int z;

> INSERT  23 : 71  @  23

+ 	public void loadPluginData(BaseData data) {
+ 		x = data.getInt("x");
+ 		y = data.getInt("y");
+ 		z = data.getInt("z");
+ 	}
+ 
+ 	public static Vec3i fromPluginData(BaseData data) {
+ 		return new Vec3i(data.getInt("x"), data.getInt("y"), data.getInt("z"));
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.set("x", x);
+ 		data.set("y", y);
+ 		data.set("z", z);
+ 		data.setCallbackInt("hashCode", () -> {
+ 			return hashCode();
+ 		});
+ 		data.setCallbackIntWithDataArg("compareTo", (BaseData vec) -> {
+ 			return compareTo(Vec3i.fromPluginData(vec));
+ 		});
+ 		data.setCallbackInt("getX", () -> {
+ 			return hashCode();
+ 		});
+ 		data.setCallbackInt("getY", () -> {
+ 			return getY();
+ 		});
+ 		data.setCallbackInt("getZ", () -> {
+ 			return getZ();
+ 		});
+ 		data.setCallbackObjectWithDataArg("crossProduct", (BaseData vec) -> {
+ 			return crossProduct(Vec3i.fromPluginData(vec)).makePluginData();
+ 		});
+ 		data.setCallbackDoubleWithDataArg("distanceSq", (BaseData vec) -> {
+ 			return distanceSq(Vec3i.fromPluginData(vec));
+ 		});
+ 		data.setCallbackDoubleWithDataArg("distanceSqToCenter", (BaseData params) -> {
+ 			return distanceSqToCenter(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"));
+ 		});
+ 		data.setCallbackString("toString", () -> {
+ 			return toString();
+ 		});
+ 		return data;
+ 	}
+ 

> EOF
