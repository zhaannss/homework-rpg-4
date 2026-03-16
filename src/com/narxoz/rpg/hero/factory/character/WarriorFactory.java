package com.narxoz.rpg.hero.factory.character;
import com.narxoz.rpg.hero.character.Character;
import com.narxoz.rpg.hero.character.Warrior;
public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Warrior(name, race, age, gender);
    }
}
