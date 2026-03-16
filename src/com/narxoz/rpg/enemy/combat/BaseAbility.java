package com.narxoz.rpg.enemy.combat;
public abstract class BaseAbility implements Ability {
    protected String name;
    protected int damage;
    protected String description;
    protected AbilityType type;
    public BaseAbility(String name, int damage, String description, AbilityType type) {
        this.name = name;
        this.damage = damage;
        this.description = description;
        this.type = type;
    }
    public BaseAbility(BaseAbility source) {
        this.name = source.name;
        this.damage = source.damage;
        this.description = source.description;
        this.type = source.type;
    }
    @Override public String getName() { return name; }
    @Override public int getDamage() { return damage; }
    @Override public String getDescription() { return description; }
    @Override public AbilityType getType() { return type; }

    @Override
    public abstract Ability clone();
}