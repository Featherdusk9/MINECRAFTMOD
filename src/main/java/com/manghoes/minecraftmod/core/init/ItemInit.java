package com.manghoes.minecraftmod.core.init;

import com.manghoes.minecraftmod.MinecraftMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// A final class is a class that cannot be extended.
public final class ItemInit {

    //We are never constructing this object
    //This file is for containing static fields -> so we are creating a private constructor
    private ItemInit() {}

    //Create object to register registry object to -> called a deferred register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftMod.MODID);




}
