package me.esmaybe.mtdrugs;

import me.esmaybe.mtdrugs.managers.DrugManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MTDrugs extends JavaPlugin {

    private DrugManager drugManager;

    @Override
    public void onEnable() {
        drugManager = new DrugManager(this);
        saveDefaultConfig();
    }
}
