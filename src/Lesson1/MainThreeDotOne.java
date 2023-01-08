package Lesson1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainThreeDotOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        do {
            System.out.print("Number:");
            numberList.add(scanner.nextInt());
        } while (numberList.size() < 10);
        System.out.print("Negative numbers:");

        int negativeNumbers = 0;
        for (Integer numbers : numberList) {
            if (numbers < 0)
                negativeNumbers++;
        }
        System.out.println(negativeNumbers);

        int positiveNumbers = 0;
        System.out.print("Positive numbers:");
        for (Integer numbers : numberList) {
            if (numbers > 0)
                positiveNumbers++;
        }
        System.out.println(positiveNumbers);

        int nullNumbers = 0;
        System.out.print("Zero numbers:");
        for (Integer numbers : numberList) {
            if (numbers == 0)
                nullNumbers++;
        }
        System.out.println(nullNumbers);
    }
}

