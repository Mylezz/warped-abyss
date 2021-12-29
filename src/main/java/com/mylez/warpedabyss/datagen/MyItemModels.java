package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.WarpedAbyss;
import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MyItemModels extends ItemModelProvider {


    public MyItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, WarpedAbyss.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //ores
        withExistingParent(Registration.NEODYMIUM_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/neodymium_ore_overworld"));
        withExistingParent(Registration.NEODYMIUM_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/neodymium_ore_deepslate"));
        withExistingParent(Registration.LAWRENCIUM_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/lawrencium_ore_overworld"));
        withExistingParent(Registration.LAWRENCIUM_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/lawrencium_ore_deepslate"));
        //blocks
/*        withExistingParent(Registration.GENERATOR_ITEM.get().getRegistryName().getPath(), modLoc("block/generator"));
        withExistingParent(Registration.POWERGEN_ITEM.get().getRegistryName().getPath(), modLoc("block/powergen/main"));*/
        //eggs
/*        withExistingParent(Registration.THIEF_EGG.get().getRegistryName().getPath(), mcLoc("item/template_spawn_egg"));*/

        //items
        //chunts
        singleTexture(Registration.RAW_NEODYMIUM_CHUNK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_neodymium_chunk"));

        singleTexture(Registration.RAW_LAWRENCIUM_CHUNK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_lawrencium_chunk"));
        //ingots
        singleTexture(Registration.NEODYMIUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/neodymium_ingot"));

        singleTexture(Registration.LAWRENCIUM_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/lawrencium_ingot"));
        //nuggets
        singleTexture(Registration.NEODYMIUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/neodymium_nugget"));

        singleTexture(Registration.LAWRENCIUM_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/lawrencium_nugget"));
        //coils
        singleTexture(Registration.NEODYMIUM_COIL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/neodymium_coil"));
        singleTexture(Registration.LAWRENCIUM_COIL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/lawrencium_coil"));
    }
}