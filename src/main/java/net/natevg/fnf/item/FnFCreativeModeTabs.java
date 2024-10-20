package net.natevg.fnf.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.natevg.fnf.FoodNFuel;

public class FnFCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodNFuel.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FNF_ITEM_TAB = CREATIVE_MODE_TABS.register("fnf_item_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ItemRegistries.LOGO.get()))
                    .title(Component.translatable("creativetab.fnf.fnf_item"))
                    .displayItems((pParameters, output) -> {
                        output.accept(ItemRegistries.CARROT_BREAD.get());
                        output.accept(ItemRegistries.COOKED_CARROT.get());
                        output.accept(ItemRegistries.ROASTED_BEETROOT.get());
                        output.accept(ItemRegistries.COOKED_TROPICAL_FISH.get());
                        output.accept(ItemRegistries.SWEET_MELON_SMOOTHIE.get());

                        output.accept(ItemRegistries.HONEYED_BREAD.get());
                        output.accept(ItemRegistries.HONEYED_CHICKEN.get());
                        output.accept(ItemRegistries.HONEYED_RABBIT.get());
                        output.accept(ItemRegistries.HONEYED_MUTTON.get());
                        output.accept(ItemRegistries.HONEYED_PORKCHOP.get());
                        output.accept(ItemRegistries.HONEYED_STEAK.get());
                        output.accept(ItemRegistries.HONEYED_POTATO.get());

                        output.accept(ItemRegistries.KELP_WRAPPED_COD.get());
                        output.accept(ItemRegistries.KELP_WRAPPED_SALMON.get());
                        output.accept(ItemRegistries.KELP_WRAPPED_TROPICAL_FISH.get());
                        output.accept(ItemRegistries.KELP_WRAPPED_VEGGIE_STICKS.get());
                        output.accept(ItemRegistries.DRIED_KELP_WRAPPED_COD.get());
                        output.accept(ItemRegistries.DRIED_KELP_WRAPPED_SALMON.get());
                        output.accept(ItemRegistries.DRIED_KELP_WRAPPED_TROPICAL_FISH.get());
                        output.accept(ItemRegistries.DRIED_KELP_WRAPPED_VEGGIE_STICKS.get());

                        output.accept(ItemRegistries.VEGGIE_SOUP.get());
                        output.accept(ItemRegistries.MUSHROOM_CHICKEN_STEW.get());
                        output.accept(ItemRegistries.MUSHROOM_MUTTON_STEW.get());
                        output.accept(ItemRegistries.MUSHROOM_BEEF_STEW.get());
                        output.accept(ItemRegistries.MUSHROOM_PORK_STEW.get());

                        output.accept(ItemRegistries.PIPING_HOT_BEETROOT_SOUP.get());
                        output.accept(ItemRegistries.PIPING_HOT_VEGGIE_SOUP.get());
                        output.accept(ItemRegistries.PIPING_HOT_MUSHROOM_STEW.get());
                        output.accept(ItemRegistries.PIPING_HOT_RABBIT_STEW.get());

                        output.accept(ItemRegistries.MINERS_DELIGHT.get());
                        output.accept(ItemRegistries.FARMERS_GRACE.get());
                        output.accept(ItemRegistries.HIGHLANDERS_MEAL.get());
                        output.accept(ItemRegistries.EXPLORERS_FANCY_COOKING.get());
                        output.accept(ItemRegistries.NETHER_DWELLERS_SUBSISTENCE.get());
                        output.accept(ItemRegistries.LUCKY_STAR.get());
                        output.accept(ItemRegistries.FISHERMANS_SECRET_BROTH.get());

                        output.accept(ItemRegistries.PAPER_STACK.get());
                        output.accept(ItemRegistries.BIO_FUEL.get());
                        output.accept(ItemRegistries.BLAZEROD_BUNDLE.get());
                        output.accept(ItemRegistries.BLAZING_COAL.get());

                        output.accept(ItemRegistries.FIRE_CORE.get());
                        output.accept(ItemRegistries.ENERGIZED_FIRE_CORE.get());
                        output.accept(ItemRegistries.SOUL_FIRE_CORE.get());
                        output.accept(ItemRegistries.ENERGIZED_SOUL_FIRE_CORE.get());
                    }).build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
