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
        //items
        add(Registration.RAW_NEODYMIUM_CHUNK.get(), "Neodymium Raw Chunk");
        add(Registration.NEODYMIUM_INGOT.get(), "Neodymium Ingot");
        add(Registration.NEODYMIUM_NUGGET.get(), "Neodymium Nugget");
    }
}