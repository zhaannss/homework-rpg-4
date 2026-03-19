package com.narxoz.rpg.enemy.combat;
public class VenomousBite extends BaseAbility {
    public VenomousBite() {
        super("Venomous Bite",
                40,
                "Injects toxins: immediate damage + slow",
                AbilityType.DAMAGE);
    }
    public VenomousBite(VenomousBite source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new VenomousBite(this);
    }
}