package net.soulsandstormer.Item.effects;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.soulsandstormer.Item.ModItems;
import net.soulsandstormer.damage_type.ModDamageSources;

public class OnFireEffect {
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent event) {
        Player player = event.player;
        ItemStack itemToCheck = new ItemStack(ModItems.BALL_OF_FIRE.get());

        if (isItemInInventory(player, itemToCheck)) {
            player.setSecondsOnFire(1); // Sets the player on fire for 5 seconds
            DamageSource sunfire = new ModDamageSources(event.player.level().registryAccess()).sunfire();
            event.player.hurt(sunfire, 2f);
        }
    }

    private static boolean isItemInInventory(Player player, ItemStack item) {
        return player.getInventory().contains(item);
    }
}
