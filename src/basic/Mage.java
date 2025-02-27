package basic;

public class Mage extends FighterBase implements SpecialAbility {
    public Mage(String name, int health) {
        super(name, health);
    }
    
    @Override
    public void attack(FighterBase enemy) {
        if (enemy == null) {
            throw new IllegalArgumentException("Enemy cannot be null!");
        }
        System.out.println(name + " casts a spell on " + enemy.getName() + "!");
        enemy.health -= 15;
    }
    
    @Override
    public void useAbility() {
        System.out.println(name + " uses 'Arcane Blast'!");
    }
}
