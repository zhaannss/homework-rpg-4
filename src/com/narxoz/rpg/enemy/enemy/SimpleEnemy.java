package com.narxoz.rpg.enemy.enemy;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.List;

public class SimpleEnemy extends BaseEnemy {
    public SimpleEnemy(String name, int health, int damage, int defense, int speed,
                       List<Ability> abilities, LootTable lootTable) {
        super(name, health, damage, defense, speed, abilities, lootTable);
    }
    @Override
    protected Enemy createClone(String name, int health, int damage, int defense, int speed,
                                List<Ability> abilities, LootTable lootTable) {
        return new SimpleEnemy(name, health, damage, defense, speed, abilities, lootTable);
    }

}
