package kr.r1atndud.events

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinEvent : Listener {

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        val p = e.player

        e.joinMessage(Component.text("${p.name} JOIN").color(NamedTextColor.YELLOW))
    }
}