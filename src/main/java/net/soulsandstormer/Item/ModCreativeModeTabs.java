package net.soulsandstormer.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

import net.soulsandstormer.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MekanismRepowered.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MEKANISMREPOWERED_TAB = CREATIVE_MODE_TABS.register("mekanismrepowered_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LVCOIL.get()))
        .title(Component.translatable("creativetab.mekanismrepowered_tab"))
        .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModItems.LVCOIL.get());
            pOutput.accept(ModItems.MVCOIL.get());
            pOutput.accept(ModItems.HVCOIL.get());
            pOutput.accept(ModItems.VHVCOIL.get());
            pOutput.accept(ModItems.EVCOIL.get());

            pOutput.accept(ModBlocks.TRANSFORMER_CASING.get());
            pOutput.accept(ModBlocks.TRANSFORMER_INTERFACE.get());
            pOutput.accept(ModBlocks.TRANSFORMER_IO.get());
        })
        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
