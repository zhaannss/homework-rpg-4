package com.narxoz.rpg.adapter;

import com.narxoz.rpg.hero.character.BaseCh;

public class HeroCombatantAdapter implements Combatant {
    private final BaseCh hero;

    public HeroCombatantAdapter(BaseCh hero) {
        this.hero = hero;
    }

    @Override
    public String getName() {
        return hero.getName();
    }

    @Override
    public int getAttackPower() {
        return hero.getStrength();  // strength = attack power
    }

    @Override
    public void takeDamage(int amount) {
        hero.receiveDamage(amount);
    }

    @Override
    public boolean isAlive() {
        return hero.isAlive();
    }
}