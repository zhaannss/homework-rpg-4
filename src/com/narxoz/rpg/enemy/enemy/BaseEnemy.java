package com.narxoz.rpg.enemy.enemy;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseEnemy implements Enemy {
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected int speed;
    protected List<Ability> abilities;
    protected LootTable lootTable;

    protected BaseEnemy(String name, int health, int damage, int defense, int speed,
                        List<Ability> abilities, LootTable lootTable) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.abilities = new ArrayList<>(abilities);
        this.lootTable = lootTable;
    }

    @Override public void setName(String name)   { this.name = name; }
    @Override public void setHealth(int health)  { this.health = health; }
    @Override public void addAbility(Ability a)  { this.abilities.add(a); }

    @Override
    public void multiplyStats(double multiplier) {
        this.health  = (int)(this.health  * multiplier);
        this.damage  = (int)(this.damage  * multiplier);
        this.defense = (int)(this.defense * multiplier);
    }

    // Added for HW3
    @Override
    public void applyDamage(int amount) {
        this.health = Math.max(0, this.health - amount);
    }

    @Override
    public boolean isDefeated() {
        return this.health <= 0;
    }
    //

    @Override public String getName()             { return name; }
    @Override public int getHealth()              { return health; }
    @Override public int getDamage()              { return damage; }
    public int getDefense()                       { return defense; }
    public int getSpeed()                         { return speed; }
    @Override public List<Ability> getAbilities() { return abilities; }
    public LootTable getLootTable()               { return lootTable; }

    @Override
    public void displayInfo() {
        System.out.println("=== ENEMY ===");
        System.out.println("Name: " + name);
        System.out.println("HP: "  + health);
        System.out.println("DMG: " + damage);
        System.out.println("DEF: " + defense);
        System.out.println("SPD: " + speed);
        System.out.println("\nAbilities:");
        for (Ability a : abilities)
            System.out.println("  - " + a.getName() + " (" + a.getDamage() + ")");
        System.out.println("\nLoot:");
        System.out.println("  Gold: " + lootTable.getGoldDrop());
        System.out.println("  XP:   " + lootTable.getExperienceDrop());
        System.out.println("  Items: " + lootTable.getItems());
    }

    @Override
    public Enemy clone() {
        List<Ability> clonedAbilities = new ArrayList<>();
        for (Ability a : abilities) clonedAbilities.add(a.clone());
        return createClone(name, health, damage, defense, speed,
                clonedAbilities, lootTable.clone());
    }

    protected abstract Enemy createClone(String name, int health, int damage,
                                         int defense, int speed, List<Ability> abilities, LootTable lootTable);
}