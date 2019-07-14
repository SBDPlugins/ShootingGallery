/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 Crypto Morin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package nl.SBDeveloper.ShootingGallery.Utils;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/*
 * References
 *
 * * * GitHub: https://github.com/CryptoMorin/XMaterial/blob/master/XMaterial.java
 * * Thread: https://www.spigotmc.org/threads/378136/
 * 1.8: http://docs.codelanx.com/Bukkit/1.8/org/bukkit/Sound.html
 * Latest: https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Sound.html
 * Basics: https://bukkit.org/threads/151517/
 */

/**
 * <b>XSound v1.0</b> - Universal Sound Support for Renames<br>
 * Supports 1.8-1.14<br>
 * 1.13 and above as priority.<br><br>
 *
 * <b>Volume:</b> 0.0-1.0 - 1.0f (normal) - Using higher values increase the distance from which the sound can be heard.<br>
 * <b>Pitch:</b> 0.5-2.0 - 1.0f (normal) - How fast the sound is play.
 */
public enum XSound {
    AMBIENT_CAVE("AMBIENCE_CAVE"),
    AMBIENT_UNDERWATER_ENTER(),
    AMBIENT_UNDERWATER_EXIT(),
    AMBIENT_UNDERWATER_LOOP("AMBIENT_UNDERWATER_EXIT"),
    AMBIENT_UNDERWATER_LOOP_ADDITIONS("AMBIENT_UNDERWATER_EXIT"),
    AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE("AMBIENT_UNDERWATER_EXIT"),
    AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE("AMBIENT_UNDERWATER_EXIT"),
    BLOCK_ANVIL_BREAK("ANVIL_BREAK"),
    BLOCK_ANVIL_DESTROY(),
    BLOCK_ANVIL_FALL(),
    BLOCK_ANVIL_HIT("BLOCK_ANVIL_FALL"),
    BLOCK_ANVIL_LAND("ANVIL_LAND"),
    BLOCK_ANVIL_PLACE("BLOCK_ANVIL_FALL"),
    BLOCK_ANVIL_STEP("BLOCK_ANVIL_FALL"),
    BLOCK_ANVIL_USE("ANVIL_USE"),
    BLOCK_BEACON_ACTIVATE(),
    BLOCK_BEACON_AMBIENT(),
    BLOCK_BEACON_DEACTIVATE("BLOCK_BEACON_AMBIENT"),
    BLOCK_BEACON_POWER_SELECT("BLOCK_BEACON_AMBIENT"),
    BLOCK_BREWING_STAND_BREW(),
    BLOCK_BUBBLE_COLUMN_BUBBLE_POP(),
    BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT(),
    BLOCK_BUBBLE_COLUMN_UPWARDS_INSIDE(),
    BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT(),
    BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE(),
    BLOCK_CHEST_CLOSE("CHEST_CLOSE", "ENTITY_CHEST_CLOSE"),
    BLOCK_CHEST_LOCKED(),
    BLOCK_CHEST_OPEN("CHEST_OPEN", "ENTITY_CHEST_OPEN"),
    BLOCK_CHORUS_FLOWER_DEATH(),
    BLOCK_CHORUS_FLOWER_GROW(),
    BLOCK_COMPARATOR_CLICK(),
    BLOCK_CONDUIT_ACTIVATE(),
    BLOCK_CONDUIT_AMBIENT(),
    BLOCK_CONDUIT_AMBIENT_SHORT(),
    BLOCK_CONDUIT_ATTACK_TARGET(),
    BLOCK_CONDUIT_DEACTIVATE(),
    BLOCK_CORAL_BLOCK_BREAK(),
    BLOCK_CORAL_BLOCK_FALL(),
    BLOCK_CORAL_BLOCK_HIT(),
    BLOCK_CORAL_BLOCK_PLACE(),
    BLOCK_CORAL_BLOCK_STEP(),
    BLOCK_DISPENSER_DISPENSE(),
    BLOCK_DISPENSER_FAIL(),
    BLOCK_DISPENSER_LAUNCH(),
    BLOCK_ENCHANTMENT_TABLE_USE(),
    BLOCK_ENDER_CHEST_CLOSE(),
    BLOCK_ENDER_CHEST_OPEN(),
    BLOCK_END_GATEWAY_SPAWN(),
    BLOCK_END_PORTAL_FRAME_FILL(),
    BLOCK_END_PORTAL_SPAWN(),
    BLOCK_FENCE_GATE_CLOSE(),
    BLOCK_FENCE_GATE_OPEN(),
    BLOCK_FIRE_AMBIENT("FIRE"),
    BLOCK_FIRE_EXTINGUISH("FIZZ"),
    BLOCK_FURNACE_FIRE_CRACKLE(),
    BLOCK_GLASS_BREAK("GLASS"),
    BLOCK_GLASS_FALL(),
    BLOCK_GLASS_HIT(),
    BLOCK_GLASS_PLACE(),
    BLOCK_GLASS_STEP(),
    BLOCK_GRASS_BREAK("DIG_GRASS"),
    BLOCK_GRASS_FALL(),
    BLOCK_GRASS_HIT(),
    BLOCK_GRASS_PLACE(),
    BLOCK_GRASS_STEP("STEP_GRASS"),
    BLOCK_GRAVEL_BREAK("DIG_GRAVEL"),
    BLOCK_GRAVEL_FALL(),
    BLOCK_GRAVEL_HIT(),
    BLOCK_GRAVEL_PLACE(),
    BLOCK_GRAVEL_STEP("STEP_GRAVEL"),
    BLOCK_IRON_DOOR_CLOSE(),
    BLOCK_IRON_DOOR_OPEN(),
    BLOCK_IRON_TRAPDOOR_CLOSE(),
    BLOCK_IRON_TRAPDOOR_OPEN(),
    BLOCK_LADDER_BREAK(),
    BLOCK_LADDER_FALL(),
    BLOCK_LADDER_HIT(),
    BLOCK_LADDER_PLACE(),
    BLOCK_LADDER_STEP("STEP_LADDER"),
    BLOCK_LAVA_AMBIENT("LAVA"),
    BLOCK_LAVA_EXTINGUISH(),
    BLOCK_LAVA_POP("LAVA_POP"),
    BLOCK_LEVER_CLICK(),
    BLOCK_LILY_PAD_PLACE("BLOCK_WATERLILY_PLACE"),
    BLOCK_METAL_BREAK(),
    BLOCK_METAL_FALL(),
    BLOCK_METAL_HIT(),
    BLOCK_METAL_PLACE(),
    BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF("BLOCK_METAL_PRESSUREPLATE_CLICK_OFF"),
    BLOCK_METAL_PRESSURE_PLATE_CLICK_ON("BLOCK_METAL_PRESSUREPLATE_CLICK_ON"),
    BLOCK_METAL_STEP(),
    BLOCK_NOTE_BLOCK_BASEDRUM("NOTE_BASS_DRUM", "BLOCK_NOTE_BASEDRUM"),
    BLOCK_NOTE_BLOCK_BASS("NOTE_BASS", "BLOCK_NOTE_BASS"),
    BLOCK_NOTE_BLOCK_BELL(),
    BLOCK_NOTE_BLOCK_CHIME(),
    BLOCK_NOTE_BLOCK_FLUTE(),
    BLOCK_NOTE_BLOCK_GUITAR("NOTE_BASS_GUITAR", "BLOCK_NOTE_GUITAR", "BLOCK_NOTE_BASS"),
    BLOCK_NOTE_BLOCK_HARP("NOTE_PIANO", "BLOCK_NOTE_HARP"),
    BLOCK_NOTE_BLOCK_HAT("NOTE_STICKS", "BLOCK_NOTE_HAT"),
    BLOCK_NOTE_BLOCK_PLING("NOTE_PLING", "BLOCK_NOTE_PLING"),
    BLOCK_NOTE_BLOCK_SNARE("NOTE_SNARE_DRUM", "BLOCK_NOTE_SNARE"),
    BLOCK_NOTE_BLOCK_XYLOPHONE("BLOCK_NOTE_XYLOPHONE"),
    BLOCK_PISTON_CONTRACT("PISTON_RETRACT"),
    BLOCK_PISTON_EXTEND("PISTON_EXTEND"),
    BLOCK_PORTAL_AMBIENT("PORTAL"),
    BLOCK_PORTAL_TRAVEL("PORTAL_TRAVEL"),
    BLOCK_PORTAL_TRIGGER("PORTAL_TRIGGER"),
    BLOCK_PUMPKIN_CARVE(),
    BLOCK_REDSTONE_TORCH_BURNOUT(),
    BLOCK_SAND_BREAK("DIG_SAND"),
    BLOCK_SAND_FALL(),
    BLOCK_SAND_HIT(),
    BLOCK_SAND_PLACE(),
    BLOCK_SAND_STEP("STEP_SAND"),
    BLOCK_SHULKER_BOX_CLOSE(),
    BLOCK_SHULKER_BOX_OPEN(),
    BLOCK_SLIME_BLOCK_BREAK("BLOCK_SLIME_BREAK"),
    BLOCK_SLIME_BLOCK_FALL("BLOCK_SLIME_FALL"),
    BLOCK_SLIME_BLOCK_HIT("BLOCK_SLIME_HIT"),
    BLOCK_SLIME_BLOCK_PLACE("BLOCK_SLIME_PLACE"),
    BLOCK_SLIME_BLOCK_STEP("BLOCK_SLIME_STEP"),
    BLOCK_SNOW_BREAK("DIG_SNOW"),
    BLOCK_SNOW_FALL(),
    BLOCK_SNOW_HIT(),
    BLOCK_SNOW_PLACE(),
    BLOCK_SNOW_STEP("STEP_SNOW"),
    BLOCK_STONE_BREAK("DIG_STONE"),
    BLOCK_STONE_BUTTON_CLICK_OFF(),
    BLOCK_STONE_BUTTON_CLICK_ON(),
    BLOCK_STONE_FALL(),
    BLOCK_STONE_HIT(),
    BLOCK_STONE_PLACE(),
    BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF("BLOCK_STONE_PRESSUREPLATE_CLICK_OFF"),
    BLOCK_STONE_PRESSURE_PLATE_CLICK_ON("BLOCK_STONE_PRESSUREPLATE_CLICK_ON"),
    BLOCK_STONE_STEP("STEP_STONE"),
    BLOCK_TRIPWIRE_ATTACH(),
    BLOCK_TRIPWIRE_CLICK_OFF(),
    BLOCK_TRIPWIRE_CLICK_ON(),
    BLOCK_TRIPWIRE_DETACH(),
    BLOCK_WATER_AMBIENT("WATER"),
    BLOCK_WET_GRASS_BREAK(),
    BLOCK_WET_GRASS_FALL(),
    BLOCK_WET_GRASS_HIT(),
    BLOCK_WET_GRASS_PLACE("BLOCK_WET_GRASS_HIT"),
    BLOCK_WET_GRASS_STEP("BLOCK_WET_GRASS_HIT"),
    BLOCK_WOODEN_BUTTON_CLICK_OFF("WOOD_CLICK", "BLOCK_WOOD_BUTTON_CLICK_OFF"),
    BLOCK_WOODEN_BUTTON_CLICK_ON("WOOD_CLICK", "BLOCK_WOOD_BUTTON_CLICK_ON"),
    BLOCK_WOODEN_DOOR_CLOSE("DOOR_CLOSE"),
    BLOCK_WOODEN_DOOR_OPEN("DOOR_OPEN"),
    BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF("BLOCK_WOOD_PRESSUREPLATE_CLICK_OFF"),
    BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON("BLOCK_WOOD_PRESSUREPLATE_CLICK_ON"),
    BLOCK_WOODEN_TRAPDOOR_CLOSE(),
    BLOCK_WOODEN_TRAPDOOR_OPEN(),
    BLOCK_WOOD_BREAK("DIG_WOOD"),
    BLOCK_WOOD_FALL(),
    BLOCK_WOOD_HIT(),
    BLOCK_WOOD_PLACE(),
    BLOCK_WOOD_STEP("STEP_WOOD"),
    BLOCK_WOOL_BREAK("DIG_WOOL", "BLOCK_CLOTH_BREAK"),
    BLOCK_WOOL_FALL(),
    BLOCK_WOOL_HIT("BLOCK_WOOL_FALL"),
    BLOCK_WOOL_PLACE("BLOCK_WOOL_FALL"),
    BLOCK_WOOL_STEP("STEP_WOOL", "BLOCK_CLOTH_STEP"),
    ENCHANT_THORNS_HIT(),
    ENTITY_ARMOR_STAND_BREAK("ENTITY_ARMORSTAND_BREAK"),
    ENTITY_ARMOR_STAND_FALL("ENTITY_ARMORSTAND_FALL"),
    ENTITY_ARMOR_STAND_HIT("ENTITY_ARMORSTAND_HIT"),
    ENTITY_ARMOR_STAND_PLACE("ENTITY_ARMORSTAND_PLACE"),
    ENTITY_ARROW_HIT("ARROW_HIT"),
    ENTITY_ARROW_HIT_PLAYER(),
    ENTITY_ARROW_SHOOT("SHOOT_ARROW"),
    ENTITY_BAT_AMBIENT("BAT_IDLE"),
    ENTITY_BAT_DEATH("BAT_DEATH"),
    ENTITY_BAT_HURT("BAT_HURT"),
    ENTITY_BAT_LOOP("BAT_LOOP"),
    ENTITY_BAT_TAKEOFF("BAT_TAKEOFF"),
    ENTITY_BLAZE_AMBIENT("BLAZE_BREATH"),
    ENTITY_BLAZE_BURN(),
    ENTITY_BLAZE_DEATH("BLAZE_DEATH"),
    ENTITY_BLAZE_HURT("BLAZE_HIT"),
    ENTITY_BLAZE_SHOOT(),
    ENTITY_BOAT_PADDLE_LAND(),
    ENTITY_BOAT_PADDLE_WATER(),
    ENTITY_CAT_AMBIENT("CAT_MEOW"),
    ENTITY_CAT_DEATH(),
    ENTITY_CAT_HISS("CAT_HISS"),
    ENTITY_CAT_HURT("CAT_HIT"),
    ENTITY_CAT_PURR("CAT_PURR"),
    ENTITY_CAT_PURREOW("CAT_PURREOW"),
    ENTITY_CHICKEN_AMBIENT("CHICKEN_IDLE"),
    ENTITY_CHICKEN_DEATH(),
    ENTITY_CHICKEN_EGG("CHICKEN_EGG_POP"),
    ENTITY_CHICKEN_HURT("CHICKEN_HURT"),
    ENTITY_CHICKEN_STEP("CHICKEN_WALK"),
    ENTITY_COD_AMBIENT(),
    ENTITY_COD_DEATH(),
    ENTITY_COD_FLOP(),
    ENTITY_COD_HURT(),
    ENTITY_COW_AMBIENT("COW_IDLE"),
    ENTITY_COW_DEATH(),
    ENTITY_COW_HURT("COW_HURT"),
    ENTITY_COW_MILK(),
    ENTITY_COW_STEP("COW_WALK"),
    ENTITY_CREEPER_DEATH("CREEPER_DEATH"),
    ENTITY_CREEPER_HURT(),
    ENTITY_CREEPER_PRIMED("CREEPER_HISS"),
    ENTITY_DOLPHIN_AMBIENT(),
    ENTITY_DOLPHIN_AMBIENT_WATER(),
    ENTITY_DOLPHIN_ATTACK(),
    ENTITY_DOLPHIN_DEATH(),
    ENTITY_DOLPHIN_EAT(),
    ENTITY_DOLPHIN_HURT(),
    ENTITY_DOLPHIN_JUMP(),
    ENTITY_DOLPHIN_PLAY(),
    ENTITY_DOLPHIN_SPLASH(),
    ENTITY_DOLPHIN_SWIM(),
    ENTITY_DONKEY_AMBIENT("DONKEY_IDLE"),
    ENTITY_DONKEY_ANGRY("DONKEY_ANGRY"),
    ENTITY_DONKEY_CHEST(),
    ENTITY_DONKEY_DEATH("DONKEY_DEATH"),
    ENTITY_DONKEY_HURT("DONKEY_HIT"),
    ENTITY_DRAGON_FIREBALL_EXPLODE("ENTITY_ENDERDRAGON_FIREBALL_EXPLODE"),
    ENTITY_DROWNED_AMBIENT(),
    ENTITY_DROWNED_AMBIENT_WATER(),
    ENTITY_DROWNED_DEATH(),
    ENTITY_DROWNED_DEATH_WATER(),
    ENTITY_DROWNED_HURT(),
    ENTITY_DROWNED_HURT_WATER(),
    ENTITY_DROWNED_SHOOT(),
    ENTITY_DROWNED_STEP(),
    ENTITY_DROWNED_SWIM(),
    ENTITY_EGG_THROW(),
    ENTITY_ELDER_GUARDIAN_AMBIENT(),
    ENTITY_ELDER_GUARDIAN_AMBIENT_LAND(),
    ENTITY_ELDER_GUARDIAN_CURSE(),
    ENTITY_ELDER_GUARDIAN_DEATH(),
    ENTITY_ELDER_GUARDIAN_DEATH_LAND(),
    ENTITY_ELDER_GUARDIAN_FLOP(),
    ENTITY_ELDER_GUARDIAN_HURT(),
    ENTITY_ELDER_GUARDIAN_HURT_LAND(),
    ENTITY_ENDERMAN_AMBIENT("ENDERMAN_IDLE", "ENTITY_ENDERMEN_AMBIENT"),
    ENTITY_ENDERMAN_DEATH("ENDERMAN_DEATH", "ENTITY_ENDERMEN_DEATH"),
    ENTITY_ENDERMAN_HURT("ENDERMAN_HIT", "ENTITY_ENDERMEN_HURT"),
    ENTITY_ENDERMAN_SCREAM("ENDERMAN_SCREAM", "ENTITY_ENDERMEN_SCREAM"),
    ENTITY_ENDERMAN_STARE("ENDERMAN_STARE", "ENTITY_ENDERMEN_STARE"),
    ENTITY_ENDERMAN_TELEPORT("ENDERMAN_TELEPORT", "ENTITY_ENDERMEN_TELEPORT"),
    ENTITY_ENDERMITE_AMBIENT(),
    ENTITY_ENDERMITE_DEATH(),
    ENTITY_ENDERMITE_HURT(),
    ENTITY_ENDERMITE_STEP(),
    ENTITY_ENDER_DRAGON_AMBIENT("ENDERDRAGON_WINGS", "ENTITY_ENDERDRAGON_AMBIENT"),
    ENTITY_ENDER_DRAGON_DEATH("ENDERDRAGON_DEATH", "ENTITY_ENDERDRAGON_DEATH"),
    ENTITY_ENDER_DRAGON_FLAP("ENDERDRAGON_WINGS", "ENTITY_ENDERDRAGON_FLAP"),
    ENTITY_ENDER_DRAGON_GROWL("ENDERDRAGON_GROWL", "ENTITY_ENDERDRAGON_GROWL"),
    ENTITY_ENDER_DRAGON_HURT("ENDERDRAGON_HIT", "ENTITY_ENDERDRAGON_HURT"),
    ENTITY_ENDER_DRAGON_SHOOT("ENTITY_ENDERDRAGON_SHOOT"),
    ENTITY_ENDER_EYE_DEATH(),
    ENTITY_ENDER_EYE_LAUNCH("ENTITY_ENDER_EYE_DEATH", "ENTITY_ENDEREYE_DEATH"),
    ENTITY_ENDER_PEARL_THROW("ENTITY_ENDERPEARL_THROW"),
    ENTITY_EVOKER_AMBIENT("ENTITY_EVOCATION_ILLAGER_AMBIENT"),
    ENTITY_EVOKER_CAST_SPELL("ENTITY_EVOCATION_ILLAGER_CAST_SPELL"),
    ENTITY_EVOKER_DEATH("ENTITY_EVOCATION_ILLAGER_DEATH"),
    ENTITY_EVOKER_FANGS_ATTACK("ENTITY_EVOCATION_FANGS_ATTACK"),
    ENTITY_EVOKER_HURT("ENTITY_EVOCATION_ILLAGER_HURT"),
    ENTITY_EVOKER_PREPARE_ATTACK("ENTITY_EVOCATION_ILLAGER_PREPARE_ATTACK"),
    ENTITY_EVOKER_PREPARE_SUMMON("ENTITY_EVOCATION_ILLAGER_PREPARE_SUMMON"),
    ENTITY_EVOKER_PREPARE_WOLOLO("ENTITY_EVOCATION_ILLAGER_PREPARE_WOLOLO"),
    ENTITY_EXPERIENCE_BOTTLE_THROW(),
    ENTITY_EXPERIENCE_ORB_PICKUP("ORB_PICKUP"),
    ENTITY_FIREWORK_ROCKET_BLAST("FIREWORK_BLAST", "ENTITY_FIREWORK_BLAST"),
    ENTITY_FIREWORK_ROCKET_BLAST_FAR("FIREWORK_BLAST2", "ENTITY_FIREWORK_BLAST_FAR"),
    ENTITY_FIREWORK_ROCKET_LARGE_BLAST("FIREWORK_LARGE_BLAST", "ENTITY_FIREWORK_LARGE_BLAST"),
    ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR("FIREWORK_LARGE_BLAST2", "ENTITY_FIREWORK_LARGE_BLAST_FAR"),
    ENTITY_FIREWORK_ROCKET_LAUNCH("FIREWORK_LAUNCH", "ENTITY_FIREWORK_LAUNCH"),
    ENTITY_FIREWORK_ROCKET_SHOOT(),
    ENTITY_FIREWORK_ROCKET_TWINKLE("FIREWORK_TWINKLE", "ENTITY_FIREWORK_TWINKLE"),
    ENTITY_FIREWORK_ROCKET_TWINKLE_FAR("FIREWORK_TWINKLE2", "ENTITY_FIREWORK_TWINKLE_FAR"),
    ENTITY_FISHING_BOBBER_RETRIEVE(),
    ENTITY_FISHING_BOBBER_SPLASH("SPLASH2", "ENTITY_BOBBER_SPLASH"),
    ENTITY_FISHING_BOBBER_THROW("ENTITY_BOBBER_THROW"),
    ENTITY_FISH_SWIM(),
    ENTITY_GENERIC_BIG_FALL("FALL_BIG"),
    ENTITY_GENERIC_BURN(),
    ENTITY_GENERIC_DEATH(),
    ENTITY_GENERIC_DRINK("DRINK"),
    ENTITY_GENERIC_EAT("EAT"),
    ENTITY_GENERIC_EXPLODE("EXPLODE"),
    ENTITY_GENERIC_EXTINGUISH_FIRE(),
    ENTITY_GENERIC_HURT(),
    ENTITY_GENERIC_SMALL_FALL("FALL_SMALL"),
    ENTITY_GENERIC_SPLASH("SPLASH"),
    ENTITY_GENERIC_SWIM("SWIM"),
    ENTITY_GHAST_AMBIENT("GHAST_MOAN"),
    ENTITY_GHAST_DEATH("GHAST_DEATH"),
    ENTITY_GHAST_HURT("GHAST_SCREAM2"),
    ENTITY_GHAST_SCREAM("GHAST_SCREAM"),
    ENTITY_GHAST_SHOOT("GHAST_FIREBALL"),
    ENTITY_GHAST_WARN("GHAST_CHARGE"),
    ENTITY_GUARDIAN_AMBIENT(),
    ENTITY_GUARDIAN_AMBIENT_LAND(),
    ENTITY_GUARDIAN_ATTACK(),
    ENTITY_GUARDIAN_DEATH(),
    ENTITY_GUARDIAN_DEATH_LAND(),
    ENTITY_GUARDIAN_FLOP(),
    ENTITY_GUARDIAN_HURT(),
    ENTITY_GUARDIAN_HURT_LAND(),
    ENTITY_HORSE_AMBIENT("HORSE_IDLE"),
    ENTITY_HORSE_ANGRY("HORSE_ANGRY"),
    ENTITY_HORSE_ARMOR("HORSE_ARMOR"),
    ENTITY_HORSE_BREATHE("HORSE_BREATHE"),
    ENTITY_HORSE_DEATH("HORSE_DEATH"),
    ENTITY_HORSE_EAT(),
    ENTITY_HORSE_GALLOP("HORSE_GALLOP"),
    ENTITY_HORSE_HURT("HORSE_HIT"),
    ENTITY_HORSE_JUMP("HORSE_JUMP"),
    ENTITY_HORSE_LAND("HORSE_LAND"),
    ENTITY_HORSE_SADDLE("HORSE_SADDLE"),
    ENTITY_HORSE_STEP("HORSE_SOFT"),
    ENTITY_HORSE_STEP_WOOD("HORSE_WOOD"),
    ENTITY_HOSTILE_BIG_FALL("FALL_BIG"),
    ENTITY_HOSTILE_DEATH(),
    ENTITY_HOSTILE_HURT(),
    ENTITY_HOSTILE_SMALL_FALL("FALL_SMALL"),
    ENTITY_HOSTILE_SPLASH("SPLASH"),
    ENTITY_HOSTILE_SWIM("SWIM"),
    ENTITY_HUSK_AMBIENT(),
    ENTITY_HUSK_CONVERTED_TO_ZOMBIE(),
    ENTITY_HUSK_DEATH(),
    ENTITY_HUSK_HURT(),
    ENTITY_HUSK_STEP(),
    ENTITY_ILLUSIONER_AMBIENT("ENTITY_ILLUSION_ILLAGER_AMBIENT"),
    ENTITY_ILLUSIONER_CAST_SPELL("ENTITY_ILLUSION_ILLAGER_CAST_SPELL"),
    ENTITY_ILLUSIONER_DEATH("ENTITY_ILLUSIONER_CAST_DEATH", "ENTITY_ILLUSION_ILLAGER_DEATH"),
    ENTITY_ILLUSIONER_HURT("ENTITY_ILLUSION_ILLAGER_HURT"),
    ENTITY_ILLUSIONER_MIRROR_MOVE("ENTITY_ILLUSION_ILLAGER_MIRROR_MOVE"),
    ENTITY_ILLUSIONER_PREPARE_BLINDNESS("ENTITY_ILLUSION_ILLAGER_PREPARE_BLINDNESS"),
    ENTITY_ILLUSIONER_PREPARE_MIRROR("ENTITY_ILLUSION_ILLAGER_PREPARE_MIRROR"),
    ENTITY_IRON_GOLEM_ATTACK("IRONGOLEM_THROW", "ENTITY_IRONGOLEM_ATTACK"),
    ENTITY_IRON_GOLEM_DEATH("IRONGOLEM_DEATH", "ENTITY_IRONGOLEM_DEATH"),
    ENTITY_IRON_GOLEM_HURT("IRONGOLEM_HIT", "ENTITY_IRONGOLEM_HURT"),
    ENTITY_IRON_GOLEM_STEP("IRONGOLEM_WALK", "ENTITY_IRONGOLEM_STEP"),
    ENTITY_ITEM_BREAK("ITEM_BREAK"),
    ENTITY_ITEM_FRAME_ADD_ITEM("ENTITY_ITEMFRAME_ADD_ITEM"),
    ENTITY_ITEM_FRAME_BREAK("ENTITY_ITEMFRAME_BREAK"),
    ENTITY_ITEM_FRAME_PLACE("ENTITY_ITEMFRAME_PLACE"),
    ENTITY_ITEM_FRAME_REMOVE_ITEM("ENTITY_ITEMFRAME_REMOVE_ITEM"),
    ENTITY_ITEM_FRAME_ROTATE_ITEM("ENTITY_ITEMFRAME_ROTATE_ITEM"),
    ENTITY_ITEM_PICKUP("ITEM_PICKUP"),
    ENTITY_LEASH_KNOT_BREAK("ENTITY_LEASHKNOT_BREAK"),
    ENTITY_LEASH_KNOT_PLACE("ENTITY_LEASHKNOT_PLACE"),
    ENTITY_LIGHTNING_BOLT_IMPACT("AMBIENCE_THUNDER", "ENTITY_LIGHTNING_IMPACT"),
    ENTITY_LIGHTNING_BOLT_THUNDER("AMBIENCE_THUNDER", "ENTITY_LIGHTNING_THUNDER"),
    ENTITY_LINGERING_POTION_THROW(),
    ENTITY_LLAMA_AMBIENT(),
    ENTITY_LLAMA_ANGRY(),
    ENTITY_LLAMA_CHEST(),
    ENTITY_LLAMA_DEATH(),
    ENTITY_LLAMA_EAT(),
    ENTITY_LLAMA_HURT(),
    ENTITY_LLAMA_SPIT(),
    ENTITY_LLAMA_STEP(),
    ENTITY_LLAMA_SWAG(),
    ENTITY_MAGMA_CUBE_DEATH("ENTITY_MAGMACUBE_DEATH"),
    ENTITY_MAGMA_CUBE_DEATH_SMALL("ENTITY_SMALL_MAGMACUBE_DEATH"),
    ENTITY_MAGMA_CUBE_HURT("ENTITY_MAGMACUBE_HURT"),
    ENTITY_MAGMA_CUBE_HURT_SMALL("ENTITY_SMALL_MAGMACUBE_HURT"),
    ENTITY_MAGMA_CUBE_JUMP("MAGMACUBE_JUMP", "ENTITY_MAGMACUBE_JUMP"),
    ENTITY_MAGMA_CUBE_SQUISH("MAGMACUBE_WALK", "ENTITY_MAGMACUBE_SQUISH"),
    ENTITY_MAGMA_CUBE_SQUISH_SMALL("MAGMACUBE_WALK2", "ENTITY_SMALL_MAGMACUBE_SQUISH"),
    ENTITY_MINECART_INSIDE("MINECART_INSIDE"),
    ENTITY_MINECART_RIDING("MINECART_BASE"),
    ENTITY_MOOSHROOM_SHEAR(),
    ENTITY_MULE_AMBIENT(),
    ENTITY_MULE_CHEST("ENTITY_MULE_AMBIENT"),
    ENTITY_MULE_DEATH("ENTITY_MULE_AMBIENT"),
    ENTITY_MULE_HURT("ENTITY_MULE_AMBIENT"),
    ENTITY_PAINTING_BREAK(),
    ENTITY_PAINTING_PLACE(),
    ENTITY_PARROT_AMBIENT(),
    ENTITY_PARROT_DEATH(),
    ENTITY_PARROT_EAT(),
    ENTITY_PARROT_FLY(),
    ENTITY_PARROT_HURT(),
    ENTITY_PARROT_IMITATE_BLAZE(),
    ENTITY_PARROT_IMITATE_CREEPER(),
    ENTITY_PARROT_IMITATE_DROWNED(),
    ENTITY_PARROT_IMITATE_ELDER_GUARDIAN(),
    ENTITY_PARROT_IMITATE_ENDERMAN(),
    ENTITY_PARROT_IMITATE_ENDERMITE(),
    ENTITY_PARROT_IMITATE_ENDER_DRAGON(),
    ENTITY_PARROT_IMITATE_EVOKER(),
    ENTITY_PARROT_IMITATE_GHAST(),
    ENTITY_PARROT_IMITATE_HUSK(),
    ENTITY_PARROT_IMITATE_ILLUSIONER(),
    ENTITY_PARROT_IMITATE_MAGMA_CUBE(),
    ENTITY_PARROT_IMITATE_PHANTOM(),
    ENTITY_PARROT_IMITATE_POLAR_BEAR(),
    ENTITY_PARROT_IMITATE_SHULKER(),
    ENTITY_PARROT_IMITATE_SILVERFISH(),
    ENTITY_PARROT_IMITATE_SKELETON(),
    ENTITY_PARROT_IMITATE_SLIME(),
    ENTITY_PARROT_IMITATE_SPIDER(),
    ENTITY_PARROT_IMITATE_STRAY(),
    ENTITY_PARROT_IMITATE_VEX(),
    ENTITY_PARROT_IMITATE_VINDICATOR(),
    ENTITY_PARROT_IMITATE_WITCH(),
    ENTITY_PARROT_IMITATE_WITHER(),
    ENTITY_PARROT_IMITATE_WITHER_SKELETON(),
    ENTITY_PARROT_IMITATE_WOLF(),
    ENTITY_PARROT_IMITATE_ZOMBIE(),
    ENTITY_PARROT_IMITATE_ZOMBIE_PIGMAN(),
    ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER(),
    ENTITY_PARROT_STEP(),
    ENTITY_PHANTOM_AMBIENT(),
    ENTITY_PHANTOM_BITE(),
    ENTITY_PHANTOM_DEATH(),
    ENTITY_PHANTOM_FLAP(),
    ENTITY_PHANTOM_HURT(),
    ENTITY_PHANTOM_SWOOP(),
    ENTITY_PIG_AMBIENT("PIG_IDLE"),
    ENTITY_PIG_DEATH("PIG_DEATH"),
    ENTITY_PIG_HURT(),
    ENTITY_PIG_SADDLE("ENTITY_PIG_HURT"),
    ENTITY_PIG_STEP("PIG_WALK"),
    ENTITY_PLAYER_ATTACK_CRIT(),
    ENTITY_PLAYER_ATTACK_KNOCKBACK(),
    ENTITY_PLAYER_ATTACK_NODAMAGE(),
    ENTITY_PLAYER_ATTACK_STRONG("SUCCESSFUL_HIT"),
    ENTITY_PLAYER_ATTACK_SWEEP(),
    ENTITY_PLAYER_ATTACK_WEAK(),
    ENTITY_PLAYER_BIG_FALL("FALL_BIG"),
    ENTITY_PLAYER_BREATH(),
    ENTITY_PLAYER_BURP("BURP"),
    ENTITY_PLAYER_DEATH(),
    ENTITY_PLAYER_HURT("HURT_FLESH"),
    ENTITY_PLAYER_HURT_DROWN(),
    ENTITY_PLAYER_HURT_ON_FIRE(),
    ENTITY_PLAYER_LEVELUP("LEVEL_UP"),
    ENTITY_PLAYER_SMALL_FALL("FALL_SMALL"),
    ENTITY_PLAYER_SPLASH("SLASH"),
    ENTITY_PLAYER_SPLASH_HIGH_SPEED("SPLASH"),
    ENTITY_PLAYER_SWIM("SWIM"),
    ENTITY_POLAR_BEAR_AMBIENT(),
    ENTITY_POLAR_BEAR_AMBIENT_BABY("ENTITY_POLAR_BEAR_BABY_AMBIENT"),
    ENTITY_POLAR_BEAR_DEATH(),
    ENTITY_POLAR_BEAR_HURT(),
    ENTITY_POLAR_BEAR_STEP(),
    ENTITY_POLAR_BEAR_WARNING(),
    ENTITY_PUFFER_FISH_AMBIENT(),
    ENTITY_PUFFER_FISH_BLOW_OUT(),
    ENTITY_PUFFER_FISH_BLOW_UP(),
    ENTITY_PUFFER_FISH_DEATH(),
    ENTITY_PUFFER_FISH_FLOP(),
    ENTITY_PUFFER_FISH_HURT(),
    ENTITY_PUFFER_FISH_STING(),
    ENTITY_RABBIT_AMBIENT(),
    ENTITY_RABBIT_ATTACK(),
    ENTITY_RABBIT_DEATH(),
    ENTITY_RABBIT_HURT(),
    ENTITY_RABBIT_JUMP(),
    ENTITY_SALMON_AMBIENT(),
    ENTITY_SALMON_DEATH(),
    ENTITY_SALMON_FLOP(),
    ENTITY_SALMON_HURT("ENTITY_SALMON_FLOP"),
    ENTITY_SHEEP_AMBIENT("SHEEP_IDLE"),
    ENTITY_SHEEP_DEATH(),
    ENTITY_SHEEP_HURT(),
    ENTITY_SHEEP_SHEAR("SHEEP_SHEAR"),
    ENTITY_SHEEP_STEP("SHEEP_WALK"),
    ENTITY_SHULKER_AMBIENT(),
    ENTITY_SHULKER_BULLET_HIT(),
    ENTITY_SHULKER_BULLET_HURT(),
    ENTITY_SHULKER_CLOSE(),
    ENTITY_SHULKER_DEATH(),
    ENTITY_SHULKER_HURT(),
    ENTITY_SHULKER_HURT_CLOSED(),
    ENTITY_SHULKER_OPEN(),
    ENTITY_SHULKER_SHOOT(),
    ENTITY_SHULKER_TELEPORT(),
    ENTITY_SILVERFISH_AMBIENT("SILVERFISH_IDLE"),
    ENTITY_SILVERFISH_DEATH("SILVERFISH_KILL"),
    ENTITY_SILVERFISH_HURT("SILVERFISH_HIT"),
    ENTITY_SILVERFISH_STEP("SILVERFISH_WALK"),
    ENTITY_SKELETON_AMBIENT("SKELETON_IDLE"),
    ENTITY_SKELETON_DEATH("SKELETON_DEATH"),
    ENTITY_SKELETON_HORSE_AMBIENT("HORSE_SKELETON_IDLE"),
    ENTITY_SKELETON_HORSE_AMBIENT_WATER(),
    ENTITY_SKELETON_HORSE_DEATH("HORSE_SKELETON_DEATH"),
    ENTITY_SKELETON_HORSE_GALLOP_WATER(),
    ENTITY_SKELETON_HORSE_HURT("HORSE_SKELETON_HIT"),
    ENTITY_SKELETON_HORSE_JUMP_WATER(),
    ENTITY_SKELETON_HORSE_STEP_WATER(),
    ENTITY_SKELETON_HORSE_SWIM(),
    ENTITY_SKELETON_HURT("SKELETON_HURT"),
    ENTITY_SKELETON_SHOOT(),
    ENTITY_SKELETON_STEP("SKELETON_WALK"),
    ENTITY_SLIME_ATTACK("SLIME_ATTACK"),
    ENTITY_SLIME_DEATH(),
    ENTITY_SLIME_DEATH_SMALL(),
    ENTITY_SLIME_HURT(),
    ENTITY_SLIME_HURT_SMALL("ENTITY_SMALL_SLIME_HURT"),
    ENTITY_SLIME_JUMP("SLIME_WALK"),
    ENTITY_SLIME_JUMP_SMALL("SLIME_WALK2", "ENTITY_SMALL_SLIME_SQUISH"),
    ENTITY_SLIME_SQUISH("SLIME_WALK2"),
    ENTITY_SLIME_SQUISH_SMALL("ENTITY_SMALL_SLIME_SQUISH"),
    ENTITY_SNOWBALL_THROW(),
    ENTITY_SNOW_GOLEM_AMBIENT("ENTITY_SNOWMAN_AMBIENT"),
    ENTITY_SNOW_GOLEM_DEATH("ENTITY_SNOWMAN_DEATH"),
    ENTITY_SNOW_GOLEM_HURT("ENTITY_SNOWMAN_HURT"),
    ENTITY_SNOW_GOLEM_SHOOT("ENTITY_SNOWMAN_SHOOT"),
    ENTITY_SPIDER_AMBIENT("SPIDER_IDLE"),
    ENTITY_SPIDER_DEATH("SPIDER_DEATH"),
    ENTITY_SPIDER_HURT(),
    ENTITY_SPIDER_STEP("SPIDER_WALK"),
    ENTITY_SPLASH_POTION_BREAK(),
    ENTITY_SPLASH_POTION_THROW(),
    ENTITY_SQUID_AMBIENT(),
    ENTITY_SQUID_DEATH(),
    ENTITY_SQUID_HURT(),
    ENTITY_SQUID_SQUIRT(),
    ENTITY_STRAY_AMBIENT(),
    ENTITY_STRAY_DEATH(),
    ENTITY_STRAY_HURT(),
    ENTITY_STRAY_STEP(),
    ENTITY_TNT_PRIMED("FUSE"),
    ENTITY_TROPICAL_FISH_AMBIENT(),
    ENTITY_TROPICAL_FISH_DEATH(),
    ENTITY_TROPICAL_FISH_FLOP("ENTITY_TROPICAL_FISH_DEATH"),
    ENTITY_TROPICAL_FISH_HURT(),
    ENTITY_TURTLE_AMBIENT_LAND(),
    ENTITY_TURTLE_DEATH(),
    ENTITY_TURTLE_DEATH_BABY(),
    ENTITY_TURTLE_EGG_BREAK(),
    ENTITY_TURTLE_EGG_CRACK(),
    ENTITY_TURTLE_EGG_HATCH(),
    ENTITY_TURTLE_HURT(),
    ENTITY_TURTLE_HURT_BABY(),
    ENTITY_TURTLE_LAY_EGG(),
    ENTITY_TURTLE_SHAMBLE(),
    ENTITY_TURTLE_SHAMBLE_BABY(),
    ENTITY_TURTLE_SWIM(),
    ENTITY_VEX_AMBIENT(),
    ENTITY_VEX_CHARGE(),
    ENTITY_VEX_DEATH(),
    ENTITY_VEX_HURT(),
    ENTITY_VILLAGER_AMBIENT("VILLAGER_IDLE"),
    ENTITY_VILLAGER_DEATH("VILLAGER_DEATH"),
    ENTITY_VILLAGER_HURT("VILLAGER_HIT"),
    ENTITY_VILLAGER_NO("VILLAGER_NO"),
    ENTITY_VILLAGER_TRADE("VILLAGER_HAGGLE", "ENTITY_VILLAGER_TRADING"),
    ENTITY_VILLAGER_YES("VILLAGER_YES"),
    ENTITY_VINDICATOR_AMBIENT("ENTITY_VINDICATION_ILLAGER_AMBIENT"),
    ENTITY_VINDICATOR_DEATH("ENTITY_VINDICATION_ILLAGER_DEATH"),
    ENTITY_VINDICATOR_HURT("ENTITY_VINDICATION_ILLAGER_HURT"),
    ENTITY_WITCH_AMBIENT(),
    ENTITY_WITCH_DEATH(),
    ENTITY_WITCH_DRINK(),
    ENTITY_WITCH_HURT(),
    ENTITY_WITCH_THROW(),
    ENTITY_WITHER_AMBIENT("WITHER_IDLE"),
    ENTITY_WITHER_BREAK_BLOCK(),
    ENTITY_WITHER_DEATH("WITHER_DEATH"),
    ENTITY_WITHER_HURT("WITHER_HURT"),
    ENTITY_WITHER_SHOOT("WITHER_SHOOT"),
    ENTITY_WITHER_SKELETON_AMBIENT(),
    ENTITY_WITHER_SKELETON_DEATH(),
    ENTITY_WITHER_SKELETON_HURT(),
    ENTITY_WITHER_SKELETON_STEP(),
    ENTITY_WITHER_SPAWN("WITHER_SPAWN"),
    ENTITY_WOLF_AMBIENT("WOLF_BARK"),
    ENTITY_WOLF_DEATH("WOLF_DEATH"),
    ENTITY_WOLF_GROWL("WOLF_GROWL"),
    ENTITY_WOLF_HOWL("WOLF_HOWL"),
    ENTITY_WOLF_HURT("WOLF_HURT"),
    ENTITY_WOLF_PANT("WOLF_PANT"),
    ENTITY_WOLF_SHAKE("WOLF_SHAKE"),
    ENTITY_WOLF_STEP("WOLF_WALK"),
    ENTITY_WOLF_WHINE("WOLF_WHINE"),
    ENTITY_ZOMBIE_AMBIENT("ZOMBIE_IDLE"),
    ENTITY_ZOMBIE_ATTACK_IRON_DOOR("ZOMBIE_METAL"),
    ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR("ZOMBIE_WOOD", "ENTITY_ZOMBIE_ATTACK_DOOR_WOOD"),
    ENTITY_ZOMBIE_BREAK_WOODEN_DOOR("ZOMBIE_WOODBREAK", "ENTITY_ZOMBIE_BREAK_DOOR_WOOD"),
    ENTITY_ZOMBIE_CONVERTED_TO_DROWNED(),
    ENTITY_ZOMBIE_DEATH("ZOMBIE_DEATH"),
    ENTITY_ZOMBIE_DESTROY_EGG(),
    ENTITY_ZOMBIE_HORSE_AMBIENT("HORSE_ZOMBIE_IDLE"),
    ENTITY_ZOMBIE_HORSE_DEATH("HORSE_ZOMBIE_DEATH"),
    ENTITY_ZOMBIE_HORSE_HURT("HORSE_ZOMBIE_HIT"),
    ENTITY_ZOMBIE_HURT("ZOMBIE_HURT"),
    ENTITY_ZOMBIE_INFECT("ZOMBIE_INFECT"),
    ENTITY_ZOMBIE_PIGMAN_AMBIENT("ZOMBIE_PIG_IDLE", "ENTITY_ZOMBIE_PIG_AMBIENT"),
    ENTITY_ZOMBIE_PIGMAN_ANGRY("ZOMBIE_PIG_ANGRY", "ENTITY_ZOMBIE_PIG_ANGRY"),
    ENTITY_ZOMBIE_PIGMAN_DEATH("ZOMBIE_PIG_DEATH", "ENTITY_ZOMBIE_PIG_DEATH"),
    ENTITY_ZOMBIE_PIGMAN_HURT("ZOMBIE_PIG_HURT", "ENTITY_ZOMBIE_PIG_HURT"),
    ENTITY_ZOMBIE_STEP("ZOMBIE_WALK"),
    ENTITY_ZOMBIE_VILLAGER_AMBIENT(),
    ENTITY_ZOMBIE_VILLAGER_CONVERTED("ZOMBIE_UNFECT"),
    ENTITY_ZOMBIE_VILLAGER_CURE("ZOMBIE_REMEDY"),
    ENTITY_ZOMBIE_VILLAGER_DEATH(),
    ENTITY_ZOMBIE_VILLAGER_HURT(),
    ENTITY_ZOMBIE_VILLAGER_STEP(),
    ITEM_ARMOR_EQUIP_CHAIN(),
    ITEM_ARMOR_EQUIP_DIAMOND(),
    ITEM_ARMOR_EQUIP_ELYTRA(),
    ITEM_ARMOR_EQUIP_GENERIC(),
    ITEM_ARMOR_EQUIP_GOLD(),
    ITEM_ARMOR_EQUIP_IRON(),
    ITEM_ARMOR_EQUIP_LEATHER(),
    ITEM_ARMOR_EQUIP_TURTLE(),
    ITEM_AXE_STRIP(),
    ITEM_BOTTLE_EMPTY(),
    ITEM_BOTTLE_FILL(),
    ITEM_BOTTLE_FILL_DRAGONBREATH(),
    ITEM_BUCKET_EMPTY(),
    ITEM_BUCKET_EMPTY_FISH(),
    ITEM_BUCKET_EMPTY_LAVA(),
    ITEM_BUCKET_FILL(),
    ITEM_BUCKET_FILL_FISH(),
    ITEM_BUCKET_FILL_LAVA(),
    ITEM_CHORUS_FRUIT_TELEPORT(),
    ITEM_ELYTRA_FLYING(),
    ITEM_FIRECHARGE_USE(),
    ITEM_FLINTANDSTEEL_USE("FIRE_IGNITE"),
    ITEM_HOE_TILL(),
    ITEM_SHIELD_BLOCK(),
    ITEM_SHIELD_BREAK(),
    ITEM_SHOVEL_FLATTEN(),
    ITEM_TOTEM_USE(),
    ITEM_TRIDENT_HIT(),
    ITEM_TRIDENT_HIT_GROUND(),
    ITEM_TRIDENT_RETURN(),
    ITEM_TRIDENT_RIPTIDE_1(),
    ITEM_TRIDENT_RIPTIDE_2("ITEM_TRIDENT_RIPTIDE_1"),
    ITEM_TRIDENT_RIPTIDE_3("ITEM_TRIDENT_RIPTIDE_1"),
    ITEM_TRIDENT_THROW(),
    ITEM_TRIDENT_THUNDER(),
    MUSIC_CREATIVE(),
    MUSIC_CREDITS(),
    MUSIC_DISC_11("RECORD_11"),
    MUSIC_DISC_13("RECORD_13"),
    MUSIC_DISC_BLOCKS("RECORD_BLOCKS"),
    MUSIC_DISC_CAT("RECORD_CAT"),
    MUSIC_DISC_CHIRP("RECORD_CHIRP"),
    MUSIC_DISC_FAR("RECORD_FAR"),
    MUSIC_DISC_MALL("RECORD_MALL"),
    MUSIC_DISC_MELLOHI("RECORD_MELLOHI"),
    MUSIC_DISC_STAL("RECORD_STAL"),
    MUSIC_DISC_STRAD("RECORD_STRAD"),
    MUSIC_DISC_WAIT("RECORD_WAIT"),
    MUSIC_DISC_WARD("RECORD_WARD"),
    MUSIC_DRAGON(),
    MUSIC_END(),
    MUSIC_GAME(),
    MUSIC_MENU(),
    MUSIC_NETHER(),
    MUSIC_UNDER_WATER(),
    UI_BUTTON_CLICK("CLICK"),
    UI_TOAST_CHALLENGE_COMPLETE(),
    UI_TOAST_IN(),
    UI_TOAST_OUT(),
    WEATHER_RAIN("AMBIENCE_RAIN"),
    WEATHER_RAIN_ABOVE();


