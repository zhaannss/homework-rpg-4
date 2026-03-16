package com.narxoz.rpg.enemy.combat;
public class FrostBreath extends BaseAbility {
    public FrostBreath() {
        super("Frost Breath",
                40,
                "Ice damage + slow effect",
                AbilityType.DAMAGE);
    }
    public FrostBreath(FrostBreath source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new FrostBreath(this);
    }
}