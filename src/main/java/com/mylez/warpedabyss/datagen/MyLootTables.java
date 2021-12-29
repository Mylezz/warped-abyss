package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;

public class MyLootTables extends BaseLootTableProvider {

    public MyLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {

        //neodymium ore
        lootTables.put(Registration.NEODYMIUM_ORE_OVERWORLD.get(), createSilkTouchTable("neodymium_ore_overworld", Registration.NEODYMIUM_ORE_OVERWORLD.get(), Registration.RAW_NEODYMIUM_CHUNK.get(), 1, 3));
        lootTables.put(Registration.NEODYMIUM_ORE_DEEPSLATE.get(), createSilkTouchTable("neodymium_ore_deepslate", Registration.NEODYMIUM_ORE_DEEPSLATE.get(), Registration.RAW_NEODYMIUM_CHUNK.get(), 1, 3));
        //lawrencium ore
        lootTables.put(Registration.LAWRENCIUM_ORE_OVERWORLD.get(), createSilkTouchTable("lawrencium_ore_overworld", Registration.LAWRENCIUM_ORE_OVERWORLD.get(), Registration.RAW_LAWRENCIUM_CHUNK.get(), 1, 3));
        lootTables.put(Registration.LAWRENCIUM_ORE_DEEPSLATE.get(), createSilkTouchTable("lawrencium_ore_deepslate", Registration.LAWRENCIUM_ORE_DEEPSLATE.get(), Registration.RAW_LAWRENCIUM_CHUNK.get(), 1, 3));
    }
}