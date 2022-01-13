package com.paperteam.industriallevel.world;

import com.paperteam.industriallevel.IndustrialLevel;
import com.paperteam.industriallevel.config.IndustrialLevelConfigBuilder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber
public class IndustrialLevelPlacedFeature {
    // Declare placed feature variables
    public static PlacedFeature TITANIUM_ORE;
    public static PlacedFeature DEEPSLATE_TITANIUM_ORE;
    public static PlacedFeature NETHER_TITANIUM_ORE;
    public static PlacedFeature END_TITANIUM_ORE;
    public static PlacedFeature CHLOROPHYTE_ORE;
    public static PlacedFeature DEEPSLATE_CHLOROPHYTE_ORE;
    public static PlacedFeature NETHER_CHLOROPHYTE_ORE;
    public static PlacedFeature END_CHLOROPHYTE_ORE;
    public static PlacedFeature BRONZE_ORE;
    public static PlacedFeature DEEPSLATE_BRONZE_ORE;
    public static PlacedFeature NETHER_BRONZE_ORE;
    public static PlacedFeature END_BRONZE_ORE;
    public static PlacedFeature LEAD_ORE;
    public static PlacedFeature DEEPSLATE_LEAD_ORE;
    public static PlacedFeature NETHER_LEAD_ORE;
    public static PlacedFeature END_LEAD_ORE;
    public static PlacedFeature NICKEL_ORE;
    public static PlacedFeature DEEPSLATE_NICKEL_ORE;
    public static PlacedFeature NETHER_NICKEL_ORE;
    public static PlacedFeature END_NICKEL_ORE;
    public static PlacedFeature OSMIUM_ORE;
    public static PlacedFeature DEEPSLATE_OSMIUM_ORE;
    public static PlacedFeature NETHER_OSMIUM_ORE;
    public static PlacedFeature END_OSMIUM_ORE;
    public static PlacedFeature PLATINUM_ORE;
    public static PlacedFeature DEEPSLATE_PLATINUM_ORE;
    public static PlacedFeature NETHER_PLATINUM_ORE;
    public static PlacedFeature END_PLATINUM_ORE;
    public static PlacedFeature SILVER_ORE;
    public static PlacedFeature DEEPSLATE_SILVER_ORE;
    public static PlacedFeature NETHER_SILVER_ORE;
    public static PlacedFeature END_SILVER_ORE;
    public static PlacedFeature TIN_ORE;
    public static PlacedFeature DEEPSLATE_TIN_ORE;
    public static PlacedFeature NETHER_TIN_ORE;
    public static PlacedFeature END_TIN_ORE;
    public static PlacedFeature URANIUM_ORE;
    public static PlacedFeature DEEPSLATE_URANIUM_ORE;
    public static PlacedFeature NETHER_URANIUM_ORE;
    public static PlacedFeature END_URANIUM_ORE;
    public static PlacedFeature ZINC_ORE;
    public static PlacedFeature DEEPSLATE_ZINC_ORE;
    public static PlacedFeature NETHER_ZINC_ORE;
    public static PlacedFeature END_ZINC_ORE;

