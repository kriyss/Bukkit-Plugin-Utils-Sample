package org.nylmod.economy;

import org.bukkit.plugin.java.JavaPlugin;
import org.kriyss.bukkit.utils.annotations.Plugin;

/**
* @author kriyss
* Main class for Math plugin
*/
@Plugin(version ="0.1")
public class Math extends JavaPlugin {
    public static Math PLUGIN;
    @Override
    public void onEnable() {
        super.onEnable();
        PLUGIN = this;
    }
}
