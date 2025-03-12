package com.thesilentnights.easyTrade.utils.moduleLoader.impl;

import com.thesilentnights.easyTrade.commands.Debug;
import com.thesilentnights.easyTrade.commands.EasyTradeCommand;
import com.thesilentnights.easyTrade.utils.moduleLoader.ModuleLoader;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

import java.util.*;

public class ModuleLoaderImpl implements ModuleLoader {
    private static final ModuleLoader instance = new ModuleLoaderImpl();

    @Override
    public boolean load(Server server, Plugin plugin) {
        List<EasyTradeCommand> commands = List.of(
                new Debug()
        );
        return true;
    }

    public static ModuleLoader getInstance() {
        return instance;
    }
}
