@file:Suppress("MemberVisibilityCanBePrivate")

package thedarkcolour.futuremc.registry

import net.minecraft.block.SoundType
import net.minecraft.util.ResourceLocation
import net.minecraft.util.SoundEvent
import net.minecraftforge.registries.IForgeRegistry
import thedarkcolour.futuremc.FutureMC

object FSounds {
    val BLOCK_NETHERITE_BREAK = soundEvent("netherite_block_break")
    val BLOCK_NETHERITE_STEP = soundEvent("netherite_block_step")
    val BLOCK_NETHERITE_PLACE = soundEvent("netherite_block_place")
    val BLOCK_NETHERITE_HIT = soundEvent("netherite_block_hit")
    val BLOCK_NETHERITE_FALL = soundEvent("netherite_block_fall")
    val BLOCK_ANCIENT_DEBRIS_BREAK = soundEvent("ancient_debris_break")
    val BLOCK_ANCIENT_DEBRIS_STEP = soundEvent("ancient_debris_step")
    val BLOCK_ANCIENT_DEBRIS_PLACE = soundEvent("ancient_debris_place")
    val BLOCK_ANCIENT_DEBRIS_HIT = soundEvent("ancient_debris_hit")
    val BLOCK_ANCIENT_DEBRIS_FALL = soundEvent("ancient_debris_fall")
    val BLOCK_SOUL_SOIL_BREAK = soundEvent("soul_soil_break")
    val BLOCK_SOUL_SOIL_STEP = soundEvent("soul_soil_step")
    val BLOCK_SOUL_SOIL_PLACE = soundEvent("soul_soil_place")
    val BLOCK_SOUL_SOIL_HIT = soundEvent("soul_soil_hit")
    val BLOCK_SOUL_SOIL_FALL = soundEvent("soul_soil_fall")
    val BLOCK_NYLIUM_BREAK = soundEvent("nylium_break")
    val BLOCK_NYLIUM_STEP = soundEvent("nylium_step")
    val BLOCK_NYLIUM_PLACE = soundEvent("nylium_place")
    val BLOCK_NYLIUM_HIT = soundEvent("nylium_hit")
    val BLOCK_NYLIUM_FALL = soundEvent("nylium_fall")
    val BLOCK_NETHER_STEM_BREAK = soundEvent("nether_stem_break")
    val BLOCK_NETHER_STEM_STEP = soundEvent("nether_stem_step")
    val BLOCK_NETHER_STEM_PLACE = soundEvent("nether_stem_place")
    val BLOCK_NETHER_STEM_HIT = soundEvent("nether_stem_hit")
    val BLOCK_NETHER_STEM_FALL = soundEvent("nether_stem_fall")
    val BLOCK_NETHER_SPROUTS_BREAK = soundEvent("nether_sprouts_break")
    val BLOCK_NETHER_SPROUTS_STEP = soundEvent("nether_sprouts_step")
    val BLOCK_NETHER_SPROUTS_PLACE = soundEvent("nether_sprouts_place")
    val BLOCK_NETHER_SPROUTS_HIT = soundEvent("nether_sprouts_hit")
    val BLOCK_NETHER_SPROUTS_FALL = soundEvent("nether_sprouts_fall")
    val BLOCK_FUNGUS_BREAK = soundEvent("fungus_break")
    val BLOCK_FUNGUS_STEP = soundEvent("fungus_step")
    val BLOCK_FUNGUS_PLACE = soundEvent("fungus_place")
    val BLOCK_FUNGUS_HIT = soundEvent("fungus_hit")
    val BLOCK_FUNGUS_FALL = soundEvent("fungus_fall")
    val BLOCK_BASALT_BREAK = soundEvent("basalt_break")
    val BLOCK_BASALT_STEP = soundEvent("basalt_step")
    val BLOCK_BASALT_PLACE = soundEvent("basalt_place")
    val BLOCK_BASALT_HIT = soundEvent("basalt_hit")
    val BLOCK_BASALT_FALL = soundEvent("basalt_fall")
    val BLOCK_WEEPING_VINES_BREAK = soundEvent("weeping_vines_break")
    val BLOCK_WEEPING_VINES_STEP = soundEvent("weeping_vines_step")
    val BLOCK_WEEPING_VINES_PLACE = soundEvent("weeping_vines_place")
    val BLOCK_WEEPING_VINES_HIT = soundEvent("weeping_vines_hit")
    val BLOCK_WEEPING_VINES_FALL = soundEvent("weeping_vines_fall")
    val BLOCK_SHROOMLIGHT_BREAK = soundEvent("shroomlight_break")
    val BLOCK_SHROOMLIGHT_STEP = soundEvent("shroomlight_step")
    val BLOCK_SHROOMLIGHT_PLACE = soundEvent("shroomlight_place")
    val BLOCK_SHROOMLIGHT_HIT = soundEvent("shroomlight_hit")
    val BLOCK_SHROOMLIGHT_FALL = soundEvent("shroomlight_fall")
    val BLOCK_ROOTS_BREAK = soundEvent("roots_break")
    val BLOCK_ROOTS_STEP = soundEvent("roots_step")
    val BLOCK_ROOTS_PLACE = soundEvent("roots_place")
    val BLOCK_ROOTS_HIT = soundEvent("roots_hit")
    val BLOCK_ROOTS_FALL = soundEvent("roots_fall")

