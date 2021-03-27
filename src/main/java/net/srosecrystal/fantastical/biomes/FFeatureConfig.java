package net.srosecrystal.fantastical.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

public class FFeatureConfig {
    public static RandomPatchFeatureConfig SURFACE_PODZOL =
            new RandomPatchFeatureConfig.Builder(new WeightedBlockStateProvider()
                    .addState(Blocks.PODZOL.getDefaultState(), 1),
                    new SimpleBlockPlacer())
                    .spreadX(15)
                    .spreadZ(15)
                    .tries(32).build();


}
