package net.icido.pokediscs.util;

import net.icido.pokediscs.PokediscsMod;
import net.icido.pokediscs.item.PokediscItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PokediscTags {
    public static class Blocks {
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PokediscsMod.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> POKEDISC_BASE_DISCS = tag("pokedisc_base_discs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(PokediscsMod.MODID, name));
        }
    }
}
