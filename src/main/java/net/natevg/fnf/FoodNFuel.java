package net.natevg.fnf;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.natevg.fnf.item.FnFCreativeModeTabs;
import net.natevg.fnf.item.ItemRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FoodNFuel.MOD_ID)
public class FoodNFuel
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "fnf";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public FoodNFuel()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the Deferred Register to the mod event bus so items get registered
        ItemRegistries.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        FnFCreativeModeTabs.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);


    }


}
