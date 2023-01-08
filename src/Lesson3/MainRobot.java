package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class MainRobot {
    public static void main(String[] args) {
        Robot defaultRobot = new Robot();
        defaultRobot.work();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        coffeeRobot.work();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        RobotCooker robotCooker = new RobotCooker();
        robotCooker.work();

        List<Robot>robotList = new ArrayList<>();
        robotList.add(coffeeRobot);
        robotList.add(robotDancer);
        robotList.add(robotCooker);
        robotList.add(robotDancer);
        robotList.add(coffeeRobot);
        robotList.add(robotDancer);
        robotList.add(coffeeRobot);
        robotList.add(coffeeRobot);
        robotList.add(robotCooker);
        System.out.println("List of Robots' work:");
        for (Robot robot:robotList) {
            robot.work();
        }

    }
}
