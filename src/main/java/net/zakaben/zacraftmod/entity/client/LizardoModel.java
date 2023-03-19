package net.zakaben.zacraftmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.zakaben.zacraftmod.ZacraftMod;
import net.zakaben.zacraftmod.entity.custom.LizardoEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LizardoModel extends AnimatedGeoModel<LizardoEntity> {
    @Override
    public ResourceLocation getModelResource(LizardoEntity object) {
        return new ResourceLocation(ZacraftMod.MOD_ID, "geo/lizardo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LizardoEntity object) {
        return new ResourceLocation(ZacraftMod.MOD_ID, "textures/entity/lizardo.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LizardoEntity animatable) {
        return new ResourceLocation(ZacraftMod.MOD_ID, "animations/lizardo.animation.json");
    }
}
