@file:JvmName("Init")
@file:Suppress("MemberVisibilityCanBePrivate", "UNCHECKED_CAST")

package thedarkcolour.futuremc.registry

import net.minecraft.tileentity.TileEntity
import net.minecraftforge.registries.IForgeRegistry
import net.minecraftforge.registries.IForgeRegistryEntry

operator fun <T : IForgeRegistryEntry<T>> IForgeRegistry<T>.invoke(t: T, enabled: Boolean): T {
    if (enabled) {
        register(t)
    }
    return t
}

operator fun <T : IForgeRegistryEntry<T>, S : T> IForgeRegistry<T>.invoke(
    t: S,
    enabled: Boolean,
    specialRegistryHandling: (S) -> Unit
): T {
    if (enabled) {
        register(t)
        specialRegistryHandling(t)
    }
    return t
}

operator fun <T : IForgeRegistryEntry<T>> IForgeRegistry<T>.invoke(t: T): T {
    register(t)
    return t
}

fun registerTE(name: String, clazz: Class<out TileEntity>, enabled: Boolean) {
    if (enabled) {
        TileEntity.register(name, clazz)
    }
}