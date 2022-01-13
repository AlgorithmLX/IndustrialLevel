package com.paperteam.industriallevel.item;

import com.paperteam.industriallevel.api.enums.ILItemTier;
import com.paperteam.industriallevel.setup.ModSetup;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TitaniumElectroHammer extends PickaxeItem {
    public static boolean skip = false;

    public TitaniumElectroHammer() {
        super(ILItemTier.TitaniumTear, 1, 3F, new Properties().tab(ModSetup.CLASSIC_TAB));
    }

    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        BlockPos blockPos = context.getClickedPos();
        ItemStack stack = context.getItemInHand();
        if (player == null) return InteractionResult.FAIL;
        Level level = Objects.requireNonNull(context.getPlayer()).level;
        if (!level.isClientSide() && !player.isShiftKeyDown() && !player.getCooldowns().isOnCooldown(stack.getItem()) && player instanceof ServerPlayer serverPlayer) {

            if (!skip) {
                List<BlockPos> blocks = new ArrayList<>();

                for (int x = 0; x < 1; x++) {
                    for (int y = 0; y < 3; y++) {
                        for (int z = 0; z < 3; z++) {
                            int posX = blockPos.getX();
                            int posY = blockPos.getY();
                            int posZ = blockPos.getZ();

                            switch (player.getDirection()) {
                                case SOUTH -> blocks.add(new BlockPos(posX + 4 - x, posY - 1 + y, posZ + z));
                                case NORTH -> blocks.add(new BlockPos(posX - 4 + x, posY - 1 + y, posZ - z));
                                case EAST -> blocks.add(new BlockPos(posX + x, posY - 1 + y, posZ + 2 - z));
                                case WEST -> blocks.add(new BlockPos(posX - x, posY - 1 + y, posZ - 2 + z));
                            }
                        }
                    }
                }
                skip = true;
                for (BlockPos position : blocks) {
                    BlockState state = level.getBlockState(position);
                    if (!state.isAir()) {
                        serverPlayer.gameMode.destroyBlock(position);

                    }
                }
                skip = false;
            }
            player.getCooldowns().addCooldown(this, 0);
        }
        return super.useOn(context);
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
        super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);
    }
    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}