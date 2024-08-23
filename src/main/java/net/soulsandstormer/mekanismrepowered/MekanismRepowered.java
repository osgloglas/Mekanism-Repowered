package net.soulsandstormer.mekanismrepowered;

import com.mojang.logging.LogUtils;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.soulsandstormer.Item.ModCreativeModeTabs;
import net.soulsandstormer.Item.ModItems;
import net.soulsandstormer.block.ModBlocks;
import net.soulsandstormer.block.entity.ModBlockEntities;
import net.soulsandstormer.infusetypes.ModInfuseTypes;
import net.soulsandstormer.screen.ModMenuTypes;
import net.soulsandstormer.screen.SpaceMinerScreen;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MekanismRepowered.MOD_ID)
public class MekanismRepowered
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mekanismrepowered";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MekanismRepowered()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModInfuseTypes.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        //example of adding to a vanilla tab
        /*if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ModItems.LVCOIL);
            event.accept(ModItems.MVCOIL);
        }*/
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            //entity renderer

            //screens
            MenuScreens.register(ModMenuTypes.SPACE_MINER_MENU.get(), SpaceMinerScreen::new);
        }
    }
}

/*TODO
 * implement space miner
 * 
 * add drones fully
 * 
 * test all recipes (with JEI or another way)
 * 
 * add advancements
 * 
 * add items from space miner
 * 
 * add nuclear waste recycler item things
 * 
 * black hole device?
 * 
 * add particle accelerator
 * 
 * add BFR (big friggin reactor)
 * 
 * ->>figure out how mekanism pipes interact with objects
 */