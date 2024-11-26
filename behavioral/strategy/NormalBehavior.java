package behavioral.strategy;

public class NormalBehavior implements RobotBehavior {

    @Override
    public int moveCommand() {
        return 0;
    }

    @Override
    public String toString() {
        return "Normal Behaviour: if find another robot ignore it";
    }
}
