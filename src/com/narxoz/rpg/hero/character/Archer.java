package com.narxoz.rpg.hero.character;
public class Archer extends BaseCh {
    public Archer (String name, String race, int age, String gender) {
        super(name, race, age, gender);
        this.health = 100;
        this.mana = 80;
        this.strength = 90;
        this.intelligence = 85;
        this.agility = 96;
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses Precision Shot! ");
    }

}