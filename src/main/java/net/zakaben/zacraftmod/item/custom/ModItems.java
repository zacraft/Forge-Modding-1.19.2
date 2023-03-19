package net.zakaben.zacraftmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zakaben.zacraftmod.ZacraftMod;
import net.zakaben.zacraftmod.entity.ModEntityTypes;
import net.zakaben.zacraftmod.item.ModCreativeModeTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZacraftMod.MOD_ID);
        public static final RegistryObject<Item> LIZARDO_SPAWN_EGG = ITEMS.register("lizardo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.LIZARDO, 0x000000, 0xa52a2a,
                    new Item.Properties().tab(ModCreativeModeTab.ZACRAFT_TAB)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
