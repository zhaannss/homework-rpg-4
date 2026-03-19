package com.narxoz.rpg.hero.factory.equipment;

import com.narxoz.rpg.hero.equipment.Armor;
import com.narxoz.rpg.hero.equipment.Elvenbow;
import com.narxoz.rpg.hero.equipment.LeatherArmor;
import com.narxoz.rpg.hero.equipment.Weapon;
public class RangerEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Elvenbow();
    }
    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
