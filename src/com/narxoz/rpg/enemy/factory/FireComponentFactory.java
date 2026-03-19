package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.combat.FireShield;
import com.narxoz.rpg.enemy.combat.FlameBreath;
import com.narxoz.rpg.enemy.combat.MeteorStorm;
import com.narxoz.rpg.enemy.loot.FireLootTable;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.Arrays;
import java.util.List;
public class FireComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new FlameBreath(), new FireShield(), new MeteorStorm());
    }
    @Override
    public LootTable createLootTable() {
        return new FireLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "AGGRESSIVE"; // Огненная тема = агрессивное поведение
    }
}