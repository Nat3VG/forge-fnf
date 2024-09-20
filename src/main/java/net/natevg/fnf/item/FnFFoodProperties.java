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
    public static final FoodProperties COOKED_CARROT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6f)
            .build();
    public static final FoodProperties ROASTED_BEETROOT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6f)
            .build();
    public static final FoodProperties SWEET_MELON_SMOOTHIE = new FoodProperties.Builder()
            .nutrition(6)
            .alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 400), 1.0f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200), 1.0f)
            .build();

    //Honeyed
    public static final FoodProperties HONEYED_BREAD = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 40), 1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 0), 1.0f)
            .build();
    public static final FoodProperties HONEYED_RABBIT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 1200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), 1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 0), 1.0f)
            .build();
    public static final FoodProperties HONEYED_POTATO = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 0), 1.0f)
            .build();
    public static final FoodProperties HONEYED_CHICKEN = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6f)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 0), 1.0f)
            .build();

    public static final FoodProperties HONEYED_MUTTON = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.8f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 0), 1.0f)
            .build();
    public static final FoodProperties HONEYED_PORKCHOP = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 1200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 0), 1.0f)
            .build();
    public static final FoodProperties HONEYED_STEAK = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 0), 1.0f)
            .build();

    //Kelp-Wrapped
    public static final FoodProperties KELP_WRAPPED_COD = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200), 1.0f)
            .build();
    public static final FoodProperties DRIED_KELP_WRAPPED_COD = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2400), 1.0f)
            .build();
    public static final FoodProperties KELP_WRAPPED_SALMON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 400), 1.0f)
            .build();
    public static final FoodProperties DRIED_KELP_WRAPPED_SALMON = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600), 1.0f)
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400), 1.0f)
            .build();
    public static final FoodProperties KELP_WRAPPED_TROPICAL_FISH = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 600), 1.0f)
            .build();
    public static final FoodProperties DRIED_KELP_WRAPPED_TROPICAL_FISH = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8f)
            .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 4800), 1.0f)
            .build();
    public static final FoodProperties KELP_WRAPPED_VEGGIE_STICKS = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100), 1.0f)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 100), 1.0f)
            .build();
    public static final FoodProperties DRIED_KELP_WRAPPED_VEGGIE_STICKS = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.7f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1200), 1.0f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 600), 1.0f)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600), 1.0f)
            .build();

}
