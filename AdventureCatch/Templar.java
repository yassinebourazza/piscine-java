public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth,weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character character) throws DeadCharacterException {
        if (getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
    
        character.setCurrentHealth(
            Math.min(
                character.getCurrentHealth() + healCapacity,
                character.getMaxHealth()
            )
        );
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public String toString() {
        String result;
    
        if (getCurrentHealth() == 0) {
            result = getName() + " has been beaten, even with its "
                + shield + " shield. So bad, it could heal "
                + healCapacity + " HP.";
        } else {
            result = getName() + " is a strong Templar with "
                + getCurrentHealth() + " HP. It can heal "
                + healCapacity + " HP and has a shield of "
                + shield + ".";
        }
    
        if (getWeapon() != null) {
            result += " He has the weapon " + getWeapon().toString();
        }
    
        return result;
    }

    public void attack(Character other) throws DeadCharacterException {
        heal(this);
        if (getWeapon() != null) {
            other.takeDamage(getWeapon().getDamage());
        } else {
            other.takeDamage(6);
        }
    }

    public void takeDamage(int damage) throws DeadCharacterException {

    if (getCurrentHealth() <= 0) {
        throw new DeadCharacterException(this);
    }
        int actualDamage = damage - shield;

        if (actualDamage < 0) {
            actualDamage = 0;
        }

        if (getCurrentHealth() < actualDamage) {
            setCurrentHealth(0);
        } else {
            setCurrentHealth(getCurrentHealth() - actualDamage);
        }
    }
}