
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  5  @  5 : 6

> INSERT  48 : 51  @  48

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginAPI;
+ import net.zxmushroom63.plugins.PluginData;

> DELETE  3  @  3 : 4

> INSERT  22 : 23  @  22

+ 	private StatFileWriter statWriter;

> CHANGE  1 : 2  @  1 : 2

~ 	public EntityPlayerSP(Minecraft mcIn, World worldIn, NetHandlerPlayClient netHandler, StatFileWriter statWriter) {

> DELETE  2  @  2 : 3

> INSERT  2 : 3  @  2

+ 		this.statWriter = statWriter;

> INSERT  19 : 20  @  19

+ 			mc.pluginApi.onUpdate();

> INSERT  8 : 9  @  8

+ 				PluginAPI.callEvent("postmotionupdate", new PluginData());

> INSERT  6 : 11  @  6

+ 		PluginData event = new PluginData();
+ 		event.set("yaw", this.rotationYaw);
+ 		event.set("pitch", this.rotationPitch);
+ 		event.set("onground", this.onGround);
+ 		PluginAPI.callEvent("premotionupdate", event);

> INSERT  83 : 91  @  83

+ 		PluginData event = new PluginData();
+ 		event.set("message", message);
+ 		event.set("preventDefault", false);
+ 		BaseData newEvent = mc.pluginApi.callEvent("sendchatmessage", event);
+ 		if (newEvent.has("preventDefault") && newEvent.getBoolean("preventDefault")) {
+ 			return;
+ 		}
+ 		message = newEvent.has("message") ? newEvent.getString("message") : message;

> EOF
