package basic;

import java.io.FileWriter;
import java.io.IOException;

public class BattleHistory {
    public static void saveBattle(String record) {
        try (FileWriter writer = new FileWriter("battle_history.txt", true)) {
            writer.write(record + "\n");
            System.out.println("Battle history saved successfully.\n");
        } catch (IOException e) {
            System.out.println("Error saving battle history: " + e.getMessage());
        }
    }
}
