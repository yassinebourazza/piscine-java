public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character character) {
        int newHealth = character.getCurrentHealth() + healCapacity;

        if (newHealth > character.getMaxHealth()) {
            newHealth = character.getMaxHealth();
        }

        character.setCurrentHealth(newHealth);
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }


    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return String.format(
                "%s is a dead sorcerer. So bad, it could heal %d HP.",
                getName(),
                healCapacity
            );
        }

        return String.format(
            "%s is a sorcerer with %d HP. It can heal %d HP.",
            getName(),
            getCurrentHealth(),
            healCapacity
        );
    }

    public void attack(Character other) {
        heal(this);
        other.takeDamage(10);
    }
    
    public void takeDamage(int damage) {
        if (getCurrentHealth() < damage) {
            setCurrentHealth(0);
        } else {
            setCurrentHealth(getCurrentHealth() - damage);
        }
    }
}
