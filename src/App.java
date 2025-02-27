import basic.CharacterCreation;
import basic.TrainingGround;
import basic.SpecialMove;
import basic.Fighter;
import basic.FighterBase;
import basic.Warrior;
import basic.Mage;
import basic.BattleHistory;
import basic.FighterRegistry;
import basic.AsyncBattle;

import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        System.out.println("\n🌟 Welcome to Java Academy Extended! 🌟");
        System.out.println("🎭 The Epic Journey Begins...\n");

        // Episode 1: Character Creation (Variables & Data Types)
        CharacterCreation character = new CharacterCreation();
        character.createCharacter();

        // Episode 2: Training Ground (Control Flow & Loops)
        TrainingGround.trainingSession();

        // Episode 3: Special Move (Methods)
        SpecialMove.unleashSpecialMove("Dragon Slash");

        // Episode 4: Basic Battle (OOP: Classes & Objects)
        Fighter player = new Fighter("Kouhai", 100);
        Fighter rival = new Fighter("Rival-Chan", 100);
        player.attack(rival);
        rival.showHealth();
        rival.attack(player);
        player.showHealth();

        // Episode 5: Advanced OOP - Inheritance, Polymorphism, Abstraction & Interfaces
        // Using abstract class FighterBase along with interface SpecialAbility
        FighterBase warrior = new Warrior("Samurai", 120);
        FighterBase mage = new Mage("Sorcerer", 90);
        warrior.attack(mage);
        mage.attack(warrior);
        warrior.showHealth();
        mage.showHealth();
        // Use special abilities
        ((Warrior) warrior).useAbility();
        ((Mage) mage).useAbility();

        // Episode 6: Exception Handling - Catching Battle Errors
        try {
            player.attack(null); // Intentionally passing null to trigger an exception
        } catch (Exception e) {
            System.out.println("⚠️ Exception Caught: " + e.getMessage());
        }

        // Episode 7: File Handling - Save Battle History
        BattleHistory.saveBattle("Kouhai vs Rival-Chan and epic clashes with Warriors and Mages");

        // Episode 8: Collections & Generics - Managing Your Fighters
        FighterRegistry<FighterBase> registry = new FighterRegistry<>();
        registry.addFighter(warrior);
        registry.addFighter(mage);
        registry.listFighters();

        // Episode 9: Lambda & Functional Interfaces - Sorting Fighters by Health
        System.out.println("\n🔀 Sorting Fighters by Health using Lambda Expressions:");
        List<FighterBase> fighterList = registry.getFighters();
        Collections.sort(fighterList, (f1, f2) -> f1.getHealth() - f2.getHealth());
        for (FighterBase fb : fighterList) {
            System.out.println(fb.getName() + " - " + fb.getHealth() + " HP");
        }

        // Episode 10: Multithreading - Asynchronous Battle Simulation
        System.out.println("\n⏱ Starting Asynchronous Battle Simulation:");
        AsyncBattle asyncBattle = new AsyncBattle();
        asyncBattle.startBattle();

        // Secure vs. Unsecure Data Handling Example
        System.out.println("\n🔒 Secure & Unsecure Data Handling Example:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a secret code: ");
        String secureInput = scanner.nextLine(); // Secure input handling
        System.out.println("✅ Good Practice: Using safe input handling -> " + secureInput);
        System.out.println("❌ Bad Practice: Storing passwords in plain text (DON'T DO THIS!)");
        scanner.close();

        System.out.println("\n🎉 End of Epic Journey! Continue learning at Java Academy Extended! 🚀");
    }
}
