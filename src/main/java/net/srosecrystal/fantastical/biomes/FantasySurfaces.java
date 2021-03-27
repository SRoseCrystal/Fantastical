package net.srosecrystal.fantastical.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
@SuppressWarnings("WeakerAccess")
public class FantasySurfaces {
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> VISLANDMAIN = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.BASALT.getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    Blocks.STONE.getDefaultState()));
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> VISLANDGRASS = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.GRASS_BLOCK.getDefaultState(),
                    Blocks.DIRT.getDefaultState(),
                    Blocks.STONE.getDefaultState()));
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> VISLANDMUSH = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.PODZOL.getDefaultState(),
                    Blocks.DIRT.getDefaultState(),
                    Blocks.STONE.getDefaultState()));
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> VISLANDBEACH = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.SAND.getDefaultState(),
                    Blocks.SAND.getDefaultState(),
                    Blocks.STONE.getDefaultState()));

    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> CISLANDBEACH = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.STONE.getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    Blocks.STONE.getDefaultState()));

    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> CISLANDMOUNT = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.SNOW_BLOCK.getDefaultState(),
                    Blocks.SNOW_BLOCK.getDefaultState(),
                    Blocks.STONE.getDefaultState()));

}
