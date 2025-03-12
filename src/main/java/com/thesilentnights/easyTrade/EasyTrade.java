package com.thesilentnights.easyTrade;

import com.thesilentnights.easyTrade.utils.moduleLoader.ModuleLoader;
import com.thesilentnights.easyTrade.utils.moduleLoader.impl.ModuleLoaderImpl;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasyTrade extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        ModuleLoaderImpl.getInstance().load(getServer(), this);

    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
