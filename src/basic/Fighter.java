package basic;

public class Fighter {
    String name;
    int health;
    
    public Fighter(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public void attack(Fighter enemy) {
        if (enemy == null) {
            throw new IllegalArgumentException("Enemy cannot be null!");
        }
        System.out.println(name + " attacks " + enemy.name + "!");
        enemy.health -= 20;
    }
    
    public void showHealth() {
        System.out.println(name + " has " + health + " HP left.");
    }
}
