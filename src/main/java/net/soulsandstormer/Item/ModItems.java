package net.soulsandstormer.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MekanismRepowered.MOD_ID);

    //coils
    public static final RegistryObject<Item> LVCOIL = ITEMS.register("lv_coil",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MVCOIL = ITEMS.register("mv_coil",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HVCOIL = ITEMS.register("hv_coil",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VHVCOIL = ITEMS.register("vhv_coil",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EVCOIL = ITEMS.register("ev_coil",
        () -> new Item(new Item.Properties()));

    //rods
    public static final RegistryObject<Item> BASIC_ROD = ITEMS.register("basic_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADVANCED_ROD = ITEMS.register("advanced_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ELITE_ROD = ITEMS.register("elite_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ULTIMATE_ROD = ITEMS.register("ultimate_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXTREME_ROD = ITEMS.register("extreme_rod",
        () -> new Item(new Item.Properties()));

    //spools
    public static final RegistryObject<Item> COPPER_SPOOL = ITEMS.register("copper_spool",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SPOOL = ITEMS.register("steel_spool",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_SPOOL = ITEMS.register("diamond_spool",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLOW_SPOOL = ITEMS.register("glow_spool",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_SPOOL = ITEMS.register("refined_spool",
        () -> new Item(new Item.Properties()));

    //wires
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_WIRE = ITEMS.register("steel_wire",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_WIRE = ITEMS.register("diamond_wire",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_GLOWSTONE_WIRE = ITEMS.register("refined_glowstone_wire",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WIRE = ITEMS.register("refined_wire",
        () -> new Item(new Item.Properties()));

    //components
    public static final RegistryObject<Item> COMPOUNDED_INGOT = ITEMS.register("compounded_ingot",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DUST_REFINED_GLOWSTONE = ITEMS.register("dust_refined_glowstone",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXTREME_CONTROL_CIRCUIT = ITEMS.register("extreme_control_circuit",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_GLOWSTONE_COMPOUND = ITEMS.register("refined_glowstone_compound",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UNSTABLE_ALLOY = ITEMS.register("unstable_alloy",
        () -> new Item(new Item.Properties()));

    //templates (for space miner)
    public static final RegistryObject<Item> BLANK_TEMPLATE = ITEMS.register("blank_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUN_TEMPLATE = ITEMS.register("sun_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MERCURY_TEMPLATE = ITEMS.register("mercury_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VENUS_TEMPLATE = ITEMS.register("venus_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOON_TEMPLATE = ITEMS.register("moon_template",
        () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> MARS_TEMPLATE = ITEMS.register("mars_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JUPITER_TEMPLATE = ITEMS.register("jupiter_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SATURN_TEMPLATE = ITEMS.register("saturn_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> URANUS_TEMPLATE = ITEMS.register("uranus_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NEPTUNE_TEMPLATE = ITEMS.register("neptune_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLUTO_TEMPLATE = ITEMS.register("pluto_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> K_168F_TEMPLATE = ITEMS.register("k_168f_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> K_452B_TEMPLATE = ITEMS.register("k_452b_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PROXIMA_CENTAURI_B_TEMPLATE = ITEMS.register("proxima_centauri_b_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLIESE_667CC_TEMPLATE = ITEMS.register("gliese_667cc_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> A51_PEGASI_B_TEMPLATE = ITEMS.register("a51_pegasi_b_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> A55_CANCRI_E_TEMPLATE = ITEMS.register("a55_cancri_e_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HD_189733B_TEMPLATE = ITEMS.register("hd_189733b_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSS_128B_TEMPLATE = ITEMS.register("ross_128b_template",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> K_22B_TEMPLATE = ITEMS.register("k_22b_template",
        () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
