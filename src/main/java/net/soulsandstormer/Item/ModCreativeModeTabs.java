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
            pOutput.accept(ModItems.BASIC_ROD.get());
            pOutput.accept(ModItems.ADVANCED_ROD.get());
            pOutput.accept(ModItems.ELITE_ROD.get());
            pOutput.accept(ModItems.ULTIMATE_ROD.get());
            pOutput.accept(ModItems.EXTREME_ROD.get());
            pOutput.accept(ModItems.COPPER_SPOOL.get());
            pOutput.accept(ModItems.STEEL_SPOOL.get());
            pOutput.accept(ModItems.DIAMOND_SPOOL.get());
            pOutput.accept(ModItems.GLOW_SPOOL.get());
            pOutput.accept(ModItems.REFINED_SPOOL.get());
            pOutput.accept(ModItems.COPPER_WIRE.get());
            pOutput.accept(ModItems.STEEL_WIRE.get());
            pOutput.accept(ModItems.DIAMOND_WIRE.get());
            pOutput.accept(ModItems.REFINED_GLOWSTONE_WIRE.get());
            pOutput.accept(ModItems.REFINED_WIRE.get());
            pOutput.accept(ModItems.COMPOUNDED_INGOT.get());
            pOutput.accept(ModItems.DUST_REFINED_GLOWSTONE.get());
            pOutput.accept(ModItems.EXTREME_CONTROL_CIRCUIT.get());
            pOutput.accept(ModItems.REFINED_GLOWSTONE_COMPOUND.get());
            pOutput.accept(ModItems.UNSTABLE_ALLOY.get());
            pOutput.accept(ModItems.BLANK_TEMPLATE.get());
            pOutput.accept(ModItems.SUN_TEMPLATE.get());
            pOutput.accept(ModItems.MERCURY_TEMPLATE.get());
            pOutput.accept(ModItems.VENUS_TEMPLATE.get());
            pOutput.accept(ModItems.MOON_TEMPLATE.get());
            pOutput.accept(ModItems.MARS_TEMPLATE.get());
            pOutput.accept(ModItems.JUPITER_TEMPLATE.get());
            pOutput.accept(ModItems.SATURN_TEMPLATE.get());
            pOutput.accept(ModItems.URANUS_TEMPLATE.get());
            pOutput.accept(ModItems.NEPTUNE_TEMPLATE.get());
            pOutput.accept(ModItems.PLUTO_TEMPLATE.get());
            pOutput.accept(ModItems.K_168F_TEMPLATE.get());
            pOutput.accept(ModItems.K_452B_TEMPLATE.get());
            pOutput.accept(ModItems.PROXIMA_CENTAURI_B_TEMPLATE.get());
            pOutput.accept(ModItems.GLIESE_667CC_TEMPLATE.get());
            pOutput.accept(ModItems.A51_PEGASI_B_TEMPLATE.get());
            pOutput.accept(ModItems.A55_CANCRI_E_TEMPLATE.get());
            pOutput.accept(ModItems.HD_189733B_TEMPLATE.get());
            pOutput.accept(ModItems.ROSS_128B_TEMPLATE.get());
            pOutput.accept(ModItems.K_22B_TEMPLATE.get());

            pOutput.accept(ModItems.BALL_OF_FIRE.get());

            pOutput.accept(ModBlocks.TRANSFORMER_CASING.get());
            pOutput.accept(ModBlocks.TRANSFORMER_INTERFACE.get());
            pOutput.accept(ModBlocks.TRANSFORMER_IO.get());
            pOutput.accept(ModBlocks.BASIC_VOLTAGE_RODS.get());
            pOutput.accept(ModBlocks.ADVANCED_VOLTAGE_RODS.get());
            pOutput.accept(ModBlocks.ELITE_VOLTAGE_RODS.get());
            pOutput.accept(ModBlocks.ULTIMATE_VOLTAGE_RODS.get());
            pOutput.accept(ModBlocks.EXTREME_VOLTAGE_RODS.get());
            pOutput.accept(ModBlocks.SPACE_MINER.get());
            pOutput.accept(ModBlocks.BASIC_EFFICIENCY_CUBE.get());
            pOutput.accept(ModBlocks.ADVANCED_EFFICIENCY_CUBE.get());
            pOutput.accept(ModBlocks.ELITE_EFFICIENCY_CUBE.get());
            pOutput.accept(ModBlocks.ULTIMATE_EFFICIENCY_CUBE.get());
            pOutput.accept(ModBlocks.EXTREME_EFFICIENCY_CUBE.get());
            pOutput.accept(ModBlocks.REFINED_OBSIDIAN_BLOCK.get());
            pOutput.accept(ModBlocks.COMPOUNDED_BLOCK.get());
        })
        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
