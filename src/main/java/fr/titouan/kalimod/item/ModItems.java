package fr.titouan.kalimod.item;

import fr.titouan.kalimod.kalimod;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, kalimod.MOD_ID);

//Kalluim Ore
    public static final RegistryObject<Item> KALIUM_INGOT = ITEMS.register("kalium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KALIUM_TAB)));
    public static final RegistryObject<Item> RAW_KALIUM = ITEMS.register("raw_kalium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KALIUM_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
