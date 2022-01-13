package com.paperteam.industriallevel.setup;

import com.paperteam.industriallevel.client.CoalPowerGeneratorScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(Registration.COAL_POWER_GENERATOR_CONTAINER.get(), CoalPowerGeneratorScreen::new);
            ItemBlockRenderTypes.setRenderLayer(Registration.COAL_POWER_GENERATOR.get(), RenderType.translucent());
        });
    }
}
