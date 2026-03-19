# Homework 4 — RPG Raid System: Bridge + Composite

## Overview

This project extends the RPG system from previous homeworks (HW1–HW3) by adding a **Raid Mode** that supports:
- Flexible skill-effect combinations using the **Bridge Pattern**
- Uniform handling of single fighters and nested teams using the **Composite Pattern**

---

## Design Patterns

### Bridge Pattern
Located in `src/com/narxoz/rpg/bridge/`

Separates **Skill** (what action is performed) from **Effect** (what type of damage is dealt).
This means any skill can be combined with any effect without creating a separate class for each combination.

```
Skill (abstraction)
  ├── SingleTargetSkill
  └── AreaSkill

EffectImplementor (implementor)
  ├── PhysicalEffect  (x1.0)
  ├── FireEffect      (x1.2)
  ├── IceEffect       (x1.1)
  └── ShadowEffect    (x1.3)
```

### Composite Pattern
Located in `src/com/narxoz/rpg/composite/`

Allows the raid engine to treat a single fighter and a group of fighters the same way through the `CombatNode` interface.

```
CombatNode (interface)
  ├── UnitLeaf (abstract leaf)
  │     ├── HeroUnit
  │     └── EnemyUnit
  └── PartyComposite (composite)
        └── RaidGroup (extends PartyComposite, supports nesting)
```

---

## Project Structure

```
src/com/narxoz/rpg/
  ├── Main.java
  ├── bridge/
  │     ├── EffectImplementor.java
  │     ├── Skill.java
  │     ├── SingleTargetSkill.java
  │     ├── AreaSkill.java
  │     ├── PhysicalEffect.java
  │     ├── FireEffect.java
  │     ├── IceEffect.java
  │     └── ShadowEffect.java
  ├── composite/
  │     ├── CombatNode.java
  │     ├── UnitLeaf.java
  │     ├── HeroUnit.java
  │     ├── EnemyUnit.java
  │     ├── PartyComposite.java
  │     └── RaidGroup.java
  ├── battle/
  │     ├── RaidEngine.java
  │     ├── RaidResult.java
  │     ├── BattleEngine.java       (from HW3)
  │     └── EncounterResult.java    (from HW3)
  ├── adapter/     (from HW3)
  ├── hero/        (from HW1)
  └── enemy/       (from HW2)
```

---

## How to Run

```bash
javac -d out $(find src -name "*.java")
java -cp out com.narxoz.rpg.Main
```

---

## Demo Output Summary

The `Main.java` demonstrates:

**1. Composite hierarchy printed as a tree:**
```
+ Heroes [HP=310, ATK=105, alive=true]
  - Arthas [HP=140, ATK=30]
  - Jaina [HP=90, ATK=40]
  - Sylvanas [HP=80, ATK=35]
+ Enemy Raid [HP=280, ATK=67, alive=true]
  + Frontline [HP=190, ATK=45, alive=true]
    - Goblin [HP=70, ATK=20]
    - Orc [HP=120, ATK=25]
  + Backline [HP=90, ATK=22, alive=true]
    - Troll [HP=90, ATK=22]
```

**2. Bridge — same skill, different effects:**
```
Slash + Physical
Slash + Fire
Slash + Ice
Slash + Shadow
```

**3. Bridge — same effect, different skills:**
```
Storm + Fire
Thrust + Fire
```

**4. Full raid simulation result:**
```
Winner: Heroes
Rounds: 12
```

---

## Connection to Previous Homeworks

| HW | Pattern | Used in HW4 |

| HW1 | Factory — hero/equipment creation | Hero objects in demo 
| HW2 | Builder — enemy creation | Enemy objects in demo 
| HW3 | Singleton BattleEngine, Adapter | Still present in Main 
| HW4 | Bridge + Composite | New raid system 