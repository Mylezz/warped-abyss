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

        add(Registration.NEODYMIUM_ORE_OVERWORLD.get(), "Neodymium ore");
        add(Registration.NEODYMIUM_ORE_DEEPSLATE.get(), "Deepslate Neodymium ore");
/*        add(MESSAGE_POWERGEN, "Power generator generating %s per tick!");
        add(MESSAGE_GENERATOR, "Generate ores from ingots!");
        add(SCREEN_TUTORIAL_POWERGEN, "Power generator");
        add(Registration.GENERATOR.get(), "Generator");
        add(Registration.POWERGEN.get(), "Power generator");*/
        //items

        add(Registration.RAW_NEODYMIUM_CHUNK.get(), "Neodymium Raw Chunk");
        add(Registration.NEODYMIUM_INGOT.get(), "Neodymium Ingot");
        add(Registration.NEODYMIUM_NUGGET.get(), "Neodymium Nugget");


        //ENTITY
/*        add(Registration.THIEF_EGG.get(), "Thief Egg");
        add(Registration.THIEF.get(), "Thief");*/
    }
}