
public class Character {
    public final int maxHealth;
    public int currentHealth;
    public final String name;

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return String.format("%s : KO", name);
        }
        return String.format("%s : %s/%s", name, currentHealth, maxHealth);
    }

    public void takeDamage(int damage) {
        if (this.currentHealth < damage) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= damage ;

        }

    }

    public void attack(Character other) {
        other.takeDamage(9);
    }
     
}