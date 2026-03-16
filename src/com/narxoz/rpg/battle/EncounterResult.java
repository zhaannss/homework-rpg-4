package com.narxoz.rpg.battle;

import com.narxoz.rpg.adapter.Combatant;

import java.util.Collections;
import java.util.List;

public class EncounterResult {
    private final String winnerTeam;
    private final List<Combatant> survivors;
    private final int totalRounds;

    public EncounterResult(String winnerTeam, List<Combatant> survivors, int totalRounds) {
        this.winnerTeam  = winnerTeam;
        this.survivors   = Collections.unmodifiableList(survivors);
        this.totalRounds = totalRounds;
    }

    public String getWinnerTeam()       { return winnerTeam; }
    public List<Combatant> getSurvivors() { return survivors; }
    public int getTotalRounds()         { return totalRounds; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=== Encounter Result ===\n");
        sb.append("Winner    : ").append(winnerTeam).append("\n");
        sb.append("Rounds    : ").append(totalRounds).append("\n");
        sb.append("Survivors : ");
        for (int i = 0; i < survivors.size(); i++) {
            sb.append(survivors.get(i).getName());
            if (i < survivors.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}