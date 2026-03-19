package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.combat.Curse;
import com.narxoz.rpg.enemy.combat.SoulHarvest;
import com.narxoz.rpg.enemy.combat.VenomousBite;
import com.narxoz.rpg.enemy.loot.LootTable;
import com.narxoz.rpg.enemy.loot.WitchcraftLootTable;

import java.util.Arrays;
import java.util.List;
public class WitchcraftComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new Curse(), new VenomousBite(), new SoulHarvest());
    }
    @Override
    public LootTable createLootTable() {
        return new WitchcraftLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "CHAOTIC"; // Колдовство = непредсказуемое поведение
    }
}