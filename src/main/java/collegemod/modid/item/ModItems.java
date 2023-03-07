package collegemod.modid.item;

import collegemod.modid.CollegeMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_RUBY = registerItem("raw_ruby",
            new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CollegeMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addItemsToItemGroup(ItemGroups.INGREDIENTS, RUBY);
        addItemsToItemGroup(ItemGroups.INGREDIENTS, RAW_RUBY);

        addItemsToItemGroup(ModItemGroup.RUBY, RUBY);
        addItemsToItemGroup(ModItemGroup.RUBY, RAW_RUBY);

        }

    private static void addItemsToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        CollegeMod.LOGGER.debug("Registering Mod Item for " + CollegeMod.MOD_ID);

        addItemsToItemGroup();
    }
}
