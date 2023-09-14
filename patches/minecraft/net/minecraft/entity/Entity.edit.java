
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  2 : 3  @  2

+ import java.util.HashMap;

> CHANGE  1 : 6  @  1 : 3

~ import java.util.Map;
~ 
~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
~ import net.lax1dude.eaglercraft.v1_8.EaglercraftUUID;
~ import net.lax1dude.eaglercraft.v1_8.HString;

> INSERT  1 : 2  @  1

+ 

> CHANGE  7 : 8  @  7 : 10

~ import net.minecraft.client.Minecraft;

> DELETE  4  @  4 : 7

> DELETE  3  @  3 : 4

> DELETE  8  @  8 : 9

> CHANGE  14 : 16  @  14 : 15

~ import net.zxmushroom63.plugins.BaseData;
~ import net.zxmushroom63.plugins.PluginData;

> CHANGE  1 : 2  @  1 : 2

~ public abstract class Entity {

> CHANGE  28 : 29  @  28 : 29

~ 	public boolean isInWeb;

> CHANGE  15 : 16  @  15 : 16

~ 	protected EaglercraftRandom rand;

> CHANGE  27 : 28  @  27 : 29

~ 	protected EaglercraftUUID entityUniqueID;

> INSERT  9 : 12  @  9

+ 	/**
+ 	 * + Called by the /kill command.
+ 	 */

> CHANGE  11 : 12  @  11 : 12

~ 		this.rand = new EaglercraftRandom();

> DELETE  3  @  3 : 4

> INSERT  29 : 34  @  29

+ 	/**
+ 	 * + Keeps moving the entity up so it isn't colliding with blocks and other
+ 	 * requirements for this entity to be spawned (only actually used on players
+ 	 * though its also on Entity)
+ 	 */

> INSERT  16 : 19  @  16

+ 	/**
+ 	 * + Will get destroyed next tick.
+ 	 */

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Sets the width and height of the entity. Args: width, height
+ 	 */

> DELETE  10  @  10 : 13

> INSERT  4 : 7  @  4

+ 	/**
+ 	 * + Sets the rotation of the entity. Args: yaw, pitch (both in degrees)
+ 	 */

> INSERT  5 : 9  @  5

+ 	/**
+ 	 * + Sets the x,y,z of the entity from the given parameters. Also seems to set
+ 	 * up a bounding box.
+ 	 */

> INSERT  10 : 14  @  10

+ 	/**
+ 	 * + Adds 15% to the entity's yaw and subtracts 15% from the pitch. Clamps pitch
+ 	 * from -90 to 90. Both arguments in degrees.
+ 	 */

> INSERT  10 : 16  @  10

+ 	/**
+ 	 * + Called to update the entity's position/logic.
+ 	 */
+ 	/**
+ 	 * + Called to update the entity's position/logic.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Gets called every tick from main Entity class
+ 	 */
+ 	/**
+ 	 * + Gets called every tick from main Entity class
+ 	 */

> DELETE  12  @  12 : 27

> DELETE  1  @  1 : 23

> CHANGE  2 : 3  @  2 : 14

~ 		this.fire = 0;

> DELETE  1  @  1 : 5

> DELETE  9  @  9 : 13

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Return the amount of time this entity should stay in a portal before being
+ 	 * transported.
+ 	 */
+ 	/**
+ 	 * + Return the amount of time this entity should stay in a portal before being
+ 	 * transported.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Called whenever the entity is walking inside of lava.
+ 	 */
+ 	/**
+ 	 * + Called whenever the entity is walking inside of lava.
+ 	 */

> INSERT  7 : 15  @  7

+ 	/**
+ 	 * + Sets entity to burn for x amount of seconds, cannot lower amount of
+ 	 * existing fire.
+ 	 */
+ 	/**
+ 	 * + Sets entity to burn for x amount of seconds, cannot lower amount of
+ 	 * existing fire.
+ 	 */

> INSERT  9 : 15  @  9

+ 	/**
+ 	 * + Removes fire from entity.
+ 	 */
+ 	/**
+ 	 * + Removes fire from entity.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + sets the dead flag. Used when you fall off the bottom of the world.
+ 	 */
+ 	/**
+ 	 * + sets the dead flag. Used when you fall off the bottom of the world.
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Checks if the offset position from the entity's current position is inside
+ 	 * of liquid. Args: x, y, z
+ 	 */
+ 	/**
+ 	 * + Checks if the offset position from the entity's current position is inside
+ 	 * of liquid. Args: x, y, z
+ 	 */

> INSERT  5 : 11  @  5

+ 	/**
+ 	 * + Determines if a liquid is present within the specified AxisAlignedBB.
+ 	 */
+ 	/**
+ 	 * + Determines if a liquid is present within the specified AxisAlignedBB.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Tries to moves the entity by the passed in displacement. Args: x, y, z
+ 	 */
+ 	/**
+ 	 * + Tries to moves the entity by the passed in displacement. Args: x, y, z
+ 	 */

> CHANGE  75 : 76  @  75 : 76

~ 			for (AxisAlignedBB axisalignedbb1 : (List<AxisAlignedBB>) list1) {

> CHANGE  6 : 7  @  6 : 7

~ 			for (AxisAlignedBB axisalignedbb2 : (List<AxisAlignedBB>) list1) {

> CHANGE  5 : 6  @  5 : 6

~ 			for (AxisAlignedBB axisalignedbb13 : (List<AxisAlignedBB>) list1) {

> CHANGE  17 : 18  @  17 : 18

~ 				for (AxisAlignedBB axisalignedbb6 : (List<AxisAlignedBB>) list) {

> CHANGE  6 : 7  @  6 : 7

~ 				for (AxisAlignedBB axisalignedbb7 : (List<AxisAlignedBB>) list) {

> CHANGE  6 : 7  @  6 : 7

~ 				for (AxisAlignedBB axisalignedbb8 : (List<AxisAlignedBB>) list) {

> CHANGE  7 : 8  @  7 : 8

~ 				for (AxisAlignedBB axisalignedbb9 : (List<AxisAlignedBB>) list) {

> CHANGE  6 : 7  @  6 : 7

~ 				for (AxisAlignedBB axisalignedbb10 : (List<AxisAlignedBB>) list) {

> CHANGE  6 : 7  @  6 : 7

~ 				for (AxisAlignedBB axisalignedbb11 : (List<AxisAlignedBB>) list) {

> CHANGE  18 : 19  @  18 : 19

~ 				for (AxisAlignedBB axisalignedbb12 : (List<AxisAlignedBB>) list) {

> INSERT  112 : 120  @  112

+ 	/**
+ 	 * + Resets the entity's position to the center (planar) and bottom (vertical)
+ 	 * points of its bounding box.
+ 	 */
+ 	/**
+ 	 * + Resets the entity's position to the center (planar) and bottom (vertical)
+ 	 * points of its bounding box.
+ 	 */

> INSERT  60 : 70  @  60

+ 	/**
+ 	 * +
+ 	 * 
+ 	 * @return True if this entity will not play sounds
+ 	 */
+ 	/**
+ 	 * +
+ 	 * 
+ 	 * @return True if this entity will not play sounds
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + When set to true the entity will not play sounds.
+ 	 */
+ 	/**
+ 	 * + When set to true the entity will not play sounds.
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + returns if this entity triggers Block.onEntityWalking on the blocks they
+ 	 * walk on. used for spiders and wolves to prevent them from trampling crops
+ 	 */
+ 	/**
+ 	 * + returns if this entity triggers Block.onEntityWalking on the blocks they
+ 	 * walk on. used for spiders and wolves to prevent them from trampling crops
+ 	 */

> INSERT  21 : 27  @  21

+ 	/**
+ 	 * + Returns the collision bounding box for this entity
+ 	 */
+ 	/**
+ 	 * + Returns the collision bounding box for this entity
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Will deal the specified amount of damage to the entity if the entity isn't
+ 	 * immune to fire damage. Args: amountDamage
+ 	 */
+ 	/**
+ 	 * + Will deal the specified amount of damage to the entity if the entity isn't
+ 	 * immune to fire damage. Args: amountDamage
+ 	 */

> INSERT  18 : 26  @  18

+ 	/**
+ 	 * + Checks if this entity is either in water or on an open air block in rain
+ 	 * (used in wolves).
+ 	 */
+ 	/**
+ 	 * + Checks if this entity is either in water or on an open air block in rain
+ 	 * (used in wolves).
+ 	 */

> INSERT  6 : 14  @  6

+ 	/**
+ 	 * + Checks if this entity is inside water (if inWater field is true as a result
+ 	 * of handleWaterMovement() returning true)
+ 	 */
+ 	/**
+ 	 * + Checks if this entity is inside water (if inWater field is true as a result
+ 	 * of handleWaterMovement() returning true)
+ 	 */

> INSERT  4 : 363  @  4

+ 	public void loadPluginData(BaseData data) {
+ 		posX = data.getDouble("x");
+ 		posY = data.getDouble("y");
+ 		posZ = data.getDouble("z");
+ 		motionX = data.getDouble("motionX");
+ 		motionY = data.getDouble("motionY");
+ 		motionZ = data.getDouble("motionZ");
+ 		rotationYaw = data.getFloat("yaw");
+ 		rotationPitch = data.getFloat("pitch");
+ 		isInWeb = data.getBoolean("isInWeb");
+ 		onGround = data.getBoolean("onGround");
+ 		noClip = data.getBoolean("noClip");
+ 		stepHeight = data.getFloat("stepHeight");
+ 		isCollided = data.getBoolean("isCollided");
+ 		isCollidedHorizontally = data.getBoolean("isCollidedHorizontally");
+ 		isCollidedVertically = data.getBoolean("isCollidedVertically");
+ 		inPortal = data.getBoolean("inPortal");
+ 		inWater = data.getBoolean("inWater");
+ 		isAirBorne = data.getBoolean("isAirBorne");
+ 		invulnerable = data.getBoolean("invulnerable");
+ 		isImmuneToFire = data.getBoolean("isImmuneToFire");
+ 		isOutsideBorder = data.getBoolean("isOutsideBorder");
+ 		entityCollisionReduction = data.getFloat("entityCollisionReduction");
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("x", posX);
+ 		data.set("y", posY);
+ 		data.set("z", posZ);
+ 		data.set("chunkCoordX", chunkCoordX);
+ 		data.set("chunkCoordY", chunkCoordY);
+ 		data.set("chunkCoordZ", chunkCoordZ);
+ 		data.set("motionX", motionX);
+ 		data.set("motionY", motionY);
+ 		data.set("motionZ", motionZ);
+ 		data.set("yaw", rotationYaw);
+ 		data.set("pitch", rotationPitch);
+ 		data.set("isInWeb", isInWeb);
+ 		data.set("isCollided", isCollided);
+ 		data.set("isCollidedVertically", isCollidedVertically);
+ 		data.set("isCollidedHorizontally", isCollidedHorizontally);
+ 		data.set("onGround", onGround);
+ 		data.set("dimension", dimension);
+ 		data.set("id", entityId);
+ 		data.set("fallDistance", fallDistance);
+ 		data.set("noClip", noClip);
+ 		data.set("stepHeight", stepHeight);
+ 		data.set("isDead", isDead);
+ 		data.set("inPortal", inPortal);
+ 		data.set("inWater", inWater);
+ 		data.set("isAirBorne", isAirBorne);
+ 		data.set("ticksExisted", ticksExisted);
+ 		data.set("invulnerable", invulnerable);
+ 		data.set("isImmuneToFire", isImmuneToFire);
+ 		data.set("isOutsideBorder", isOutsideBorder);
+ 		data.set("entityCollisionReduction", entityCollisionReduction);
+ 		data.set("ticksExisted", ticksExisted);
+ 
+ 		data.setCallbackBoolean("isBurning", () -> {
+ 			/**
+ 			 * + Returns true if the entity is on fire. Used by render to add the fire
+ 			 * effect on rendering.
+ 			 */
+ 			return isBurning();
+ 		});
+ 		data.setCallbackBoolean("isPushedByWater", () -> {
+ 			return isPushedByWater();
+ 		});
+ 		data.setCallbackBoolean("isEating", () -> {
+ 			return isEating();
+ 		});
+ 		data.setCallbackBoolean("isEntityAlive", () -> {
+ 			/**
+ 			 * + Checks whether target entity is alive.
+ 			 */
+ 			return isEntityAlive();
+ 		});
+ 		data.setCallbackBoolean("isEntityInsideOpaqueBlock", () -> {
+ 			/**
+ 			 * + Checks if this entity is inside of an opaque block
+ 			 */
+ 			return isEntityInsideOpaqueBlock();
+ 		});
+ 		data.setCallbackBoolean("isImmuneToExplosions", () -> {
+ 			return isImmuneToExplosions();
+ 		});
+ 		data.setCallbackBoolean("isImmuneToFire", () -> {
+ 			return isImmuneToFire();
+ 		});
+ 		data.setCallbackBoolean("isInLava", () -> {
+ 			return isInLava();
+ 		});
+ 		data.setCallbackBooleanWithDataArg("isInRangeToRender3d", (BaseData params) -> {
+ 			return isInRangeToRender3d(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"));
+ 		});
+ 		data.setCallbackBooleanWithDataArg("isInRangeToRenderDist", (BaseData params) -> {
+ 			/**
+ 			 * + Checks if the entity is in range to render by using the past in distance
+ 			 * and comparing it to its average edge length * 64 * renderDistanceWeight Args:
+ 			 * distance
+ 			 */
+ 			return isInRangeToRenderDist(params.getDouble("distance"));
+ 		});
+ 		data.setCallbackBoolean("isInWater", () -> {
+ 			/**
+ 			 * + Checks if this entity is inside water (if inWater field is true as a result
+ 			 * of handleWaterMovement() returning true)
+ 			 */
+ 			return isInWater();
+ 		});
+ 		data.setCallbackBoolean("isInvisible", () -> {
+ 			return isInvisible();
+ 		});
+ 		data.setCallbackBoolean("isPushedByWater", () -> {
+ 			return isPushedByWater();
+ 		});
+ 		data.setCallbackBoolean("isRiding", () -> {
+ 			/**
+ 			 * + Returns true if the entity is riding another entity, used by render to
+ 			 * rotate the legs to be in 'sit' position for players.
+ 			 */
+ 			return isRiding();
+ 		});
+ 		data.setCallbackBoolean("isSilent", () -> {
+ 			/**
+ 			 * +
+ 			 * 
+ 			 * @return True if this entity will not play sounds
+ 			 */
+ 			return isSilent();
+ 		});
+ 		data.setCallbackBoolean("isSneaking", () -> {
+ 			/**
+ 			 * + Returns if this entity is sneaking.
+ 			 */
+ 			return isSneaking();
+ 		});
+ 		data.setCallbackBoolean("isSprinting", () -> {
+ 			/**
+ 			 * + Get if the Entity is sprinting.
+ 			 */
+ 			return isSprinting();
+ 		});
+ 		data.setCallbackBoolean("isWet", () -> {
+ 			/**
+ 			 * + Checks if this entity is either in water or on an open air block in rain
+ 			 * (used in wolves).
+ 			 */
+ 			return isWet();
+ 		});
+ 
+ 		data.setCallbackVoidWithDataArg("setAir", (BaseData params) -> {
+ 			setAir(params.getInt("air"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setAlwaysRenderNameTag", (BaseData params) -> {
+ 			setAlwaysRenderNameTag(params.getBoolean("alwaysRenderNameTag"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setAngles", (BaseData params) -> {
+ 			setAngles(params.getFloat("yaw"), params.getFloat("pitch"));
+ 		});
+ 		data.setCallbackVoid("setBeenAttacked", () -> {
+ 			setBeenAttacked();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setCustomNameTag", (BaseData params) -> {
+ 			setCustomNameTag(params.getString("name"));
+ 		});
+ 		data.setCallbackVoid("setDead", () -> {
+ 			setDead();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setEating", (BaseData params) -> {
+ 			setEating(params.getBoolean("eating"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setEntityId", (BaseData params) -> {
+ 			setEntityId(params.getInt("id"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setFire", (BaseData params) -> {
+ 			setFire(params.getInt("seconds"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setFlag", (BaseData params) -> {
+ 			setFlag(params.getInt("flag"), params.getBoolean("set"));
+ 		});
+ 		data.setCallbackVoid("setInWeb", () -> {
+ 			setInWeb();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setInvisible", (BaseData params) -> {
+ 			setInvisible(params.getBoolean("invisible"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setLocationAndAngles", (BaseData params) -> {
+ 			setLocationAndAngles(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"),
+ 					params.getFloat("yaw"), params.getFloat("pitch"));
+ 		});
+ 		data.setCallbackVoid("setOnFireFromLava", () -> {
+ 			setOnFireFromLava();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setOutsideBorder", (BaseData params) -> {
+ 			setOutsideBorder(params.getBoolean("outsideBorder"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setPosition", (BaseData params) -> {
+ 			setPosition(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setPositionAndRotation", (BaseData params) -> {
+ 			setPositionAndRotation(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"),
+ 					params.getFloat("yaw"), params.getFloat("pitch"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setPositionAndRotation2", (BaseData params) -> {
+ 			setPositionAndRotation2(params.getDouble("d0"), params.getDouble("d1"), params.getDouble("d2"),
+ 					params.getFloat("f"), params.getFloat("f1"), params.getInt("var9"), params.getBoolean("var10"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setPositionAndUpdate", (BaseData params) -> {
+ 			setPositionAndUpdate(params.getDouble("d0"), params.getDouble("d1"), params.getDouble("d2"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setRotation", (BaseData params) -> {
+ 			setRotation(params.getFloat("yaw"), params.getFloat("pitch"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setRotationYawHead", (BaseData params) -> {
+ 			setRotationYawHead(params.getFloat("rotation"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setSilent", (BaseData params) -> {
+ 			setSilent(params.getBoolean("isSilent"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setSize", (BaseData params) -> {
+ 			setSize(params.getFloat("f"), params.getFloat("f1"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setSneaking", (BaseData params) -> {
+ 			setSneaking(params.getBoolean("sneaking"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setSprinting", (BaseData params) -> {
+ 			setSprinting(params.getBoolean("flag"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setVelocity", (BaseData params) -> {
+ 			setVelocity(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"));
+ 		});
+ 
+ 		// Todo: add other getters and other functions. When I get told to! hahhahahah
+ 		data.setCallbackString("getUUID", () -> {
+ 			return entityUniqueID.toString();
+ 		});
+ 
+ 		data.setCallbackInt("getAir", () -> {
+ 			return getAir();
+ 		});
+ 		data.setCallbackBoolean("getAlwaysRenderNameTag", () -> {
+ 			return getAlwaysRenderNameTag();
+ 		});
+ 		data.setCallbackBoolean("getAlwaysRenderNameTagForRender", () -> {
+ 			return getAlwaysRenderNameTagForRender();
+ 		});
+ 		data.setCallbackFloatWithDataArg("getBrightness", (BaseData params) -> {
+ 			return getBrightness(params.getFloat("var1"));
+ 		});
+ 		data.setCallbackIntWithDataArg("getBrightnessForRender", (BaseData params) -> {
+ 			return getBrightnessForRender(params.getFloat("var1"));
+ 		});
+ 		data.setCallbackFloat("getCollisionBorderSize", () -> {
+ 			return getCollisionBorderSize();
+ 		});
+ 		data.setCallbackObject("GetCollisionBoundingBox", () -> {
+ 			return getCollisionBoundingBox().makePluginData();
+ 		});
+ 		data.setCallbackObject("getCommandSenderEntity", () -> {
+ 			return getCommandSenderEntity().makePluginData();
+ 		});
+ 		data.setCallbackString("getCustomNameTag", () -> {
+ 			return getCustomNameTag();
+ 		});
+ 		data.setCallbackString("getDisplayName", () -> {
+ 			return getDisplayName().getUnformattedText();
+ 		});
+ 		data.setCallbackString("getDisplayNameFormatted", () -> {
+ 			return getDisplayName().getFormattedText();
+ 		});
+ 		data.setCallbackDoubleWithDataArg("getDistance", (BaseData params) -> {
+ 			return getDistance(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"));
+ 		});
+ 		data.setCallbackDoubleWithDataArg("getDistanceSq", (BaseData params) -> {
+ 			return getDistanceSq(params.getDouble("x"), params.getDouble("y"), params.getDouble("z"));
+ 		});
+ 		data.setCallbackDouble("getMountedYOffset", () -> {
+ 			return getMountedYOffset();
+ 		});
+ 		data.setCallbackInt("getEntityId", () -> {
+ 			return getEntityId();
+ 		});
+ 		data.setCallbackString("getEntityString", () -> {
+ 			return getEntityString();
+ 		});
+ 		data.setCallbackFloat("getEyeHeight", () -> {
+ 			return getEyeHeight();
+ 		});
+ 		data.setCallbackBooleanWithDataArg("getFlag", (BaseData params) -> {
+ 			return getFlag(params.getInt("flag"));
+ 		});
+ 		data.setCallbackInt("getMaxFallHeight", () -> {
+ 			return getMaxFallHeight();
+ 		});
+ 		data.setCallbackInt("getMaxInPortalTime", () -> {
+ 			return getMaxInPortalTime();
+ 		});
+ 		data.setCallbackString("getName", () -> {
+ 			return getName();
+ 		});
+ 		data.setCallbackObjectArr("getParts", () -> {
+ 			Entity[] entityArr = getParts();
+ 			PluginData[] arr = new PluginData[entityArr.length];
+ 			for (int i = 0; i < entityArr.length; i++) {
+ 				if (entityArr[i] != null) {
+ 					arr[i] = entityArr[i].makePluginData();
+ 				} else {
+ 					arr[i] = new PluginData();
+ 				}
+ 			}
+ 			return arr;
+ 		});
+ 		data.setCallbackInt("getPortalCooldown", () -> {
+ 			return getPortalCooldown();
+ 		});
+ 		data.setCallbackFloat("getRotationYawHead", () -> {
+ 			return getRotationYawHead();
+ 		});
+ 		data.setCallbackString("getSplashSound", () -> {
+ 			return getSplashSound();
+ 		});
+ 		data.setCallbackString("getSwimSound", () -> {
+ 			return getSwimSound();
+ 		});
+ 		data.setCallbackDouble("getYOffset", () -> {
+ 			return getYOffset();
+ 		});
+ 		data.setCallbackString("getClassName", () -> {
+ 			return getClass().getSimpleName();
+ 		});
+ 		data.setCallbackObject("getPositionVector", () -> {
+ 			return getPositionVector().makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("getPositionEyes", (BaseData params) -> {
+ 			return getPositionEyes(params.getFloat("partialTicks")).makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("getLook", (BaseData params) -> {
+ 			return getLook(params.getFloat("partialTicks")).makePluginData();
+ 		});
+ 		data.setCallbackObject("getLookVec", () -> {
+ 			return getLookVec().makePluginData();
+ 		});
+ 		data.setCallbackObjectWithDataArg("getVectorForRotation", (BaseData params) -> {
+ 			return getVectorForRotation(params.getFloat("yaw"), params.getFloat("pitch")).makePluginData();
+ 		});
+ 
+ 		return data;
+ 	}
+ 
+ 	/**
+ 	 * + Returns if this entity is in water and will end up adding the waters
+ 	 * velocity to the entity
+ 	 */
+ 	/**
+ 	 * + Returns if this entity is in water and will end up adding the waters
+ 	 * velocity to the entity
+ 	 */

> INSERT  18 : 26  @  18

+ 	/**
+ 	 * + sets the players height back to normal after doing things like sleeping and
+ 	 * dieing
+ 	 */
+ 	/**
+ 	 * + sets the players height back to normal after doing things like sleeping and
+ 	 * dieing
+ 	 */

> INSERT  27 : 35  @  27

+ 	/**
+ 	 * + Attempts to create sprinting particles if the entity is sprinting and not
+ 	 * in water.
+ 	 */
+ 	/**
+ 	 * + Attempts to create sprinting particles if the entity is sprinting and not
+ 	 * in water.
+ 	 */

> INSERT  28 : 36  @  28

+ 	/**
+ 	 * + Checks if the current block the entity is within of the specified material
+ 	 * type
+ 	 */
+ 	/**
+ 	 * + Checks if the current block the entity is within of the specified material
+ 	 * type
+ 	 */

> INSERT  22 : 28  @  22

+ 	/**
+ 	 * + Used in both water and by flying objects
+ 	 */
+ 	/**
+ 	 * + Used in both water and by flying objects
+ 	 */

> INSERT  23 : 29  @  23

+ 	/**
+ 	 * + Gets how bright this entity is.
+ 	 */
+ 	/**
+ 	 * + Gets how bright this entity is.
+ 	 */

> INSERT  5 : 11  @  5

+ 	/**
+ 	 * + Sets the reference to the World object.
+ 	 */
+ 	/**
+ 	 * + Sets the reference to the World object.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Sets the entity's position and rotation.
+ 	 */
+ 	/**
+ 	 * + Sets the entity's position and rotation.
+ 	 */

> INSERT  24 : 30  @  24

+ 	/**
+ 	 * + Sets the location and Yaw/Pitch of an entity in the world
+ 	 */
+ 	/**
+ 	 * + Sets the location and Yaw/Pitch of an entity in the world
+ 	 */

> INSERT  9 : 15  @  9

+ 	/**
+ 	 * + Returns the distance to the entity. Args: entity
+ 	 */
+ 	/**
+ 	 * + Returns the distance to the entity. Args: entity
+ 	 */

> INSERT  7 : 13  @  7

+ 	/**
+ 	 * + Gets the squared distance to the position. Args: x, y, z
+ 	 */
+ 	/**
+ 	 * + Gets the squared distance to the position. Args: x, y, z
+ 	 */

> INSERT  7 : 13  @  7

+ 	/**
+ 	 * + Gets the squared distance to the position. Args: x, y, z
+ 	 */
+ 	/**
+ 	 * + Gets the squared distance to the position. Args: x, y, z
+ 	 */

> INSERT  8 : 14  @  8

+ 	/**
+ 	 * + Gets the distance to the position. Args: x, y, z
+ 	 */
+ 	/**
+ 	 * + Gets the distance to the position. Args: x, y, z
+ 	 */

> INSERT  7 : 13  @  7

+ 	/**
+ 	 * + Returns the squared distance to the entity. Args: entity
+ 	 */
+ 	/**
+ 	 * + Returns the squared distance to the entity. Args: entity
+ 	 */

> INSERT  7 : 13  @  7

+ 	/**
+ 	 * + Called by a player entity when they collide with an entity
+ 	 */
+ 	/**
+ 	 * + Called by a player entity when they collide with an entity
+ 	 */

> INSERT  3 : 11  @  3

+ 	/**
+ 	 * + Applies a velocity to each of the entities pushing them away from each
+ 	 * other. Args: entity
+ 	 */
+ 	/**
+ 	 * + Applies a velocity to each of the entities pushing them away from each
+ 	 * other. Args: entity
+ 	 */

> INSERT  34 : 40  @  34

+ 	/**
+ 	 * + Adds to the current velocity of the entity. Args: x, y, z
+ 	 */
+ 	/**
+ 	 * + Adds to the current velocity of the entity. Args: x, y, z
+ 	 */

> INSERT  7 : 13  @  7

+ 	/**
+ 	 * + Sets that this entity has been attacked.
+ 	 */
+ 	/**
+ 	 * + Sets that this entity has been attacked.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Called when the entity is attacked.
+ 	 */
+ 	/**
+ 	 * + Called when the entity is attacked.
+ 	 */

> INSERT  9 : 15  @  9

+ 	/**
+ 	 * + interpolated look vector
+ 	 */
+ 	/**
+ 	 * + interpolated look vector
+ 	 */

> INSERT  10 : 16  @  10

+ 	/**
+ 	 * + Creates a Vec3 using the pitch and yaw of the entities rotation.
+ 	 */
+ 	/**
+ 	 * + Creates a Vec3 using the pitch and yaw of the entities rotation.
+ 	 */

> INSERT  28 : 36  @  28

+ 	/**
+ 	 * + Returns true if other Entities should be prevented from moving through this
+ 	 * Entity.
+ 	 */
+ 	/**
+ 	 * + Returns true if other Entities should be prevented from moving through this
+ 	 * Entity.
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Returns true if this entity should push and be pushed by other entities
+ 	 * when colliding.
+ 	 */
+ 	/**
+ 	 * + Returns true if this entity should push and be pushed by other entities
+ 	 * when colliding.
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Adds a value to the player score. Currently not actually used and the
+ 	 * entity passed in does nothing. Args: entity, scoreToAdd
+ 	 */
+ 	/**
+ 	 * + Adds a value to the player score. Currently not actually used and the
+ 	 * entity passed in does nothing. Args: entity, scoreToAdd
+ 	 */

> INSERT  11 : 21  @  11

+ 	/**
+ 	 * + Checks if the entity is in range to render by using the past in distance
+ 	 * and comparing it to its average edge length * 64 * renderDistanceWeight Args:
+ 	 * distance
+ 	 */
+ 	/**
+ 	 * + Checks if the entity is in range to render by using the past in distance
+ 	 * and comparing it to its average edge length * 64 * renderDistanceWeight Args:
+ 	 * distance
+ 	 */

> INSERT  10 : 18  @  10

+ 	/**
+ 	 * + Like writeToNBTOptional but does not check if the entity is ridden. Used
+ 	 * for saving ridden entities with their riders.
+ 	 */
+ 	/**
+ 	 * + Like writeToNBTOptional but does not check if the entity is ridden. Used
+ 	 * for saving ridden entities with their riders.
+ 	 */

> INSERT  11 : 23  @  11

+ 	/**
+ 	 * + Either write this entity to the NBT tag given and return true, or return
+ 	 * false without doing anything. If this returns false the entity is not saved
+ 	 * on disk. Ridden entities return false here as they are saved with their
+ 	 * rider.
+ 	 */
+ 	/**
+ 	 * + Either write this entity to the NBT tag given and return true, or return
+ 	 * false without doing anything. If this returns false the entity is not saved
+ 	 * on disk. Ridden entities return false here as they are saved with their
+ 	 * rider.
+ 	 */

> INSERT  11 : 19  @  11

+ 	/**
+ 	 * + Save the entity to NBT (calls an abstract helper method to write extra
+ 	 * data)
+ 	 */
+ 	/**
+ 	 * + Save the entity to NBT (calls an abstract helper method to write extra
+ 	 * data)
+ 	 */

> DELETE  20  @  20 : 21

> INSERT  20 : 28  @  20

+ 	/**
+ 	 * + Reads the entity from NBT (calls an abstract helper method to read
+ 	 * specialized data)
+ 	 */
+ 	/**
+ 	 * + Reads the entity from NBT (calls an abstract helper method to read
+ 	 * specialized data)
+ 	 */

> CHANGE  35 : 37  @  35 : 36

~ 				this.entityUniqueID = new EaglercraftUUID(tagCompund.getLong("UUIDMost"),
~ 						tagCompund.getLong("UUIDLeast"));

> CHANGE  1 : 2  @  1 : 2

~ 				this.entityUniqueID = EaglercraftUUID.fromString(tagCompund.getString("UUID"));

> DELETE  9  @  9 : 10

> INSERT  18 : 24  @  18

+ 	/**
+ 	 * + Returns the string that identifies this Entity's class
+ 	 */
+ 	/**
+ 	 * + Returns the string that identifies this Entity's class
+ 	 */

> INSERT  11 : 17  @  11

+ 	/**
+ 	 * + creates a NBT list from the array of doubles passed to this function
+ 	 */
+ 	/**
+ 	 * + creates a NBT list from the array of doubles passed to this function
+ 	 */

> INSERT  10 : 16  @  10

+ 	/**
+ 	 * + Returns a new NBTTagList filled with the specified floats
+ 	 */
+ 	/**
+ 	 * + Returns a new NBTTagList filled with the specified floats
+ 	 */

> INSERT  18 : 24  @  18

+ 	/**
+ 	 * + Drops an item at the position of the entity.
+ 	 */
+ 	/**
+ 	 * + Drops an item at the position of the entity.
+ 	 */

> INSERT  12 : 18  @  12

+ 	/**
+ 	 * + Checks whether target entity is alive.
+ 	 */
+ 	/**
+ 	 * + Checks whether target entity is alive.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Checks if this entity is inside of an opaque block
+ 	 */
+ 	/**
+ 	 * + Checks if this entity is inside of an opaque block
+ 	 */

> INSERT  27 : 33  @  27

+ 	/**
+ 	 * + First layer of player interaction
+ 	 */
+ 	/**
+ 	 * + First layer of player interaction
+ 	 */

> INSERT  4 : 14  @  4

+ 	/**
+ 	 * + Returns a boundingBox used to collide the entity with other entities and
+ 	 * blocks. This enables the entity to be pushable on contact, like boats or
+ 	 * minecarts.
+ 	 */
+ 	/**
+ 	 * + Returns a boundingBox used to collide the entity with other entities and
+ 	 * blocks. This enables the entity to be pushable on contact, like boats or
+ 	 * minecarts.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Handles updating while being ridden by an entity
+ 	 */
+ 	/**
+ 	 * + Handles updating while being ridden by an entity
+ 	 */

> INSERT  62 : 68  @  62

+ 	/**
+ 	 * + Returns the Y Offset of this entity.
+ 	 */
+ 	/**
+ 	 * + Returns the Y Offset of this entity.
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Returns the Y offset from the entity's position for any entity riding this
+ 	 * one.
+ 	 */
+ 	/**
+ 	 * + Returns the Y offset from the entity's position for any entity riding this
+ 	 * one.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Called when a player mounts an entity. e.g. mounts a pig, mounts a boat.
+ 	 */
+ 	/**
+ 	 * + Called when a player mounts an entity. e.g. mounts a pig, mounts a boat.
+ 	 */

> CHANGE  38 : 39  @  38 : 39

~ 			for (AxisAlignedBB axisalignedbb : (List<AxisAlignedBB>) list) {

> INSERT  15 : 21  @  15

+ 	/**
+ 	 * + returns a (normalized) vector of where this entity is looking
+ 	 */
+ 	/**
+ 	 * + returns a (normalized) vector of where this entity is looking
+ 	 */

> DELETE  8  @  8 : 29

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Return the amount of cooldown before this entity can use a portal again.
+ 	 */
+ 	/**
+ 	 * + Return the amount of cooldown before this entity can use a portal again.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Sets the velocity to the args. Args: x, y, z
+ 	 */
+ 	/**
+ 	 * + Sets the velocity to the args. Args: x, y, z
+ 	 */

> INSERT  9 : 17  @  9

+ 	/**
+ 	 * + Setups the entity to do the hurt animation. Only used by packets in
+ 	 * multiplayer.
+ 	 */
+ 	/**
+ 	 * + Setups the entity to do the hurt animation. Only used by packets in
+ 	 * multiplayer.
+ 	 */

> INSERT  3 : 9  @  3

+ 	/**
+ 	 * + returns the inventory of this entity (only used in EntityPlayerMP it seems)
+ 	 */
+ 	/**
+ 	 * + returns the inventory of this entity (only used in EntityPlayerMP it seems)
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Sets the held item, or an armor slot. Slot 0 is held item. Slot 1-4 is
+ 	 * armor. Params: Item, slot
+ 	 */
+ 	/**
+ 	 * + Sets the held item, or an armor slot. Slot 0 is held item. Slot 1-4 is
+ 	 * armor. Params: Item, slot
+ 	 */

> INSERT  3 : 11  @  3

+ 	/**
+ 	 * + Returns true if the entity is on fire. Used by render to add the fire
+ 	 * effect on rendering.
+ 	 */
+ 	/**
+ 	 * + Returns true if the entity is on fire. Used by render to add the fire
+ 	 * effect on rendering.
+ 	 */

> CHANGE  1 : 2  @  1 : 2

~ 		boolean flag = this.worldObj != null;

> INSERT  3 : 11  @  3

+ 	/**
+ 	 * + Returns true if the entity is riding another entity, used by render to
+ 	 * rotate the legs to be in 'sit' position for players.
+ 	 */
+ 	/**
+ 	 * + Returns true if the entity is riding another entity, used by render to
+ 	 * rotate the legs to be in 'sit' position for players.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Returns if this entity is sneaking.
+ 	 */
+ 	/**
+ 	 * + Returns if this entity is sneaking.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Sets the sneaking flag.
+ 	 */
+ 	/**
+ 	 * + Sets the sneaking flag.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Get if the Entity is sprinting.
+ 	 */
+ 	/**
+ 	 * + Get if the Entity is sprinting.
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Set sprinting switch for Entity.
+ 	 */
+ 	/**
+ 	 * + Set sprinting switch for Entity.
+ 	 */

> INSERT  8 : 20  @  8

+ 	/**
+ 	 * + Only used by renderer in EntityLivingBase subclasses.\nDetermines if an
+ 	 * entity is visible or not to a specfic player, if the entity is normally
+ 	 * invisible.\nFor EntityLivingBase subclasses, returning false when invisible
+ 	 * will render the entity semitransparent.
+ 	 */
+ 	/**
+ 	 * + Only used by renderer in EntityLivingBase subclasses.\nDetermines if an
+ 	 * entity is visible or not to a specfic player, if the entity is normally
+ 	 * invisible.\nFor EntityLivingBase subclasses, returning false when invisible
+ 	 * will render the entity semitransparent.
+ 	 */

> INSERT  16 : 26  @  16

+ 	/**
+ 	 * + Returns true if the flag is active for the entity. Known flags: 0) is
+ 	 * burning; 1) is sneaking; 2) is riding something; 3) is sprinting; 4) is
+ 	 * eating
+ 	 */
+ 	/**
+ 	 * + Returns true if the flag is active for the entity. Known flags: 0) is
+ 	 * burning; 1) is sneaking; 2) is riding something; 3) is sprinting; 4) is
+ 	 * eating
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Enable or disable a entity flag, see getEntityFlag to read the know flags.
+ 	 */
+ 	/**
+ 	 * + Enable or disable a entity flag, see getEntityFlag to read the know flags.
+ 	 */

> INSERT  18 : 24  @  18

+ 	/**
+ 	 * + Called when a lightning bolt hits the entity.
+ 	 */
+ 	/**
+ 	 * + Called when a lightning bolt hits the entity.
+ 	 */

> INSERT  9 : 15  @  9

+ 	/**
+ 	 * + This method gets called when the entity kills another one.
+ 	 */
+ 	/**
+ 	 * + This method gets called when the entity kills another one.
+ 	 */

> INSERT  64 : 70  @  64

+ 	/**
+ 	 * + Sets the Entity inside a web block.
+ 	 */
+ 	/**
+ 	 * + Sets the Entity inside a web block.
+ 	 */

> INSERT  5 : 13  @  5

+ 	/**
+ 	 * + Gets the name of this command sender (usually username, but possibly
+ 	 * "Rcon")
+ 	 */
+ 	/**
+ 	 * + Gets the name of this command sender (usually username, but possibly
+ 	 * "Rcon")
+ 	 */

> INSERT  13 : 19  @  13

+ 	/**
+ 	 * + Return the Entity parts making up this Entity (currently only for dragons)
+ 	 */
+ 	/**
+ 	 * + Return the Entity parts making up this Entity (currently only for dragons)
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Returns true if Entity argument is equal to this Entity
+ 	 */
+ 	/**
+ 	 * + Returns true if Entity argument is equal to this Entity
+ 	 */

> INSERT  8 : 14  @  8

+ 	/**
+ 	 * + Sets the head's yaw rotation of the entity.
+ 	 */
+ 	/**
+ 	 * + Sets the head's yaw rotation of the entity.
+ 	 */

> INSERT  6 : 12  @  6

+ 	/**
+ 	 * + If returns false, the item will not inflict any damage against entities.
+ 	 */
+ 	/**
+ 	 * + If returns false, the item will not inflict any damage against entities.
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Called when a player attacks an entity. If this returns true the attack
+ 	 * will not happen.
+ 	 */
+ 	/**
+ 	 * + Called when a player attacks an entity. If this returns true the attack
+ 	 * will not happen.
+ 	 */

> CHANGE  5 : 6  @  5 : 6

~ 		return HString.format("%s[\'%s\'/%d, l=\'%s\', x=%.2f, y=%.2f, z=%.2f]",

> INSERT  9 : 17  @  9

+ 	/**
+ 	 * + Sets this entity's location and angles to the location and angles of the
+ 	 * passed in entity.
+ 	 */
+ 	/**
+ 	 * + Sets this entity's location and angles to the location and angles of the
+ 	 * passed in entity.
+ 	 */

> INSERT  5 : 13  @  5

+ 	/**
+ 	 * + Prepares this entity in new dimension by copying NBT data from entity in
+ 	 * old dimension
+ 	 */
+ 	/**
+ 	 * + Prepares this entity in new dimension by copying NBT data from entity in
+ 	 * old dimension
+ 	 */

> INSERT  10 : 18  @  10

+ 	/**
+ 	 * + Teleports the entity to another dimension. Params: Dimension number to
+ 	 * teleport to
+ 	 */
+ 	/**
+ 	 * + Teleports the entity to another dimension. Params: Dimension number to
+ 	 * teleport to
+ 	 */

> DELETE  1  @  1 : 35

> INSERT  2 : 8  @  2

+ 	/**
+ 	 * + Explosion resistance of a block relative to this entity
+ 	 */
+ 	/**
+ 	 * + Explosion resistance of a block relative to this entity
+ 	 */

> INSERT  9 : 17  @  9

+ 	/**
+ 	 * + The maximum height from where the entity is alowed to jump (used in
+ 	 * pathfinder)
+ 	 */
+ 	/**
+ 	 * + The maximum height from where the entity is alowed to jump (used in
+ 	 * pathfinder)
+ 	 */

> INSERT  12 : 20  @  12

+ 	/**
+ 	 * + Return whether this entity should NOT trigger a pressure plate or a
+ 	 * tripwire.
+ 	 */
+ 	/**
+ 	 * + Return whether this entity should NOT trigger a pressure plate or a
+ 	 * tripwire.
+ 	 */

> CHANGE  7 : 8  @  7 : 8

~ 				return EntityList.getEntityString(Entity.this) + " (" + Entity.this.getClass().getName() + ")";

> CHANGE  8 : 9  @  8 : 9

~ 		category.addCrashSection("Entity\'s Exact location", HString.format("%.2f, %.2f, %.2f",

> CHANGE  4 : 5  @  4 : 5

~ 		category.addCrashSection("Entity\'s Momentum", HString.format("%.2f, %.2f, %.2f", new Object[] {

> INSERT  13 : 19  @  13

+ 	/**
+ 	 * + Return whether this entity should be rendered as on fire.
+ 	 */
+ 	/**
+ 	 * + Return whether this entity should be rendered as on fire.
+ 	 */

> CHANGE  4 : 5  @  4 : 5

~ 	public EaglercraftUUID getUniqueID() {

> INSERT  7 : 15  @  7

+ 	/**
+ 	 * + Get the formatted ChatComponent that will be used for the sender's username
+ 	 * in chat
+ 	 */
+ 	/**
+ 	 * + Get the formatted ChatComponent that will be used for the sender's username
+ 	 * in chat
+ 	 */

> INSERT  7 : 13  @  7

+ 	/**
+ 	 * + Sets the custom name tag for this entity
+ 	 */
+ 	/**
+ 	 * + Sets the custom name tag for this entity
+ 	 */

> INSERT  8 : 14  @  8

+ 	/**
+ 	 * + Returns true if this thing is named
+ 	 */
+ 	/**
+ 	 * + Returns true if this thing is named
+ 	 */

> INSERT  12 : 18  @  12

+ 	/**
+ 	 * + Sets the position of the entity and updates the 'last' variables
+ 	 */
+ 	/**
+ 	 * + Sets the position of the entity and updates the 'last' variables
+ 	 */

> DELETE  28  @  28 : 32

> INSERT  24 : 30  @  24

+ 	/**
+ 	 * + Send a chat message to the CommandSender
+ 	 */
+ 	/**
+ 	 * + Send a chat message to the CommandSender
+ 	 */

> INSERT  3 : 11  @  3

+ 	/**
+ 	 * + Returns {@code true} if the CommandSender is allowed to execute the
+ 	 * command, {@code false} if not
+ 	 */
+ 	/**
+ 	 * + Returns {@code true} if the CommandSender is allowed to execute the
+ 	 * command, {@code false} if not
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Get the position in the world. <b>{@code null} is not allowed!</b> If you
+ 	 * are not an entity in the world, return the coordinates 0, 0, 0
+ 	 */
+ 	/**
+ 	 * + Get the position in the world. <b>{@code null} is not allowed!</b> If you
+ 	 * are not an entity in the world, return the coordinates 0, 0, 0
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Get the position vector. <b>{@code null} is not allowed!</b> If you are not
+ 	 * an entity in the world, return 0.0D, 0.0D, 0.0D
+ 	 */
+ 	/**
+ 	 * + Get the position vector. <b>{@code null} is not allowed!</b> If you are not
+ 	 * an entity in the world, return 0.0D, 0.0D, 0.0D
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Get the world, if available. <b>{@code null} is not allowed!</b> If you are
+ 	 * not an entity in the world, return the overworld
+ 	 */
+ 	/**
+ 	 * + Get the world, if available. <b>{@code null} is not allowed!</b> If you are
+ 	 * not an entity in the world, return the overworld
+ 	 */

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Returns the entity associated with the command sender. MAY BE NULL!
+ 	 */
+ 	/**
+ 	 * + Returns the entity associated with the command sender. MAY BE NULL!
+ 	 */

> INSERT  4 : 12  @  4

+ 	/**
+ 	 * + Returns true if the command sender should be sent feedback about executed
+ 	 * commands
+ 	 */
+ 	/**
+ 	 * + Returns true if the command sender should be sent feedback about executed
+ 	 * commands
+ 	 */

> DELETE  4  @  4 : 16

> INSERT  4 : 10  @  4

+ 	/**
+ 	 * + Called when client receives entity's NBTTagCompound from server.
+ 	 */
+ 	/**
+ 	 * + Called when client receives entity's NBTTagCompound from server.
+ 	 */

> INSERT  3 : 11  @  3

+ 	/**
+ 	 * + New version of interactWith that includes vector information on where
+ 	 * precisely the player targeted.
+ 	 */
+ 	/**
+ 	 * + New version of interactWith that includes vector information on where
+ 	 * precisely the player targeted.
+ 	 */

> EOF
