package com.narxoz.rpg;

import com.narxoz.rpg.battle.RaidEngine;
import com.narxoz.rpg.battle.RaidResult;
import com.narxoz.rpg.bridge.*;
import com.narxoz.rpg.composite.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Homework 4 Demo: Bridge + Composite ===\n");

        //COMPOSITE: build leaves
        HeroUnit warrior = new HeroUnit("Arthas",  140, 30);
        HeroUnit mage    = new HeroUnit("Jaina",    90, 40);
        HeroUnit archer  = new HeroUnit("Sylvanas", 80, 35);

        EnemyUnit goblin  = new EnemyUnit("Goblin",  70, 20);
        EnemyUnit orc     = new EnemyUnit("Orc",    120, 25);
        EnemyUnit troll   = new EnemyUnit("Troll",   90, 22);

        //COMPOSITE: build nested hierarchy
        //Heroes:
        //PartyComposite "Heroes"
        //     - HeroUnit Arthas
        //     - HeroUnit Jaina
        //     - HeroUnit Sylvanas
        PartyComposite heroes = new PartyComposite("Heroes");
        heroes.add(warrior);
        heroes.add(mage);
        heroes.add(archer);

        //Enemies (nested):
        //RaidGroup "Enemy Raid"
        //PartyComposite "Frontline"
        //         - EnemyUnit Goblin
        //         - EnemyUnit Orc
        //     + PartyComposite "Backline"
        //         - EnemyUnit Troll
        PartyComposite frontline = new PartyComposite("Frontline");
        frontline.add(goblin);
        frontline.add(orc);

        PartyComposite backline = new PartyComposite("Backline");
        backline.add(troll);

        RaidGroup enemies = new RaidGroup("Enemy Raid");
        enemies.add(frontline);
        enemies.add(backline);

        System.out.println("--- Team Structures ---");
        heroes.printTree("");
        enemies.printTree("");

        System.out.println("\nHeroes  total HP=" + heroes.getAttackPower()
                + "  ATK=" + heroes.getAttackPower());
        System.out.println("Enemies total HP=" + enemies.getHealth()
                + "  ATK=" + enemies.getAttackPower());

        //BRIDGE: same skill, different effects
        Skill slashPhysical = new SingleTargetSkill("Slash", 20, new PhysicalEffect());
        Skill slashFire     = new SingleTargetSkill("Slash", 20, new FireEffect());
        Skill slashIce      = new SingleTargetSkill("Slash", 20, new IceEffect());
        Skill slashShadow   = new SingleTargetSkill("Slash", 20, new ShadowEffect());

        //Same effect, different skills
        Skill stormFire  = new AreaSkill("Storm", 15, new FireEffect());
        Skill thrustFire = new SingleTargetSkill("Thrust", 25, new FireEffect());

        System.out.println("\n--- Bridge Preview: same skill, different effects ---");
        System.out.println(slashPhysical.getSkillName() + " + " + slashPhysical.getEffectName());
        System.out.println(slashFire.getSkillName()     + " + " + slashFire.getEffectName());
        System.out.println(slashIce.getSkillName()      + " + " + slashIce.getEffectName());
        System.out.println(slashShadow.getSkillName()   + " + " + slashShadow.getEffectName());

        System.out.println("\n--- Bridge Preview: same effect (Fire), different skills ---");
        System.out.println(stormFire.getSkillName()  + " + " + stormFire.getEffectName());
        System.out.println(thrustFire.getSkillName() + " + " + thrustFire.getEffectName());

        //BRIDGE: live cast demo
        System.out.println("\n--- Bridge Cast Demo ---");
        EnemyUnit dummyA = new EnemyUnit("DummyA", 200, 0);
        EnemyUnit dummyB = new EnemyUnit("DummyB", 200, 0);
        PartyComposite dummyGroup = new PartyComposite("DummyGroup");
        dummyGroup.add(new EnemyUnit("D1", 100, 0));
        dummyGroup.add(new EnemyUnit("D2", 100, 0));

        slashPhysical.cast(dummyA);
        slashFire.cast(dummyA);
        slashShadow.cast(dummyA);
        stormFire.cast(dummyGroup);   // AOE — распределяется по D1, D2

        //RAID SIMULATION
        System.out.println("\n--- Full Raid ---");
        RaidEngine engine = new RaidEngine().setRandomSeed(42L);
        RaidResult result = engine.runRaid(heroes, enemies, slashFire, stormFire);

        System.out.println("\n--- Raid Result ---");
        System.out.println("Winner: " + result.getWinner());
        System.out.println("Rounds: " + result.getRounds());
        for (String line : result.getLog()) System.out.println("  " + line);

        System.out.println("\n--- Final team states ---");
        heroes.printTree("");
        enemies.printTree("");

        System.out.println("\n===  yayyy demo Complete ===");
    }
}
