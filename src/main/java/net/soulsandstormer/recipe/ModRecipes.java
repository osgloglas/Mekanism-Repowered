package net.soulsandstormer.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

public class ModRecipes {
    private static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
        DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MekanismRepowered.MOD_ID);

    public static final RegistryObject<RecipeSerializer<SpaceMinerRecipe>> SPACE_MINER_SERIALIZER =
        SERIALIZERS.register("space_mining", () -> SpaceMinerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
