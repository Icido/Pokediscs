package net.icido.pokediscs.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.icido.pokediscs.PokediscsMod;

public class PokediscCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PokediscsMod.MODID);

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> POKEDISCS_TAB = CREATIVE_MODE_TABS.register("pokediscstab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PokediscItems.PKM_THEME_SONG.get()))
                    .title(Component.translatable("creativetab.pokediscs_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(PokediscItems.PKM_THEME_SONG.get());
                        pOutput.accept(PokediscItems.BLANK_DISC.get());
                        pOutput.accept(PokediscItems.RBY_BASE_DISC.get());
                        pOutput.accept(PokediscItems.RBY_GYM_LEADER.get());
                        pOutput.accept(PokediscItems.FRLG_BASE_DISC.get());
                        pOutput.accept(PokediscItems.FRLG_GYM_LEADER.get());
                        pOutput.accept(PokediscItems.GSC_BASE_DISC.get());
                        pOutput.accept(PokediscItems.GSC_JOHTO_GYM_LEADER.get());
                        pOutput.accept(PokediscItems.GSC_KANTO_GYM_LEADER.get());
                        pOutput.accept(PokediscItems.HGSS_BASE_DISC.get());
                        pOutput.accept(PokediscItems.HGSS_JOHTO_GYM_LEADER.get());
                        pOutput.accept(PokediscItems.HGSS_KANTO_GYM_LEADER.get());
                        pOutput.accept(PokediscItems.RSE_BASE_DISC.get());
                        pOutput.accept(PokediscItems.RSE_GYM_LEADER.get());
                        pOutput.accept(PokediscItems.ORAS_BASE_DISC.get());
                        pOutput.accept(PokediscItems.ORAS_GYM_LEADER.get());
                        pOutput.accept(PokediscItems.DPP_BASE_DISC.get());
                        pOutput.accept(PokediscItems.DPP_GYM_LEADER.get());
                        })
                    .build());
};
