import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;

        allCharacters.add(this);
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

    public static String printStatus() {
        String result = "------------------------------------------\n";
        if (allCharacters.isEmpty()) {
            result += "Nobody's fighting right now !\n";
        } else {
            result += "Characters currently fighting :\n";
            for (Character character : allCharacters) {
                result += " - " + character.toString() + "\n";
            }
        }
        result += "------------------------------------------\n";

        return result;
    }

    public static Character fight(Character first, Character second) {
        while (first.getCurrentHealth() > 0 && second.getCurrentHealth() > 0) {
            first.attack(second);

            if (second.getCurrentHealth() == 0) {
                return first;
            }

            second.attack(first);

            if (first.getCurrentHealth() == 0) {
                return second;
            }
        }

        return null;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
     
}