package com.narxoz.rpg.enemy.combat;
public class Blizzard extends BaseAbility {
    public Blizzard() {
        super("Blizzard",
                120,
                "Ultimate: Massive AoE ice damage + freeze effect",
                AbilityType.ULTIMATE);
    }
    public Blizzard(Blizzard source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new Blizzard(this);
    }
}