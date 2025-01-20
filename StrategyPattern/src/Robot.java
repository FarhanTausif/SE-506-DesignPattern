// Robot.java
public class Robot {
    private String name;
    private Behavior behavior;

    public Robot(String name, Behavior initialBehavior) {
        this.name = name;
        this.behavior = initialBehavior;
    }

    public void setBehavior(Behavior newBehavior) {
        this.behavior = newBehavior;
    }

    public void performAction(String position, String nearbyObstacle) {
        behavior.execute(name, position, nearbyObstacle);
    }
}
