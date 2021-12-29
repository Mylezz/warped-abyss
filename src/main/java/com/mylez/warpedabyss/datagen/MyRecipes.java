package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.WarpedAbyss;
import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;
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
        //palladium
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PALLADIUM_ORE_ITEM),
                        Registration.PALLADIUM_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.PALLADIUM_ORE_ITEM))
                .save(consumer, "palladium_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_PALLADIUM_CHUNK.get()),
                        Registration.PALLADIUM_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_PALLADIUM_CHUNK.get()))
                .save(consumer, "palladium_ingot2");

        //nuggets into ingot (SHAPELESS EXAMPLE TOO!!!)
        ShapelessRecipeBuilder.shapeless(Registration.NEODYMIUM_NUGGET.get(), 9)
                        .requires(Registration.NEODYMIUM_INGOT.get())
                        .unlockedBy("neodymium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NEODYMIUM_INGOT.get()))
                        .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LAWRENCIUM_NUGGET.get(), 9)
                .requires(Registration.LAWRENCIUM_INGOT.get())
                .unlockedBy("lawrencium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LAWRENCIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PALLADIUM_NUGGET.get(), 9)
                .requires(Registration.PALLADIUM_INGOT.get())
                .unlockedBy("palladium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PALLADIUM_INGOT.get()))
                .save(consumer);

        // ingot into nuggets
        ShapelessRecipeBuilder.shapeless(Registration.NEODYMIUM_INGOT.get())
                .requires(Registration.NEODYMIUM_NUGGET.get(), 9)
                .unlockedBy("neodymium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NEODYMIUM_NUGGET.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LAWRENCIUM_INGOT.get())
                .requires(Registration.LAWRENCIUM_NUGGET.get(), 9)
                .unlockedBy("lawrencium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LAWRENCIUM_NUGGET.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PALLADIUM_INGOT.get())
                .requires(Registration.PALLADIUM_NUGGET.get(), 9)
                .unlockedBy("palladium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PALLADIUM_NUGGET.get()))
                .save(consumer);

        //blocks into ingots
        ShapelessRecipeBuilder.shapeless(Registration.NEODYMIUM_INGOT.get())
                .requires(Registration.NEODYMIUM_BLOCK_STORAGE.get(), 9)
                .unlockedBy("neodymium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NEODYMIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LAWRENCIUM_INGOT.get())
                .requires(Registration.LAWRENCIUM_BLOCK_STORAGE.get(), 9)
                .unlockedBy("lawrencium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LAWRENCIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PALLADIUM_INGOT.get())
                .requires(Registration.PALLADIUM_BLOCK_STORAGE.get(), 9)
                .unlockedBy("palladium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PALLADIUM_INGOT.get()))
                .save(consumer);

        //ingots into blocks
        ShapelessRecipeBuilder.shapeless(Registration.NEODYMIUM_BLOCK_STORAGE.get(), 1)
                .requires(Registration.NEODYMIUM_INGOT.get(), 9)
                .unlockedBy("neodymium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.NEODYMIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.LAWRENCIUM_BLOCK_STORAGE.get(), 1)
                .requires(Registration.LAWRENCIUM_INGOT.get(), 9)
                .unlockedBy("lawrencium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LAWRENCIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(Registration.PALLADIUM_BLOCK_STORAGE.get(), 1)
                .requires(Registration.PALLADIUM_INGOT.get(), 9)
                .unlockedBy("palladium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PALLADIUM_INGOT.get()))
                .save(consumer);

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
        ShapedRecipeBuilder.shaped(Registration.PALLADIUM_COIL.get())
                .pattern("  #")
                .pattern(" m ")
                .pattern("#  ")
                .define('#', Tags.Items.DUSTS_REDSTONE)
                .define('m', Registration.PALLADIUM_INGOT.get())
                .group("warpedabyss")
                .unlockedBy("palladium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PALLADIUM_INGOT.get()))
                .save(consumer);
        //lattices
/*        ShapedRecipeBuilder.shaped(Registration.NETHER_STAR_LATTICE.get())
                .pattern("  #")
                .pattern(" m ")
                .pattern("#  ")
                .define('#', Tags.Items.DUSTS_REDSTONE)
                .define('m', Registration.LAWRENCIUM_INGOT.get())
                .group("warpedabyss")
                .unlockedBy("lawrencium", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.LAWRENCIUM_INGOT.get()))
                .save(consumer);*/

    }
}