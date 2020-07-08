package com.romoalamn.arrowselector.registry;

import com.romoalamn.arrowselector.ArrowSelectorMod;
import com.romoalamn.arrowselector.item.BowWithQuiver;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;

import java.util.function.Supplier;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ArrowSelectorMod.MODID);

    public static final RegistryObject<BowWithQuiver> BOW_WITH_QUIVER = register(() -> new BowWithQuiver(new Item.Properties().group(ItemGroup.COMBAT)), "bow_quiver");

    public static <Y extends Item> RegistryObject<Y> register(Supplier<Y> instance, String id) {
        return ITEMS.register(id, instance);
    }
}
