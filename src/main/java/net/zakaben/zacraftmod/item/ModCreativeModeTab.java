package net.zakaben.zacraftmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab ZACRAFT_TAB = new CreativeModeTab("zacrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.EMERALD);
        }
    };
}
