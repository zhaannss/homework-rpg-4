package com.narxoz.rpg.enemy.combat;
public class MeteorStorm extends BaseAbility {
    public MeteorStorm() {
        super("Meteor Storm",
                150,
                "Ultimate: High AoE fire damage from the sky",
                AbilityType.ULTIMATE);
    }
    public MeteorStorm(MeteorStorm source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new MeteorStorm(this);
    }
}