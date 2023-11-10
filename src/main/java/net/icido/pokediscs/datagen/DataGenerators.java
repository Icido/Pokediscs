package net.icido.pokediscs.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.icido.pokediscs.PokediscsMod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = PokediscsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput pOutput = gen.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        gen.addProvider(event.includeServer(), new PokediscRecipeProvider(pOutput));

        gen.addProvider(event.includeClient(), new PokediscItemModelProvider(pOutput, existingFileHelper));

        PokediscBlockTagGenerator blockTagGenerator = gen.addProvider(event.includeServer(),
                new PokediscBlockTagGenerator(pOutput, lookupProvider, existingFileHelper));
        gen.addProvider(event.includeServer(), new PokediscItemTagGenerator(pOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
