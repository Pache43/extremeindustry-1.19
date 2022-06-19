package net.pache.extremeindustry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.pache.extremeindustry.ExtremeIndustry;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ExtremeIndustry.MOD_ID, name), item);
    }
    public static void registerModItems(){
        ExtremeIndustry.LOGGER.info("Registering Mod Items for " + ExtremeIndustry.MOD_ID);
    }
}
