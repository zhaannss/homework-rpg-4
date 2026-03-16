package com.narxoz.rpg.hero.equipment;
public class Robe implements Armor {

    @Override
    public int getDefense() {
        return 35;     }
    @Override
    public String getArmorInfo() {
        return "Mage Robe: Enchanted robe that enhances magical abilities " +
                "and provides minor magical protection.";
    }
    @Override
    public String getArmorType() {
        return "Magic Armor";
    }
}
