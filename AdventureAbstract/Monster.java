public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() > 0) {
            return String.format(
                "%s is a monster with %d HP",
                getName(),
                getCurrentHealth()
            );
        }

        return String.format(
            "%s is a monster and is dead",
            getName()
        );
    }

    public void takeDamage(int damage) {
        int actualDamage = (int) (damage * 0.8);

        if (getCurrentHealth() < actualDamage) {
            setCurrentHealth(0);
        } else {
            setCurrentHealth(getCurrentHealth() - actualDamage);
        }
    }

    public void attack(Character other) {
        other.takeDamage(7);
    }
}