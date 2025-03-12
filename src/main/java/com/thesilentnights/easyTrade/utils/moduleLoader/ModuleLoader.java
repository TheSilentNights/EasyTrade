package com.thesilentnights.easyTrade.utils.moduleLoader;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

public interface ModuleLoader
{
    public boolean load(Server server, Plugin plugin);
}
