package com.narxoz.rpg.enemy.builder;

import com.narxoz.rpg.enemy.enemy.BossEnemy;
import com.narxoz.rpg.enemy.enemy.Enemy;

import java.util.HashMap;
import java.util.Map;
public class BossEnemyBuilder extends SimpleEnemyBuilder {
    private final Map<Integer, Integer> phases = new HashMap<>();
    @Override
    public EnemyBuilder addPhase(int phaseNumber, int healthThreshold) {
        this.phases.put(phaseNumber, healthThreshold);
        return this;
    }
    // FACTORY METHOD: build() creates the product.
    @Override
    public Enemy build() {
        if (this.name == null || this.name.trim().isEmpty()) {
            throw new IllegalStateException("Validation Error: Boss name is required.");
        }
        if (this.health < 1000) { // Example: Bosses must be strong
            throw new IllegalStateException("Validation Error: Boss health must be at least 1000.");
        }
        if (this.phases == null || this.phases.isEmpty()) {
            throw new IllegalStateException("Validation Error: Boss must have at least one combat phase defined.");
        }
        return new BossEnemy(name, health, damage, defense, speed, abilities, lootTable, phases);
    }
}