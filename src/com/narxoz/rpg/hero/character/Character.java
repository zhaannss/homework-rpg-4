package com.narxoz.rpg.hero.character;

import com.narxoz.rpg.hero.equipment.Armor;
import com.narxoz.rpg.hero.equipment.Weapon;
public interface Character {
    String getName();

    String getRace();

    int getAge();

    String getGender();

    int getHealth();

    int getMana();

    int getStrength();

    int getIntelligence();

    int getAgility();

    void equipWeapon(Weapon weapon);

    void equipArmor(Armor armor);

    void displayEquipment();

    void displayStats();

    void useSpecialAbility();
}
