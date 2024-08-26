package net.soulsandstormer.block.custom;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import net.soulsandstormer.block.entity.ModBlockEntities;
import net.soulsandstormer.block.entity.SpaceMinerEntity;

public class SpaceMiner extends BaseEntityBlock {
    public static final VoxelShape SHAPE_BODY1 = Block.box(-8, 2, -8, 24, 11, 24); //come back to this for bounds
    public static final VoxelShape SHAPE_BODY2 = Block.box(-6, 11, -6, 22, 13, 22);
    public static final VoxelShape SHAPE_BODY3 = Block.box(-8, 13, -8, 24, 18, 24);
    public static final VoxelShape SHAPE_LEG_A1 = Block.box(-11, 13, -7, -8, 17, 0);
    public static final VoxelShape SHAPE_LEG_A2 = Block.box(-11, 13, 15, -8, 17, 22);
    public static final VoxelShape SHAPE_LEG_A3 = Block.box(24, 13, -7, 27, 17, 0);
    public static final VoxelShape SHAPE_LEG_A4 = Block.box(24, 13, 15, 27, 17, 22);
    public static final VoxelShape SHAPE_LEG1 = Block.box(-13, 1, -6, -11, 18, -1);
    public static final VoxelShape SHAPE_LEG2 = Block.box(-13, 1, 16, -11, 18, 21);
    public static final VoxelShape SHAPE_LEG3 = Block.box(27, 1, -6, 29, 18, -1);
    public static final VoxelShape SHAPE_LEG4 = Block.box(27, 1, 16, 29, 18, 21);
    public static final VoxelShape SHAPE_LEG_F1 = Block.box(-14, 0, -7, -10, 1, 0);
    public static final VoxelShape SHAPE_LEG_F2 = Block.box(-14, 0, 15, -10, 1, 22);
    public static final VoxelShape SHAPE_LEG_F3 = Block.box(26, 0, -7, 30, 1, 0);
    public static final VoxelShape SHAPE_LEG_F4 = Block.box(26, 0, 15, 30, 1, 22);
    public static final VoxelShape SHAPE_ANTENNA1 = Block.box(0, 18, 15, 3, 23, 18);
    public static final VoxelShape SHAPE_ANTENNA2 = Block.box(8, 18, 13, 10, 22, 15);
    public static final VoxelShape SHAPE_PIPE = Block.box(6, 6, 24, 10, 10, 31);
    public static final VoxelShape SHAPE_PORT = Block.box(5, 5, 31, 11, 11, 32);

    public SpaceMiner(Properties pProperties) {
        super(pProperties);
        //TODO Auto-generated constructor stub
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Shapes.or(SHAPE_BODY1, SHAPE_BODY2, SHAPE_BODY3,
            SHAPE_LEG_A1, SHAPE_LEG_A2, SHAPE_LEG_A3, SHAPE_LEG_A4, SHAPE_LEG1, SHAPE_LEG2, SHAPE_LEG3, SHAPE_LEG4, SHAPE_LEG_F1, SHAPE_LEG_F2, SHAPE_LEG_F3, SHAPE_LEG_F4,
            SHAPE_ANTENNA1, SHAPE_ANTENNA2, SHAPE_PIPE, SHAPE_PORT);
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof SpaceMinerEntity) {
                ((SpaceMinerEntity) blockEntity).drops();
            }
        }

        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if (entity instanceof SpaceMinerEntity) {
                NetworkHooks.openScreen(((ServerPlayer)pPlayer), (SpaceMinerEntity)entity, pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new SpaceMinerEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        if (pLevel.isClientSide()) {
            return null;
        }

        return createTickerHelper(pBlockEntityType, ModBlockEntities.SPACE_MINER_BE.get(),
            (pLevel1, pPos, pState1, pBlockEntity) -> pBlockEntity.tick(pLevel1, pPos, pState1));
    }
}
