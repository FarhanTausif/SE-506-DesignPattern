public class AggressiveBehavior implements Behavior {
    @Override
    public void execute(String robotName, String position, String nearbyObstacle) {
        System.out.println(robotName + " aggressively approaches the obstacle at position " + position
                + ". Nearby obstacle: " + nearbyObstacle);
    }
}
