package com.romoalamn.arrowselector;

import com.romoalamn.arrowselector.registry.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ArrowSelectorMod.MODID)
public class ArrowSelectorMod {
    public static final String MODID = "arrow_selector";
    public ArrowSelectorMod(){
        //what do I do in here?
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
