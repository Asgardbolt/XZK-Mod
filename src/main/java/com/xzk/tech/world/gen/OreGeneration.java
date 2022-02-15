package com.xzk.tech.world.gen;

import com.xzk.tech.block.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration{
    public static final RuleTest END_ORE = new BlockMatchRuleTest(Blocks.END_STONE);
    public static final RuleTest SAND_STONE_ORE = new BlockMatchRuleTest(Blocks.SANDSTONE);
    public static final RuleTest SAND_ORE = new BlockMatchRuleTest(Blocks.SAND);
    public static final RuleTest CLAY_ORE = new BlockMatchRuleTest(Blocks.CLAY);
    public static final RuleTest DEEP_STONE = new BlockMatchRuleTest(BlockRegistry.DeepStone.get());
    public static final RuleTest VERY_DEEP_STONE = new BlockMatchRuleTest(BlockRegistry.VeryDeepStone.get());
    public static void GenerateOres(final BiomeLoadingEvent event)
    {
        /*
        coal ore:17,1,0,125,20
        iron ore:9,5,0,64,20
        gold_ore:9,1,0,32,2
        redstone_ore:8,1,0,16,8
        diamond_ore:8,1,0,16,1
        Lapis Lazuli:7,1,0,31,1
        granite:33,1,0,80,10
         */
        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, BlockRegistry.SilverOre.get().defaultBlockState(),
                9,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, BlockRegistry.GoldOreVeryDeep.get().defaultBlockState(),
                9,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, BlockRegistry.PlatinumOre.get().defaultBlockState(),
                9,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, BlockRegistry.IridosmineOre.get().defaultBlockState(),
                9,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, BlockRegistry.PhosphoceriteVeryDeep.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, BlockRegistry.BastnasiteVeryDeep.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, BlockRegistry.XenotimeVeryDeep.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Phosphocerite.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Bastnasite.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Xenotime.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.VeryDeepPortalToVeryDeep.get().defaultBlockState(),
                1,
                1,
                0,
                5,
                1
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.DeepPortalToDeep.get().defaultBlockState(),
                1,
                1,
                0,
                5,
                1
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, Blocks.LAVA.defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, Blocks.LAVA.defaultBlockState(),
                10,
                1,
                0,
                225,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, Blocks.MAGMA_BLOCK.defaultBlockState(),
                8,
                1,
                0,
                225,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, Blocks.COAL_BLOCK.defaultBlockState(),
                9,
                1,
                0,
                125,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, Blocks.STONE.defaultBlockState(),
                17,
                125,
                0,
                225,
                5
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, Blocks.STONE.defaultBlockState(),
                9,
                175,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, BlockRegistry.DeepStone.get().defaultBlockState(),
                17,
                125,
                0,
                225,
                5
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.SpodumeneDeep.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.PolluciteDeep.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.LepidoliteDeep.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Rutile.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.ZirconProducts.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Baddeleyite.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.VanadiumTitanoMagnetite.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Columbite.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Coltan.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Molybdenite.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Wolframite.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, BlockRegistry.Scheelite.get().defaultBlockState(),
                8,
                1,
                0,
                225,
                2
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Apatite.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Arsenopyrite.get().defaultBlockState(),
                9,
                5,
                0,
                64,
                20
        );

        OreGenerate(event.getGeneration(), OreGeneration.SAND_ORE, BlockRegistry.BoraxOre.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Barite.get().defaultBlockState(),
                9,
                1,
                0,
                32,
                2
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Bauxite.get().defaultBlockState(),
                9,
                5,
                0,
                64,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Bismite.get().defaultBlockState(),
                8,
                1,
                0,
                16,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.SAND_STONE_ORE, BlockRegistry.Beryl.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Spodumene.get().defaultBlockState(),
                8,
                1,
                0,
                16,
                1
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Lepidolite.get().defaultBlockState(),
                8,
                16,
                0,
                32,
                1
        );

        OreGenerate(event.getGeneration(), OreGeneration.CLAY_ORE, BlockRegistry.Priceite.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                20
        );

        OreGenerate(event.getGeneration(), OreGeneration.SAND_ORE, BlockRegistry.RockSaltOre.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Magnesite.get().defaultBlockState(),
                9,
                64,
                0,
                125,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Carnallite.get().defaultBlockState(),
                9,
                1,
                0,
                125,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.CalciumCarbonate.get().defaultBlockState(),
                33,
                1,
                0,
                80,
                10
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Chromite.get().defaultBlockState(),
                9,
                5,
                0,
                64,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Pyrolusite.get().defaultBlockState(),
                8,
                1,
                0,
                64,
                8
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Psilomelane.get().defaultBlockState(),
                8,
                1,
                0,
                64,
                8
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Magnetite.get().defaultBlockState(),
                9,
                5,
                0,
                64,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Pentlandite.get().defaultBlockState(),
                9,
                5,
                0,
                64,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Chalcocite.get().defaultBlockState(),
                9,
                5,
                0,
                64,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Chalcopyrite.get().defaultBlockState(),
                9,
                5,
                0,
                64,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.SphaleriteAndGalena.get().defaultBlockState(),
                8,
                1,
                0,
                32,
                8
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Smithsonite.get().defaultBlockState(),
                8,
                32,
                0,
                125,
                8
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Stibnite.get().defaultBlockState(),
                9,
                1,
                0,
                32,
                2
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Cassiterite.get().defaultBlockState(),
                9,
                5,
                0,
                64,
                20
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Pollucite.get().defaultBlockState(),
                8,
                1,
                0,
                32,
                1
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Witherite.get().defaultBlockState(),
                9,
                1,
                0,
                32,
                2
        );

        OreGenerate(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockRegistry.Cinnabar.get().defaultBlockState(),
                8,
                1,
                0,
                64,
                8
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, Blocks.OBSIDIAN.defaultBlockState(),
                33,
                1,
                0,
                255,
                10
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, Blocks.OBSIDIAN.defaultBlockState(),
                33,
                1,
                0,
                255,
                20
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, Blocks.GRAVEL.defaultBlockState(),
                33,
                1,
                0,
                255,
                10
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, Blocks.DIORITE.defaultBlockState(),
                33,
                1,
                0,
                255,
                10
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, Blocks.ANDESITE.defaultBlockState(),
                33,
                1,
                0,
                255,
                10
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, Blocks.GRANITE.defaultBlockState(),
                33,
                1,
                0,
                255,
                10
        );

        OreGenerate(event.getGeneration(), OreGeneration.DEEP_STONE, Blocks.GRANITE.defaultBlockState(),
                8,
                1,
                0,
                255,
                2
        );

        OreGenerate(event.getGeneration(), OreGeneration.VERY_DEEP_STONE, Blocks.BEDROCK.defaultBlockState(),
                33,
                1,
                0,
                255,
                20
        );
    };

    private static void OreGenerate(
            BiomeGenerationSettingsBuilder settings, RuleTest FillerType, BlockState state,int size,
            int min, int top, int max, int CountPerChunk
    )
    {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE
                        .configured(new OreFeatureConfig(FillerType,state,size))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(min,top,max)))
                        .squared()
                        .count(CountPerChunk));
    }
}

