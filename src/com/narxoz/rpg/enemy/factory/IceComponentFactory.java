package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.combat.Blizzard;
import com.narxoz.rpg.enemy.combat.FrostBreath;
import com.narxoz.rpg.enemy.combat.IceShield;
import com.narxoz.rpg.enemy.loot.IceLootTable;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.Arrays;
import java.util.List;
public class IceComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new FrostBreath(), new IceShield(), new Blizzard());
    }
    @Override
    public LootTable createLootTable() {
        return new IceLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "DEFENSIVE";// Ледяная тема = защитное поведение
    }
}