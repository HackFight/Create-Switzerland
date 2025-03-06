package net.hackfight.createswitzerland.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hackfight.createswitzerland.CreateSwitzerland;
import net.hackfight.createswitzerland.item.custom.MilkChocolateTabletItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Register all items
    public static final Item SWISS_FLAG_ICON = registerItem("swiss_flag_icon", new Item(new Item.Settings()));
    public static final Item CRUSHED_COCOA_BEANS = registerItem("crushed_cocoa_beans", new Item(new Item.Settings()));
    public static final Item COCOA_POWDER = registerItem("cocoa_powder", new Item(new Item.Settings()));
    public static final Item COCOA_BUTTER = registerItem("cocoa_butter", new Item(new Item.Settings()));

    public static final Item BAR_OF_DARK_CHOCOLATE = registerItem("bar_of_dark_chocolate", new Item(new Item.Settings().food(ModFoodComponents.BAR_OF_DARK_CHOCOLATE)));
    public static final Item BAR_OF_WHITE_CHOCOLATE = registerItem("bar_of_white_chocolate", new Item(new Item.Settings().food(ModFoodComponents.BAR_OF_WHITE_CHOCOLATE)));
    public static final Item BAR_OF_CARAMEL = registerItem("bar_of_caramel", new Item(new Item.Settings().food(ModFoodComponents.BAR_OF_CARAMEL)));

    public static final Item DARK_CHOCOLATE_GLAZED_BERRIES = registerItem("dark_chocolate_glazed_berries", new Item(new Item.Settings().food(ModFoodComponents.DARK_CHOCOLATE_GLAZED_BERRIES)));
    public static final Item WHITE_CHOCOLATE_GLAZED_BERRIES = registerItem("white_chocolate_glazed_berries", new Item(new Item.Settings().food(ModFoodComponents.WHITE_CHOCOLATE_GLAZED_BERRIES)));

    public static final Item MILK_CHOCOLATE_TABLET = registerItem("milk_chocolate_tablet", new MilkChocolateTabletItem(new FabricItemSettings().food(ModFoodComponents.MILK_CHOCOLATE_TABLET)));
    public static final Item DARK_CHOCOLATE_TABLET = registerItem("dark_chocolate_tablet", new Item(new Item.Settings().food(ModFoodComponents.DARK_CHOCOLATE_TABLET)));
    public static final Item WHITE_CHOCOLATE_TABLET = registerItem("white_chocolate_tablet", new Item(new Item.Settings().food(ModFoodComponents.WHITE_CHOCOLATE_TABLET)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CreateSwitzerland.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        CreateSwitzerland.LOGGER.info("Registering mod items for " + CreateSwitzerland.MOD_ID);

        //Add items to the INGREDIENTS creative item tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CRUSHED_COCOA_BEANS);
            entries.add(COCOA_POWDER);
            entries.add(COCOA_BUTTER);
        });

        //Add items to the FOOD_AND_DRINK creative item tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(DARK_CHOCOLATE_GLAZED_BERRIES);
            entries.add(WHITE_CHOCOLATE_GLAZED_BERRIES);
            entries.add(DARK_CHOCOLATE_TABLET);
            entries.add(WHITE_CHOCOLATE_TABLET);
        });
    }
}
