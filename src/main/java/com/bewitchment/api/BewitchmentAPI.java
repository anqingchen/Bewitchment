package com.bewitchment.api;

import com.bewitchment.Bewitchment;
import com.bewitchment.api.capability.extendedplayer.ExtendedPlayer;
import com.bewitchment.api.registry.AltarUpgrade;
import com.bewitchment.registry.ModObjects;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.EntityEntry;

import java.util.*;
import java.util.function.Predicate;

@SuppressWarnings({"unused", "SameReturnValue", "ConstantConditions"})
public class BewitchmentAPI {
	/**
	 * a Map of loot for mobs to drop when killed with the Athame
	 */
	public static final Map<Predicate<EntityLivingBase>, Collection<ItemStack>> ATHAME_LOOT = new HashMap<>();
	
	/**
	 * a Map of AltarUpgrades for the Witches' Atlar to search for
	 */
	public static final Map<Predicate<BlockWorldState>, AltarUpgrade> ALTAR_UPGRADES = new HashMap<>();
	
	/**
	 * A list of pets to be chosen for the meet pet fortune
	 */
	public static final List<EntityEntry> VALID_PETS = new ArrayList<>();
	
	/**
	 * The Demon creature attribute. Used for well, demons.
	 */
	public static EnumCreatureAttribute DEMON = EnumHelper.addCreatureAttribute("DEMON");
	
	/**
	 * The Spirit creature attribute. Used for ghosts and pretty much most spirits that aren't demons or fae.
	 */
	public static EnumCreatureAttribute SPIRIT = EnumHelper.addCreatureAttribute("SPIRIT");
	
	/**
	 * The Fairy creature attribute. This is for future usage ATM.
	 */
	public static EnumCreatureAttribute FAE = EnumHelper.addCreatureAttribute("FAE");
	
	/**
	 * @param entity the entity to check
	 * @return true if the entity is a witch, false otherwise
	 */
	public static boolean isWitch(EntityLivingBase entity) {
		return !isWitchHunter(entity) && (entity instanceof EntityWitch || (entity instanceof EntityPlayer && Bewitchment.proxy.doesPlayerHaveAdvancement((EntityPlayer) entity, new ResourceLocation(Bewitchment.MODID, "crafted_altar"))));
	}
	
	/**
	 * @param entity the entity to check
	 * @return false always, vampires are not currently in the mod
	 */
	public static boolean isVampire(EntityLivingBase entity) {
		return false;
	}
	
	/**
	 * @param entity the entity to check
	 * @return false always, werewolves are not currently in the mod
	 */
	public static boolean isWerewolf(EntityLivingBase entity) {
		return false;
	}
	
	/**
	 * @param entity the entity to check
	 * @return false always, spectres are not currently in the mod
	 */
	public static boolean isSpectre(EntityLivingBase entity) {
		return false;
	}
	
	/**
	 * @param entity the entity to check
	 * @return if entity is a spirit
	 */
	public static boolean isSpirit(EntityLivingBase entity) {
		return entity.getCreatureAttribute() == SPIRIT;
	}
	
	/**
	 * @param entity the entity to check
	 * @return if player defeated at least one boss
	 */
	public static boolean defeatedBoss(EntityPlayer entity) {
		return !(entity.getCapability(ExtendedPlayer.CAPABILITY, null)).uniqueDefeatedBosses.isEmpty();
	}
	
	
	/**
	 * @param entity the entity to check
	 * @return false always, infusion is not currently in the mod
	 */
	public static boolean isInfused(EntityPlayer entity) {
		return false;
	}
	
	/**
	 * @param entity the entity to check
	 * @return true when there's active effect not provided by beacon, vice versa
	 */
	public static boolean hasEffects(EntityPlayer entity) {
		for (PotionEffect potion : entity.getActivePotionEffects()) {
			if (!potion.getIsAmbient()) return true;
		}
		return false;
	}
	
	/**
	 * @param entity the entity to check
	 * @return false always, witch hunters are not currently in the mod
	 */
	public static boolean isWitchHunter(EntityLivingBase entity) {
		return false;
	}
	
	/**
	 * @param entity the entity to check
	 * @return true if player has full set of besmirched gear
	 */
	public static boolean hasBesmirched(EntityLivingBase entity) {
		List<ItemStack> armor = (List<ItemStack>) entity.getArmorInventoryList();
		List<Item> armorItem = new ArrayList<>();
		for (ItemStack is : armor) {
			armorItem.add(is.getItem());
		}
		return (armorItem.contains(ModObjects.besmirched_cowl) || armorItem.contains(ModObjects.besmirched_hat)) && armorItem.contains(ModObjects.besmirched_robes) && armorItem.contains(ModObjects.besmirched_pants);
	}
	
	/**
	 * @param entity the entity to check
	 * @return true if player has full set of alchemist gear
	 */
	public static boolean hasAlchemist(EntityLivingBase entity) {
		List<ItemStack> armor = (List<ItemStack>) entity.getArmorInventoryList();
		List<Item> armorItem = new ArrayList<>();
		for (ItemStack is : armor) {
			armorItem.add(is.getItem());
		}
		return (armorItem.contains(ModObjects.alchemist_cowl) || armorItem.contains(ModObjects.alchemist_hat)) && armorItem.contains(ModObjects.alchemist_robes) && armorItem.contains(ModObjects.alchemist_pants);
	}
	
	public static float getSilverWeakness(EntityLivingBase entity) {
		float fin = 1;
		if (isVampire(entity) || isWerewolf(entity) || entity.isEntityUndead()) {
			fin = 1.5f;
			if (entity instanceof EntityPlayer) fin *= 1.5f;
		}
		return fin;
	}
	
	public static float getColdIronWeakness(EntityLivingBase entity) {
		float fin = 1;
		if (entity.getCreatureAttribute() == DEMON || entity.getCreatureAttribute() == SPIRIT || entity.getCreatureAttribute() == FAE || entity instanceof EntityBlaze || entity instanceof EntityVex || entity instanceof EntityGhast || entity instanceof EntityEnderman || entity.getClass().getName().endsWith("EntityPixie") || entity.getClass().getName().endsWith("EntityHirschgeist") || entity.getClass().getName().endsWith("EntityFairy")) {
			fin = 1.5f;
			if (entity instanceof EntityPlayer) fin *= 1.5f;
		}
		return fin;
	}
}