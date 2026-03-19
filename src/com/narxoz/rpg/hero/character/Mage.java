package com.narxoz.rpg.hero.character;
public class Mage extends BaseCh {
    public Mage (String name, String race, int age, String gender) {
        super(name, race, age, gender);
        this.health = 80;
        this.mana = 150;
        this.strength = 30;
        this.intelligence = 130;
        this.agility = 50;
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses casts Fireball!");
    }

}