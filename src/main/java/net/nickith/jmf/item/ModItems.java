package net.nickith.jmf.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.nickith.jmf.JavaMusicFeatures;

import java.util.function.Function;

public class ModItems {
    public static final Item BLANK_DISC = registerItem("blank_disc", Item::new);
    public static final Item TRACK_DISC = registerItem("track_disc",
            properties -> new Item(properties
                    .stacksTo(1)

            ));











    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(JavaMusicFeatures.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JavaMusicFeatures.MOD_ID, name)))));
    }

    public static void registerModItems() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
            output.accept(BLANK_DISC);
            output.accept(TRACK_DISC);
        });
    }
}
