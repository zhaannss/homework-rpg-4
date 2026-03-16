package com.narxoz.rpg.bridge;

import com.narxoz.rpg.composite.CombatNode;

public class AreaSkill extends Skill {
    public AreaSkill(String skillName, int basePower, EffectImplementor effect) {
        super(skillName, basePower, effect);
    }

    @Override
    public void cast(CombatNode target) {
        System.out.printf("  [%s / %s] AOE -> %s%n",
                getSkillName(), getEffectName(), target.getName());
        // Делегируем Composite и он сам распределит урон по живым листьям
        int damage = resolvedDamage();
        target.takeDamage(damage);
        if (!target.isAlive()) System.out.println("    " + target.getName() + " DEFEATED!");
    }
}
