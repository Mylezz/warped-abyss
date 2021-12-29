package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.WarpedAbyss;
import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.CustomLoaderBuilder;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MyBlockStates extends BlockStateProvider {

    public MyBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, WarpedAbyss.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(Registration.NEODYMIUM_ORE_OVERWORLD.get());
        simpleBlock(Registration.NEODYMIUM_ORE_DEEPSLATE.get());
        simpleBlock(Registration.LAWRENCIUM_ORE_OVERWORLD.get());
        simpleBlock(Registration.LAWRENCIUM_ORE_DEEPSLATE.get());
        simpleBlock(Registration.PALLADIUM_ORE_OVERWORLD.get());
        simpleBlock(Registration.PALLADIUM_ORE_DEEPSLATE.get());
        //blocks
        simpleBlock(Registration.NEODYMIUM_BLOCK_STORAGE.get());
        simpleBlock(Registration.LAWRENCIUM_BLOCK_STORAGE.get());
        simpleBlock(Registration.PALLADIUM_BLOCK_STORAGE.get());
    }


}
