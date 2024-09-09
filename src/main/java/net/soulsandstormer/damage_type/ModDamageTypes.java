package net.soulsandstormer.damage_type;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;
import net.soulsandstormer.mekanismrepowered.MekanismRepowered;

public interface ModDamageTypes {
    ResourceKey<DamageType> SUNFIRE = ResourceKey.create(Registries.DAMAGE_TYPE,
            new ResourceLocation(MekanismRepowered.MOD_ID, "sunfire")
    );
    ResourceKey<DamageType> GRAVITYDAMAGE = ResourceKey.create(Registries.DAMAGE_TYPE,
            new ResourceLocation(MekanismRepowered.MOD_ID, "gravitydamage")
    );
}
