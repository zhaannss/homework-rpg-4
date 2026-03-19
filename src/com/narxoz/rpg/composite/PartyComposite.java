package com.narxoz.rpg.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartyComposite implements CombatNode {
    private final String name;
    private final List<CombatNode> children = new ArrayList<>();

    public PartyComposite(String name) {
        this.name = name;
    }

    public void add(CombatNode node) { children.add(node); }
    public void remove(CombatNode node) { children.remove(node); }

    @Override public String getName() { return name; }

    @Override
    public int getHealth() {
        int total = 0;
        for (CombatNode c : children) total += c.getHealth();
        return total;
    }

    @Override
    public int getAttackPower() {
        int total = 0;
        for (CombatNode c : children) if (c.isAlive()) total += c.getAttackPower();
        return total;
    }

    @Override
    public void takeDamage(int amount) {
        List<CombatNode> alive = getAliveChildren();
        if (alive.isEmpty()) return;
        int share = Math.max(1, amount / alive.size());
        for (CombatNode c : alive) c.takeDamage(share);
    }

    @Override
    public boolean isAlive() {
        for (CombatNode c : children) if (c.isAlive()) return true;
        return false;
    }

    @Override
    public List<CombatNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public void printTree(String indent) {
        System.out.println(indent + "+ " + name
                + " [HP=" + getHealth() + ", ATK=" + getAttackPower() + ", alive=" + isAlive() + "]");
        for (CombatNode c : children) c.printTree(indent + "  ");
    }

    private List<CombatNode> getAliveChildren() {
        List<CombatNode> alive = new ArrayList<>();
        for (CombatNode c : children) if (c.isAlive()) alive.add(c);
        return alive;
    }
}