    val BLOCK_SMITHING_TABLE_USE = soundEvent("smithing_table_use")
    val ITEM_ARMOR_EQUIP_NETHERITE = soundEvent("equip_netherite")

    val NETHERITE = SoundType(1.0f, 1.0f, BLOCK_NETHERITE_BREAK, BLOCK_NETHERITE_STEP, BLOCK_NETHERITE_PLACE, BLOCK_NETHERITE_HIT, BLOCK_NETHERITE_FALL)
    val ANCIENT_DEBRIS = SoundType(1.0f, 1.0f, BLOCK_ANCIENT_DEBRIS_BREAK, BLOCK_ANCIENT_DEBRIS_STEP, BLOCK_ANCIENT_DEBRIS_PLACE, BLOCK_ANCIENT_DEBRIS_HIT, BLOCK_ANCIENT_DEBRIS_FALL)
    val SOUL_SOIL = SoundType(1.0f, 1.0f, BLOCK_SOUL_SOIL_BREAK, BLOCK_SOUL_SOIL_STEP, BLOCK_SOUL_SOIL_PLACE, BLOCK_SOUL_SOIL_HIT, BLOCK_SOUL_SOIL_FALL)
    val NYLIUM = SoundType(1.0f, 1.0f, BLOCK_NYLIUM_BREAK, BLOCK_NYLIUM_STEP, BLOCK_NYLIUM_PLACE, BLOCK_NYLIUM_HIT, BLOCK_NYLIUM_FALL)
    val NETHER_STEM = SoundType(1.0f, 1.0f, BLOCK_NETHER_STEM_BREAK, BLOCK_NETHER_STEM_STEP, BLOCK_NETHER_STEM_PLACE, BLOCK_NETHER_STEM_HIT, BLOCK_NETHER_STEM_FALL)
    val NETHER_SPROUTS = SoundType(1.0f, 1.0f, BLOCK_NETHER_SPROUTS_BREAK, BLOCK_NETHER_SPROUTS_STEP, BLOCK_NETHER_SPROUTS_PLACE, BLOCK_NETHER_SPROUTS_HIT, BLOCK_NETHER_SPROUTS_FALL)
    val FUNGUS = SoundType(1.0f, 1.0f, BLOCK_FUNGUS_BREAK, BLOCK_FUNGUS_STEP, BLOCK_FUNGUS_PLACE, BLOCK_FUNGUS_HIT, BLOCK_FUNGUS_FALL)
    val BASALT = SoundType(1.0f, 1.0f, BLOCK_BASALT_BREAK, BLOCK_BASALT_STEP, BLOCK_BASALT_PLACE, BLOCK_BASALT_HIT, BLOCK_BASALT_FALL)
    val WEEPING_VINES = SoundType(1.0f, 1.0f, BLOCK_WEEPING_VINES_BREAK, BLOCK_WEEPING_VINES_STEP, BLOCK_WEEPING_VINES_PLACE, BLOCK_WEEPING_VINES_HIT, BLOCK_WEEPING_VINES_FALL)
    val SHROOMLIGHT = SoundType(1.0f, 1.0f, BLOCK_SHROOMLIGHT_BREAK, BLOCK_SHROOMLIGHT_STEP, BLOCK_SHROOMLIGHT_PLACE, BLOCK_SHROOMLIGHT_HIT, BLOCK_SHROOMLIGHT_FALL)
    val ROOTS = SoundType(1.0f, 1.0f, BLOCK_ROOTS_BREAK, BLOCK_ROOTS_STEP, BLOCK_ROOTS_PLACE, BLOCK_ROOTS_HIT, BLOCK_ROOTS_FALL)

