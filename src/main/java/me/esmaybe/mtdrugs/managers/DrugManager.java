package me.esmaybe.mtdrugs.managers;

import me.esmaybe.mtdrugs.MTDrugs;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DrugManager {

    private final MTDrugs mtDrugs;

    public DrugManager(MTDrugs mtDrugs) {
        this.mtDrugs = mtDrugs;
        loadDrugs();
    }

    private void loadDrugs() {
        if (mtDrugs.getConfig().getConfigurationSection("drugs") == null) return;
        for (String drug : mtDrugs.getConfig().getConfigurationSection("drugs").getKeys(false)) {
            // TODO: Register drugs
        }
    }

}
