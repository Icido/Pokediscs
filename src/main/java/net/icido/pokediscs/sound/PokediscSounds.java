package net.icido.pokediscs.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.icido.pokediscs.PokediscsMod;

public class PokediscSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PokediscsMod.MODID);

    public static final RegistryObject<SoundEvent> PKM_THEME_SONG_MUSIC = registerSoundEvents("pkm_theme_song_music");
    public static final RegistryObject<SoundEvent> RBY_GYM_LEADER_MUSIC = registerSoundEvents("rby_gym_leader_music");
    public static final RegistryObject<SoundEvent> FRLG_GYM_LEADER_MUSIC = registerSoundEvents("frlg_gym_leader_music");
    public static final RegistryObject<SoundEvent> GSC_JOHTO_GYM_LEADER_MUSIC = registerSoundEvents("gsc_johto_gym_leader_music");
    public static final RegistryObject<SoundEvent> GSC_KANTO_GYM_LEADER_MUSIC = registerSoundEvents("gsc_kanto_gym_leader_music");
    public static final RegistryObject<SoundEvent> HGSS_JOHTO_GYM_LEADER_MUSIC = registerSoundEvents("hgss_johto_gym_leader_music");
    public static final RegistryObject<SoundEvent> HGSS_KANTO_GYM_LEADER_MUSIC = registerSoundEvents("hgss_kanto_gym_leader_music");
    public static final RegistryObject<SoundEvent> RSE_GYM_LEADER_MUSIC = registerSoundEvents("rse_gym_leader_music");
    public static final RegistryObject<SoundEvent> ORAS_GYM_LEADER_MUSIC = registerSoundEvents("oras_gym_leader_music");
    public static final RegistryObject<SoundEvent> DPP_GYM_LEADER_MUSIC = registerSoundEvents("dpp_gym_leader_music");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(PokediscsMod.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
