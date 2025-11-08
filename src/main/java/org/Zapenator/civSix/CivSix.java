package org.Zapenator.civSix;

import org.Zapenator.civSix.game.GameManager;
import org.Zapenator.civSix.game.map.GameMap;
import org.bukkit.plugin.java.JavaPlugin;

public final class CivSix extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        GameManager gm = new GameManager(new GameMap());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
