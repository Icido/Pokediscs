package net.icido.pokediscs.datagen;

import net.icido.pokediscs.util.PokediscTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.icido.pokediscs.PokediscsMod;
import net.icido.pokediscs.item.PokediscItems;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class PokediscItemTagGenerator extends ItemTagsProvider {
    public PokediscItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                                    CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, PokediscsMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.MUSIC_DISCS)
                .add(PokediscItems.PKM_THEME_SONG.get(),
                        PokediscItems.RBY_GYM_LEADER.get(),
                        PokediscItems.FRLG_GYM_LEADER.get(),
                        PokediscItems.GSC_JOHTO_GYM_LEADER.get(),
                        PokediscItems.GSC_KANTO_GYM_LEADER.get(),
                        PokediscItems.HGSS_JOHTO_GYM_LEADER.get(),
                        PokediscItems.HGSS_KANTO_GYM_LEADER.get(),
                        PokediscItems.RSE_GYM_LEADER.get(),
                        PokediscItems.ORAS_GYM_LEADER.get(),
                        PokediscItems.DPP_GYM_LEADER.get());

        this.tag(PokediscTags.Items.POKEDISC_BASE_DISCS)
                .add(PokediscItems.RBY_BASE_DISC.get(),
                        PokediscItems.FRLG_BASE_DISC.get(),
                        PokediscItems.GSC_BASE_DISC.get(),
                        PokediscItems.HGSS_BASE_DISC.get(),
                        PokediscItems.RSE_BASE_DISC.get(),
                        PokediscItems.ORAS_BASE_DISC.get(),
                        PokediscItems.DPP_BASE_DISC.get());
    }
}
