package com.narxoz.rpg.hero.character;
public class Healer extends BaseCh {
    public Healer (String name, String race, int age, String gender) {
        super(name, race, age, gender);
        this.health = 70;
        this.mana = 130;
        this.strength = 25;
        this.intelligence = 145;
        this.agility = 40;
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses instant healing with holy power!");
    }

}