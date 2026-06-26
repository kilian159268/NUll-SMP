package org.tick.nUllSMP;

import org.bukkit.plugin.java.JavaPlugin;
import org.tick.nUllSMP.commands.MainCommand;

public final class NUllSMP extends JavaPlugin {

    String consolePrefix = "[Null-SMP] ";

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println(consolePrefix + "Null-SMP Plugin has been enabled!");

        getCommand("null-smp").setExecutor(new MainCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println(consolePrefix + "Null-SMP Plugin has been disabled!");

    }
}