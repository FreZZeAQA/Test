package Lesson5;

import java.util.Scanner;

public class HourlyWageWorker implements Salary {

    @Override
    public void salary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salary per hour:");
        double monthlySalary =scanner.nextDouble();
        System.out.print("Count of hours:");
        double monthsCount =scanner.nextDouble();
        System.out.println("Salary for "+monthsCount+" hours:"+monthlySalary*monthsCount);
    }
    }

