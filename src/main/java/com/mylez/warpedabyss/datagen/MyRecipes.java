package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.io.IOException;
import java.util.function.Consumer;

public class MyRecipes extends RecipeProvider {

    public MyRecipes(DataGenerator generatorIn) { super(generatorIn);}

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        //smelting
        //NEODYMIUM
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.NEODYMIUM_ORE_ITEM),
                        Registration.NEODYMIUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.NEODYMIUM_ORE_ITEM))
                .save(consumer, "neodymium_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_NEODYMIUM_CHUNK.get()),
                        Registration.NEODYMIUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_NEODYMIUM_CHUNK.get()))
                .save(consumer, "neodymium_ingot2");
        //LAWRENCIUM
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.LAWRENCIUM_ORE_ITEM),
                        Registration.LAWRENCIUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.LAWRENCIUM_ORE_ITEM))
                .save(consumer, "lawrencium_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_LAWRENCIUM_CHUNK.get()),
                        Registration.LAWRENCIUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_LAWRENCIUM_CHUNK.get()))
                .save(consumer, "lawrencium_ingot2");

        //crafting
        //coils
        ShapedRecipeBuilder.shaped(Registration.NEODYMIUM_COIL.get())
                .pattern("  #")
                .pattern(" m ")
                .pattern("#  ")
                .define('#', Tags.Items.DUSTS_REDSTONE)
                .define('m', Registration.NEODYMIUM_INGOT.get())
                .group("warpedabyss")
                .unlockedBy("neodymium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NEODYMIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.LAWRENCIUM_COIL.get())
                .pattern("  #")
                .pattern(" m ")
                .pattern("#  ")
                .define('#', Tags.Items.DUSTS_REDSTONE)
                .define('m', Registration.LAWRENCIUM_INGOT.get())
                .group("warpedabyss")
                .unlockedBy("lawrencium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LAWRENCIUM_INGOT.get()))
                .save(consumer);
        //machines

    }
}