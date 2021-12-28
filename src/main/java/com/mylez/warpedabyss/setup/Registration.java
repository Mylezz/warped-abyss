package com.mylez.warpedabyss.setup;

import com.mylez.warpedabyss.WarpedAbyss;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.mylez.warpedabyss.WarpedAbyss.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    // Some common properties for our blocks and items
    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

//BLOCKS
    public static final RegistryObject<Block> NEODYMIUM_ORE_OVERWORLD = BLOCKS.register("neodymium_ore_overworld", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NEODYMIUM_ORE_OVERWORLD_ITEM = fromBlock(NEODYMIUM_ORE_OVERWORLD);
    public static final RegistryObject<Block> NEODYMIUM_ORE_DEEPSLATE = BLOCKS.register("neodymium_ore_deepslate", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NEODYMIUM_ORE_DEEPSLATE_ITEM = fromBlock(NEODYMIUM_ORE_DEEPSLATE);

// BLOCK TAGS

    public static final Tags.IOptionalNamedTag<Block> NEODYMIUM_ORE = BlockTags.createOptional(new ResourceLocation(WarpedAbyss.MODID, "neodymium_ore"));
//ITEMS
    public static final RegistryObject<Item> RAW_NEODYMIUM_CHUNK = ITEMS.register("raw_neodymium_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> NEODYMIUM_INGOT = ITEMS.register("neodymium_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> NEODYMIUM_NUGGET = ITEMS.register("neodymium_nugget", () -> new Item(ITEM_PROPERTIES));

//ITEM TAGS

public static final Tags.IOptionalNamedTag<Item> NEODYMIUM_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(WarpedAbyss.MODID, "neodymium_ore"));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
