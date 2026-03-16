package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.combat.DarkNova;
import com.narxoz.rpg.enemy.combat.ShadowStrike;
import com.narxoz.rpg.enemy.combat.Vanish;
import com.narxoz.rpg.enemy.loot.LootTable;
import com.narxoz.rpg.enemy.loot.ShadowLootTable;

import java.util.Arrays;
import java.util.List;
public class ShadowComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new ShadowStrike(), new Vanish(), new DarkNova());
    }
    @Override
    public LootTable createLootTable() {
        return new ShadowLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "TACTICAL"; // Теневая тема = тактическое поведение
    }
}