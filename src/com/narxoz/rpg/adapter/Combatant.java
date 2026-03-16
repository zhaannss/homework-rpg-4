package com.narxoz.rpg.adapter;

public interface Combatant {
    String getName();
    int getAttackPower();
    void takeDamage(int amount);
    boolean isAlive();
}