    public static final XSound[] VALUES = XSound.values();
    private static final HashMap<XSound, Sound> CACHED_SEARCH = new HashMap<>();
    private final String[] legacy;

    XSound(String... legacy) {
        this.legacy = legacy;
    }

    /**
     * Attempts to build the string like an enum name.
     *
     * @param name the sound name to modify.
     * @return a Sound enum name.
     */
    @Nonnull
    private static String format(@Nonnull String name) {
        return StringUtils.replace(StringUtils.replace(name.toUpperCase(), "MINECRAFT:", ""), "-", "_").trim()
                .replaceAll("\\s+", "_").replaceAll("\\d+", "").replaceAll("\\W+", "");
    }

    /**
     * Checks if XSound enum contains a sound with this name.
     *
     * @param name name of the sound
     * @return true if XSound enum has this sound.
     */
    public static boolean contains(String name) {
        Validate.notEmpty(name, "Sound name cannot be null or empty");
        String formatted = format(name);
        return Arrays.stream(VALUES).anyMatch(s -> s.name().equals(formatted));
    }

    /**
     * Parses an {@link XSound} with the given argument.
     *
     * @param name the name of the sound.
     * @return a {@link XSound} object.
     */
    @Nullable
    public static XSound matchXSound(@Nonnull String name) {
        return Arrays.stream(VALUES).filter(s -> s.name().equals(format(name)) || s.matchAnyLegacy(name)).findFirst().orElse(null);
    }