    private fun soundEvent(name: String): SoundEvent {
        val registryName = ResourceLocation(FutureMC.ID, name)
        return SoundEvent(registryName).setRegistryName(registryName)
    }

    fun registerSounds(sounds: IForgeRegistry<SoundEvent>) {
        sounds.register(BLOCK_NETHERITE_BREAK)
        sounds.register(BLOCK_NETHERITE_STEP)
        sounds.register(BLOCK_NETHERITE_PLACE)
        sounds.register(BLOCK_NETHERITE_HIT)
        sounds.register(BLOCK_NETHERITE_FALL)
        sounds.register(BLOCK_ANCIENT_DEBRIS_BREAK)
        sounds.register(BLOCK_ANCIENT_DEBRIS_STEP)
        sounds.register(BLOCK_ANCIENT_DEBRIS_PLACE)
        sounds.register(BLOCK_ANCIENT_DEBRIS_HIT)
        sounds.register(BLOCK_ANCIENT_DEBRIS_FALL)
        sounds.register(BLOCK_SOUL_SOIL_BREAK)
        sounds.register(BLOCK_SOUL_SOIL_STEP)
        sounds.register(BLOCK_SOUL_SOIL_PLACE)
        sounds.register(BLOCK_SOUL_SOIL_HIT)
        sounds.register(BLOCK_SOUL_SOIL_FALL)
        sounds.register(BLOCK_NYLIUM_BREAK)
        sounds.register(BLOCK_NYLIUM_STEP)
        sounds.register(BLOCK_NYLIUM_PLACE)
        sounds.register(BLOCK_NYLIUM_HIT)
        sounds.register(BLOCK_NYLIUM_FALL)
        sounds.register(BLOCK_NETHER_STEM_BREAK)
        sounds.register(BLOCK_NETHER_STEM_STEP)
        sounds.register(BLOCK_NETHER_STEM_PLACE)
        sounds.register(BLOCK_NETHER_STEM_HIT)
        sounds.register(BLOCK_NETHER_STEM_FALL)
        sounds.register(BLOCK_NETHER_SPROUTS_BREAK)
        sounds.register(BLOCK_NETHER_SPROUTS_STEP)
        sounds.register(BLOCK_NETHER_SPROUTS_PLACE)
        sounds.register(BLOCK_NETHER_SPROUTS_HIT)
        sounds.register(BLOCK_NETHER_SPROUTS_FALL)
        sounds.register(BLOCK_FUNGUS_BREAK)
        sounds.register(BLOCK_FUNGUS_STEP)
        sounds.register(BLOCK_FUNGUS_PLACE)
        sounds.register(BLOCK_FUNGUS_HIT)
        sounds.register(BLOCK_FUNGUS_FALL)
        sounds.register(BLOCK_BASALT_BREAK)
        sounds.register(BLOCK_BASALT_STEP)
        sounds.register(BLOCK_BASALT_PLACE)
        sounds.register(BLOCK_BASALT_HIT)
        sounds.register(BLOCK_BASALT_FALL)
        sounds.register(BLOCK_WEEPING_VINES_BREAK)
        sounds.register(BLOCK_WEEPING_VINES_STEP)
        sounds.register(BLOCK_WEEPING_VINES_PLACE)
        sounds.register(BLOCK_WEEPING_VINES_HIT)
        sounds.register(BLOCK_WEEPING_VINES_FALL)
        sounds.register(BLOCK_SHROOMLIGHT_BREAK)
        sounds.register(BLOCK_SHROOMLIGHT_STEP)
        sounds.register(BLOCK_SHROOMLIGHT_PLACE)
        sounds.register(BLOCK_SHROOMLIGHT_HIT)
        sounds.register(BLOCK_SHROOMLIGHT_FALL)

        sounds.register(BLOCK_SMITHING_TABLE_USE)
        sounds.register(ITEM_ARMOR_EQUIP_NETHERITE)
    }
}