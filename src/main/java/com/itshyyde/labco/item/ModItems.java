package com.itshyyde.labco.item;

import com.itshyyde.labco.LabCo;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LabCo.MODID);

    public static final DeferredItem<Item> FERROCARBON_DUST = ITEMS.register("ferrocarbon_dust", 
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
