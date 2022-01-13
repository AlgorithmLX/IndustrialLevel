package com.paperteam.industriallevel.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class TinBlock extends Block {
    public TinBlock() {
        super(Properties.of(Material.METAL)
                .strength(13f)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        );
    }
}
