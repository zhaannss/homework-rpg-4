package com.narxoz.rpg.hero.factory.character;
import com.narxoz.rpg.hero.character.Character;
import com.narxoz.rpg.hero.character.Healer;
public class HealerFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Healer(name, race, age, gender);
    }
}
