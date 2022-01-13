package com.paperteam.industriallevel.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class DeepslateUraniumOre extends Block {
    public DeepslateUraniumOre() {
        super(Properties.of(Material.STONE)
                .strength(3f)
                .sound(SoundType.DEEPSLATE)
                .requiresCorrectToolForDrops()
        );
    }
}