    public static void registerPlacedFeatures() {
        // Add configured features and placement details to placed features
        TITANIUM_ORE = IndustrialLevelConfiguredFeature.TITANIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.TITANIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.TITANIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.TITANIUM_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_TITANIUM_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_TITANIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_TITANIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_TITANIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_TITANIUM_ORE_MAX_HEIGHT.get()))));

        NETHER_TITANIUM_ORE = IndustrialLevelConfiguredFeature.NETHER_TITANIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.NETHER_TITANIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_TITANIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_TITANIUM_ORE_MAX_HEIGHT.get()))));

        END_TITANIUM_ORE = IndustrialLevelConfiguredFeature.END_TITANIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.END_TITANIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_TITANIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_TITANIUM_ORE_MAX_HEIGHT.get()))));

        CHLOROPHYTE_ORE = IndustrialLevelConfiguredFeature.CHLOROPHYTE_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.CHLOROPHYTE_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.CHLOROPHYTE_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.CHLOROPHYTE_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_CHLOROPHYTE_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_CHLOROPHYTE_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_MAX_HEIGHT.get()))));

        NETHER_CHLOROPHYTE_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_CHLOROPHYTE_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_MAX_HEIGHT.get()))));

        END_CHLOROPHYTE_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_CHLOROPHYTE_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_MAX_HEIGHT.get()))));

        BRONZE_ORE = IndustrialLevelConfiguredFeature.BRONZE_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.BRONZE_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.BRONZE_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.BRONZE_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_BRONZE_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_BRONZE_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_MAX_HEIGHT.get()))));

        NETHER_BRONZE_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_BRONZE_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_MAX_HEIGHT.get()))));

        END_BRONZE_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_BRONZE_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_MAX_HEIGHT.get()))));

        LEAD_ORE = IndustrialLevelConfiguredFeature.LEAD_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.LEAD_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.LEAD_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.LEAD_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_LEAD_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_LEAD_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_MAX_HEIGHT.get()))));

        NETHER_LEAD_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_LEAD_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_MAX_HEIGHT.get()))));

        END_LEAD_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_LEAD_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_MAX_HEIGHT.get()))));

        NICKEL_ORE = IndustrialLevelConfiguredFeature.NICKEL_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.NICKEL_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NICKEL_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NICKEL_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_NICKEL_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_NICKEL_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_MAX_HEIGHT.get()))));

        NETHER_NICKEL_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_NICKEL_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_MAX_HEIGHT.get()))));

        END_NICKEL_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_NICKEL_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_MAX_HEIGHT.get()))));

        OSMIUM_ORE = IndustrialLevelConfiguredFeature.OSMIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.OSMIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.OSMIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.OSMIUM_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_OSMIUM_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_OSMIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_OSMIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_OSMIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_OSMIUM_ORE_MAX_HEIGHT.get()))));

        NETHER_OSMIUM_ORE = IndustrialLevelConfiguredFeature.NETHER_OSMIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.NETHER_OSMIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_OSMIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_OSMIUM_ORE_MAX_HEIGHT.get()))));

        END_OSMIUM_ORE = IndustrialLevelConfiguredFeature.END_OSMIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.END_OSMIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_OSMIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_OSMIUM_ORE_MAX_HEIGHT.get()))));

        PLATINUM_ORE = IndustrialLevelConfiguredFeature.PLATINUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.PLATINUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.PLATINUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.PLATINUM_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_PLATINUM_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_PLATINUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_PLATINUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_PLATINUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_PLATINUM_ORE_MAX_HEIGHT.get()))));

        NETHER_PLATINUM_ORE = IndustrialLevelConfiguredFeature.NETHER_PLATINUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.NETHER_PLATINUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_PLATINUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_PLATINUM_ORE_MAX_HEIGHT.get()))));

        END_PLATINUM_ORE = IndustrialLevelConfiguredFeature.END_PLATINUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.END_PLATINUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_PLATINUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_PLATINUM_ORE_MAX_HEIGHT.get()))));

        SILVER_ORE = IndustrialLevelConfiguredFeature.SILVER_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.SILVER_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.SILVER_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.SILVER_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_SILVER_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_SILVER_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_SILVER_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_SILVER_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_SILVER_ORE_MAX_HEIGHT.get()))));

        NETHER_SILVER_ORE = IndustrialLevelConfiguredFeature.NETHER_SILVER_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.NETHER_SILVER_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_SILVER_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_SILVER_ORE_MAX_HEIGHT.get()))));

        END_SILVER_ORE = IndustrialLevelConfiguredFeature.END_SILVER_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.END_SILVER_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_SILVER_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_SILVER_ORE_MAX_HEIGHT.get()))));

        TIN_ORE = IndustrialLevelConfiguredFeature.TIN_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.TIN_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.TIN_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.TIN_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_TIN_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_TIN_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_TIN_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_TIN_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_TIN_ORE_MAX_HEIGHT.get()))));

        NETHER_TIN_ORE = IndustrialLevelConfiguredFeature.NETHER_TIN_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.NETHER_TIN_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_TIN_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_TIN_ORE_MAX_HEIGHT.get()))));

        END_TIN_ORE = IndustrialLevelConfiguredFeature.END_TIN_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.END_TIN_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_TIN_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_TIN_ORE_MAX_HEIGHT.get()))));

        URANIUM_ORE = IndustrialLevelConfiguredFeature.URANIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.URANIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.URANIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.URANIUM_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_URANIUM_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_URANIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_URANIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_URANIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_URANIUM_ORE_MAX_HEIGHT.get()))));

        NETHER_URANIUM_ORE = IndustrialLevelConfiguredFeature.NETHER_URANIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.NETHER_URANIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_URANIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_URANIUM_ORE_MAX_HEIGHT.get()))));

        END_URANIUM_ORE = IndustrialLevelConfiguredFeature.END_URANIUM_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.END_URANIUM_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_URANIUM_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_URANIUM_ORE_MAX_HEIGHT.get()))));

        ZINC_ORE = IndustrialLevelConfiguredFeature.ZINC_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.ZINC_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.ZINC_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.ZINC_ORE_MAX_HEIGHT.get()))));

        DEEPSLATE_ZINC_ORE = IndustrialLevelConfiguredFeature.DEEPSLATE_ZINC_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.DEEPSLATE_ZINC_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_ZINC_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.DEEPSLATE_ZINC_ORE_MAX_HEIGHT.get()))));

        NETHER_ZINC_ORE = IndustrialLevelConfiguredFeature.NETHER_ZINC_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.NETHER_ZINC_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_ZINC_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.NETHER_ZINC_ORE_MAX_HEIGHT.get()))));

        END_ZINC_ORE = IndustrialLevelConfiguredFeature.END_ZINC_ORE
                .placed(commonOrePlacement(IndustrialLevelConfigBuilder.END_ZINC_ORE_CHANCE.get(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_ZINC_ORE_MIN_HEIGHT.get()),
                                VerticalAnchor.absolute(IndustrialLevelConfigBuilder.END_ZINC_ORE_MAX_HEIGHT.get()))));

        // Register placed features
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "titanium_ore"), TITANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_titanium_ore"), NETHER_TITANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_titanium_ore"), END_TITANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "chlorophyte_ore"), CHLOROPHYTE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_chlorophyte_ore"), DEEPSLATE_CHLOROPHYTE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_chlorophyte_ore"), NETHER_CHLOROPHYTE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_chlorophyte_ore"), END_CHLOROPHYTE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "bronze_ore"), BRONZE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_bronze_ore"), DEEPSLATE_BRONZE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_bronze_ore"), NETHER_BRONZE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_bronze_ore"), END_BRONZE_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "lead_ore"), LEAD_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_lead_ore"), DEEPSLATE_LEAD_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_lead_ore"), NETHER_LEAD_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_lead_ore"), END_LEAD_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nickel_ore"), NICKEL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_nickel_ore"), DEEPSLATE_NICKEL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_nickel_ore"), NETHER_NICKEL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_nickel_ore"), END_NICKEL_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "osmium_ore"), OSMIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_osmium_ore"), DEEPSLATE_OSMIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_osmium_ore"), NETHER_OSMIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_osmium_ore"), END_OSMIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "platinum_ore"), PLATINUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_platinum_ore"), DEEPSLATE_PLATINUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_platinum_ore"), NETHER_PLATINUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_platinum_ore"), END_PLATINUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "silver_ore"), SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_silver_ore"), NETHER_SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_silver_ore"), END_SILVER_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "tin_ore"), TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_tin_ore"), DEEPSLATE_TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_tin_ore"), NETHER_TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_tin_ore"), END_TIN_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "uranium_ore"), URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_uranium_ore"), DEEPSLATE_URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_uranium_ore"), NETHER_URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_uranium_ore"), END_URANIUM_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "zinc_ore"), ZINC_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "deepslate_zinc_ore"), DEEPSLATE_ZINC_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "nether_zinc_ore"), NETHER_ZINC_ORE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new ResourceLocation(IndustrialLevel.ModId, "end_zinc_ore"), END_ZINC_ORE);
    }

    @SubscribeEvent
    public static void registerBiomeModification(final BiomeLoadingEvent event)
    {
        // Add features to be inserted into biome generation
        if(IndustrialLevelConfigBuilder.TITANIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> TITANIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_TITANIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_TITANIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_TITANIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_TITANIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_TITANIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_TITANIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.CHLOROPHYTE_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> CHLOROPHYTE_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_CHLOROPHYTE_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_CHLOROPHYTE_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_CHLOROPHYTE_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_CHLOROPHYTE_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_CHLOROPHYTE_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_CHLOROPHYTE_ORE);
        }

        if(IndustrialLevelConfigBuilder.BRONZE_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> BRONZE_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_BRONZE_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_BRONZE_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_BRONZE_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_BRONZE_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_BRONZE_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_BRONZE_ORE);
        }

        if(IndustrialLevelConfigBuilder.LEAD_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> LEAD_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_LEAD_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_LEAD_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_LEAD_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_LEAD_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_LEAD_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_LEAD_ORE);
        }

        if(IndustrialLevelConfigBuilder.NICKEL_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NICKEL_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_NICKEL_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_NICKEL_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_NICKEL_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_NICKEL_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_NICKEL_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_NICKEL_ORE);
        }

        if(IndustrialLevelConfigBuilder.OSMIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> OSMIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_OSMIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_OSMIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_OSMIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_OSMIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_OSMIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_OSMIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.PLATINUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> PLATINUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_PLATINUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_PLATINUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_PLATINUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_PLATINUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_PLATINUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_PLATINUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.SILVER_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> SILVER_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_SILVER_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_SILVER_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_SILVER_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_SILVER_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_SILVER_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_SILVER_ORE);
        }

        if(IndustrialLevelConfigBuilder.TIN_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> TIN_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_TIN_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_TIN_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_TIN_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_TIN_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_TIN_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_TIN_ORE);
        }

        if(IndustrialLevelConfigBuilder.URANIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> URANIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_URANIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_URANIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_URANIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_URANIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_URANIUM_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_URANIUM_ORE);
        }

        if(IndustrialLevelConfigBuilder.ZINC_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> ZINC_ORE);
        }

        if(IndustrialLevelConfigBuilder.DEEPSLATE_ZINC_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> DEEPSLATE_ZINC_ORE);
        }

        if(IndustrialLevelConfigBuilder.NETHER_ZINC_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> NETHER_ZINC_ORE);
        }

        if(IndustrialLevelConfigBuilder.END_ZINC_ORE_GENERATION.get()) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(() -> END_ZINC_ORE);
        }
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_)
    {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_)
    {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_)
    {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
