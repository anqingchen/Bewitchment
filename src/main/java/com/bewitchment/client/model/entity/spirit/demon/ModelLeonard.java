package com.bewitchment.client.model.entity.spirit.demon;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * leonard - cybercat5555
 * Created using Tabula 7.0.1
 */
public class ModelLeonard extends ModelBiped {
	public ModelRenderer bipedBody;
	public ModelRenderer chestFur01;
	public ModelRenderer chestFur02;
	public ModelRenderer beltBuckle01;
	public ModelRenderer beltBuckle02;
	public ModelRenderer beltBuckle03;
	public ModelRenderer bipedHead;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer muzzleUpper;
	public ModelRenderer muzzleLower;
	public ModelRenderer snout;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer lHorn01;
	public ModelRenderer rHorn01;
	public ModelRenderer mHorn01;
	public ModelRenderer muzzleUpper02;
	public ModelRenderer beard;
	public ModelRenderer lHorn02;
	public ModelRenderer lHorn03a;
	public ModelRenderer lHorn03b;
	public ModelRenderer lHorn03c;
	public ModelRenderer lHorn03d;
	public ModelRenderer lHorn04;
	public ModelRenderer rHorn02;
	public ModelRenderer rHorn03a;
	public ModelRenderer rHorn03b;
	public ModelRenderer rHorn03c;
	public ModelRenderer rHorn03d;
	public ModelRenderer rHorn04;
	public ModelRenderer mHorn02;
	public ModelRenderer mHorn03a;
	public ModelRenderer mHorn03b;
	public ModelRenderer mHorn03c;
	public ModelRenderer mHorn03d;
	public ModelRenderer mHorn04;
	public ModelRenderer bipedLeftArm01;
	public ModelRenderer bipedRightArm01;
	public ModelRenderer lLeg02;
	public ModelRenderer lFoot;
	public ModelRenderer lClaw01;
	public ModelRenderer lClaw02;
	public ModelRenderer lClaw03;
	public ModelRenderer lWebbing01;
	public ModelRenderer lWebbing02;
	public ModelRenderer rLeg02;
	public ModelRenderer rFoot;
	public ModelRenderer rClaw01;
	public ModelRenderer rClaw02;
	public ModelRenderer rClaw03;
	public ModelRenderer rWebbing01;
	public ModelRenderer rWebbing02;
	
