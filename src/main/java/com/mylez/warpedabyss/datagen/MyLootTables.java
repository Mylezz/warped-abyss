package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;

public class MyLootTables extends BaseLootTableProvider {

    public MyLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
//        lootTables.put(Registration.GENERATOR.get(), createStandardTable("generator", Registration.GENERATOR.get(), Registration.GENERATOR_BE.get()));
//        lootTables.put(Registration.POWERGEN.get(), createStandardTable("powergen", Registration.POWERGEN.get(), Registration.POWERGEN_BE.get()));
        lootTables.put(Registration.NEODYMIUM_ORE_OVERWORLD.get(), createSilkTouchTable("neodymium_ore_overworld", Registration.NEODYMIUM_ORE_OVERWORLD.get(), Registration.RAW_NEODYMIUM_CHUNK.get(), 1, 3));
        lootTables.put(Registration.NEODYMIUM_ORE_DEEPSLATE.get(), createSilkTouchTable("neodymium_ore_deepslate", Registration.NEODYMIUM_ORE_DEEPSLATE.get(), Registration.RAW_NEODYMIUM_CHUNK.get(), 1, 3));
    }
}