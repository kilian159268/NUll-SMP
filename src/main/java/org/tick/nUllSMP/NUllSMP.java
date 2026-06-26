package org.tick.nUllSMP;

import org.bukkit.plugin.java.JavaPlugin;
import org.tick.nUllSMP.commands.MainCommand;

import java.io.File;

public final class NUllSMP extends JavaPlugin {

    private static NUllSMP plugin;

    String consolePrefix = "[Null-SMP] ";

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;



        System.out.println(consolePrefix + "Null-SMP Plugin has been enabled!");

        getCommand("null-smp").setExecutor(new MainCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println(consolePrefix + "Null-SMP Plugin has been disabled!");

    }

    public static NUllSMP getPlugin() {
        return plugin;
    }
}