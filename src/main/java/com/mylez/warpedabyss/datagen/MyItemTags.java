package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.WarpedAbyss;
import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MyItemTags extends ItemTagsProvider {

    public MyItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, WarpedAbyss.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.NEODYMIUM_ORE_OVERWORLD_ITEM.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE_ITEM.get())
                .add(Registration.LAWRENCIUM_ORE_OVERWORLD_ITEM.get())
                .add(Registration.LAWRENCIUM_ORE_DEEPSLATE_ITEM.get())
                .add(Registration.PALLADIUM_ORE_OVERWORLD_ITEM.get())
                .add(Registration.PALLADIUM_ORE_DEEPSLATE_ITEM.get());

        tag(Registration.NEODYMIUM_ORE_ITEM)
                .add(Registration.NEODYMIUM_ORE_OVERWORLD_ITEM.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE_ITEM.get());

        tag(Registration.LAWRENCIUM_ORE_ITEM)
                .add(Registration.LAWRENCIUM_ORE_OVERWORLD_ITEM.get())
                .add(Registration.LAWRENCIUM_ORE_DEEPSLATE_ITEM.get());
        tag(Registration.PALLADIUM_ORE_ITEM)
                .add(Registration.PALLADIUM_ORE_OVERWORLD_ITEM.get())
                .add(Registration.PALLADIUM_ORE_DEEPSLATE_ITEM.get());

        tag(Tags.Items.INGOTS)
                .add(Registration.NEODYMIUM_INGOT.get())
                .add(Registration.LAWRENCIUM_INGOT.get())
                .add(Registration.PALLADIUM_INGOT.get());

        tag(Tags.Items.STORAGE_BLOCKS)
                .add(Item.byBlock(Registration.NEODYMIUM_BLOCK_STORAGE.get()))
                .add(Item.byBlock(Registration.LAWRENCIUM_BLOCK_STORAGE.get()))
                .add(Item.byBlock(Registration.PALLADIUM_BLOCK_STORAGE.get()));

    }

    @Override
    public String getName() {
        return "Warped Abyss Tags";
    }
}