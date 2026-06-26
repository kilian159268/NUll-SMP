package org.tick.nUllSMP;

import org.bukkit.plugin.java.JavaPlugin;

public final class NUllSMP extends JavaPlugin {

    String consolePrefix = "[Null-SMP] ";

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println(consolePrefix + "Null-SMP Plugin has been enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println(consolePrefix + "Null-SMP Plugin has been disabled!");

    }
}