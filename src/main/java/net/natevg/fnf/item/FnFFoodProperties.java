package net.natevg.fnf.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;


public class FnFFoodProperties {
    //For MobEffectInstance duration, every second = 20 tick
    public static final int FLASH = 60;    // 3 seconds
    public static final int EX_BRIEF = 200;    // 10 seconds
    public static final int BRIEF = 600;    // 30 seconds
    public static final int SHORT = 1200;    // 1 minute
    public static final int MEDIUM = 3600;    // 3 minutes
    public static final int LONG = 6000;    // 5 minutes
    public static final int EX_LONG = 9600;    // 8 minutes

    //FnF Food Items
    public static final FoodProperties CARROT_BREAD = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, SHORT), 1.0F)
            .build();
    public static final FoodProperties COOKED_TROPICAL_FISH = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, EX_BRIEF), 1.0F)
            .build();
    public static final FoodProperties COOKED_CARROT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build();
    public static final FoodProperties ROASTED_BEETROOT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .build();
    public static final FoodProperties SWEET_MELON_SMOOTHIE = new FoodProperties.Builder()
            .nutrition(6)
            .alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.REGENERATION, BRIEF), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, SHORT), 1.0F)
            .build();

    //Honeyed Foods
    public static final FoodProperties HONEYED_BREAD = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 40), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL), 1.0F)
            .build();
    public static final FoodProperties HONEYED_RABBIT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .effect(new MobEffectInstance(MobEffects.JUMP, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SHORT, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL), 1.0F)
            .build();
    public static final FoodProperties HONEYED_POTATO = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL), 1.0F)
            .build();
    public static final FoodProperties HONEYED_CHICKEN = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.6F)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL), 1.0F)
            .build();

    public static final FoodProperties HONEYED_MUTTON = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL), 1.0F)
            .build();
    public static final FoodProperties HONEYED_PORKCHOP = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL, 0), 1.0F)
            .build();
    public static final FoodProperties HONEYED_STEAK = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL), 1.0F)
            .build();
    public static final FoodProperties HONEYED_COOKIE = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(0.1F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL), 1.0F)
            .fast().alwaysEdible()
            .build();
    public static final FoodProperties HONEY_POPPED_CHORUS_FRUIT = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(0.3F)
            .effect(new MobEffectInstance(MobEffects.LEVITATION, BRIEF), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL), 1.0F)
            .alwaysEdible()
            .build();

    //Kelp-Wrapped Foods
    public static final FoodProperties KELP_WRAPPED_COD = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.2F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, EX_BRIEF), 1.0F)
            .build();
    public static final FoodProperties DRIED_KELP_WRAPPED_COD = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2400), 1.0F)
            .build();
    public static final FoodProperties KELP_WRAPPED_SALMON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.2F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 400), 1.0F)
            .build();
    public static final FoodProperties DRIED_KELP_WRAPPED_SALMON = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400), 1.0F)
            .build();
    public static final FoodProperties KELP_WRAPPED_TROPICAL_FISH = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.2F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, BRIEF), 1.0F)
            .build();
    public static final FoodProperties DRIED_KELP_WRAPPED_TROPICAL_FISH = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, LONG), 1.0F)
            .build();
    public static final FoodProperties KELP_WRAPPED_VEGGIE_STICKS = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.3F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, EX_BRIEF), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 100), 1.0F)
            .build();
    public static final FoodProperties DRIED_KELP_WRAPPED_VEGGIE_STICKS = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.7F)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, BRIEF), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, BRIEF), 1.0F)
            .build();

    //Soup n Stew
    public static final FoodProperties VEGGIE_SOUP = fnfstew(6)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, SHORT, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, SHORT), 1.0F)
            .build();
    public static final FoodProperties PIPING_HOT_BEETROOT_SOUP = fnfstew(8)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .build();
    public static final FoodProperties PIPING_HOT_MUSHROOM_STEW = fnfstew(8)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .build();
    public static final FoodProperties PIPING_HOT_RABBIT_STEW = fnfstew(8)
            .effect(new MobEffectInstance(MobEffects.JUMP, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .build();
    public static final FoodProperties PIPING_HOT_VEGGIE_SOUP = fnfstew(8)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, MEDIUM, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .build();
    public static final FoodProperties MUSHROOM_CHICKEN_STEW = fnfstew(8)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .build();
    public static final FoodProperties MUSHROOM_MUTTON_STEW = fnfstew(8)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, LONG,1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .build();
    public static final FoodProperties MUSHROOM_BEEF_STEW = fnfstew(8)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, LONG,2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .build();
    public static final FoodProperties MUSHROOM_PORK_STEW = fnfstew(8)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, LONG,2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM,1), 1.0F)
            .build();
    public static final FoodProperties MINERS_DELIGHT = fnfstew(12)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, LONG,1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, EX_LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, EX_LONG, 4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, LONG), 1.0F)
            .build();
    public static final FoodProperties FARMERS_GRACE = fnfstew(12)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, LONG,4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, LONG,4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, EX_LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, LONG, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, LONG,2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, SHORT), 1.0F)
            .build();
    public static final FoodProperties NETHER_DWELLERS_SUBSISTENCE = fnfstew(12)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, EX_LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, LONG,4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, LONG,4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, EX_LONG,2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, LONG, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, LONG,3), 1.0F)
            .build();
    public static final FoodProperties HIGHLANDERS_MEAL = fnfstew(12)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, EX_LONG,3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.JUMP, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, LONG), 1.0F)
            .build();
    public static final FoodProperties EXPLORERS_FANCY_COOKING = fnfstew(12)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.JUMP, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, EX_LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, MEDIUM), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SATURATION, FLASH), 1.0F)
            .build();
    public static final FoodProperties LUCKY_STAR = fnfstew(12)
            .effect(new MobEffectInstance(MobEffects.JUMP, EX_LONG,1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, EX_LONG,2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.LUCK, LONG,3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.GLOWING, LONG), 1.0F)
            .build();
    public static final FoodProperties FISHERMANS_SECRET_BROTH = fnfstew(12)
            .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, EX_LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, LONG), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, LONG), 1.0F)
            .build();

    //Skewers
    public static final FoodProperties RAW_MEAT_SKEWER = fnfskewer(3)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, EX_BRIEF), 1.0F).build();
    public static final FoodProperties RAW_GLOWING_MEAT_SKEWER = fnfskewer(3)
            .effect(new MobEffectInstance(MobEffects.GLOWING, EX_BRIEF), 1.0F).build();
    public static final FoodProperties COOKED_BEEF_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SHORT,1), 1.0F)
            .build();
    public static final FoodProperties COOKED_MUTTON_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SHORT,1), 1.0F)
            .build();
    public static final FoodProperties COOKED_PORK_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SHORT,1), 1.0F)
            .build();
    public static final FoodProperties COOKED_CHICKEN_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SHORT,1), 1.0F)
            .build();
    public static final FoodProperties COOKED_RABBIT_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.JUMP, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, SHORT,1), 1.0F)
            .build();
    public static final FoodProperties COOKED_GLOWING_BEEF_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, SHORT,1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, SHORT), 1.0F)
            .build();
    public static final FoodProperties COOKED_GLOWING_MUTTON_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, SHORT,1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, SHORT), 1.0F)
            .build();
    public static final FoodProperties COOKED_GLOWING_PORK_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, SHORT,1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, SHORT), 1.0F)
            .build();
    public static final FoodProperties COOKED_GLOWING_CHICKEN_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, SHORT,1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, SHORT), 1.0F)
            .build();
    public static final FoodProperties COOKED_GLOWING_RABBIT_SKEWER = fnfskewer(6)
            .effect(new MobEffectInstance(MobEffects.JUMP, SHORT), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, SHORT,1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, SHORT), 1.0F)
            .build();

    //Modded Stew Method
    private static FoodProperties.Builder fnfstew(int pNutrition) {
        return new FoodProperties.Builder().nutrition(pNutrition).saturationModifier(1F).alwaysEdible().usingConvertsTo(Items.BOWL);
    }

    //Modded Skewer Method
    private static FoodProperties.Builder fnfskewer(int pNutrition) {
        return new FoodProperties.Builder().nutrition(pNutrition).saturationModifier(0.3F).fast().alwaysEdible().usingConvertsTo(Items.STICK);
    }

}
