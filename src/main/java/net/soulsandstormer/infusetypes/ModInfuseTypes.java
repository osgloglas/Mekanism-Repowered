package net.soulsandstormer.infusetypes;

import mekanism.api.chemical.infuse.InfuseType;
import mekanism.common.registration.impl.InfuseTypeDeferredRegister;
import mekanism.common.registration.impl.InfuseTypeRegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModInfuseTypes {
    public static final InfuseTypeDeferredRegister MOD_INFUSE_TYPES = new InfuseTypeDeferredRegister("mekanismrepowered");
    public static final InfuseTypeRegistryObject<InfuseType> REFINED_GLOWSTONE_COMPOUND;

    private ModInfuseTypes() {
    }

    public static void register(IEventBus eventBus) {
        MOD_INFUSE_TYPES.register(eventBus);
    }

    static {
        REFINED_GLOWSTONE_COMPOUND = MOD_INFUSE_TYPES.register("infused_glowstone_compound", 12895748);
   }
}