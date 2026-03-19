package com.narxoz.rpg.enemy.loot;
import java.util.Arrays;
public class IceLootTable extends BaseLootTable {
    public IceLootTable() {
        // Замёрзший алмаз, Древнее ледяное ядро, Осколки ледникового стекла
        super(Arrays.asList("Frozen Diamond", "Ancient Ice Core", "Shattered Glacial Glass"), 300, 350);
    }
    public IceLootTable(IceLootTable source) {
        super(source);
    }
    @Override
    public LootTable clone() {
        return new IceLootTable(this); // Prototype: Deep Copy
    }
}