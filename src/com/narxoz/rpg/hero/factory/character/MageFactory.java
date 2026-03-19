package com.narxoz.rpg.hero.factory.character;
import com.narxoz.rpg.hero.character.Character;
import com.narxoz.rpg.hero.character.Mage;
public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Mage(name, race, age, gender);
    }
}
