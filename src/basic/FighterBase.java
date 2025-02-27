package basic;

public abstract class FighterBase {
    protected String name;
    protected int health;
    
    public FighterBase(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public abstract void attack(FighterBase enemy);
    
    public void showHealth() {
        System.out.println(name + " has " + health + " HP left.");
    }
    
    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health;
    }
}
