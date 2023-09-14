
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 4  @  2 : 4

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;

> INSERT  147 : 215  @  147

+ 
+ 	public void loadPluginData(BaseData data) {
+ 		// Actually we cant load anything
+ 		// _ _
+ 		// \(o-o)/
+ 	}
+ 
+ 	public static Vec3 fromPluginData(BaseData data) {
+ 		return new Vec3(data.getDouble("x"), data.getDouble("y"), data.getDouble("z"));
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("x", xCoord);
+ 		data.set("y", yCoord);
+ 		data.set("z", zCoord);
+ 		data.setCallbackVoidWithDataArg("subtractReverse", (BaseData vec3) -> {
+ 			subtractReverse(Vec3.fromPluginData(vec3));
+ 		});
+ 		data.setCallbackObject("normalize", () -> {
+ 			return normalize().makePluginData();
+ 		});
+ 		data.setCallbackDoubleWithDataArg("dotProduct", (BaseData vec3) -> {
+ 			return dotProduct(Vec3.fromPluginData(vec3));
+ 		});
+ 		data.setCallbackObjectWithDataArg("crossProduct", (BaseData vec3) -> {
+ 			return crossProduct(Vec3.fromPluginData(vec3)).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("subtract", (BaseData params) -> {
+ 			return subtract(params.getDouble("x"), params.getDouble("y"), params.getDouble("z")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("addVector", (BaseData params) -> {
+ 			return addVector(params.getDouble("x"), params.getDouble("y"), params.getDouble("z")).makePluginData();
+ 		});
+ 		data.setCallbackDoubleWithDataArg("distanceTo", (BaseData vec3) -> {
+ 			return distanceTo(Vec3.fromPluginData(vec3));
+ 		});
+ 		data.setCallbackDoubleWithDataArg("squareDistanceTo", (BaseData vec3) -> {
+ 			return squareDistanceTo(Vec3.fromPluginData(vec3));
+ 		});
+ 		data.setCallbackDouble("lengthVector", () -> {
+ 			return lengthVector();
+ 		});
+ 		data.setCallbackObjectWithDataArg("getIntermediateWithXValue", (BaseData params) -> {
+ 			return getIntermediateWithXValue(Vec3.fromPluginData(params.getBaseData("vec")), params.getDouble("x"))
+ 					.makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("getIntermediateWithYValue", (BaseData params) -> {
+ 			return getIntermediateWithYValue(Vec3.fromPluginData(params.getBaseData("vec")), params.getDouble("y"))
+ 					.makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("getIntermediateWithZValue", (BaseData params) -> {
+ 			return getIntermediateWithZValue(Vec3.fromPluginData(params.getBaseData("vec")), params.getDouble("z"))
+ 					.makePluginData();
+ 		});
+ 		data.setCallbackString("toString", () -> {
+ 			return toString();
+ 		});
+ 		data.setCallbackObjectWithDataArg("rotatePitch", (BaseData params) -> {
+ 			return rotatePitch(params.getFloat("pitch")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("rotateYaw", (BaseData params) -> {
+ 			return rotateYaw(params.getFloat("yaw")).makePluginData();
+ 		});
+ 
+ 		return data;
+ 	}
+ 

> EOF
