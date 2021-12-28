package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.WarpedAbyss;
import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MyBlockTags extends BlockTagsProvider {

    public MyBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, WarpedAbyss.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.NEODYMIUM_ORE_OVERWORLD.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.NEODYMIUM_ORE_OVERWORLD.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.NEODYMIUM_ORE_OVERWORLD.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE.get());
        tag(Registration.NEODYMIUM_ORE)
                .add(Registration.NEODYMIUM_ORE_OVERWORLD.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE.get());

    }

    @Override
    public String getName() {
        return "Warped Abyss Tags";
    }
}