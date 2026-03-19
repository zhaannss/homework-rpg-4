package com.narxoz.rpg.hero.factory.character;

import com.narxoz.rpg.hero.character.Archer;
import com.narxoz.rpg.hero.character.Character;
public class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Archer(name, race, age, gender);
    }
}
