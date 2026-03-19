package com.narxoz.rpg.hero.character;
public class Warrior extends BaseCh {
    public Warrior(String name, String race, int age, String gender) {
        super(name, race, age, gender);
        this.health = 200;
        this.mana = 40;
        this.strength = 120;
        this.intelligence = 70;
        this.agility = 60;
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name + "uses Berserk! Strength increased temporarily!");
    }

}
