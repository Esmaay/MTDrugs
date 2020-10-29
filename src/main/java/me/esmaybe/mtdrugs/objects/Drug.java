package me.esmaybe.mtdrugs.objects;

import org.bukkit.Material;

import java.util.List;

public class Drug {

    private String name;
    private Material item;
    private List<Effect> effects;
    private long cooldown;

    public Drug(String name, Material item, List<Effect> effects, long cooldown) {
        this.name = name;
        this.item = item;
        this.effects = effects;
        this.cooldown = cooldown;
    }

    public long getCooldown() {
        return cooldown;
    }

    public void setCooldown(long cooldown) {
        this.cooldown = cooldown;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    public Material getItem() {
        return item;
    }

    public void setItem(Material item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
