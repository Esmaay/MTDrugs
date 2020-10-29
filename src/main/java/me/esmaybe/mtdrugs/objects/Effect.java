package me.esmaybe.mtdrugs.objects;

import org.bukkit.potion.PotionEffectType;

public class Effect {

    private PotionEffectType potionEffectType;
    private int level;
    private int duration;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public PotionEffectType getPotionEffectType() {
        return potionEffectType;
    }

    public void setPotionEffectType(PotionEffectType potionEffectType) {
        this.potionEffectType = potionEffectType;
    }

    public Effect(PotionEffectType potionEffectType, int level, int duration) {
        this.potionEffectType = potionEffectType;
        this.level = level;
        this.duration = duration;
    }

}
