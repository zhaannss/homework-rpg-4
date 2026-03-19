package com.narxoz.rpg.enemy.combat;
public class DarkNova extends BaseAbility {
    public DarkNova() {
        super("Dark Nova",
                100,
                "Ultimate: Powerful AoE shadow explosion",
                AbilityType.ULTIMATE);
    }
    public DarkNova(DarkNova source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new DarkNova(this);
    }
}