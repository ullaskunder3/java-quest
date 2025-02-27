package basic;

public class CharacterCreation {
    public void createCharacter() {
        String name = "Kouhai";   // Your anime character name
        int age = 16;
        double powerLevel = 99.9;
        char rank = 'A';
        boolean hasSpecialMove = true;
        
        System.out.println("---- Character Creation ----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("Rank: " + rank);
        System.out.println("Special Move Unlocked? " + hasSpecialMove);
        System.out.println("----------------------------\n");
    }
}
