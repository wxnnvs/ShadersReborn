
# Eagler Context Redacted Diff
# Copyright (c) 2023 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 5

> DELETE  3  @  3 : 4

> INSERT  1 : 9  @  1

+ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
+ import net.lax1dude.eaglercraft.v1_8.HString;
+ import java.util.Set;
+ 
+ import com.google.common.collect.HashMultimap;
+ import com.google.common.collect.Lists;
+ import com.google.common.collect.Multimap;
+ 

> CHANGE  13 : 14  @  13 : 17

~ import net.minecraft.nbt.JsonToNBT;

> INSERT  3 : 4  @  3

+ import net.minecraft.nbt.NBTTagString;

> INSERT  9 : 11  @  9

+ import net.zxmushroom63.plugins.BaseData;
+ import net.zxmushroom63.plugins.PluginData;

> INSERT  18 : 157  @  18

+ 	public void loadPluginData(BaseData data) {
+ 		stackSize = data.getInt("amount");
+ 		animationsToGo = data.getInt("animationsToGo");
+ 		itemDamage = data.getInt("itemDamage");
+ 		if (itemFrame != null) {
+ 			itemFrame.loadPluginData(data.getBaseData("itemFrame"));
+ 		}
+ 		if (canDestroyCacheBlock != null) {
+ 			canDestroyCacheBlock.loadPluginData(data.getBaseData("canDestroyCacheBlock"));
+ 		}
+ 		if (canPlaceOnCacheBlock != null) {
+ 			canPlaceOnCacheBlock.loadPluginData(data.getBaseData("canPlaceOnCacheBlock"));
+ 		}
+ 		canDestroyCacheResult = data.getBoolean("canDestroyCacheResult");
+ 		canPlaceOnCacheResult = data.getBoolean("canPlaceOnCacheResult");
+ 	}
+ 
+ 	public static ItemStack fromPluginData(BaseData data) {
+ 		return new ItemStack(Item.getItemById(data.getInt("itemId")), data.getInt("amount"), data.getInt("itemDamage"));
+ 	}
+ 
+ 	public PluginData makePluginData() {
+ 		PluginData data = new PluginData();
+ 		data.set("amount", stackSize);
+ 		data.set("animationsToGo", animationsToGo);
+ 		data.set("itemId", item.getIdFromItem(item));
+ 		data.set("itemDamage", itemDamage);
+ 		if (itemFrame != null) {
+ 			data.set("itemFrame", itemFrame.makePluginData());
+ 		}
+ 		if (canDestroyCacheBlock != null) {
+ 			data.set("canDestroyCacheBlock", canDestroyCacheBlock.makePluginData());
+ 		}
+ 		data.set("canDestroyCacheResult", canDestroyCacheResult);
+ 		if (canPlaceOnCacheBlock != null) {
+ 			data.set("canPlaceOnCacheBlock", canPlaceOnCacheBlock.makePluginData());
+ 		}
+ 		data.set("canPlaceOnCacheResult", canPlaceOnCacheResult);
+ 
+ 		data.setCallbackVoid("reload", () -> {
+ 			loadPluginData(data);
+ 		});
+ 		data.setCallbackObject("getItem", () -> {
+ 			return getItem().makePluginData();
+ 		});
+ 		data.setCallbackInt("getMaxStackSize", () -> {
+ 			return getMaxStackSize();
+ 		});
+ 		data.setCallbackBoolean("isStackable", () -> {
+ 			return isStackable();
+ 		});
+ 		data.setCallbackBoolean("isItemStackDamageable", () -> {
+ 			return isItemStackDamageable();
+ 		});
+ 		data.setCallbackBoolean("getHasSubtypes", () -> {
+ 			return getHasSubtypes();
+ 		});
+ 		data.setCallbackBoolean("isItemDamaged", () -> {
+ 			return isItemDamaged();
+ 		});
+ 		data.setCallbackInt("getItemDamage", () -> {
+ 			return getItemDamage();
+ 		});
+ 		data.setCallbackInt("getMetadata", () -> {
+ 			return getMetadata();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setItemDamage", (BaseData params) -> {
+ 			setItemDamage(params.getInt("meta"));
+ 		});
+ 		data.setCallbackInt("getMaxDamage", () -> {
+ 			return getMaxDamage();
+ 		});
+ 		data.setCallbackObject("copy", () -> {
+ 			return copy().makePluginData();
+ 		});
+ 		data.setCallbackString("getUnlocalizedName", () -> {
+ 			return getUnlocalizedName();
+ 		});
+ 		data.setCallbackString("toString", () -> {
+ 			return toString();
+ 		});
+ 		data.setCallbackInt("getMaxItemUseDuration", () -> {
+ 			return getMaxItemUseDuration();
+ 		});
+ 		data.setCallbackString("getDisplayName", () -> {
+ 			return getDisplayName();
+ 		});
+ 		data.setCallbackObjectWithDataArg("setDisplayName", (BaseData params) -> {
+ 			return setStackDisplayName(params.getString("displayName")).makePluginData();
+ 		});
+ 		data.setCallbackVoid("clearCustomName", () -> {
+ 			clearCustomName();
+ 		});
+ 		data.setCallbackBoolean("hasDisplayName", () -> {
+ 			return hasDisplayName();
+ 		});
+ 		data.setCallbackBoolean("hasEffect", () -> {
+ 			return hasEffect();
+ 		});
+ 		data.setCallbackBoolean("isItemEnchantable", () -> {
+ 			return isItemEnchantable();
+ 		});
+ 		data.setCallbackVoidWithDataArg("addEnchantment", (BaseData params) -> {
+ 			addEnchantment(Enchantment.getEnchantmentById(params.getInt("enchId")), params.getInt("level"));
+ 		});
+ 		data.setCallbackBoolean("isItemEnchanted", () -> {
+ 			return isItemEnchanted();
+ 		});
+ 		data.setCallbackBoolean("canEditBlocks", () -> {
+ 			return canEditBlocks();
+ 		});
+ 		data.setCallbackBoolean("isOnItemFrame", () -> {
+ 			return isOnItemFrame();
+ 		});
+ 		data.setCallbackInt("getRepairCost", () -> {
+ 			return getRepairCost();
+ 		});
+ 		data.setCallbackVoidWithDataArg("setRepairCost", (BaseData params) -> {
+ 			setRepairCost(params.getInt("cost"));
+ 		});
+ 		data.setCallbackVoidWithDataArg("setItem", (BaseData params) -> {
+ 			setItem(Item.getItemById(params.getInt("itemId")));
+ 		});
+ 		data.setCallbackBooleanWithDataArg("canDestroy", (BaseData params) -> {
+ 			return canDestroy(Block.getBlockById(params.getInt("blockId")));
+ 		});
+ 		data.setCallbackBooleanWithDataArg("canPlaceOn", (BaseData params) -> {
+ 			return canPlaceOn(Block.getBlockById(params.getInt("blockId")));
+ 		});
+ 		data.setCallbackString("toNBT", () -> {
+ 			return toNBT();
+ 		});
+ 		data.setCallbackVoidWithDataArg("fromNBT", (BaseData params) -> {
+ 			fromNBT(params.getString("nbt"));
+ 		});
+ 
+ 		return data;
+ 	}
+ 

> INSERT  91 : 106  @  91

+ 	public String toNBT() {
+ 		NBTTagCompound nbt = new NBTTagCompound();
+ 		nbt = writeToNBT(nbt);
+ 		return nbt.toString();
+ 	}
+ 
+ 	public void fromNBT(String nbt) {
+ 		try {
+ 			NBTTagCompound nbtParsed = JsonToNBT.getTagFromJson(nbt);
+ 			this.readFromNBT(nbtParsed);
+ 		} catch (Exception e) {
+ 			// Swallowing the error!
+ 		}
+ 	}
+ 

> CHANGE  64 : 65  @  64 : 65

~ 	public boolean attemptDamageItem(int amount, EaglercraftRandom rand) {

> CHANGE  249 : 250  @  249 : 250

~ 				s = s + HString.format("#%04d/%d%s",

> CHANGE  2 : 3  @  2 : 3

~ 				s = s + HString.format("#%04d%s", new Object[] { Integer.valueOf(i), s1 });

> CHANGE  56 : 57  @  56 : 57

~ 			for (Entry entry : (Set<Entry>) multimap.entries()) {

> EOF
