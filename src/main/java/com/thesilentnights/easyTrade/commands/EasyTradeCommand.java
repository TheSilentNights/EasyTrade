package com.thesilentnights.easyTrade.commands;

import org.bukkit.Server;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public interface EasyTradeCommand extends CommandExecutor, TabCompleter
{
    public void register(Server server, JavaPlugin plugin);
}
