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
                //ores
                .add(Registration.NEODYMIUM_ORE_OVERWORLD.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE.get())
                .add(Registration.LAWRENCIUM_ORE_OVERWORLD.get())
                .add(Registration.LAWRENCIUM_ORE_DEEPSLATE.get())
                .add(Registration.PALLADIUM_ORE_OVERWORLD.get())
                .add(Registration.PALLADIUM_ORE_DEEPSLATE.get())
                //blocks
                .add(Registration.NEODYMIUM_BLOCK_STORAGE.get())
                .add(Registration.LAWRENCIUM_BLOCK_STORAGE.get())
                .add(Registration.PALLADIUM_BLOCK_STORAGE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                //ores
                .add(Registration.NEODYMIUM_ORE_OVERWORLD.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE.get())
                .add(Registration.LAWRENCIUM_ORE_OVERWORLD.get())
                .add(Registration.LAWRENCIUM_ORE_DEEPSLATE.get())
                .add(Registration.PALLADIUM_ORE_OVERWORLD.get())
                .add(Registration.PALLADIUM_ORE_DEEPSLATE.get())
                //blocks
                .add(Registration.NEODYMIUM_BLOCK_STORAGE.get())
                .add(Registration.LAWRENCIUM_BLOCK_STORAGE.get())
                .add(Registration.PALLADIUM_BLOCK_STORAGE.get());

        tag(Tags.Blocks.ORES)
                //ores
                .add(Registration.NEODYMIUM_ORE_OVERWORLD.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE.get())
                .add(Registration.LAWRENCIUM_ORE_OVERWORLD.get())
                .add(Registration.LAWRENCIUM_ORE_DEEPSLATE.get())
                .add(Registration.PALLADIUM_ORE_OVERWORLD.get())
                .add(Registration.PALLADIUM_ORE_DEEPSLATE.get());
        tag(Registration.NEODYMIUM_ORE)
                .add(Registration.NEODYMIUM_ORE_OVERWORLD.get())
                .add(Registration.NEODYMIUM_ORE_DEEPSLATE.get());
        tag(Registration.LAWRENCIUM_ORE)
                .add(Registration.LAWRENCIUM_ORE_OVERWORLD.get())
                .add(Registration.LAWRENCIUM_ORE_DEEPSLATE.get());
        tag(Registration.PALLADIUM_ORE)
                .add(Registration.PALLADIUM_ORE_OVERWORLD.get())
                .add(Registration.PALLADIUM_ORE_DEEPSLATE.get());

        //storage blocks
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(Registration.NEODYMIUM_BLOCK_STORAGE.get())
                .add(Registration.LAWRENCIUM_BLOCK_STORAGE.get())
                .add(Registration.PALLADIUM_BLOCK_STORAGE.get());
        //storage ???????
/*        tag(Tags.Blocks.NEODYMIUM_BLOCK)
                .add(Registration.NEODYMIUM_BLOCK_STORAGE.get());
        tag(Tags.Blocks.LAWRENCIUM_BLOCK)
                .add(Registration.LAWRENCIUM_BLOCK_STORAGE.get());
        tag(Tags.Blocks.PALLADIUM_BLOCK)
                .add(Registration.PALLADIUM_BLOCK_STORAGE.get());*/

    }

    @Override
    public String getName() {
        return "Warped Abyss Tags";
    }
}