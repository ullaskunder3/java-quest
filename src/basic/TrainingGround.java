package basic;

public class TrainingGround {
    public static void trainingSession() {
        int powerLevel = 80;
        System.out.println("---- Training Ground ----");
        if (powerLevel > 90) {
            System.out.println("You're a PRO! Ready to fight the Elite Four!");
        } else if (powerLevel >= 70) {
            System.out.println("You're strong! Keep training!");
        } else {
            System.out.println("You need more training...");
        }
        System.out.println("Starting training loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Special Move " + i + " activated!");
        }
        System.out.println("Training Complete!\n");
    }
}
