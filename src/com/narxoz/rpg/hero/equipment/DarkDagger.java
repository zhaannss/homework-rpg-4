package com.narxoz.rpg.hero.equipment;
public class DarkDagger implements Weapon {
    private int damage;
    private String name;
    private String type;
    private String specialEffect;

    public DarkDagger() {
        this.damage = 15;
        this.name = "DarkDagger";
        this.type = "Dagger";
        this.specialEffect = " When used, it can leave a mark on the enemy that will consume his HP.";
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