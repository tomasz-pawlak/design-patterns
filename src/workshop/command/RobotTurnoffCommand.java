package workshop.command;

import workshop.Robot;

public class RobotTurnoffCommand implements Command {
    private Robot robot;

    @Override
    public void execute() {
        robot.turnOff();
    }

    public RobotTurnoffCommand(Robot robot) {
        this.robot = robot;
    }
}
