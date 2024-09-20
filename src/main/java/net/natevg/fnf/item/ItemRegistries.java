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

    //Food Registries
    public static final RegistryObject<Item> LOGO = ITEMS.register("logo", () -> new Item(new Item.Properties()));

    //Honeyed Food
    public static final RegistryObject<Item> HONEYED_POTATO = ITEMS.register("honeyed_potato", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_POTATO)));
    public static final RegistryObject<Item> HONEYED_BREAD = ITEMS.register("honeyed_bread", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_BREAD)));
    public static final RegistryObject<Item> HONEYED_CHICKEN = ITEMS.register("honeyed_chicken", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_CHICKEN)));
    public static final RegistryObject<Item> HONEYED_MUTTON = ITEMS.register("honeyed_mutton", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_MUTTON)));
    public static final RegistryObject<Item> HONEYED_PORKCHOP = ITEMS.register("honeyed_porkchop", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_PORKCHOP)));
    public static final RegistryObject<Item> HONEYED_RABBIT = ITEMS.register("honeyed_rabbit", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_RABBIT)));
    public static final RegistryObject<Item> HONEYED_STEAK = ITEMS.register("honeyed_steak", () -> new Item(new Item.Properties().food(FnFFoodProperties.HONEYED_STEAK)));

    //Kelp-Wrapped Food
    public static final RegistryObject<Item> KELP_WRAPPED_COD = ITEMS.register("kelp_wrapped_cod", () -> new Item(new Item.Properties().food(FnFFoodProperties.KELP_WRAPPED_COD)));
    public static final RegistryObject<Item> KELP_WRAPPED_SALMON = ITEMS.register("kelp_wrapped_salmon", () -> new Item(new Item.Properties().food(FnFFoodProperties.KELP_WRAPPED_SALMON)));
    public static final RegistryObject<Item> KELP_WRAPPED_TROPICAL_FISH = ITEMS.register("kelp_wrapped_tropical_fish", () -> new Item(new Item.Properties().food(FnFFoodProperties.KELP_WRAPPED_TROPICAL_FISH)));
    public static final RegistryObject<Item> KELP_WRAPPED_VEGGIE_STICKS = ITEMS.register("kelp_wrapped_veggie_sticks", () -> new Item(new Item.Properties().food(FnFFoodProperties.KELP_WRAPPED_VEGGIE_STICKS)));
    public static final RegistryObject<Item> DRIED_KELP_WRAPPED_COD = ITEMS.register("dried_kelp_wrapped_cod", () -> new Item(new Item.Properties().food(FnFFoodProperties.DRIED_KELP_WRAPPED_COD)));
    public static final RegistryObject<Item> DRIED_KELP_WRAPPED_SALMON = ITEMS.register("dried_kelp_wrapped_salmon", () -> new Item(new Item.Properties().food(FnFFoodProperties.DRIED_KELP_WRAPPED_SALMON)));
    public static final RegistryObject<Item> DRIED_KELP_WRAPPED_TROPICAL_FISH = ITEMS.register("dried_kelp_wrapped_tropical_fish", () -> new Item(new Item.Properties().food(FnFFoodProperties.DRIED_KELP_WRAPPED_TROPICAL_FISH)));
    public static final RegistryObject<Item> DRIED_KELP_WRAPPED_VEGGIE_STICKS = ITEMS.register("dried_kelp_wrapped_veggie_sticks", () -> new Item(new Item.Properties().food(FnFFoodProperties.DRIED_KELP_WRAPPED_VEGGIE_STICKS)));

    //Other Food
    public static final RegistryObject<Item> CARROT_BREAD = ITEMS.register("carrot_bread", () -> new Item(new Item.Properties().food(FnFFoodProperties.CARROT_BREAD)));
    public static final RegistryObject<Item> COOKED_TROPICAL_FISH = ITEMS.register("cooked_tropical_fish", () -> new Item(new Item.Properties().food(FnFFoodProperties.COOKED_TROPICAL_FISH)));
    public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(new Item.Properties().food(FnFFoodProperties.COOKED_CARROT)));
    public static final RegistryObject<Item> ROASTED_BEETROOT = ITEMS.register("roasted_beetroot", () -> new Item(new Item.Properties().food(FnFFoodProperties.ROASTED_BEETROOT)));
    public static final RegistryObject<Item> SWEET_MELON_SMOOTHIE = ITEMS.register("sweet_melon_smoothie", () -> new Item(new Item.Properties().food(FnFFoodProperties.SWEET_MELON_SMOOTHIE)));

    //Fuel Registries (200 burn ticks = 1 item)
    public static final RegistryObject<Item> PAPER_STACK = ITEMS.register("paper_stack", () -> new FuelItem(new Item.Properties(), 100));
    public static final RegistryObject<Item> BIO_FUEL = ITEMS.register("bio_fuel", () -> new FuelItem(new Item.Properties(), 3200));
    public static final RegistryObject<Item> BLAZING_COAL = ITEMS.register("blazing_coal", () -> new FuelItem(new Item.Properties(), 6400));
    public static final RegistryObject<Item> BLAZEROD_BUNDLE = ITEMS.register("blazerod_bundle", () -> new FuelItem(new Item.Properties(), 10400));

    //Registry method
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
