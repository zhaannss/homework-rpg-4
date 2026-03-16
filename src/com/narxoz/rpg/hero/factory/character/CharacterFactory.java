package com.narxoz.rpg.hero.factory.character;
import com.narxoz.rpg.hero.character.Character;
public abstract class CharacterFactory {
    public abstract Character createCharacter(
            String name,
            String race,
            int age,
            String gender
    );
}
