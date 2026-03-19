package com.narxoz.rpg.battle;

import com.narxoz.rpg.bridge.Skill;
import com.narxoz.rpg.composite.CombatNode;

import java.util.Random;

public class RaidEngine {
    private Random random = new Random(1L);

    public RaidEngine setRandomSeed(long seed) {
        this.random = new Random(seed);
        return this;
    }

    public RaidResult runRaid(CombatNode teamA, CombatNode teamB,
                              Skill teamASkill, Skill teamBSkill) {
        RaidResult result = new RaidResult();

        if (teamA == null || teamB == null || teamASkill == null || teamBSkill == null) {
            result.setWinner("ERROR: null input");
            result.setRounds(0);
            result.addLine("Invalid inputs.");
            return result;
        }

        if (!teamA.isAlive() || !teamB.isAlive()) {
            result.setWinner("ERROR: team already dead");
            result.setRounds(0);
            return result;
        }

        System.out.println("\n=== RAID START ===");
        System.out.println("Team A: " + teamA.getName() + " | Team B: " + teamB.getName());

        int round = 0;
        final int MAX_ROUNDS = 100;

        while (teamA.isAlive() && teamB.isAlive() && round < MAX_ROUNDS) {
            round++;
            System.out.println("\n-- Round " + round + " --");

            // Team A casts on Team B
            boolean critA = random.nextInt(100) < 10;
            result.addLine("Round " + round + ": " + teamA.getName()
                    + " casts [" + teamASkill.getSkillName() + "] on " + teamB.getName()
                    + (critA ? " (CRIT!)" : ""));
            teamASkill.cast(teamB);

            if (!teamB.isAlive()) break;

            // Team B casts on Team A
            boolean critB = random.nextInt(100) < 10;
            result.addLine("Round " + round + ": " + teamB.getName()
                    + " casts [" + teamBSkill.getSkillName() + "] on " + teamA.getName()
                    + (critB ? " (CRIT!)" : ""));
            teamBSkill.cast(teamA);
        }

        String winner;
        if (teamA.isAlive() && !teamB.isAlive()) {
            winner = teamA.getName();
        } else if (teamB.isAlive() && !teamA.isAlive()) {
            winner = teamB.getName();
        } else {
            winner = "Draw (max rounds reached)";
        }

        result.setWinner(winner);
        result.setRounds(round);
        result.addLine("Winner: " + winner + " after " + round + " rounds.");
        System.out.println("\n=== RAID END — Winner: " + winner + " ===");
        return result;
    }
}
