package com.narxoz.rpg.bridge;

import com.narxoz.rpg.composite.CombatNode;

public class SingleTargetSkill extends Skill {
    public SingleTargetSkill(String skillName, int basePower, EffectImplementor effect) {
        super(skillName, basePower, effect);
    }

    @Override
    public void cast(CombatNode target) {
        int damage = resolvedDamage();
        System.out.printf("  [%s / %s] -> %s : %d dmg%n",
                getSkillName(), getEffectName(), target.getName(), damage);
        target.takeDamage(damage);
        if (!target.isAlive()) System.out.println("    " + target.getName() + " DEFEATED!");
    }
}
