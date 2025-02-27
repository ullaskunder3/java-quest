package basic;

public class AsyncBattle implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Async Battle: Fighters are entering the arena...");
            Thread.sleep(1000);
            System.out.println("Async Battle: The clash begins!");
            Thread.sleep(1000);
            System.out.println("Async Battle: A flurry of moves is exchanged!");
            Thread.sleep(1000);
            System.out.println("Async Battle: The battle concludes with a draw!\n");
        } catch (InterruptedException e) {
            System.out.println("Async Battle interrupted: " + e.getMessage());
        }
    }
    
    public void startBattle() {
        Thread battleThread = new Thread(new AsyncBattle());
        battleThread.start();
        try {
            battleThread.join();
        } catch (InterruptedException e) {
            System.out.println("Battle thread interrupted: " + e.getMessage());
        }
    }
}
