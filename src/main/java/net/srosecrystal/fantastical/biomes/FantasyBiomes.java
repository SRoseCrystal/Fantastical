package net.srosecrystal.fantastical.biomes;


import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public class FantasyBiomes {

//volcano Island
public static final RegistryKey<Biome> VOLCANIC_ISLAND_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("fantastical", "volcanom"));
    public static final RegistryKey<Biome> VOLCANIC_ISLAND_BEACH_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("fantastical", "volcanob"));
    public static final RegistryKey<Biome> VOLCANIC_ISLAND_GRASS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("fantastical", "volcanog"));
    public static final RegistryKey<Biome> VOLCANIC_ISLAND_MUSH_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("fantastical", "volcanobb"));

private static final Biome VOLCANIC_ISLAND = VolcanoIsland.createVIsland();
    private static final Biome VOLCANIC_ISLAND_BEACH = VolcanoIsland.createVIslandBeach();
    private static final Biome VOLCANIC_ISLAND_GRASS = VolcanoIsland.createVIslandGrass();
    private static final Biome VOLCANIC_ISLAND_MUSH = VolcanoIsland.createVIslandMUSH();

    //Cold Island
    public static final RegistryKey<Biome> COLD_ISLAND_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("fantastical", "coldm"));
    public static final RegistryKey<Biome> COLD_ISLAND_BEACH_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("fantastical", "coldb"));
    public static final RegistryKey<Biome> COLD_ISLAND_HILL_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("fantastical", "coldh"));

    private static final Biome COLD_ISLAND = ColdIsland.createCIsland();
    private static final Biome COLD_ISLAND_BEACH = ColdIsland.createCIslandBeach();
    private static final Biome COLD_ISLAND_HILL = ColdIsland.createCIslandHills();

    @SuppressWarnings("WeakerAccess")
    public static void init() {
        OverworldBiomes.addEdgeBiome(BiomeKeys.DEEP_OCEAN, BiomeKeys.DEEP_OCEAN , 0.1D);

        //Volcano Biome
        Registry.register(BuiltinRegistries.BIOME, VOLCANIC_ISLAND_KEY.getValue(), VOLCANIC_ISLAND);
        Registry.register(BuiltinRegistries.BIOME, VOLCANIC_ISLAND_BEACH_KEY.getValue(), VOLCANIC_ISLAND_BEACH);
        Registry.register(BuiltinRegistries.BIOME, VOLCANIC_ISLAND_GRASS_KEY.getValue(), VOLCANIC_ISLAND_GRASS);
        Registry.register(BuiltinRegistries.BIOME, VOLCANIC_ISLAND_MUSH_KEY.getValue(), VOLCANIC_ISLAND_MUSH);

        OverworldBiomes.addBiomeVariant(BiomeKeys.DEEP_OCEAN,VOLCANIC_ISLAND_KEY,0.01D);
        OverworldBiomes.addShoreBiome(VOLCANIC_ISLAND_BEACH_KEY, VOLCANIC_ISLAND_BEACH_KEY, 5D);
        OverworldBiomes.addHillsBiome(VOLCANIC_ISLAND_KEY, VOLCANIC_ISLAND_GRASS_KEY , 6D);
        OverworldBiomes.addHillsBiome(VOLCANIC_ISLAND_KEY, VOLCANIC_ISLAND_MUSH_KEY, 8D);

        //Cold Biome
        Registry.register(BuiltinRegistries.BIOME, COLD_ISLAND_KEY.getValue(), COLD_ISLAND);
        Registry.register(BuiltinRegistries.BIOME, COLD_ISLAND_BEACH_KEY.getValue(), COLD_ISLAND_BEACH);
        Registry.register(BuiltinRegistries.BIOME, COLD_ISLAND_HILL_KEY.getValue(), COLD_ISLAND_HILL);

        OverworldBiomes.addBiomeVariant(BiomeKeys.DEEP_OCEAN,COLD_ISLAND_KEY,0.1D);//0.1
        OverworldBiomes.addShoreBiome(COLD_ISLAND_KEY, COLD_ISLAND_BEACH_KEY, 7D);
        OverworldBiomes.addEdgeBiome(COLD_ISLAND_BEACH_KEY, BiomeKeys.DEEP_COLD_OCEAN, 5D);
        OverworldBiomes.addHillsBiome(COLD_ISLAND_KEY, COLD_ISLAND_HILL_KEY , 5D);

    }

}
