package net.zakaben.zacraftmod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zakaben.zacraftmod.ZacraftMod;
import net.zakaben.zacraftmod.entity.custom.LizardoEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ZacraftMod.MOD_ID);

    public static final RegistryObject<EntityType<LizardoEntity>> LIZARDO =
            ENTITY_TYPES.register("lizardo",
                    () -> EntityType.Builder.of(LizardoEntity::new, MobCategory.MONSTER)
                            .sized(0.8f,2f)
                            .build(new ResourceLocation(ZacraftMod.MOD_ID, "lizardo").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
