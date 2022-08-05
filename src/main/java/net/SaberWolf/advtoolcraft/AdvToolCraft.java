package net.SaberWolf.advtoolcraft;

import net.SaberWolf.advtoolcraft.Blocks.AddBlocks;
import net.SaberWolf.advtoolcraft.Items.AddItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvToolCraft implements ModInitializer {
	public static final String Mod_ID = "advtoolcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);
	public static final ItemGroup ADV_CRAFT = FabricItemGroupBuilder.build(
			new Identifier(AdvToolCraft.Mod_ID, "general"),
			() -> new ItemStack(Blocks.COBBLESTONE));

	@Override
	public void onInitialize() {
		AddItems.registerModItems();
		AddBlocks.registerModBlocks();
	}
}
