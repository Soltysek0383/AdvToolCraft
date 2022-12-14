package net.SaberWolf.advtoolcraft.Blocks;

import net.SaberWolf.advtoolcraft.AdvToolCraft;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AddBlocks {
    
    public static final Block IRON_VEIN = registerblock("iron_vein", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), AdvToolCraft.ADV_CRAFT);
    public static final Block GOLD_VEIN = registerblock("gold_vein", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), AdvToolCraft.ADV_CRAFT);
    public static final Block COPPER_VEIN = registerblock("copper_vein", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), AdvToolCraft.ADV_CRAFT);
    public static final Block COAL_VEIN = registerblock("coal_vein", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), AdvToolCraft.ADV_CRAFT);
    private static Block registerblock(String name, Block block , ItemGroup group){
        registerblockitem(name , block , group);
        return Registry.register(Registry.BLOCK, new Identifier(AdvToolCraft.Mod_ID,name), block);

    }
    private static BlockItem registerblockitem(String name , Block block , ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AdvToolCraft.Mod_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        AdvToolCraft.LOGGER.info("Registering blocks for "+ AdvToolCraft.Mod_ID);
    }
}


