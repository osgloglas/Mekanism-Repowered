package net.soulsandstormer.Item.effects;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.soulsandstormer.Item.ModItems;
import net.soulsandstormer.damage_type.ModDamageSources;

public class GravityEffect {
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent event) {
        Player player = event.player;
        ItemStack itemToCheck = new ItemStack(ModItems.HEAVY_HELIUM.get());

        if (isItemInInventory(player, itemToCheck)) {
            if (hasAtLeast64OfItem(player, itemToCheck)) {
                if (!player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 4));
                }
                DamageSource gravitydamage = new ModDamageSources(event.player.level().registryAccess()).gravitydamage();
                event.player.hurt(gravitydamage, 4f);
            } else if (hasAtLeast48OfItem(player, itemToCheck)) {
                if (!player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 3));
                }
                DamageSource gravitydamage = new ModDamageSources(event.player.level().registryAccess()).gravitydamage();
                event.player.hurt(gravitydamage, 2f);
            } else if (hasAtLeast32OfItem(player, itemToCheck)) {
                if (!player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2));
                }
                DamageSource gravitydamage = new ModDamageSources(event.player.level().registryAccess()).gravitydamage();
                event.player.hurt(gravitydamage, 1f);
            } else if (hasAtLeast16OfItem(player, itemToCheck)) {
                if (!player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1));
                }
                DamageSource gravitydamage = new ModDamageSources(event.player.level().registryAccess()).gravitydamage();
                event.player.hurt(gravitydamage, 0.5f);
            }
        } else {
            // Remove Slowness effect if item is no longer in inventory
            if (player.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) {
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
        }
    }

    private static boolean isItemInInventory(Player player, ItemStack item) {
        return player.getInventory().contains(item);
    }

    private static boolean hasAtLeast16OfItem(Player player, ItemStack itemToCheck) {
        int requiredAmount = 16;
        int totalAmount = 0;
    
        // Iterate over all the inventory slots
        for (ItemStack stack : player.getInventory().items) {
            // Check if the stack is not empty and matches the item to check
            if (!stack.isEmpty() && stack.is(itemToCheck.getItem())) {
                totalAmount += stack.getCount();
                // Early exit if the total amount meets or exceeds the required amount
                if (totalAmount >= requiredAmount) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasAtLeast32OfItem(Player player, ItemStack itemToCheck) {
        int requiredAmount = 32;
        int totalAmount = 0;
    
        // Iterate over all the inventory slots
        for (ItemStack stack : player.getInventory().items) {
            // Check if the stack is not empty and matches the item to check
            if (!stack.isEmpty() && stack.is(itemToCheck.getItem())) {
                totalAmount += stack.getCount();
                // Early exit if the total amount meets or exceeds the required amount
                if (totalAmount >= requiredAmount) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasAtLeast48OfItem(Player player, ItemStack itemToCheck) {
        int requiredAmount = 48;
        int totalAmount = 0;
    
        // Iterate over all the inventory slots
        for (ItemStack stack : player.getInventory().items) {
            // Check if the stack is not empty and matches the item to check
            if (!stack.isEmpty() && stack.is(itemToCheck.getItem())) {
                totalAmount += stack.getCount();
                // Early exit if the total amount meets or exceeds the required amount
                if (totalAmount >= requiredAmount) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasAtLeast64OfItem(Player player, ItemStack itemToCheck) {
        int requiredAmount = 64;
        int totalAmount = 0;
    
        // Iterate over all the inventory slots
        for (ItemStack stack : player.getInventory().items) {
            // Check if the stack is not empty and matches the item to check
            if (!stack.isEmpty() && stack.is(itemToCheck.getItem())) {
                totalAmount += stack.getCount();
                // Early exit if the total amount meets or exceeds the required amount
                if (totalAmount >= requiredAmount) {
                    return true;
                }
            }
        }
        return false;
    }
}
