package net.icido.pokediscs.item;

import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.icido.pokediscs.PokediscsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.icido.pokediscs.sound.PokediscSounds;

public class PokediscItems
{
    //This creates a registry that you can bus in using your main mod class
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PokediscsMod.MODID);

    //This creates an item with the id 'exampleitem' that functions as a default item - items that you just hold and have no interactions like ingots/sticks etc.
    //public static final RegistryObject<Item> RSE_GYM_LEADER = ITEMS.register("rse_gym_leader",
            //() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PKM_THEME_SONG = ITEMS.register("pkm_theme_song",
            () -> new RecordItem(7, PokediscSounds.PKM_THEME_SONG_MUSIC, new Item.Properties().stacksTo(1), 1220));
    public static final RegistryObject<Item> BLANK_DISC = ITEMS.register("blank_disc",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> RBY_BASE_DISC = ITEMS.register("rby_base_disc",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> FRLG_BASE_DISC = ITEMS.register("frlg_base_disc",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> GSC_BASE_DISC = ITEMS.register("gsc_base_disc",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> HGSS_BASE_DISC = ITEMS.register("hgss_base_disc",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> RSE_BASE_DISC = ITEMS.register("rse_base_disc",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> ORAS_BASE_DISC = ITEMS.register("oras_base_disc",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DPP_BASE_DISC = ITEMS.register("dpp_base_disc",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> RBY_GYM_LEADER = ITEMS.register("rby_gym_leader",
            () -> new RecordItem(7, PokediscSounds.RBY_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 3580));
    public static final RegistryObject<Item> FRLG_GYM_LEADER = ITEMS.register("frlg_gym_leader",
            () -> new RecordItem(7, PokediscSounds.FRLG_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 3580));
    public static final RegistryObject<Item> GSC_JOHTO_GYM_LEADER = ITEMS.register("gsc_johto_gym_leader",
            () -> new RecordItem(7, PokediscSounds.GSC_JOHTO_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 3580));
    public static final RegistryObject<Item> GSC_KANTO_GYM_LEADER = ITEMS.register("gsc_kanto_gym_leader",
            () -> new RecordItem(7, PokediscSounds.GSC_KANTO_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 3580));
    public static final RegistryObject<Item> HGSS_JOHTO_GYM_LEADER = ITEMS.register("hgss_johto_gym_leader",
            () -> new RecordItem(7, PokediscSounds.HGSS_JOHTO_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 3580));
    public static final RegistryObject<Item> HGSS_KANTO_GYM_LEADER = ITEMS.register("hgss_kanto_gym_leader",
            () -> new RecordItem(7, PokediscSounds.HGSS_KANTO_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 3560));
    public static final RegistryObject<Item> RSE_GYM_LEADER = ITEMS.register("rse_gym_leader",
            () -> new RecordItem(7, PokediscSounds.RSE_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 3580));
    public static final RegistryObject<Item> ORAS_GYM_LEADER = ITEMS.register("oras_gym_leader",
            () -> new RecordItem(7, PokediscSounds.ORAS_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 6000));
    public static final RegistryObject<Item> DPP_GYM_LEADER = ITEMS.register("dpp_gym_leader",
            () -> new RecordItem(7, PokediscSounds.DPP_GYM_LEADER_MUSIC, new Item.Properties().stacksTo(1), 3560));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
