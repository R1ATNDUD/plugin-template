package kr.r1atndud

import kr.r1atndud.events.JoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    companion object { lateinit var instance: Main }

    override fun onEnable() {
        logger.info("플러그인 활성화")

        instance = this

        server.pluginManager.apply {
            registerEvents(JoinEvent(), this@Main)
        }
    }


}