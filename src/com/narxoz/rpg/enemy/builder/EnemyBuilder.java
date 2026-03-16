package com.narxoz.rpg.enemy.builder;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.enemy.Enemy;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.List;
public interface EnemyBuilder {
    EnemyBuilder setName(String name);
    EnemyBuilder setHealth(int health);
    EnemyBuilder setDamage(int damage);
    EnemyBuilder setDefense(int defense);
    EnemyBuilder setSpeed(int speed);
    EnemyBuilder setElement(String element);
    EnemyBuilder addAbility(Ability ability);
    EnemyBuilder setAbilities(List<Ability> abilities);
    EnemyBuilder addPhase(int phaseNumber, int healthThreshold);
    EnemyBuilder setLootTable(LootTable loot);
    EnemyBuilder setAI(String aiBehavior);
    Enemy build();
}