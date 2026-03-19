package com.narxoz.rpg.enemy.combat;
public interface Ability  {
    String getName();
    int getDamage();
    String getDescription();
    AbilityType getType();
    Ability clone();
}