    /**
     * Just an extra feature that loads sounds from strings.<br>
     * Useful for getting sounds from config files.<br>
     * <b>Format:</b> Sound, Volume, Pitch<br><br>
     *
     * <b>Usage Example:</b> ENTITY_PLAYER_BURP, 0.5, 1
     *
     * @param player the player to play the sound to.
     * @param sound  the string of the sound with volume and pitch (if needed).
     */
    public static void playSoundFromString(@Nonnull Player player, @Nonnull String sound) {
        Validate.notNull(player, "Player cannot be null");
        Validate.notEmpty(sound, "Sound string cannot be null or empty");
        String[] split = StringUtils.replace(sound, " ", "").split(",");
        if (split.length == 0)
            throw new IllegalArgumentException("Sound string must at least have a sound name and must be separated with comma: " + sound);

        try {
            String name = split[0];

            XSound xType = matchXSound(name);
            if (xType == null)
                throw new IllegalArgumentException("Invalid sound name: " + name);
            Sound type = xType.parseSound();

            float volume;
            if (split.length == 2) {
                volume = Float.parseFloat(split[1]);
            } else volume = 1f;
            float pitch;
            if (split.length == 3) {
                pitch = Float.parseFloat(split[2]);
            } else pitch = 0f;

            player.playSound(player.getLocation(), type, volume, pitch);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("There was a problem while getting a number for one of the sounds in config: " + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("There was a problem while getting a sound type in config: " + ex.getMessage());
        }
    }

    /**
     * Gets all the previous sound names used for this sound.
     *
     * @return a list of sound names.
     */
    @Nonnull
    public String[] getLegacy() {
        return legacy;
    }

    /**
     * Parses the XSound as a {@link Sound} based on the server version.
     *
     * @return a {@link Sound} object.
     */
    @Nullable
    public Sound parseSound() {
        Sound sound = CACHED_SEARCH.get(this);
        if (sound != null) return sound;

        try {
            sound = Sound.valueOf(this.name());
        } catch (IllegalArgumentException ignored) {
            for (String legacy : legacy) {
                try {
                    sound = Sound.valueOf(legacy);
                } catch (IllegalArgumentException ignore) {
                }
            }
        }

        // Put nulls too, because there's no point of parsing them again if it's going to give null.
        CACHED_SEARCH.put(this, sound);
        return sound;
    }

    /**
     * Checks if the given string matches any of this sound's legacy sound names.
     *
     * @param name the sound name to check
     * @return true if it's one of the legacy names.
     */
    public boolean matchAnyLegacy(@Nonnull String name) {
        name = format(name);
        return Arrays.asList(legacy).contains(name);
    }

    /**
     * @see #playSound(Player, float, float)
     */
    public void playSound(@Nonnull Player player) {
        playSound(player, 1f, 1f);
    }

    /**
     * Plays a sound to the player with the given volume and pitch.
     *
     * @param player the player to play the sound to
     * @param volume the volume of the sound, 1 is normal
     * @param pitch  the pitch of the sound, 0 is normal
     */
    public void playSound(@Nonnull Player player, float volume, float pitch) {
        Objects.requireNonNull(player, "Player cannot be null");
        if (player.isOnline())
            player.playSound(player.getLocation(), this.parseSound(), volume, pitch);
    }
}