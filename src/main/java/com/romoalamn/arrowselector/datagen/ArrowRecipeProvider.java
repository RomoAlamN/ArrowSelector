package com.romoalamn.arrowselector.datagen;

import com.romoalamn.arrowselector.item.BowWithQuiver;
import com.romoalamn.arrowselector.registry.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;

import java.util.function.Consumer;

public class ArrowRecipeProvider extends RecipeProvider {
    public ArrowRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    /**
     * Registers all recipes to the given consumer.
     *
     * @param consumer
     */
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.BOW_WITH_QUIVER.get())
                .setGroup("bow_with_quiver")
                .addCriterion("has_bow", hasItem(Items.BOW))
                .addIngredient(Items.BOW)
                .addIngredient(Items.LEATHER, 2)
                .build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.BOW_WITH_QUIVER.get())
                .setGroup("bow_with_quiver")
                .addCriterion("has_bow", hasItem(Items.BOW))
                .addIngredient(Items.BOW)
                .addIngredient(Items.STRING, 4)
                .build(consumer);
    }
}
