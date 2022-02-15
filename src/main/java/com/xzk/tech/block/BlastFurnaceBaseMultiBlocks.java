package com.xzk.tech.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class BlastFurnaceBaseMultiBlocks extends Block {
    private static final VoxelShape shape0;
    private static final VoxelShape shape1;
    private static final VoxelShape shape2;
    private static final VoxelShape shape3;
    private static final VoxelShape shape4;
    private static final VoxelShape shape8;
    private static final VoxelShape shape9;
    private static final VoxelShape shape10;
    private static final VoxelShape shape11;
    private static final VoxelShape shape12;
    private static final VoxelShape shape13;
    private static final VoxelShape shape14;
    private static final VoxelShape shape15;
    private static final VoxelShape shape16;
    private static final VoxelShape shape17;
    private static final VoxelShape shape18;
    private static final VoxelShape shape19;
    private static final VoxelShape shape20;
    private static final VoxelShape shape21;
    private static final VoxelShape shape22;
    private static final VoxelShape shape23;
    private static final VoxelShape shape24;
    private static final VoxelShape shape25;
    private static final VoxelShape shape26;
    private static final VoxelShape shape27;
    private static final VoxelShape shape28;
    private static final VoxelShape shape29;
    private static final VoxelShape shape30;
    private static final VoxelShape shape31;
    private static final VoxelShape shape32;
    private static final VoxelShape shape33;
    private static final VoxelShape shape34;
    private static final VoxelShape shape35;
    private static final VoxelShape shape36;

    public static final IntegerProperty BFBMultiBlocks = IntegerProperty.create("b_f_b_multiblocks",0,36);

    static {
        VoxelShape base0_1 = Block.box(0, 0, 12, 1, 8, 16);
        VoxelShape base0_2 = Block.box(1, 0, 7, 3, 8, 16);
        VoxelShape base0_3 = Block.box(3, 0, 3, 7, 8, 16);
        VoxelShape base0_4 = Block.box(7, 0, 1, 12, 8, 16);
        VoxelShape base0_5 = Block.box(12, 0, 0, 16, 8, 16);
        shape0 = VoxelShapes.or(base0_1,base0_2,base0_3,base0_4,base0_5);

        VoxelShape base1_1 = Block.box(0, 0, 7, 15, 8, 12);
        VoxelShape base1_2 = Block.box(0, 0, 1, 9, 8, 3);
        VoxelShape base1_3 = Block.box(0, 0, 3, 13, 8, 7);
        VoxelShape base1_4 = Block.box(0, 0, 0, 4, 8, 1);
        VoxelShape base1_5 = Block.box(0, 0, 12, 16, 8, 16);
        shape1 = VoxelShapes.or(base1_1,base1_2,base1_3,base1_4,base1_5);

        VoxelShape base2_1 = Block.box(4, 0, 0, 9, 8, 15);
        VoxelShape base2_2 = Block.box(13, 0, 0, 15, 8, 9);
        VoxelShape base2_3 = Block.box(9, 0, 0, 13, 8, 13);
        VoxelShape base2_4 = Block.box(15, 0, 0, 16, 8, 4);
        VoxelShape base2_5 = Block.box(0, 0, 0, 4, 8, 16);
        shape2 = VoxelShapes.or(base2_1,base2_2,base2_3,base2_4,base2_5);

        VoxelShape base3_1 = Block.box(1, 0, 4, 16, 8, 9);
        VoxelShape base3_2 = Block.box(7, 0, 13, 16, 8, 15);
        VoxelShape base3_3 = Block.box(3, 0, 9, 16, 8, 13);
        VoxelShape base3_4 = Block.box(12, 0, 15, 16, 8, 16);
        VoxelShape base3_5 = Block.box(0, 0, 0, 16, 8, 4);
        shape3 = VoxelShapes.or(base3_1,base3_2,base3_3,base3_4,base3_5);

        VoxelShape base4_1 = Block.box(0, 0, 0, 16, 8, 16);
        shape4 = VoxelShapes.or(base4_1);

        VoxelShape base8_1 = Block.box(0, 0, 0, 16, 8, 16);
        VoxelShape base8_2 = Block.box(0, 8, 0, 16, 16, 4);
        shape8 = VoxelShapes.or(base8_1,base8_2);

        VoxelShape base9_1 = Block.box(0, 0, 0, 16, 8, 16);
        VoxelShape base9_2 = Block.box(12, 8, 0, 16, 16, 16);
        shape9 = VoxelShapes.or(base9_1,base9_2);

        VoxelShape base10_1 = Block.box(0, 0, 0, 16, 8, 16);
        VoxelShape base10_2 = Block.box(0, 8, 12, 16, 16, 16);
        shape10 = VoxelShapes.or(base10_1,base10_2);

        VoxelShape base11_1 = Block.box(0, 0, 0, 16, 8, 16);
        VoxelShape base11_2 = Block.box(0, 8, 0, 4, 16, 16);
        shape11 = VoxelShapes.or(base11_1,base11_2);

        VoxelShape base12_1 = Block.box(0, 0, 8, 8, 8, 16);
        VoxelShape base12_2 = Block.box(0, 8, 0, 4, 16, 8);
        VoxelShape base12_3 = Block.box(8, 8, 12, 16, 16, 16);
        VoxelShape base12_4 = Block.box(4, 8, 8, 8, 16, 12);
        shape12 = VoxelShapes.or(base12_1,base12_2,base12_3,base12_4);

        VoxelShape base13_1 = Block.box(0, 0, 0, 8, 8, 8);
        VoxelShape base13_2 = Block.box(8, 8, 0, 16, 16, 4);
        VoxelShape base13_3 = Block.box(0, 8, 8, 4, 16, 16);
        VoxelShape base13_4 = Block.box(4, 8, 4, 8, 16, 8);
        shape13 = VoxelShapes.or(base13_1,base13_2,base13_3,base13_4);

        VoxelShape base14_1 = Block.box(8, 0, 0, 16, 8, 8);
        VoxelShape base14_2 = Block.box(12, 8, 8, 16, 16, 16);
        VoxelShape base14_3 = Block.box(0, 8, 0, 8, 16, 4);
        VoxelShape base14_4 = Block.box(8, 8, 4, 12, 16, 8);
        shape14 = VoxelShapes.or(base14_1,base14_2,base14_3,base14_4);

        VoxelShape base15_1 = Block.box(8, 0, 8, 16, 8, 16);
        VoxelShape base15_2 = Block.box(0, 8, 12, 8, 16, 16);
        VoxelShape base15_3 = Block.box(12, 8, 0, 16, 16, 8);
        VoxelShape base15_4 = Block.box(8, 8, 8, 12, 16, 12);
        shape15 = VoxelShapes.or(base15_1,base15_2,base15_3,base15_4);

        VoxelShape base16_1 = Block.box(4, 0, 8, 8, 16, 16);
        VoxelShape base16_2 = Block.box(8, 0, 4, 16, 16, 8);
        shape16 = VoxelShapes.or(base16_1,base16_2);

        VoxelShape base17_1 = Block.box(0, 0, 4, 8, 16, 8);
        VoxelShape base17_2 = Block.box(8, 0, 8, 12, 16, 16);
        shape17 = VoxelShapes.or(base17_1,base17_2);

        VoxelShape base18_1 = Block.box(8, 0, 0, 12, 16, 8);
        VoxelShape base18_2 = Block.box(0, 0, 8, 8, 16, 12);
        shape18 = VoxelShapes.or(base18_1,base18_2);

        VoxelShape base19_1 = Block.box(8, 0, 8, 16, 16, 12);
        VoxelShape base19_2 = Block.box(4, 0, 0, 8, 16, 8);
        shape19 = VoxelShapes.or(base19_1,base19_2);

        VoxelShape base20_1 = Block.box(4, 0, 0, 8, 16, 16);
        shape20 = VoxelShapes.or(base20_1);

        VoxelShape base21_1 = Block.box(0, 0, 4, 16, 16, 8);
        shape21 = VoxelShapes.or(base21_1);

        VoxelShape base22_1 = Block.box(8, 0, 0, 12, 16, 16);
        shape22 = VoxelShapes.or(base22_1);

        VoxelShape base23_1 = Block.box(0, 0, 8, 16, 16, 12);
        shape23 = VoxelShapes.or(base23_1);

        VoxelShape base24_1 = Block.box(4, 0, 12, 8, 16, 16);
        VoxelShape base24_2 = Block.box(0, 0, 8, 8, 16, 12);
        shape24 = VoxelShapes.or(base24_1,base24_2);

        VoxelShape base25_1 = Block.box(0, 0, 4, 4, 16, 8);
        VoxelShape base25_2 = Block.box(4, 0, 0, 8, 16, 8);
        shape25 = VoxelShapes.or(base25_1,base25_2);

        VoxelShape base26_1 = Block.box(8, 0, 0, 12, 16, 4);
        VoxelShape base26_2 = Block.box(8, 0, 4, 16, 16, 8);
        shape26 = VoxelShapes.or(base26_1,base26_2);

        VoxelShape base27_1 = Block.box(12, 0, 8, 16, 16, 12);
        VoxelShape base27_2 = Block.box(8, 0, 8, 12, 16, 16);
        shape27 = VoxelShapes.or(base27_1,base27_2);

        VoxelShape base28_1 = Block.box(0, 0, 0, 4, 16, 4);
        shape28 = VoxelShapes.or(base28_1);

        VoxelShape base29_1 = Block.box(12, 0, 0, 16, 16, 4);
        shape29 = VoxelShapes.or(base29_1);

        VoxelShape base30_1 = Block.box(12, 0, 12, 16, 16, 16);
        shape30 = VoxelShapes.or(base30_1);

        VoxelShape base31_1 = Block.box(0, 0, 12, 4, 16, 16);
        shape31 = VoxelShapes.or(base31_1);

        VoxelShape base32_1 = Block.box(0, 0, 0, 16, 16, 4);
        shape32 = VoxelShapes.or(base32_1);

        VoxelShape base33_1 = Block.box(12, 0, 0, 16, 16, 16);
        shape33 = VoxelShapes.or(base33_1);

        VoxelShape base34_1 = Block.box(0, 0, 12, 16, 16, 16);
        shape34 = VoxelShapes.or(base34_1);

        VoxelShape base35_1 = Block.box(0, 0, 0, 4, 16, 16);
        shape35 = VoxelShapes.or(base35_1);

        VoxelShape base36_1 = Block.box(12, 0, 4, 16, 16, 12);
        VoxelShape base36_2 = Block.box(0, 0, 4, 4, 16, 12);
        VoxelShape base36_3 = Block.box(0, 0, 12, 16, 16, 16);
        VoxelShape base36_4 = Block.box(0, 0, 0, 16, 16, 4);
        shape36 = VoxelShapes.or(base36_1,base36_2,base36_3,base36_4);
    }

    public BlastFurnaceBaseMultiBlocks() {
        super(AbstractBlock.Properties.of(Material.METAL).strength(-1.0F).sound(SoundType.METAL).noDrops().noOcclusion());
        this.registerDefaultState(this.getStateDefinition().any().setValue(BFBMultiBlocks,0));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.getValue(BFBMultiBlocks)){
            case 0:
            default:
                return shape0;
            case 1:
                return shape1;
            case 2:
                return shape2;
            case 3:
                return shape3;
            case 4:
            case 5:
            case 6:
            case 7:
                return shape4;
            case 8:
                return shape8;
            case 9:
                return shape9;
            case 10:
                return shape10;
            case 11:
                return shape11;
            case 12:
                return shape12;
            case 13:
                return shape13;
            case 14:
                return shape14;
            case 15:
                return shape15;
            case 16:
                return shape16;
            case 17:
                return shape17;
            case 18:
                return shape18;
            case 19:
                return shape19;
            case 20:
                return shape20;
            case 21:
                return shape21;
            case 22:
                return shape22;
            case 23:
                return shape23;
            case 24:
                return shape24;
            case 25:
                return shape25;
            case 26:
                return shape26;
            case 27:
                return shape27;
            case 28:
                return shape28;
            case 29:
                return shape29;
            case 30:
                return shape30;
            case 31:
                return shape31;
            case 32:
                return shape32;
            case 33:
                return shape33;
            case 34:
                return shape34;
            case 35:
                return shape35;
            case 36:
                return shape36;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BFBMultiBlocks);
        super.createBlockStateDefinition(builder);
    }
}
