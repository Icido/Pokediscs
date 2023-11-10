package net.icido.pokediscs;

import com.mojang.logging.LogUtils;
import net.icido.pokediscs.item.PokediscCreativeModeTabs;
import net.icido.pokediscs.item.PokediscItems;
import net.icido.pokediscs.sound.PokediscSounds;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

//Signal to forge to load this on client start (I think)
@Mod(PokediscsMod.MODID)
public class PokediscsMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "pokediscs";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PokediscsMod()
    {
        //Use this to initalise all your mod stuff in the client
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        PokediscCreativeModeTabs.register(bus);

        PokediscSounds.register(bus);
        PokediscItems.ITEMS.register(bus);

        bus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    //Use this to add items to Minecraft's default tabs
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
