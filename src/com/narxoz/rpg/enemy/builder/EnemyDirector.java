package com.narxoz.rpg.enemy.builder;
import com.narxoz.rpg.enemy.enemy.Enemy;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;
public class EnemyDirector {
    // The Director uses Factory Method delegation by calling builder.build().
    public Enemy createMinion(EnemyBuilder builder, EnemyComponentFactory factory) {
        return builder
                .setName("Themed Minion")
                .setHealth(100)
                .setDamage(15)
                .setDefense(5)
                .setSpeed(20)
                .setElement(factory.toString().contains("Fire") ? "Fire" : "Normal") // Интеграция с темой
                .setAbilities(factory.createAbilities()) // Синхронизация компонентов через Abstract Factory
                .setLootTable(factory.createLootTable())
                .setAI("Aggressive")
                .build(); // Вызов Factory Method
    }
    public Enemy createElite(EnemyBuilder builder, EnemyComponentFactory factory) {
        return builder
                .setName("Elite Warrior")
                .setHealth(500)
                .setDamage(40)
                .setDefense(25)
                .setSpeed(30)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI("Tactical")
                .build();
    }
    public Enemy createMiniBoss(EnemyBuilder builder, EnemyComponentFactory factory) {
        return builder
                .setName("Area Guardian")
                .setHealth(2000)
                .setDamage(80)
                .setDefense(50)
                .setSpeed(40)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .addPhase(1, 2000)
                .addPhase(2, 500)
                .setAI("Defensive")
                .build();
    }
    public Enemy createRaidBoss(EnemyBuilder builder, EnemyComponentFactory factory) {
        return builder
                .setName("World Eater")
                .setHealth(10000)
                .setDamage(200)
                .setDefense(100)
                .setSpeed(50)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .addPhase(1, 10000)
                .addPhase(2, 5000)
                .addPhase(3, 1000)
                .setAI("Aggressive")
                .build();
    }
}