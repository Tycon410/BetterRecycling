package com.tycon.better_recycling;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

import java.util.List;
import java.util.function.Function;

public class ModItems {

    // 核心注册方法
    public static <T extends Item> T register(String name,
                                              Function<Item.Properties, T> itemFactory,
                                              Item.Properties settings) {
        Identifier id = Identifier.fromNamespaceAndPath(BetterRecycling.MOD_ID, name);
        ResourceKey<Item> itemKey = ResourceKey.create(BuiltInRegistries.ITEM.key(), id);
        T item = itemFactory.apply(settings.setId(itemKey));
        return Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }

    // 注册具体物品（静态字段，类加载时即执行注册）（堆叠加 .stacksTo()；耐久加 .durability()；食物加 .food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.3f).build())）
    public static final Item SUSPICIOUS_SUBSTANCE = register(
            "suspicious_substance",
            Item::new,
            new Item.Properties()
    );



    public static final Item COAL_DUST = register(
            "coal_dust",
            Item::new,
            new Item.Properties()
    );
    public static final Item LAPIS_LAZULI_DUST = register(
            "lapis_lazuli_dust",
            Item::new,
            new Item.Properties()
    );
    public static final Item AMETHYST_DUST = register(
            "amethyst_dust",
            Item::new,
            new Item.Properties()
    );
    public static final Item EMERALD_DUST = register(
            "emerald_dust",
            Item::new,
            new Item.Properties()
    );
    public static final Item REDSTONE = register(
            "redstone",
            Item::new,
            new Item.Properties()
    );
    public static final Item DIAMOND_DUST = register(
            "diamond_dust",
            Item::new,
            new Item.Properties()
    );
    public static final Item NETHERITE_NUGGET = register(
            "netherite_nugget",
            Item::new,
            new Item.Properties()
    );
    public static final Item OBSIDIAN_SHARD = register(
            "obsidian_shard",
            Item::new,
            new Item.Properties()
    );



    public static final Item SCRAP_IRON = register(
            "scrap_iron",
            Item::new,
            new Item.Properties()
    );
    public static final Item A_BUNDLE_OF_SCRAP_IRON = register(
            "a_bundle_of_scrap_iron",
            Item::new,
            new Item.Properties()
    );
    public static final Item SCRAP_COPPER = register(
            "scrap_copper",
            Item::new,
            new Item.Properties()
    );
    public static final Item A_BUNDLE_OF_SCRAP_COPPER = register(
            "a_bundle_of_scrap_copper",
            Item::new,
            new Item.Properties()
    );
    public static final Item SCRAP_GOLD = register(
            "scrap_gold",
            Item::new,
            new Item.Properties()
    );
    public static final Item A_BUNDLE_OF_SCRAP_GOLD = register(
            "a_bundle_of_scrap_gold",
            Item::new,
            new Item.Properties()
    );


    public static final List<Item> INGREDIENT = List.of(
            COAL_DUST,
            LAPIS_LAZULI_DUST,
            AMETHYST_DUST,
            EMERALD_DUST,
            REDSTONE,
            DIAMOND_DUST,
            NETHERITE_NUGGET,
            OBSIDIAN_SHARD,
            SCRAP_IRON,
            A_BUNDLE_OF_SCRAP_IRON,
            SCRAP_COPPER,
            A_BUNDLE_OF_SCRAP_COPPER,
            SCRAP_GOLD,
            A_BUNDLE_OF_SCRAP_GOLD
    );

}