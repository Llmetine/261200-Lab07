public class Character {
    private int health;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    public Character(int maxHealth, int maxStamina) {
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    public int getHealth() {
        return this.health;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void swingSword() {
        if (stamina > 0) {
            stamina -= 10;
            if (stamina < 0) {
                stamina = 0;
            }
            System.out.println("Character swings the sword. Stamina is now " + stamina + ".");
            if (stamina == 0) {
                System.out.println("Your character needs to cool down.");
            }
        } else {
            System.out.println("Your character needs to cool down.");
        }
    }

    public void takeDamage(int damageAmount) {
        if (health > 0) {
            health -= damageAmount;
            if (health < 0) {
                health = 0;
            }
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");
            if (health == 0) {
                System.out.println("Character is dead.");
            }
        }
    }

    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
