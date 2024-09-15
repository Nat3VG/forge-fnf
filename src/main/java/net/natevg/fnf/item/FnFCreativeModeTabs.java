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
                        output.accept(ItemRegistries.COOKED_TROPICAL_FISH.get());
                        output.accept(ItemRegistries.HONEYED_BREAD.get());
                        output.accept(ItemRegistries.HONEYED_CHICKEN.get());
                        output.accept(ItemRegistries.HONEYED_RABBIT.get());
                        output.accept(ItemRegistries.HONEYED_MUTTON.get());
                        output.accept(ItemRegistries.HONEYED_PORKCHOP.get());
                        output.accept(ItemRegistries.HONEYED_STEAK.get());
                        output.accept(ItemRegistries.SWEET_MELON_SMOOTHIE.get());

                        output.accept(ItemRegistries.BIO_FUEL.get());
                        output.accept(ItemRegistries.BLAZEROD_BUNDLE.get());
                        output.accept(ItemRegistries.BLAZING_COAL.get());
                    }).build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
