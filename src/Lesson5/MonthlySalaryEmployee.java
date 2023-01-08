package Lesson5;

import java.util.Scanner;

public class MonthlySalaryEmployee implements Salary{

    @Override
    public void salary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salary per Month:");
        double monthlySalary =scanner.nextDouble();
        System.out.print("Count of months:");
        double monthsCount =scanner.nextDouble();
        System.out.println("Salary for "+monthsCount+" months:"+monthlySalary*monthsCount);
    }
}
