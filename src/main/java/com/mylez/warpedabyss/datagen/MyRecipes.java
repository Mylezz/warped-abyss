package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.io.IOException;
import java.util.function.Consumer;

public class MyRecipes extends RecipeProvider {

    public MyRecipes(DataGenerator generatorIn) { super(generatorIn);}

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.NEODYMIUM_ORE_ITEM),
                        Registration.NEODYMIUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.NEODYMIUM_ORE_ITEM))
                .save(consumer, "neodymium_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_NEODYMIUM_CHUNK.get()),
                        Registration.NEODYMIUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_NEODYMIUM_CHUNK.get()))
                .save(consumer, "neodymium_ingot2");
    }
}