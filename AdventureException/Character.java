import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private Weapon weapon;

    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth, Weapon weapon) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
        this.weapon = weapon;

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

    public abstract void takeDamage(int damage) throws DeadCharacterException ;

    public abstract void attack(Character other) throws DeadCharacterException ;

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
        try {
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
        } catch (DeadCharacterException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
     
}