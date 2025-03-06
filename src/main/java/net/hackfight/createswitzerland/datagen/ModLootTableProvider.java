package net.hackfight.createswitzerland.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.hackfight.createswitzerland.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MILK_CHOCOLATE_BLOCK);
		addDrop(ModBlocks.DARK_CHOCOLATE_BLOCK);
		addDrop(ModBlocks.WHITE_CHOCOLATE_BLOCK);

		addDrop(ModBlocks.WHITE_CHOCOLATE_STAIRS);
		addDrop(ModBlocks.WHITE_CHOCOLATE_STAIRS);
		addDrop(ModBlocks.WHITE_CHOCOLATE_STAIRS);

		addDrop(ModBlocks.WHITE_CHOCOLATE_SLAB, slabDrops(ModBlocks.MILK_CHOCOLATE_SLAB));
		addDrop(ModBlocks.WHITE_CHOCOLATE_SLAB, slabDrops(ModBlocks.DARK_CHOCOLATE_SLAB));
		addDrop(ModBlocks.WHITE_CHOCOLATE_SLAB, slabDrops(ModBlocks.WHITE_CHOCOLATE_SLAB));
    }
}
