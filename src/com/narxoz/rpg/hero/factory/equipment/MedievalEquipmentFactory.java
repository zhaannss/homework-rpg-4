package com.narxoz.rpg.hero.factory.equipment;

import com.narxoz.rpg.hero.equipment.Armor;
import com.narxoz.rpg.hero.equipment.ChainMail;
import com.narxoz.rpg.hero.equipment.IronSword;
import com.narxoz.rpg.hero.equipment.Weapon;
public class MedievalEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }
    @Override
    public Armor createArmor() {
        return new ChainMail();
    }
}
