package com.narxoz.rpg.enemy.loot;
import java.util.ArrayList;
import java.util.List;
public abstract class BaseLootTable implements LootTable {
    protected List<String> items;
    protected int goldDrop;
    protected int experienceDrop;
    public BaseLootTable(List<String> items, int goldDrop, int experienceDrop) {
        this.items = items != null ? items : new ArrayList<>();
        this.goldDrop = goldDrop;
        this.experienceDrop = experienceDrop;
    }
    public BaseLootTable(BaseLootTable source) {
        this.items = new ArrayList<>(source.items);
        this.goldDrop = source.goldDrop;
        this.experienceDrop = source.experienceDrop;
    }
    @Override
    public List<String> getItems() {
        return items;
    }
    @Override
    public int getGoldDrop() {
        return goldDrop;
    }
    @Override
    public int getExperienceDrop() {
        return experienceDrop;
    }
    @Override
    public String getLootInfo() {
        return "Items: " + items + " | Gold: " + goldDrop + " | XP: " + experienceDrop;
    }
    @Override
    public abstract LootTable clone();
}