	public ModelLeonard() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.mHorn02 = new ModelRenderer(this, 40, 11);
		this.mHorn02.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.mHorn02.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(mHorn02, -0.13962634015954636F, 0.0F, 0.0F);
		this.muzzleUpper = new ModelRenderer(this, 24, 45);
		this.muzzleUpper.setRotationPoint(0.0F, -1.4F, -3.8F);
		this.muzzleUpper.addBox(-1.6F, -1.8F, -3.5F, 4, 2, 4, 0.0F);
		this.setRotateAngle(muzzleUpper, 0.06981317007977318F, 0.0F, 0.0F);
		this.mHorn03b = new ModelRenderer(this, 25, 6);
		this.mHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mHorn03b.addBox(-0.2F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.bipedLeftArm = new ModelRenderer(this, 44, 14);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.2F, -0.0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedLeftArm, 0.08726646259971647F, 0.0F, -0.10000736613927509F);
		this.beltBuckle02 = new ModelRenderer(this, 51, 60);
		this.beltBuckle02.setRotationPoint(0.0F, 12.5F, -1.3F);
		this.beltBuckle02.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
		this.lEar = new ModelRenderer(this, 40, 0);
		this.lEar.setRotationPoint(2.6F, -4.3F, 0.0F);
		this.lEar.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(lEar, -0.5235987755982988F, 0.0F, 0.3141592653589793F);
		this.rFoot = new ModelRenderer(this, 0, 40);
		this.rFoot.mirror = true;
		this.rFoot.setRotationPoint(0.0F, 7.1F, 0.8F);
		this.rFoot.addBox(-1.5F, -0.5F, -2.4F, 3, 1, 3, 0.0F);
		this.setRotateAngle(rFoot, 0.0F, 0.05235987755982988F, 0.0F);
		this.mHorn03d = new ModelRenderer(this, 25, 6);
		this.mHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mHorn03d.addBox(-0.2F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 14);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.5F, 0.1F);
		this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
		this.setRotateAngle(bipedLeftLeg, -0.06981317007977318F, 0.0F, -0.06981317007977318F);
		this.rClaw01 = new ModelRenderer(this, 0, 46);
		this.rClaw01.mirror = true;
		this.rClaw01.setRotationPoint(-1.0F, 0.1F, -1.6F);
		this.rClaw01.addBox(-0.5F, -0.5F, -3.3F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rClaw01, 0.05235987755982988F, 0.3141592653589793F, 0.0F);
		this.chestFur02 = new ModelRenderer(this, 43, 47);
		this.chestFur02.setRotationPoint(0.0F, 0.7F, -1.1F);
		this.chestFur02.addBox(-2.5F, 0.0F, -1.0F, 5, 5, 2, 0.0F);
		this.setRotateAngle(chestFur02, -0.3490658503988659F, 0.0F, 0.0F);
		this.muzzleLower = new ModelRenderer(this, 23, 54);
		this.muzzleLower.setRotationPoint(0.0F, -0.8F, -3.6F);
		this.muzzleLower.addBox(-2.0F, -0.5F, -3.5F, 4, 1, 4, 0.0F);
		this.setRotateAngle(muzzleLower, 0.06981317007977318F, 0.0F, 0.0F);
		this.beltBuckle03 = new ModelRenderer(this, 58, 58);
		this.beltBuckle03.setRotationPoint(0.5F, 11.5F, -1.3F);
		this.beltBuckle03.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
		this.snout = new ModelRenderer(this, 24, 36);
		this.snout.setRotationPoint(0.0F, -4.1F, -3.3F);
		this.snout.addBox(-2.0F, -1.0F, -4.4F, 4, 2, 5, 0.0F);
		this.setRotateAngle(snout, 0.41887902047863906F, 0.0F, 0.0F);
		this.rHorn01 = new ModelRenderer(this, 25, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-1.8F, -5.0F, -1.5F);
		this.rHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(rHorn01, -0.5235987755982988F, 0.0F, -0.5235987755982988F);
		this.lHorn03b = new ModelRenderer(this, 25, 6);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(-0.2F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.beltBuckle01 = new ModelRenderer(this, 51, 56);
		this.beltBuckle01.setRotationPoint(0.0F, 10.5F, -1.3F);
		this.beltBuckle01.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
		this.rHorn03d = new ModelRenderer(this, 25, 6);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-0.2F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-3.0F, -6.0F, -3.4F, 6, 6, 6, 0.0F);
		this.lWebbing02 = new ModelRenderer(this, 0, 54);
		this.lWebbing02.mirror = true;
		this.lWebbing02.setRotationPoint(-0.3F, 0.0F, -2.1F);
		this.lWebbing02.addBox(-1.0F, 0.0F, -2.4F, 2, 0, 2, 0.0F);
		this.setRotateAngle(lWebbing02, 0.06981317007977318F, 0.3490658503988659F, 0.0F);
		this.lClaw03 = new ModelRenderer(this, 0, 46);
		this.lClaw03.setRotationPoint(-1.0F, 0.1F, -1.6F);
		this.lClaw03.addBox(-0.5F, -0.5F, -3.3F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lClaw03, 0.05235987755982988F, 0.3141592653589793F, 0.0F);
		this.rHorn04 = new ModelRenderer(this, 31, 6);
		this.rHorn04.mirror = true;
		this.rHorn04.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn04, 0.2617993877991494F, 0.0F, 0.0F);
		this.lLeg02 = new ModelRenderer(this, 0, 29);
		this.lLeg02.setRotationPoint(0.0F, 9.7F, 0.0F);
		this.lLeg02.addBox(-1.5F, -0.1F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(lLeg02, 0.06981317007977318F, 0.0F, 0.06981317007977318F);
		this.lFoot = new ModelRenderer(this, 0, 40);
		this.lFoot.setRotationPoint(0.0F, 7.1F, 0.8F);
		this.lFoot.addBox(-1.5F, -0.5F, -2.4F, 3, 1, 3, 0.0F);
		this.setRotateAngle(lFoot, 0.0F, -0.05235987755982988F, 0.0F);
		this.mHorn03a = new ModelRenderer(this, 25, 6);
		this.mHorn03a.setRotationPoint(0.0F, -2.8F, 0.0F);
		this.mHorn03a.addBox(-0.8F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(mHorn03a, -0.3141592653589793F, 0.0F, 0.0F);
		this.muzzleUpper02 = new ModelRenderer(this, 12, 45);
		this.muzzleUpper02.setRotationPoint(0.0F, -1.4F, -3.8F);
		this.muzzleUpper02.addBox(-2.3F, -1.8F, -3.5F, 1, 2, 4, 0.0F);
		this.setRotateAngle(muzzleUpper02, 0.06981317007977318F, 0.0F, 0.0F);
		this.chestFur01 = new ModelRenderer(this, 43, 38);
		this.chestFur01.setRotationPoint(0.0F, 1.4F, -1.1F);
		this.chestFur01.addBox(-3.0F, 0.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(chestFur01, -0.19198621771937624F, 0.0F, 0.0F);
		this.rClaw03 = new ModelRenderer(this, 0, 46);
		this.rClaw03.mirror = true;
		this.rClaw03.setRotationPoint(1.0F, 0.1F, -1.6F);
		this.rClaw03.addBox(-0.5F, -0.5F, -3.3F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rClaw03, 0.05235987755982988F, -0.3141592653589793F, 0.0F);
		this.rHorn02 = new ModelRenderer(this, 25, 0);
		this.rHorn02.mirror = true;
		this.rHorn02.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHorn02, -0.13962634015954636F, 0.0F, -0.20943951023931953F);
		this.mHorn04 = new ModelRenderer(this, 50, 7);
		this.mHorn04.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.mHorn04.addBox(-0.5F, -3.7F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(mHorn04, 0.2617993877991494F, 0.0F, 0.0F);
		this.bipedRightArm01 = new ModelRenderer(this, 44, 26);
		this.bipedRightArm01.mirror = true;
		this.bipedRightArm01.setRotationPoint(-0.5F, 5.7F, -0.0F);
		this.bipedRightArm01.addBox(-1.51F, -0.3F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedRightArm01, -0.17453292519943295F, 0.0F, 0.0F);
		this.rHorn03a = new ModelRenderer(this, 25, 6);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.rHorn03a.addBox(-0.8F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn03a, -0.3141592653589793F, 0.0F, 0.0F);
		this.lWebbing01 = new ModelRenderer(this, 0, 54);
		this.lWebbing01.setRotationPoint(0.3F, 0.0F, -2.1F);
		this.lWebbing01.addBox(-1.0F, 0.0F, -2.4F, 2, 0, 2, 0.0F);
		this.setRotateAngle(lWebbing01, 0.06981317007977318F, -0.3490658503988659F, 0.0F);
		this.bipedBody = new ModelRenderer(this, 17, 16);
		this.bipedBody.setRotationPoint(0.0F, -5.8F, 0.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 13, 4, 0.0F);
		this.rHorn03b = new ModelRenderer(this, 25, 6);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-0.2F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.mHorn03c = new ModelRenderer(this, 25, 6);
		this.mHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mHorn03c.addBox(-0.8F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.rHorn03c = new ModelRenderer(this, 25, 6);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-0.8F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.lHorn01 = new ModelRenderer(this, 25, 0);
		this.lHorn01.setRotationPoint(1.8F, -5.0F, -1.5F);
		this.lHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(lHorn01, -0.5235987755982988F, 0.0F, 0.5235987755982988F);
		this.rWebbing01 = new ModelRenderer(this, 0, 54);
		this.rWebbing01.mirror = true;
		this.rWebbing01.setRotationPoint(-0.3F, 0.0F, -2.1F);
		this.rWebbing01.addBox(-1.0F, 0.0F, -2.4F, 2, 0, 2, 0.0F);
		this.setRotateAngle(rWebbing01, 0.06981317007977318F, 0.3490658503988659F, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 44, 14);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-5.0F, 2.2F, 0.0F);
		this.bipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedRightArm, 0.08726646259971647F, 0.0F, 0.10000736613927509F);
		this.beard = new ModelRenderer(this, 53, 0);
		this.beard.setRotationPoint(0.0F, 0.3F, -2.0F);
		this.beard.addBox(-1.5F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
		this.setRotateAngle(beard, -0.10471975511965977F, 0.0F, 0.0F);
		this.bipedLeftArm01 = new ModelRenderer(this, 44, 26);
		this.bipedLeftArm01.setRotationPoint(0.5F, 5.7F, -0.0F);
		this.bipedLeftArm01.addBox(-1.49F, -0.3F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedLeftArm01, -0.17453292519943295F, 0.0F, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 14);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.5F, 0.1F);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
		this.setRotateAngle(bipedRightLeg, -0.06981317007977318F, 0.0F, 0.06981317007977318F);
		this.lHorn03a = new ModelRenderer(this, 25, 6);
		this.lHorn03a.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.lHorn03a.addBox(-0.8F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn03a, -0.3141592653589793F, 0.0F, 0.0F);
		this.lHorn03c = new ModelRenderer(this, 25, 6);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(-0.8F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.lHorn03d = new ModelRenderer(this, 25, 6);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(-0.2F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.rWebbing02 = new ModelRenderer(this, 0, 54);
		this.rWebbing02.setRotationPoint(0.3F, 0.0F, -2.1F);
		this.rWebbing02.addBox(-1.0F, 0.0F, -2.4F, 2, 0, 2, 0.0F);
		this.setRotateAngle(rWebbing02, 0.06981317007977318F, -0.3490658503988659F, 0.0F);
		this.lHorn04 = new ModelRenderer(this, 31, 6);
		this.lHorn04.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn04, 0.2617993877991494F, 0.0F, 0.0F);
		this.lClaw02 = new ModelRenderer(this, 0, 46);
		this.lClaw02.setRotationPoint(0.0F, 0.1F, -2.0F);
		this.lClaw02.addBox(-0.5F, -0.5F, -3.3F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lClaw02, 0.05235987755982988F, 0.0F, 0.0F);
		this.lHorn02 = new ModelRenderer(this, 25, 0);
		this.lHorn02.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHorn02, -0.13962634015954636F, 0.0F, 0.20943951023931953F);
		this.rEar = new ModelRenderer(this, 40, 0);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-2.6F, -4.3F, 0.0F);
		this.rEar.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(rEar, -0.5235987755982988F, 0.0F, -0.3141592653589793F);
		this.rLeg02 = new ModelRenderer(this, 0, 29);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.0F, 9.7F, 0.0F);
		this.rLeg02.addBox(-1.5F, -0.1F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(rLeg02, 0.06981317007977318F, 0.0F, -0.06981317007977318F);
		this.mHorn01 = new ModelRenderer(this, 41, 5);
		this.mHorn01.setRotationPoint(0.0F, -5.2F, -0.2F);
		this.mHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(mHorn01, -0.9599310885968813F, 0.0F, 0.0F);
		this.lClaw01 = new ModelRenderer(this, 0, 46);
		this.lClaw01.setRotationPoint(1.0F, 0.1F, -1.6F);
		this.lClaw01.addBox(-0.5F, -0.5F, -3.3F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lClaw01, 0.05235987755982988F, -0.3141592653589793F, 0.0F);
		this.rClaw02 = new ModelRenderer(this, 0, 46);
		this.rClaw02.mirror = true;
		this.rClaw02.setRotationPoint(0.0F, 0.1F, -2.0F);
		this.rClaw02.addBox(-0.5F, -0.5F, -3.3F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rClaw02, 0.05235987755982988F, 0.0F, 0.0F);
		this.mHorn01.addChild(this.mHorn02);
		this.bipedHead.addChild(this.muzzleUpper);
		this.mHorn03a.addChild(this.mHorn03b);
		this.bipedBody.addChild(this.bipedLeftArm);
		this.bipedBody.addChild(this.beltBuckle02);
		this.bipedHead.addChild(this.lEar);
		this.rLeg02.addChild(this.rFoot);
		this.mHorn03a.addChild(this.mHorn03d);
		this.bipedBody.addChild(this.bipedLeftLeg);
		this.rFoot.addChild(this.rClaw01);
		this.bipedBody.addChild(this.chestFur02);
		this.bipedHead.addChild(this.muzzleLower);
		this.bipedBody.addChild(this.beltBuckle03);
		this.bipedHead.addChild(this.snout);
		this.bipedHead.addChild(this.rHorn01);
		this.lHorn03a.addChild(this.lHorn03b);
		this.bipedBody.addChild(this.beltBuckle01);
		this.rHorn03a.addChild(this.rHorn03d);
		this.bipedBody.addChild(this.bipedHead);
		this.lFoot.addChild(this.lWebbing02);
		this.lFoot.addChild(this.lClaw03);
		this.rHorn03a.addChild(this.rHorn04);
		this.bipedLeftLeg.addChild(this.lLeg02);
		this.lLeg02.addChild(this.lFoot);
		this.mHorn02.addChild(this.mHorn03a);
		this.bipedHead.addChild(this.muzzleUpper02);
		this.bipedBody.addChild(this.chestFur01);
		this.rFoot.addChild(this.rClaw03);
		this.rHorn01.addChild(this.rHorn02);
		this.mHorn03a.addChild(this.mHorn04);
		this.bipedRightArm.addChild(this.bipedRightArm01);
		this.rHorn02.addChild(this.rHorn03a);
		this.lFoot.addChild(this.lWebbing01);
		this.rHorn03a.addChild(this.rHorn03b);
		this.mHorn03a.addChild(this.mHorn03c);
		this.rHorn03a.addChild(this.rHorn03c);
		this.bipedHead.addChild(this.lHorn01);
		this.rFoot.addChild(this.rWebbing01);
		this.bipedBody.addChild(this.bipedRightArm);
		this.muzzleLower.addChild(this.beard);
		this.bipedLeftArm.addChild(this.bipedLeftArm01);
		this.bipedBody.addChild(this.bipedRightLeg);
		this.lHorn02.addChild(this.lHorn03a);
		this.lHorn03a.addChild(this.lHorn03c);
		this.lHorn03a.addChild(this.lHorn03d);
		this.rFoot.addChild(this.rWebbing02);
		this.lHorn03a.addChild(this.lHorn04);
		this.lFoot.addChild(this.lClaw02);
		this.lHorn01.addChild(this.lHorn02);
		this.bipedHead.addChild(this.rEar);
		this.bipedRightLeg.addChild(this.rLeg02);
		this.bipedHead.addChild(this.mHorn01);
		this.lFoot.addChild(this.lClaw01);
		this.rFoot.addChild(this.rClaw02);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedBody.render(f5);
	}
	
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
		boolean flag = entity instanceof EntityLivingBase && ((EntityLivingBase) entity).getTicksElytraFlying() > 4;
		this.bipedHead.rotateAngleY = netHeadYaw * 0.017453292F;
		
		if (flag) {
			this.bipedHead.rotateAngleX = -((float) Math.PI / 4F);
		}
		else {
			this.bipedHead.rotateAngleX = headPitch * 0.017453292F;
		}
		float swingMod = 0.3F;
		this.bipedLeftLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingMod * limbSwingAmount;
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * swingMod * limbSwingAmount;
		
		this.bipedRightArm.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingMod * limbSwingAmount;
		this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * swingMod * limbSwingAmount;
		
		setLivingAnimations((EntityLivingBase) entity, limbSwing, limbSwingAmount, Minecraft.getMinecraft().getRenderPartialTicks());
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
