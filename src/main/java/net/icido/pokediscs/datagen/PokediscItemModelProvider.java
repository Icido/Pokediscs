package net.icido.pokediscs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.icido.pokediscs.PokediscsMod;
import net.icido.pokediscs.item.PokediscItems;

public class PokediscItemModelProvider extends ItemModelProvider {
    public PokediscItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PokediscsMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(PokediscItems.PKM_THEME_SONG);

        simpleItem(PokediscItems.BLANK_DISC);

        simpleItem(PokediscItems.RBY_BASE_DISC);
        simpleItem(PokediscItems.FRLG_BASE_DISC);
        simpleItem(PokediscItems.GSC_BASE_DISC);
        simpleItem(PokediscItems.HGSS_BASE_DISC);
        simpleItem(PokediscItems.RSE_BASE_DISC);
        simpleItem(PokediscItems.ORAS_BASE_DISC);
        simpleItem(PokediscItems.DPP_BASE_DISC);

        simpleItem(PokediscItems.RBY_GYM_LEADER);
        simpleItem(PokediscItems.FRLG_GYM_LEADER);
        simpleItem(PokediscItems.GSC_JOHTO_GYM_LEADER);
        simpleItem(PokediscItems.GSC_KANTO_GYM_LEADER);
        simpleItem(PokediscItems.HGSS_JOHTO_GYM_LEADER);
        simpleItem(PokediscItems.HGSS_KANTO_GYM_LEADER);
        simpleItem(PokediscItems.RSE_GYM_LEADER);
        simpleItem(PokediscItems.ORAS_GYM_LEADER);
        simpleItem(PokediscItems.DPP_GYM_LEADER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PokediscsMod.MODID,"item/" + item.getId().getPath()));
    }
}
