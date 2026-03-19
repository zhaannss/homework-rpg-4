package com.narxoz.rpg.hero.factory.character;
import com.narxoz.rpg.hero.character.Character;
import com.narxoz.rpg.hero.character.Roque;
public class RoqueFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Roque(name, race, age, gender);
    }
}
