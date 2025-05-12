package com.itshyyde.labco.item;

import java.util.function.Supplier;

import com.itshyyde.labco.LabCo;
import com.itshyyde.labco.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LabCo.MODID);

    public static final Supplier<CreativeModeTab> LABCO_ITEMS_TAB = CREATIVE_MODE_TAB.register("labco_items_tab",
        () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.FERROCARBON_DUST.get()))
            .title(Component.translatable("creativetab.labco.labco_items"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.FERROCARBON_DUST);
                output.accept(ModBlocks.FERROCARBON_BLOCK);
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
