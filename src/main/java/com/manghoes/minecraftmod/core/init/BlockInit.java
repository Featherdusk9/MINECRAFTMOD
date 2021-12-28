package com.manghoes.minecraftmod.core.init;


import com.manghoes.minecraftmod.MinecraftMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class BlockInit {

    private BlockInit() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftMod.MODID);




}
