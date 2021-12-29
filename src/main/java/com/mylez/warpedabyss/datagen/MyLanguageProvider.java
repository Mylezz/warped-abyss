package com.mylez.warpedabyss.datagen;

import com.mylez.warpedabyss.WarpedAbyss;
import com.mylez.warpedabyss.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.mylez.warpedabyss.setup.ModSetup.TAB_NAME;

public class MyLanguageProvider extends LanguageProvider {

    public MyLanguageProvider(DataGenerator gen, String locale) {
        super(gen, WarpedAbyss.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Warped Abyss");
        //blocks
        //neodymium
        add(Registration.NEODYMIUM_ORE_OVERWORLD.get(), "Neodymium ore");
        add(Registration.NEODYMIUM_ORE_DEEPSLATE.get(), "Deepslate Neodymium ore");
        //lawrencium
        add(Registration.LAWRENCIUM_ORE_OVERWORLD.get(), "Lawrencium ore");
        add(Registration.LAWRENCIUM_ORE_DEEPSLATE.get(), "Deepslate Lawrencium ore");
        //palladium
        add(Registration.PALLADIUM_ORE_OVERWORLD.get(), "Palladium ore");
        add(Registration.PALLADIUM_ORE_DEEPSLATE.get(), "Deepslate Palladium ore");
        //Chunks
        add(Registration.RAW_NEODYMIUM_CHUNK.get(), "Neodymium Raw Chunk");
        add(Registration.RAW_LAWRENCIUM_CHUNK.get(), "Lawrencium Raw Chunk");
        add(Registration.RAW_PALLADIUM_CHUNK.get(), "Palladium Raw Chunk");
        //ingots
        add(Registration.NEODYMIUM_INGOT.get(), "Neodymium Ingot");
        add(Registration.LAWRENCIUM_INGOT.get(), "Lawrencium Ingot");
        add(Registration.PALLADIUM_INGOT.get(), "Palladium Ingot");
        //nuggets
        add(Registration.NEODYMIUM_NUGGET.get(), "Neodymium Nugget");
        add(Registration.LAWRENCIUM_NUGGET.get(), "Lawrencium Nugget");
        add(Registration.PALLADIUM_NUGGET.get(), "Palladium Nugget");
        //coils
        add(Registration.NEODYMIUM_COIL.get(), "Neodymium Coil");
        add(Registration.LAWRENCIUM_COIL.get(), "Lawrencium Coil");
        add(Registration.PALLADIUM_COIL.get(), "Palladium Coil");
        //lattices
        add(Registration.NETHER_STAR_LATTICE.get(), "Nether Star Lattice");




        //ENTITY

    }
}