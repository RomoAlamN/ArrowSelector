package com.romoalamn.arrowselector.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber
public class DataGenerationEvent {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent gde){
        DataGenerator gen = gde.getGenerator();
        gen.addProvider(new ArrowItemModelProvider(gen, gde.getExistingFileHelper()));

    }
}
