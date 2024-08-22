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
import net.soulsandstormer.block.custom.TransformerInterface;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, MekanismRepowered.MOD_ID);

    //actual block creation

    //transformer components
    public static final RegistryObject<Block> TRANSFORMER_CASING = registerBlock("transformer_casing", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TRANSFORMER_INTERFACE = registerBlock("transformer_interface", 
        () -> new TransformerInterface(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TRANSFORMER_IO = registerBlock("transformer_io", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    //voltage rods
    public static final RegistryObject<Block> BASIC_VOLTAGE_RODS = registerBlock("basic_voltage_rods", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ADVANCED_VOLTAGE_RODS = registerBlock("advanced_voltage_rods", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ELITE_VOLTAGE_RODS = registerBlock("elite_voltage_rods", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ULTIMATE_VOLTAGE_RODS = registerBlock("ultimate_voltage_rods", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> EXTREME_VOLTAGE_RODS = registerBlock("extreme_voltage_rods", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    //space miner (will need custom class)
    public static final RegistryObject<Block> SPACE_MINER = registerBlock("space_miner", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    //efficiency cubes
    public static final RegistryObject<Block> BASIC_EFFICIENCY_CUBE = registerBlock("basic_efficiency_cube", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    
    public static final RegistryObject<Block> ADVANCED_EFFICIENCY_CUBE = registerBlock("advanced_efficiency_cube", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ELITE_EFFICIENCY_CUBE = registerBlock("elite_efficiency_cube", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    
    public static final RegistryObject<Block> ULTIMATE_EFFICIENCY_CUBE = registerBlock("ultimate_efficiency_cube", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> EXTREME_EFFICIENCY_CUBE = registerBlock("extreme_efficiency_cube", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    //components
    public static final RegistryObject<Block> REFINED_OBSIDIAN_BLOCK = registerBlock("refined_obsidian_block", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> COMPOUNDED_BLOCK = registerBlock("compounded_block", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
        
    //helper method
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
