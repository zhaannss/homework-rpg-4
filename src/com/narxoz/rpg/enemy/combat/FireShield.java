package com.narxoz.rpg.enemy.combat;
public class FireShield extends BaseAbility {
    public FireShield() {
        super("Fire Shield",
                10,
                "Defensive buff that burns attackers",
                AbilityType.DEFENSIVE);
    }
    public FireShield(FireShield source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new FireShield(this);
    }
}