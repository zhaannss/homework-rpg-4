package com.narxoz.rpg.hero.equipment;
public class Elvenbow implements Weapon {
    private int damage;
    private String name;
    private String type;
    private String specialEffect;

    public Elvenbow() {
        this.damage = 20;
        this.name = "Elven Bow";
        this.type = "Bow";
        this.specialEffect = "Tracks down an enemy using their mana";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public String getWeaponInfo() {
        return name +
                " (Type: " + type +
                ", Damage: " + damage +
                ", Effect: " + specialEffect + ")";
    }
    @Override
    public String getSpecialEffect() {
        return specialEffect;
    }
}