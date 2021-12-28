package com.manghoes.minecraftmod;

import com.manghoes.minecraftmod.core.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = MinecraftMod.MODID)
public class MinecraftMod {
	public static final String MODID = "minecraftmod";
	
	public MinecraftMod() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);
	}



}
