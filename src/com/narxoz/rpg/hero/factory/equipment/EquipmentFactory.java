package com.narxoz.rpg.hero.factory.equipment;

import com.narxoz.rpg.hero.equipment.Armor;
import com.narxoz.rpg.hero.equipment.Weapon;
public interface EquipmentFactory{
    Weapon createWeapon();
    Armor createArmor();
}
