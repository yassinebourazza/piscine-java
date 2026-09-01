public class Monster extends Character {

    public Monster(String name, int maxHealth,Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        String result;

        if (getCurrentHealth() > 0) {
            result = String.format(
                "%s is a monster with %d HP",
                getName(),
                getCurrentHealth()
            );
        } else {
            result = String.format(
                "%s is a monster and is dead",
                getName()
            );
        }

        if (getWeapon() != null) {
            result += " He has the weapon " + getWeapon().toString();
        }

        return result;
    }

    public void takeDamage(int damage) throws DeadCharacterException {
        if (getCurrentHealth() <= 0) {
            throw new DeadCharacterException(this);
        }
        int actualDamage = (int) (damage * 0.8);

        if (getCurrentHealth() < actualDamage) {
            setCurrentHealth(0);
        } else {
            setCurrentHealth(getCurrentHealth() - actualDamage);
        }
    }

    public void attack(Character other) throws DeadCharacterException {
        if (getWeapon() != null) {
            other.takeDamage(getWeapon().getDamage());
        } else {
            other.takeDamage(7);
        }
    }
}