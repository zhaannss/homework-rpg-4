package com.narxoz.rpg.hero.factory.equipment;

import com.narxoz.rpg.hero.equipment.Armor;
import com.narxoz.rpg.hero.equipment.HolyWand;
import com.narxoz.rpg.hero.equipment.Robe;
import com.narxoz.rpg.hero.equipment.Weapon;
public class HolyEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new HolyWand();
    }
    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
