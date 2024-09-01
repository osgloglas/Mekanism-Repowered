package net.soulsandstormer.Item.effects;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.soulsandstormer.Item.ModItems;

public class OnFireEffect {
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent event) {
        Player player = event.player;

        // Replace with your custom item or use an existing item.
        ItemStack itemToCheck = new ItemStack(ModItems.BALL_OF_FIRE.get());

        if (isItemInInventory(player, itemToCheck)) {
            player.setSecondsOnFire(5); // Sets the player on fire for 5 seconds
        }
    }

    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof Player player) {
            ItemStack itemToCheck = new ItemStack(ModItems.BALL_OF_FIRE.get());

            if (isItemInInventory(player, itemToCheck)) {
                // Create the custom death message
                Component customDeathMessage = Component.literal(player.getName().getString() + " could not handle the power of the sun ");
                
                // Set the custom death message
                event.setCanceled(true);
                player.level().getServer().getPlayerList().broadcastSystemMessage(customDeathMessage, false);
            }
        }
    }

    private static boolean isItemInInventory(Player player, ItemStack item) {
        return player.getInventory().contains(item);
    }
}
