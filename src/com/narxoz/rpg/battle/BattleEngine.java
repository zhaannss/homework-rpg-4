package com.narxoz.rpg.battle;

import com.narxoz.rpg.adapter.Combatant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class BattleEngine {

    private static BattleEngine instance;
    private Random random;

    private BattleEngine() {
        this.random = new Random();
    }

    public static BattleEngine getInstance() {
        if (instance == null) {
            instance = new BattleEngine();
        }
        return instance;
    }

    public BattleEngine setRandomSeed(long seed) {
        this.random = new Random(seed);
        return this;
    }

    public void reset() {
        this.random = new Random();
    }

    public EncounterResult runEncounter(List<Combatant> teamA, List<Combatant> teamB) {
        List<Combatant> aliveA = new ArrayList<>(teamA);
        List<Combatant> aliveB = new ArrayList<>(teamB);

        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║        BATTLE START          ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("  Team A (Heroes): " + names(aliveA));
        System.out.println("  Team B (Enemies): " + names(aliveB));

        int round = 1;

        while (!aliveA.isEmpty() && !aliveB.isEmpty()) {
            System.out.println("\n--- Round " + round + " ---");

            // Team A attacks Team B
            attack(aliveA, aliveB, "Heroes");
            aliveB.removeIf(c -> !c.isAlive());
            if (aliveB.isEmpty()) break;

            // Team B attacks Team A
            attack(aliveB, aliveA, "Enemies");
            aliveA.removeIf(c -> !c.isAlive());

            System.out.println("  >> Alive — Heroes: " + names(aliveA)
                    + " | Enemies: " + names(aliveB));
            round++;
        }

        boolean heroesWon = !aliveA.isEmpty();
        String winner = heroesWon ? "Team A (Heroes)" : "Team B (Enemies)";
        List<Combatant> survivors = heroesWon ? aliveA : aliveB;

        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║         BATTLE END           ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("  Winner: " + winner);
        System.out.println("  Survivors: " + names(survivors));

        return new EncounterResult(winner, survivors, round - 1);
    }

    private void attack(List<Combatant> attackers, List<Combatant> defenders, String label) {
        for (Combatant attacker : attackers) {
            if (!attacker.isAlive()) continue;

            Combatant target = defenders.stream()
                    .filter(Combatant::isAlive)
                    .findFirst()
                    .orElse(null);

            if (target == null) break;

            int damage = attacker.getAttackPower();
            target.takeDamage(damage);

            System.out.printf("  [%s] %s attacks %s for %d dmg%s%n",
                    label,
                    attacker.getName(),
                    target.getName(),
                    damage,
                    target.isAlive() ? "" : " — DEFEATED!");
        }
    }

    private String names(List<Combatant> list) {
        if (list.isEmpty()) return "(none)";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getName());
            if (i < list.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}