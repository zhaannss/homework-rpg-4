package com.narxoz.rpg.enemy.builder;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.enemy.Enemy;
import com.narxoz.rpg.enemy.enemy.SimpleEnemy;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.ArrayList;
import java.util.List;
public class SimpleEnemyBuilder implements EnemyBuilder {
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected int speed;
    protected String element;
    protected String aiBehavior;
    protected List<Ability> abilities = new ArrayList<>();
    protected LootTable lootTable;
    @Override
    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public EnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }
    @Override
    public EnemyBuilder setElement(String element) {
        this.element = element;
        return this;
    }

    @Override
    public EnemyBuilder setAI(String aiBehavior) {
        this.aiBehavior = aiBehavior;
        return this;
    }

    @Override
    public EnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public EnemyBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    @Override
    public EnemyBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public EnemyBuilder addAbility(Ability ability) {
        this.abilities.add(ability);
        return this;
    }

    @Override
    public EnemyBuilder setAbilities(List<Ability> abilities) {
        this.abilities = new ArrayList<>(abilities);
        return this;
    }

    @Override
    public EnemyBuilder setLootTable(LootTable loot) {
        this.lootTable = loot;
        return this;
    }

    @Override
    public EnemyBuilder addPhase(int phaseNumber, int healthThreshold) {
        // У обычных врагов фаз нет
        return this;
    }
    // FACTORY METHOD: build() creates the product.
    @Override
    public Enemy build() {
        if (this.name == null || this.name.trim().isEmpty()) {
            throw new IllegalStateException("Validation Error: Enemy name cannot be null or empty.");
        }

        if (this.health <= 0) {
            throw new IllegalStateException("Validation Error: Enemy health must be positive. Current value: " + health);
        }

        if (this.damage < 0) {
            throw new IllegalStateException("Validation Error: Enemy damage cannot be negative.");
        }

        if (this.lootTable == null) {
            throw new IllegalStateException("Validation Error: Loot table must be set for the enemy.");
        }
        return new SimpleEnemy(name, health, damage, defense, speed, abilities, lootTable);
    }
}