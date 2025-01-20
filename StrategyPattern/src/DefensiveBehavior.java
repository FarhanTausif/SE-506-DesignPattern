public class DefensiveBehavior implements Behavior {
    @Override
    public void execute(String robotName, String position, String nearbyObstacle) {
        System.out.println(robotName + " defends itself and moves away from the obstacle at position "
                + position + ". Nearby obstacle: " + nearbyObstacle);
    }
}
