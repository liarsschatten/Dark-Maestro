package com.liarsschatten.darkmaestro.item;

import com.liarsschatten.darkmaestro.DarkMaestro;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DarkMaestro.MODID);

    public static final DeferredItem<Item> DARKCOMPONENT = ITEMS.register("dark_component",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> ATHAME = ITEMS.register("athame",
            ()-> new SwordItem(Tiers.IRON, new  Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .durability(800)
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 4, -2.4f))));

    public static final DeferredItem<SwordItem> KURAYAMI = ITEMS.register("kurayami",
            ()-> new SwordItem(Tiers.NETHERITE, new  Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .component(DataComponents.UNBREAKABLE, new Unbreakable(true))
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 40, -2.4f))));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
