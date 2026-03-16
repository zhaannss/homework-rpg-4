package com.narxoz.rpg.enemy.combat;
public class ShadowStrike extends BaseAbility {
    public ShadowStrike() {
        super("Shadow Strike",
                70,
                "High single-target damage + blind",
                AbilityType.DAMAGE);
    }
    public ShadowStrike(ShadowStrike source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new ShadowStrike(this);
    }
}