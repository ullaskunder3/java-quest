package basic;

import java.util.ArrayList;
import java.util.List;

public class FighterRegistry<T extends FighterBase> {
    private List<T> fighters = new ArrayList<>();
    
    public void addFighter(T fighter) {
        fighters.add(fighter);
        System.out.println(fighter.getName() + " added to registry.");
    }
    
    public List<T> getFighters() {
        return fighters;
    }
    
    public void listFighters() {
        System.out.println("---- Fighter Registry ----");
        for (T fighter : fighters) {
            System.out.println(fighter.getName() + " - " + fighter.getHealth() + " HP");
        }
        System.out.println("--------------------------\n");
    }
}
