package net.soulsandstormer.block.custom;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SpaceMiner extends BaseEntityBlock{
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 32, 32, 30); //come back to this for bounds

    protected SpaceMiner(Properties pProperties) {
        super(pProperties);
        //TODO Auto-generated constructor stub
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newBlockEntity'");
    }
    
}
