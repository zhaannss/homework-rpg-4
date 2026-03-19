package com.narxoz.rpg.enemy.loot;
import java.util.Arrays;
public class FireLootTable extends BaseLootTable {
    public FireLootTable() {
        // Закалённая драконья чешуя, Неугасающий уголь, Осколок обсидиана, Огненная эссенция(чтоб не забыть чо я вообще добавила)
        super(Arrays.asList("Hardened Dragon Scale", "Everburning Coal", "Obsidian Shard", "Fire Essence"), 150, 400);
    }
    public FireLootTable(FireLootTable source) {
        super(source);
    }
    @Override
    public LootTable clone() {
        return new FireLootTable(this); // Prototype: Deep Copy
    }
}