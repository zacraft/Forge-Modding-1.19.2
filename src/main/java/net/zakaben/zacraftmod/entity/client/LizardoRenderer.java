package net.zakaben.zacraftmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.zakaben.zacraftmod.ZacraftMod;
import net.zakaben.zacraftmod.entity.custom.LizardoEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LizardoRenderer extends GeoEntityRenderer<LizardoEntity> {
    public LizardoRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LizardoModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(LizardoEntity instance) {
        return new ResourceLocation(ZacraftMod.MOD_ID, "textures/entity/lizardo.png");
    }

    @Override
    public RenderType getRenderType(LizardoEntity animatable, float partialTick, PoseStack stack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight,
                                    ResourceLocation texture) {
        stack.scale(0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTick, stack, bufferSource, buffer, packedLight, texture);
    }
}
