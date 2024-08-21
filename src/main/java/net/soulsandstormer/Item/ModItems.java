package net.soulsandstormer.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MekanismRepowered.MOD_ID);

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
