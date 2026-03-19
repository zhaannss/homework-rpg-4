package com.narxoz.rpg.hero.character;
public class Roque extends BaseCh {
    public Roque (String name, String race, int age, String gender) {
        super(name, race, age, gender);
        this.health = 90;
        this.mana = 55;
        this.strength = 80;
        this.intelligence = 110;
        this.agility = 120;
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses instant step and super stealth mode!");
    }

}