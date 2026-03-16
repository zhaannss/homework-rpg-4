package com.narxoz.rpg.enemy.enemy;

import com.narxoz.rpg.enemy.combat.Ability;

import java.util.List;

public interface Enemy {
        String getName();
        int getHealth();
        int getDamage();          // added for HW3
        List<Ability> getAbilities();

        void setName(String name);
        void setHealth(int health);
        void addAbility(Ability ability);
        void multiplyStats(double multiplier);

        // ── Added for HW3 ──
        void applyDamage(int amount);
        boolean isDefeated();
        // ───────────────────

        void displayInfo();
        Enemy clone();
}