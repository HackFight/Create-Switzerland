package net.hackfight.createswitzerland;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.hackfight.createswitzerland.fluid.ModFluids;
import net.minecraft.util.Identifier;

public class CreateSwitzerlandClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DARK_CHOCOLATE, ModFluids.DARK_CHOCOLATE_FLOWING, new SimpleFluidRenderHandler(
                new Identifier(CreateSwitzerland.MOD_ID, "block/dark_chocolate_still"),
                new Identifier(CreateSwitzerland.MOD_ID, "block/dark_chocolate_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DARK_CHOCOLATE_FLOWING, ModFluids.DARK_CHOCOLATE_FLOWING, new SimpleFluidRenderHandler(
                new Identifier(CreateSwitzerland.MOD_ID, "block/dark_chocolate_still"),
                new Identifier(CreateSwitzerland.MOD_ID, "block/dark_chocolate_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.WHITE_CHOCOLATE, ModFluids.WHITE_CHOCOLATE_FLOWING, new SimpleFluidRenderHandler(
                new Identifier(CreateSwitzerland.MOD_ID, "block/white_chocolate_still"),
                new Identifier(CreateSwitzerland.MOD_ID, "block/white_chocolate_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.WHITE_CHOCOLATE_FLOWING, ModFluids.WHITE_CHOCOLATE_FLOWING, new SimpleFluidRenderHandler(
                new Identifier(CreateSwitzerland.MOD_ID, "block/white_chocolate_still"),
                new Identifier(CreateSwitzerland.MOD_ID, "block/white_chocolate_flow")
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.CARAMEL, ModFluids.CARAMEL_FLOWING, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xFFB67233
        ));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.CARAMEL_FLOWING, ModFluids.CARAMEL_FLOWING, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xFFB67233
        ));
    }
}
