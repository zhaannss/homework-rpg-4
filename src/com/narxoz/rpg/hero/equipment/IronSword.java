package com.narxoz.rpg.hero.equipment;
public class IronSword implements Weapon {
    private int damage;
    private String name;
    private String type;
    private String specialEffect;

    public IronSword() {
        this.damage = 30 ;
        this.name = "Iron Sword";
        this.type = "Sword";
        this.specialEffect = "When the sword is filled with mana, a shell appears around it that increases the weapon's stats.";
    }

    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public String getWeaponInfo() {
        return name +
                " (Type: " + type +
                ", Damage: " + damage +
                ", Effect: " + specialEffect + ")";
    }
    @Override
    public String getSpecialEffect() {
        return specialEffect;
    }
}
/**
 * Example concrete weapon implementation - Medieval theme.
 *
 * This is provided as a reference to help you understand the structure.
 * Study this, then create other weapons and armor for different themes.
 *
 * Notice:
 * - This implements the Weapon interface
 * - It has specific attributes for this weapon type
 * - It belongs to the "Medieval" equipment family
 *
 * TODO: Create similar implementations for:
 * Weapons:
 * - WizardStaff (Magic theme)
 * - Longbow (Ranger theme)
 * - Other weapons you imagine...
 *
 * Armor:
 * - PlateArmor (Medieval theme)
 * - EnchantedRobes (Magic theme)
 * - LeatherArmor (Ranger theme)
 * - Other armor you imagine...
 */
    // TODO: Implement methods from Weapon interface
    // Define those methods in the Weapon interface first!

    // Example method structure:


    // TODO: Consider adding theme-specific properties
    // For example, Medieval weapons might have:
    // - Durability
    // - Weight
    // Magic weapons might have:
    // - Mana boost
    // - Spell power
