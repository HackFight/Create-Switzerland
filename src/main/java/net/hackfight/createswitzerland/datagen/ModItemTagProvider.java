package net.hackfight.createswitzerland.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.hackfight.createswitzerland.item.ModItems;
import net.hackfight.createswitzerland.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

	@Override
	protected void configure(RegistryWrapper.WrapperLookup arg) {

		getOrCreateTagBuilder(ModTags.Items.CHOCOLATE_TABLET)
				.add(ModItems.MILK_CHOCOLATE_TABLET)
				.add(ModItems.DARK_CHOCOLATE_TABLET)
				.add(ModItems.WHITE_CHOCOLATE_TABLET);
	}
}
