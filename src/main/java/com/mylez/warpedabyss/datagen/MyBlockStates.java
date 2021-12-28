package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.WarpedAbyss;
import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MyBlockStates extends BlockStateProvider {

    public MyBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, WarpedAbyss.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.NEODYMIUM_ORE_OVERWORLD.get());
        simpleBlock(Registration.NEODYMIUM_ORE_DEEPSLATE.get());
    }
}