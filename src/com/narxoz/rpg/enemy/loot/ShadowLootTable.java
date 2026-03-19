package com.narxoz.rpg.enemy.loot;
import java.util.Arrays;
public class ShadowLootTable extends BaseLootTable {
    public ShadowLootTable() {
        // Кулон Пустоты, Истёртый теневой плащ, Эфирная пыль
        super(Arrays.asList("Void Pendant", "Tattered Shadow Cloak", "Ethereal Dust"), 50, 750);
    }
    public ShadowLootTable(ShadowLootTable source) {
        super(source);
    }
    @Override
    public LootTable clone() {
        return new ShadowLootTable(this); // Prototype: Deep Copy
    }
}