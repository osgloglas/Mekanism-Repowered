package net.soulsandstormer.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.soulsandstormer.block.ModBlocks;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MekanismRepowered.MOD_ID);

    public static final RegistryObject<BlockEntityType<SpaceMinerEntity>> SPACE_MINER_BE =
        BLOCK_ENTITIES.register("space_miner_be", () -> 
            BlockEntityType.Builder.of(SpaceMinerEntity::new, 
                ModBlocks.SPACE_MINER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
