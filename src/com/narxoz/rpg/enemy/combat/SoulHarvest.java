package com.narxoz.rpg.enemy.combat;
public class SoulHarvest extends BaseAbility {
    public SoulHarvest() {
        super("Soul Harvest",
                130,
                "Ultimate: Rips the soul and heals the caster",
                AbilityType.ULTIMATE);
    }
    public SoulHarvest(SoulHarvest source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new SoulHarvest(this);
    }
}