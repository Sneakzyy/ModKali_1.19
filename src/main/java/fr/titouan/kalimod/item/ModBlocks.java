package fr.titouan.kalimod.item;

import fr.titouan.kalimod.kalimod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, kalimod.MOD_ID);

    //Kalium Blocks
    public static final RegistryObject<Block> KALIUM_BLOCK = registerBlock("kalium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()),ModCreativeModeTab.KALIUM_TAB);

    public static final RegistryObject<Block> KALIUM_ORE = registerBlock("kalium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()),ModCreativeModeTab.KALIUM_TAB);

    public static final RegistryObject<Block> DEEPSLATE_KALIUM_ORE = registerBlock("deepslate_kalium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()),ModCreativeModeTab.KALIUM_TAB);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
