package com.narxoz.rpg.hero.factory.equipment;

import com.narxoz.rpg.hero.equipment.ArcaneStaff;
import com.narxoz.rpg.hero.equipment.Armor;
import com.narxoz.rpg.hero.equipment.Robe;
import com.narxoz.rpg.hero.equipment.Weapon;
public class MagicEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new ArcaneStaff();
    }
    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
