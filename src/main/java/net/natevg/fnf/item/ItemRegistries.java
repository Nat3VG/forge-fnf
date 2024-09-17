package net.natevg.fnf.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.natevg.fnf.FoodNFuel;
import net.natevg.fnf.item.custom.FuelItem;

public class ItemRegistries {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodNFuel.MOD_ID);

    public static final RegistryObject<Item> LOGO = ITEMS.register("logo", () -> new Item(new Item.Properties()));
    //Food Registries
    public static final RegistryObject<Item> CARROT_BREAD = ITEMS.register("carrot_bread", () -> new Item(new Item.Properties().food(FnFFoodProperties.CARROT_BREAD)));
    public static final RegistryObject<Item> COOKED_TROPICAL_FISH = ITEMS.register("cooked_tropical_fish", () -> new Item(new Item.Properties().food(FnFFoodProperties.COOKED_TROPICAL_FISH)));
    public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(new Item.Properties().food(FnFFoodProperties.COOKED_CARROT)));
    public static final RegistryObject<Item> HONEYED_BREAD = ITEMS.register("honeyed_bread", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_BREAD)));
    public static final RegistryObject<Item> HONEYED_CHICKEN = ITEMS.register("honeyed_chicken", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_CHICKEN)));
    public static final RegistryObject<Item> HONEYED_MUTTON = ITEMS.register("honeyed_mutton", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_MUTTON)));
    public static final RegistryObject<Item> HONEYED_PORKCHOP = ITEMS.register("honeyed_porkchop", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_PORKCHOP)));
    public static final RegistryObject<Item> HONEYED_RABBIT = ITEMS.register("honeyed_rabbit", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_RABBIT)));
    public static final RegistryObject<Item> HONEYED_STEAK = ITEMS.register("honeyed_steak", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_STEAK)));
    public static final RegistryObject<Item> SWEET_MELON_SMOOTHIE = ITEMS.register("sweet_melon_smoothie", () -> new Item(new Item.Properties().food(FnFFoodProperties.SWEET_MELON_SMOOTHIE)));

    //Fuel Registries
    public static final RegistryObject<Item> BIO_FUEL = ITEMS.register("bio_fuel", () -> new FuelItem(new Item.Properties(), 3200));
    public static final RegistryObject<Item> BLAZING_COAL = ITEMS.register("blazing_coal", () -> new FuelItem(new Item.Properties(), 6400));
    public static final RegistryObject<Item> BLAZEROD_BUNDLE = ITEMS.register("blazerod_bundle", () -> new FuelItem(new Item.Properties(), 10400));

    //Registry method
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
