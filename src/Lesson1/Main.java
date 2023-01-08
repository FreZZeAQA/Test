package Lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number;
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        do {
            System.out.print("Write number:");
            number = scanner.nextInt();
            numbers.add(number);
        }
        while (!number.equals(0));
        System.out.println("Count of numbers:"+numbers.size());
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Sum of Numbers = " + sum);

    }
}
