package com.narxoz.rpg.hero.character;

import com.narxoz.rpg.hero.equipment.Armor;
import com.narxoz.rpg.hero.equipment.Weapon;

public abstract class BaseCh implements Character {
    protected String name;
    protected String race;
    protected int age;
    protected String gender;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected Weapon weapon;
    protected Armor armor;

    public BaseCh(String name, String race, int age, String gender) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.gender = gender;
    }

    @Override public String getName()       { return name; }
    @Override public String getRace()       { return race; }
    @Override public int getAge()           { return age; }
    @Override public String getGender()     { return gender; }
    @Override public int getHealth()        { return health; }
    @Override public int getMana()          { return mana; }
    @Override public int getStrength()      { return strength; }
    @Override public int getIntelligence()  { return intelligence; }
    @Override public int getAgility()       { return agility; }

    // Added for HW3
    public void receiveDamage(int amount) {
        this.health = Math.max(0, this.health - amount);
    }

    public boolean isAlive() {
        return this.health > 0;
    }
    //

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equipped " + weapon.getWeaponInfo());
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " equipped "
                + armor.getArmorInfo() + " (Defense: " + armor.getDefense() + ")");
    }

    @Override
    public void displayEquipment() {
        System.out.println("Weapon: " + (weapon != null ? weapon.getWeaponInfo() : "None"));
        System.out.println("Armor: " + (armor != null
                ? armor.getArmorInfo() + " (Defense: " + armor.getDefense() + ")" : "None"));
    }

    @Override
    public void displayStats() {
        System.out.println("Name: " + name + ", Race: " + race);
        System.out.println("Health: " + health + ", Mana: " + mana);
        System.out.println("Strength: " + strength
                + ", Intelligence: " + intelligence + ", Agility: " + agility);
    }



    @Override
    public abstract void useSpecialAbility();
}