package net.SaberWolf.advtoolcraft.Items;

import net.SaberWolf.advtoolcraft.AdvToolCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class  AddItems {
    
    public static final Item IRON_CHUNK = registerItem("iron_chunk", new Item(new FabricItemSettings().group(AdvToolCraft.ADV_CRAFT)));
    public static final Item COAL_CHUNK = registerItem("coal_chunk", new Item(new FabricItemSettings().group(AdvToolCraft.ADV_CRAFT)));
    public static final Item GOLD_CHUNK = registerItem("gold_chunk", new Item(new FabricItemSettings().group(AdvToolCraft.ADV_CRAFT)));
    public static final Item COPPER_CHUNK = registerItem("copper_chunk", new Item(new FabricItemSettings().group(AdvToolCraft.ADV_CRAFT)));
    public static final Item PICKAXE_SANDBOX = registerItem("pickaxe_sandbox", new Item(new FabricItemSettings().group(AdvToolCraft.ADV_CRAFT)));
    public static final Item PICKAXE_HEAD = registerItem("pickaxe_head", new Item(new FabricItemSettings().group(AdvToolCraft.ADV_CRAFT)));
    private static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(AdvToolCraft.Mod_ID,name), item);
    }
    public static void registerModItems() {
        AdvToolCraft.LOGGER.info("Registering items for "+ AdvToolCraft.Mod_ID);
    }
}


