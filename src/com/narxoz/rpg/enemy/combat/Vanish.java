package com.narxoz.rpg.enemy.combat;
public class Vanish extends BaseAbility {
    public Vanish() {
        super("Vanish",
                0,
                "Disappear into shadows, becoming untargetable",
                AbilityType.DEFENSIVE);
    }
    public Vanish(Vanish source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new Vanish(this);
    }
}