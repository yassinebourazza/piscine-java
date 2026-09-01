public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character character) {
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
        if (getCurrentHealth() == 0) {
            return getName() + " has been beaten, even with its "
                + shield + " shield. So bad, it could heal "
                + healCapacity + " HP.";
        }

        return getName() + " is a strong Templar with "
            + getCurrentHealth() + " HP. It can heal "
            + healCapacity + " HP and has a shield of "
            + shield + ".";
    }

    public void attack(Character other) {
        heal(this);
        other.takeDamage(6);
    }

    public void takeDamage(int damage) {
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