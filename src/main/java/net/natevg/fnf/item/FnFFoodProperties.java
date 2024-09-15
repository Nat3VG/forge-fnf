package net.natevg.fnf.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FnFFoodProperties {
    //For MobEffectInstance duration, every second = 20 tick
    public static final FoodProperties CARROT_BREAD = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6f)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200), 1.0f)
            .build();
    public static final FoodProperties COOKED_TROPICAL_FISH = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 600), 1.0f)
            .build();
    public static final FoodProperties HONEYED_BREAD = new FoodProperties.Builder()
            .nutrition(11)
            .saturationModifier(0.7f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 40, 1), 1.0f)
            .build();
    public static final FoodProperties HONEYED_RABBIT = new FoodProperties.Builder()
            .nutrition(11)
            .saturationModifier(0.7f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 600, 1), 1.0f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 1.0f)
            .build();
    public static final FoodProperties HONEYED_CHICKEN = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(0.7f)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 1), 1.0f)
            .build();

    public static final FoodProperties HONEYED_MUTTON = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(0.9f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1), 1.0f)
            .build();
    public static final FoodProperties HONEYED_PORKCHOP = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(0.9f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 1.0f)
            .build();
    public static final FoodProperties HONEYED_STEAK = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(0.9f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1), 1.0f)
            .build();
    public static final FoodProperties SWEET_MELON_SMOOTHIE = new FoodProperties.Builder()
            .nutrition(10)
            .alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 1), 1.0f)
            .build();
}
