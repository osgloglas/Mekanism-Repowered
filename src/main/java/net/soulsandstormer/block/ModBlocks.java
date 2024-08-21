package net.soulsandstormer.block;

import com.google.common.base.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.soulsandstormer.Item.ModItems;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, MekanismRepowered.MOD_ID);

    //actual block creation
    public static final RegistryObject<Block> TRANSFORMER_CASING = registerBlock("transformer_casing", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TRANSFORMER_INTERFACE = registerBlock("transformer_interface", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TRANSFORMER_IO = registerBlock("transformer_io", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //item association to block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject <T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
