public class NormalBehavior implements Behavior {
    @Override
    public void execute(String robotName, String position, String nearbyObstacle) {
        System.out.println(robotName + " moves normally at position " + position
                + ". Nearby obstacle: " + nearbyObstacle);
    }
}
