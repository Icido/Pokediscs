package net.icido.pokediscs.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import net.icido.pokediscs.util.PokediscTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.icido.pokediscs.item.PokediscItems;

import java.util.function.Consumer;

public class PokediscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public PokediscRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //region Utility Items

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.BLANK_DISC.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("CCC")
                .define('B', Items.BLACK_DYE)
                .define('C', Items.CLAY_BALL)
                .unlockedBy(getHasName(Items.CLAY_BALL), has(Items.CLAY_BALL))
                .save(pWriter, "pokediscs:blank_disc_clay");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PokediscItems.BLANK_DISC.get())
                .requires(PokediscTags.Items.POKEDISC_BASE_DISCS)
                .requires(Items.WHITE_WOOL)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter, "pokediscs:blank_disc_scrub_base_discs");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PokediscItems.BLANK_DISC.get())
                .requires(ItemTags.MUSIC_DISCS)
                .requires(Items.WHITE_WOOL)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter, "pokediscs:blank_disc_scrub_music_discs");

        //endregion

        //region Base discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.RBY_BASE_DISC.get())
                .pattern("RRY")
                .pattern("R#B")
                .pattern("YBB")
                .define('#', PokediscItems.BLANK_DISC.get())
                .define('R', CobblemonItems.RED_APRICORN)
                .define('B', CobblemonItems.BLUE_APRICORN)
                .define('Y', CobblemonItems.YELLOW_APRICORN)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.FRLG_BASE_DISC.get())
                .pattern("RRR")
                .pattern("R#G")
                .pattern("GGG")
                .define('#', PokediscItems.BLANK_DISC.get())
                .define('R', CobblemonItems.RED_APRICORN)
                .define('G', CobblemonItems.GREEN_APRICORN)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.GSC_BASE_DISC.get())
                .pattern("WWB")
                .pattern("W#Y")
                .pattern("BYY")
                .define('#', PokediscItems.BLANK_DISC.get())
                .define('W', CobblemonItems.WHITE_APRICORN)
                .define('B', CobblemonItems.BLUE_APRICORN)
                .define('Y', CobblemonItems.YELLOW_APRICORN)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.HGSS_BASE_DISC.get())
                .pattern("WWW")
                .pattern("W#Y")
                .pattern("YYY")
                .define('#', PokediscItems.BLANK_DISC.get())
                .define('W', CobblemonItems.WHITE_APRICORN)
                .define('Y', CobblemonItems.YELLOW_APRICORN)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.RSE_BASE_DISC.get())
                .pattern("BBG")
                .pattern("B#R")
                .pattern("GRR")
                .define('#', PokediscItems.BLANK_DISC.get())
                .define('B', CobblemonItems.BLUE_APRICORN)
                .define('R', CobblemonItems.RED_APRICORN)
                .define('G', CobblemonItems.GREEN_APRICORN)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.ORAS_BASE_DISC.get())
                .pattern("BBB")
                .pattern("B#R")
                .pattern("RRR")
                .define('#', PokediscItems.BLANK_DISC.get())
                .define('B', CobblemonItems.BLUE_APRICORN)
                .define('R', CobblemonItems.RED_APRICORN)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.DPP_BASE_DISC.get())
                .pattern("PPW")
                .pattern("P#B")
                .pattern("WBB")
                .define('#', PokediscItems.BLANK_DISC.get())
                .define('B', CobblemonItems.BLUE_APRICORN)
                .define('P', CobblemonItems.PINK_APRICORN)
                .define('W', CobblemonItems.WHITE_APRICORN)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter);

        //endregion

        //region Alternative Discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.PKM_THEME_SONG.get())
                .pattern("RRR")
                .pattern("G#G")
                .pattern("WWW")
                .define('#', PokediscItems.BLANK_DISC.get())
                .define('R', CobblemonItems.RED_APRICORN)
                .define('G', Items.GRAY_DYE)
                .define('W', CobblemonItems.WHITE_APRICORN)
                .unlockedBy(getHasName(PokediscItems.BLANK_DISC.get()), has(PokediscItems.BLANK_DISC.get()))
                .save(pWriter);

        //endregion

        //region RBY Discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.RBY_GYM_LEADER.get())
                .pattern("  B")
                .pattern(" # ")
                .pattern("   ")
                .define('#', PokediscItems.RBY_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.RBY_BASE_DISC.get()), has(PokediscItems.RBY_BASE_DISC.get()))
                .save(pWriter);

        //endregion

        //region FRLG Discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.FRLG_GYM_LEADER.get())
                .pattern("  B")
                .pattern(" # ")
                .pattern("   ")
                .define('#', PokediscItems.FRLG_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.FRLG_BASE_DISC.get()), has(PokediscItems.FRLG_BASE_DISC.get()))
                .save(pWriter);

        //endregion

        //region GSC Discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.GSC_KANTO_GYM_LEADER.get())
                .pattern("  B")
                .pattern(" # ")
                .pattern("   ")
                .define('#', PokediscItems.GSC_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.GSC_BASE_DISC.get()), has(PokediscItems.GSC_BASE_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.GSC_JOHTO_GYM_LEADER.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('#', PokediscItems.GSC_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.GSC_BASE_DISC.get()), has(PokediscItems.GSC_BASE_DISC.get()))
                .save(pWriter);

        //endregion

        //region HGSS Discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.HGSS_KANTO_GYM_LEADER.get())
                .pattern("  B")
                .pattern(" # ")
                .pattern("   ")
                .define('#', PokediscItems.HGSS_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.HGSS_BASE_DISC.get()), has(PokediscItems.HGSS_BASE_DISC.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.HGSS_JOHTO_GYM_LEADER.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('#', PokediscItems.HGSS_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.HGSS_BASE_DISC.get()), has(PokediscItems.HGSS_BASE_DISC.get()))
                .save(pWriter);

        //endregion

        //region RSE Discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.RSE_GYM_LEADER.get())
                .pattern("  B")
                .pattern(" # ")
                .pattern("   ")
                .define('#', PokediscItems.RSE_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.RSE_BASE_DISC.get()), has(PokediscItems.RSE_BASE_DISC.get()))
                .save(pWriter);

        //endregion

        //region ORAS Discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.ORAS_GYM_LEADER.get())
                .pattern("  B")
                .pattern(" # ")
                .pattern("   ")
                .define('#', PokediscItems.ORAS_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.ORAS_BASE_DISC.get()), has(PokediscItems.ORAS_BASE_DISC.get()))
                .save(pWriter);

        //endregion

        //region DPP Discs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PokediscItems.DPP_GYM_LEADER.get())
                .pattern("  B")
                .pattern(" # ")
                .pattern("   ")
                .define('#', PokediscItems.DPP_BASE_DISC.get())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(PokediscItems.DPP_BASE_DISC.get()), has(PokediscItems.DPP_BASE_DISC.get()))
                .save(pWriter);

        //endregion
    }
}
