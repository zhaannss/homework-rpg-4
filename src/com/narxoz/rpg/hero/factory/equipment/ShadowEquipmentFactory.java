package com.narxoz.rpg.hero.factory.equipment;

import com.narxoz.rpg.hero.equipment.Armor;
import com.narxoz.rpg.hero.equipment.DarkDagger;
import com.narxoz.rpg.hero.equipment.LeatherArmor;
import com.narxoz.rpg.hero.equipment.Weapon;
public class ShadowEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new DarkDagger();
    }
    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
