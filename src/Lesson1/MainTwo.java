package Lesson1;

import java.util.*;

public class MainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numberList = new LinkedList<>();
        numberList.add(2.8);
        numberList.add(5.23);
        numberList.add(100.0);
        numberList.add(9.78);
        numberList.add(1.0);
        numberList.add(57.0);
        numberList.add(67.6);
        numberList.add(8.0);
        numberList.add(9.5);
        System.out.println("Number List:"+numberList);
        numberList.sort(Comparator.comparingDouble(o -> o));
        System.out.println("Sorted numbers:"+numberList);
        numberList.removeIf(thisDouble -> Math.floor(thisDouble) != thisDouble);
        System.out.println("Integer numbers:"+numberList);
        System.out.print("Range from:");
        int start = scanner.nextInt();
        System.out.print("Range to:");
        int end = scanner.nextInt();
        for (Double numbers : numberList) {
            if (numbers >= start && numbers <= end)
                System.out.println("Number in range:" + numbers);
        }
    }
}
