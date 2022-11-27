package fr.titouan.kalimod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab KALIUM_TAB = new CreativeModeTab("kaliumtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_KALIUM.get());
        }
    };

}
