package com.paperteam.industriallevel.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class EndLeadOre extends Block {
    public EndLeadOre() {
        super(Properties.of(Material.STONE)
                .strength(3f, 9f)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}
