package com.narxoz.rpg.hero.equipment;
public class HolyWand implements Weapon {
    private int damage;
    private String name;
    private String type;
    private String specialEffect;

    public HolyWand() {
        this.damage = 20;
        this.name = "HolyWand";
        this.type = "Wand";
        this.specialEffect = "When healing, it also gives a buff to the heroes' abilities.";
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