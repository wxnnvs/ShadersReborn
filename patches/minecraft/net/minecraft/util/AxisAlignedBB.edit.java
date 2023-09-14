
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 4  @  2 : 6

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;

> INSERT  286 : 346  @  286

+ 
+ 	public void loadPluginData(BaseData data) {
+ 		// Actually we cant load anything
+ 		// _ _
+ 		// \(o-o)/
+ 	}
+ 
+ 	public static AxisAlignedBB fromPluginData(BaseData data) {
+ 		return new AxisAlignedBB(data.getDouble("x1"), data.getDouble("y1"), data.getDouble("z1"), data.getDouble("x1"),
+ 				data.getDouble("y1"), data.getDouble("z1"));
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 
+ 		data.set("minX", minX);
+ 		data.set("minY", minY);
+ 		data.set("minZ", minZ);
+ 		data.set("maxX", maxX);
+ 		data.set("maxY", maxY);
+ 		data.set("maxZ", maxZ);
+ 
+ 		data.setCallbackObjectWithDataArg("addCoord", (BaseData params) -> {
+ 			return addCoord(params.getDouble("x"), params.getDouble("y"), params.getDouble("z")).makePluginData();
+ 		});
+ 
+ 		data.setCallbackObjectWithDataArg("contract", (BaseData params) -> {
+ 			return contract(params.getDouble("x"), params.getDouble("y"), params.getDouble("z")).makePluginData();
+ 		});
+ 
+ 		data.setCallbackObjectWithDataArg("expand", (BaseData params) -> {
+ 			return expand(params.getDouble("x"), params.getDouble("y"), params.getDouble("z")).makePluginData();
+ 		});
+ 
+ 		data.setCallbackObjectWithDataArg("offset", (BaseData params) -> {
+ 			return offset(params.getDouble("x"), params.getDouble("y"), params.getDouble("z")).makePluginData();
+ 		});
+ 
+ 		data.setCallbackObjectWithDataArg("union", (BaseData axisAlignedBB) -> {
+ 			return union(AxisAlignedBB.fromPluginData(axisAlignedBB)).makePluginData();
+ 		});
+ 
+ 		data.setCallbackBooleanWithDataArg("intersectsWith", (BaseData axisAlignedBB) -> {
+ 			return intersectsWith(AxisAlignedBB.fromPluginData(axisAlignedBB));
+ 		});
+ 
+ 		data.setCallbackBooleanWithDataArg("isVecInside", (BaseData vec) -> {
+ 			return isVecInside(Vec3.fromPluginData(vec));
+ 		});
+ 		data.setCallbackDouble("getAverageEdgeLength", () -> {
+ 			return getAverageEdgeLength();
+ 		});
+ 
+ 		data.setCallbackString("toString", () -> {
+ 			return toString();
+ 		});
+ 
+ 		return data;
+ 	}
+ 

> EOF
