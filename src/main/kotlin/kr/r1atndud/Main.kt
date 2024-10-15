package kr.r1atndud

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        logger.info("플러그인 활성화")

        server.pluginManager.apply {

        }
    }


}