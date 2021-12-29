package com.mylez.warpedabyss.setup;

import com.mylez.warpedabyss.WarpedAbyss;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
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
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MODID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
        CONTAINERS.register(bus);
        ENTITIES.register(bus);
    }

    // Some common properties for our blocks and items
    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

//BLOCKS
//MACHINES



    //ORES
    //Neodymium
    public static final RegistryObject<Block> NEODYMIUM_ORE_OVERWORLD = BLOCKS.register("neodymium_ore_overworld", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NEODYMIUM_ORE_OVERWORLD_ITEM = fromBlock(NEODYMIUM_ORE_OVERWORLD);
    public static final RegistryObject<Block> NEODYMIUM_ORE_DEEPSLATE = BLOCKS.register("neodymium_ore_deepslate", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NEODYMIUM_ORE_DEEPSLATE_ITEM = fromBlock(NEODYMIUM_ORE_DEEPSLATE);
    //Lawrencium
    public static final RegistryObject<Block> LAWRENCIUM_ORE_OVERWORLD = BLOCKS.register("lawrencium_ore_overworld", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> LAWRENCIUM_ORE_OVERWORLD_ITEM = fromBlock(LAWRENCIUM_ORE_OVERWORLD);
    public static final RegistryObject<Block> LAWRENCIUM_ORE_DEEPSLATE = BLOCKS.register("lawrencium_ore_deepslate", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> LAWRENCIUM_ORE_DEEPSLATE_ITEM = fromBlock(LAWRENCIUM_ORE_DEEPSLATE);
    //Palladium
    public static final RegistryObject<Block> PALLADIUM_ORE_OVERWORLD = BLOCKS.register("palladium_ore_overworld", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PALLADIUM_ORE_OVERWORLD_ITEM = fromBlock(PALLADIUM_ORE_OVERWORLD);
    public static final RegistryObject<Block> PALLADIUM_ORE_DEEPSLATE = BLOCKS.register("palladium_ore_deepslate", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PALLADIUM_ORE_DEEPSLATE_ITEM = fromBlock(PALLADIUM_ORE_DEEPSLATE);
// BLOCK TAGS

    public static final Tags.IOptionalNamedTag<Block> NEODYMIUM_ORE = BlockTags.createOptional(new ResourceLocation(WarpedAbyss.MODID, "neodymium_ore"));
    public static final Tags.IOptionalNamedTag<Block> LAWRENCIUM_ORE = BlockTags.createOptional(new ResourceLocation(WarpedAbyss.MODID, "lawrencium_ore"));
    public static final Tags.IOptionalNamedTag<Block> PALLADIUM_ORE = BlockTags.createOptional(new ResourceLocation(WarpedAbyss.MODID, "palladium_ore"));
//ITEMS
    //ingots
    public static final RegistryObject<Item> NEODYMIUM_INGOT = ITEMS.register("neodymium_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LAWRENCIUM_INGOT = ITEMS.register("lawrencium_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot", () -> new Item(ITEM_PROPERTIES));
    //RAW
    public static final RegistryObject<Item> RAW_NEODYMIUM_CHUNK = ITEMS.register("raw_neodymium_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> RAW_LAWRENCIUM_CHUNK = ITEMS.register("raw_lawrencium_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> RAW_PALLADIUM_CHUNK = ITEMS.register("raw_palladium_chunk", () -> new Item(ITEM_PROPERTIES));
    //nuggets
    public static final RegistryObject<Item> NEODYMIUM_NUGGET = ITEMS.register("neodymium_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LAWRENCIUM_NUGGET = ITEMS.register("lawrencium_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget", () -> new Item(ITEM_PROPERTIES));
    //coils
    public static final RegistryObject<Item> NEODYMIUM_COIL = ITEMS.register("neodymium_coil", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LAWRENCIUM_COIL = ITEMS.register("lawrencium_coil", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PALLADIUM_COIL = ITEMS.register("palladium_coil", () -> new Item(ITEM_PROPERTIES));
    //Lattice
    public static final RegistryObject<Item> NETHER_STAR_LATTICE = ITEMS.register("nether_star_lattice", () -> new Item(ITEM_PROPERTIES));
    //
//ITEM TAGS

public static final Tags.IOptionalNamedTag<Item> NEODYMIUM_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(WarpedAbyss.MODID, "neodymium_ore"));
public static final Tags.IOptionalNamedTag<Item> LAWRENCIUM_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(WarpedAbyss.MODID, "lawrencium_ore"));
    public static final Tags.IOptionalNamedTag<Item> PALLADIUM_ORE_ITEM = ItemTags.createOptional(new ResourceLocation(WarpedAbyss.MODID, "palladium_ore"));
//ENTITY SHIT


// YOU SHALL NOT PASS
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
