package com.paperteam.industriallevel;

import com.paperteam.industriallevel.setup.ClientSetup;
import com.paperteam.industriallevel.setup.Registration;
import com.paperteam.industriallevel.setup.ModSetup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(IndustrialLevel.ModId)
public class IndustrialLevel {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String ModId = "industriallevel";

    public IndustrialLevel() {

        Registration.init();

        MinecraftForge.EVENT_BUS.register(this);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
    }

}
