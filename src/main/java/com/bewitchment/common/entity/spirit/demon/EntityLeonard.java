package com.bewitchment.common.entity.spirit.demon;

import com.bewitchment.Bewitchment;
import com.bewitchment.api.BewitchmentAPI;
import com.bewitchment.common.entity.util.ModEntityMob;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.AbstractIllager;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityLeonard extends ModEntityMob {
	private final BossInfoServer bossInfo = (BossInfoServer) (new BossInfoServer(this.getDisplayName(), BossInfo.Color.RED, BossInfo.Overlay.PROGRESS)).setDarkenSky(false);
	
	protected EntityLeonard(World world) {
		super(world, new ResourceLocation(Bewitchment.MODID, "entities/leonard"));
		isImmuneToFire = true;
		setSize(1.0f, 3.8f);
	}
	
	@Override
	protected boolean isValidLightLevel() {
		return false;
	}
	
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		
		if (this.hasCustomName()) {
			this.bossInfo.setName(this.getDisplayName());
		}
	}
	
	public void fall(float distance, float damageMultiplier) {
	}
	
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return BewitchmentAPI.DEMON;
	}
	
	//Todo: Get this functional. Sleep is kind of fucked. Effects will be applied based on conditions.
	//Okay, regen works now. Will try it with other scenarios later.
	public void onLivingUpdate() {
		if (this.getHealth() < this.getMaxHealth()) {
			this.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 50, 0, false, true));
			world.playSound(null, getPosition(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.HOSTILE, 1, 1);
		}
		if (this.getHealth() <= this.getMaxHealth() / 2.0F) {
			this.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 100, 0, false, true));
			world.playSound(null, getPosition(), SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.HOSTILE, 1, 1);
		}
		super.onLivingUpdate();
	}

	@Override
	public boolean isPotionApplicable(PotionEffect potioneffectIn) {
		return !potioneffectIn.getPotion().isBadEffect();
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(500);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.75);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(13.616);
	}
	
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender() {
		return 15728880;
	}
	
	public boolean isNonBoss() {
		return false;
	}
	
	public void setCustomNameTag(String name) {
		super.setCustomNameTag(name);
		this.bossInfo.setName(this.getDisplayName());
	}
	
	public void addTrackingPlayer(EntityPlayerMP player) {
		super.addTrackingPlayer(player);
		this.bossInfo.addPlayer(player);
	}
	
	public void removeTrackingPlayer(EntityPlayerMP player) {
		super.removeTrackingPlayer(player);
		this.bossInfo.removePlayer(player);
	}
	
	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(0, new EntityAIBreakDoor(this));
		tasks.addTask(1, new EntityAIAttackMelee(this, 0.5, false));
		tasks.addTask(2, new EntityAIWatchClosest2(this, EntityPlayer.class, 5, 1));
		tasks.addTask(3, new EntityAILookIdle(this));
		tasks.addTask(3, new EntityAIWanderAvoidWater(this, getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue() * (2 / 3d)));
		tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
		targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityLivingBase.class, 10, false, false, e -> e instanceof EntityVillager || e instanceof AbstractIllager || e instanceof EntityWitch || e instanceof EntityIronGolem));
	}
	
	protected void updateAITasks() {
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}
}
