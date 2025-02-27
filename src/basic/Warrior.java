package basic;

public class Warrior extends FighterBase implements SpecialAbility {
    public Warrior(String name, int health) {
        super(name, health);
    }
    
    @Override
    public void attack(FighterBase enemy) {
        if (enemy == null) {
            throw new IllegalArgumentException("Enemy cannot be null!");
        }
        System.out.println(name + " slashes at " + enemy.getName() + " with a mighty sword!");
        enemy.health -= 25;
    }
    
    @Override
    public void useAbility() {
        System.out.println(name + " uses 'Blade Storm'!");
    }
}
