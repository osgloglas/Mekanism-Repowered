package net.soulsandstormer.infusetypes;

import mekanism.api.chemical.infuse.InfuseType;
import mekanism.common.registration.impl.InfuseTypeDeferredRegister;
import mekanism.common.registration.impl.InfuseTypeRegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

public class ModInfuseTypes {
    public static final InfuseTypeDeferredRegister MOD_INFUSE_TYPES = new InfuseTypeDeferredRegister(MekanismRepowered.MOD_ID);
    public static final InfuseTypeRegistryObject<InfuseType> INFUSED_GLOWSTONE_COMPOUND;
    public static final InfuseTypeRegistryObject<InfuseType> PURE_LAVA;
    public static final InfuseTypeRegistryObject<InfuseType> STONE;
    public static final InfuseTypeRegistryObject<InfuseType> MAGMA;
    public static final InfuseTypeRegistryObject<InfuseType> MILK;
    public static final InfuseTypeRegistryObject<InfuseType> TERRACOTTA_SLURRY;
    public static final InfuseTypeRegistryObject<InfuseType> DENSE_OSMIUM;
    public static final InfuseTypeRegistryObject<InfuseType> LIQUIDATED_HYDROGEN;
    public static final InfuseTypeRegistryObject<InfuseType> ICE;
    public static final InfuseTypeRegistryObject<InfuseType> BLUE_ICE;
    public static final InfuseTypeRegistryObject<InfuseType> DENSE_NETHERITE;
    public static final InfuseTypeRegistryObject<InfuseType> LODING_FLUID;
    public static final InfuseTypeRegistryObject<InfuseType> GRASS;
    public static final InfuseTypeRegistryObject<InfuseType> LIQUIDATED_DIRT;
    public static final InfuseTypeRegistryObject<InfuseType> LIQUIDATED_SANDSTONE;
    public static final InfuseTypeRegistryObject<InfuseType> NETHER_STAR_FUEL;
    public static final InfuseTypeRegistryObject<InfuseType> LIQUIDATED_BRINE;
    public static final InfuseTypeRegistryObject<InfuseType> PURE_WATER;
    public static final InfuseTypeRegistryObject<InfuseType> INFESTED_STONE;
    public static final InfuseTypeRegistryObject<InfuseType> DENSE_DIAMOND;

    private ModInfuseTypes() {
    }

    public static void register(IEventBus eventBus) {
        MOD_INFUSE_TYPES.register(eventBus);
    }

    //component infuse types
    static {
        INFUSED_GLOWSTONE_COMPOUND = MOD_INFUSE_TYPES.register("infused_glowstone_compound", 0xede861);
    }

    //template infuse types
    static {
        PURE_LAVA = MOD_INFUSE_TYPES.register("pure_lava", 0xff5100);
    }
    static {
        STONE = MOD_INFUSE_TYPES.register("infused_stone", 0x595959);
    }
    static {
        MAGMA = MOD_INFUSE_TYPES.register("infused_magma", 0x802800);
    }
    static {
        MILK = MOD_INFUSE_TYPES.register("infused_milk", 0xe0e0e0);
    }
    static {
        TERRACOTTA_SLURRY = MOD_INFUSE_TYPES.register("terracotta_slurry", 0xc96c40);
    }
    static {
        DENSE_OSMIUM = MOD_INFUSE_TYPES.register("dense_osmium", 0x5c89b5);
    }
    static {
        LIQUIDATED_HYDROGEN = MOD_INFUSE_TYPES.register("liquidated_hydrogen", 0xc2c2c2);
    }
    static {
        ICE = MOD_INFUSE_TYPES.register("infused_ice", 0x4fa7ff);
    }
    static {
        BLUE_ICE = MOD_INFUSE_TYPES.register("infused_blue_ice", 0x1977d4);
    }
    static {
        DENSE_NETHERITE = MOD_INFUSE_TYPES.register("dense_netherite", 0x424242);
    }
    static {
        LODING_FLUID = MOD_INFUSE_TYPES.register("loding_fluid", 0x949494);
    }
    static {
        GRASS = MOD_INFUSE_TYPES.register("infused_grass", 0x37803a);
    }
    static {
        LIQUIDATED_DIRT = MOD_INFUSE_TYPES.register("liquidated_dirt", 0x473823);
    }
    static {
        LIQUIDATED_SANDSTONE = MOD_INFUSE_TYPES.register("liquidated_sandstone", 0xad9e87);
    }
    static {
        NETHER_STAR_FUEL = MOD_INFUSE_TYPES.register("nether_star_fuel", 0xc9c7ab);
    }
    static {
        LIQUIDATED_BRINE = MOD_INFUSE_TYPES.register("liquidated_brine", 0xa6a376);
    }
    static {
        PURE_WATER = MOD_INFUSE_TYPES.register("pure_water", 0x1d36a8);
    }
    static {
        INFESTED_STONE = MOD_INFUSE_TYPES.register("infused_infested_stone", 0x595959);
    }
    static {
        DENSE_DIAMOND = MOD_INFUSE_TYPES.register("dense_diamond", 0x46b7d4);
    }
}