package org.tick.nUllSMP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MainCommand implements CommandExecutor, TabCompleter {

    String mainPrefix = "§8[§f§lNull-SMP§8]§r ";


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {


        if (!(sender instanceof Player player)) {

            sender.sendMessage(mainPrefix + "§7This command is not send by a Player!");
            return true;

        }


        if (args.length == 0) {
            player.sendMessage(mainPrefix + "§7Please Use /null-smp help for more info!");
            return true;
        }

        if (args[0].equalsIgnoreCase("help")) {
            player.sendMessage(ChatColor.DARK_GRAY + "§l----------" + ChatColor.GRAY + "§l[Null-SMP-Help]" + ChatColor.DARK_GRAY + "§l----------");
            player.sendMessage(ChatColor.GRAY + "- /null-smp help | To open this page.");
            player.sendMessage(ChatColor.DARK_GRAY + "§l---------------------------------");
            return true;
        }



        player.sendMessage(mainPrefix + "§7Wrong Argument please Use /null-smp help for more info!");

        return true;
    }


    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {

        ArrayList<String> list = new ArrayList<>();

        if (args.length == 0 ) return list;

        if (args.length == 1) {

            list.add("help");

        }


        return list;
    }
}
