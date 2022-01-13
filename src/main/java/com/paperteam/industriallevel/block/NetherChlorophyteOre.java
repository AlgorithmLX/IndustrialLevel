package com.paperteam.industriallevel.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class NetherChlorophyteOre extends Block {
    public NetherChlorophyteOre() {
        super(Properties.of(Material.STONE)
                .strength(0.4f, 2f)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}
