package workshop.command;

import workshop.Robot;

public class RobotTurnonCommand implements Command {
    private Robot robot;

    @Override
    public void execute() {
        robot.turnOn();
    }

    public RobotTurnonCommand(Robot robot) {
        this.robot = robot;
    }
}
