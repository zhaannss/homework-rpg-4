package com.narxoz.rpg.enemy.loot;
import java.util.Arrays;
public class WitchcraftLootTable extends BaseLootTable {
    public WitchcraftLootTable() {
        // Ингредиенты для зелий, Когти ворона, Проклятые амулеты(чтоб не забыть чо я вообще добавила)
        super(Arrays.asList("Potion Ingredients", "Crow Claw", "Cursed Amulet"), 80, 400);
    }
    public WitchcraftLootTable(WitchcraftLootTable source) {
        super(source);
    }
    @Override
    public LootTable clone() {
        return new WitchcraftLootTable(this); // Prototype Pattern: Deep Copy
    }
}