// SimulationApp.java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create behaviors
        Behavior aggressive = new AggressiveBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();

        // Array of available behaviors for random assignment
        Behavior[] behaviors =
                {
                    normal,
                    aggressive,
                    defensive
                };

        Robot robot1 = new Robot("Robot1", getRandomBehavior(behaviors));
        Robot robot2 = new Robot("Robot2", getRandomBehavior(behaviors));
        Robot robot3 = new Robot("Robot3", getRandomBehavior(behaviors));

        String[] positions = {"(10, 20)", "(15, 25)", "(30, 35)"};
        String[] nearbyObstacles = {"Tree", "Rock", "Wall"};

        System.out.println("Initial behaviors:");
        robot1.performAction(positions[0], nearbyObstacles[0]);
        robot2.performAction(positions[1], nearbyObstacles[1]);
        robot3.performAction(positions[2], nearbyObstacles[2]);

        System.out.println("\nChanging behaviors dynamically...\n");
        robot1.setBehavior(getRandomBehavior(behaviors));
        robot2.setBehavior(getRandomBehavior(behaviors));
        robot3.setBehavior(getRandomBehavior(behaviors));

        System.out.println("Behaviors after change:");
        robot1.performAction(positions[0], nearbyObstacles[0]);
        robot2.performAction(positions[1], nearbyObstacles[1]);
        robot3.performAction(positions[2], nearbyObstacles[2]);
    }

    private static Behavior getRandomBehavior(Behavior[] behaviors) {
        Random random = new Random();
        int index = random.nextInt(behaviors.length);
        return behaviors[index];
    }
}
