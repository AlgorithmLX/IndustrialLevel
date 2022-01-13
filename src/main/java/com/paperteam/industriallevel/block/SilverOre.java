package com.paperteam.industriallevel.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class SilverOre extends Block {
    public SilverOre() {
        super(Properties.of(Material.STONE)
                .strength(2f)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}