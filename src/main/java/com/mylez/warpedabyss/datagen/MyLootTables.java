package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;

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
        //Palladium ore
        lootTables.put(Registration.PALLADIUM_ORE_OVERWORLD.get(), createSilkTouchTable("palladium_ore_overworld", Registration.PALLADIUM_ORE_OVERWORLD.get(), Registration.RAW_PALLADIUM_CHUNK.get(), 1, 3));
        lootTables.put(Registration.PALLADIUM_ORE_DEEPSLATE.get(), createSilkTouchTable("palladium_ore_deepslate", Registration.PALLADIUM_ORE_DEEPSLATE.get(), Registration.RAW_PALLADIUM_CHUNK.get(), 1, 3));
        //Storage Blocks
/*        lootTables.put(Registration.NEODYMIUM_BLOCK.get(), createSilkTouchTable("neodymium_block", Registration.NEODYMIUM_BLOCK.get(), Item.byBlock(Registration.NEODYMIUM_BLOCK.get()), 1, 1));
        lootTables.put(Registration.LAWRENCIUM_BLOCK.get(), createSilkTouchTable("lawrencium_block", Registration.LAWRENCIUM_BLOCK.get(), Item.byBlock(Registration.LAWRENCIUM_BLOCK.get()), 1, 1));
        lootTables.put(Registration.PALLADIUM_BLOCK.get(), createSilkTouchTable("palladium_block", Registration.PALLADIUM_BLOCK.get(), Item.byBlock(Registration.PALLADIUM_BLOCK.get()), 1, 1));*/
    }
}