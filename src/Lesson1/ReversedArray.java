package Lesson1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReversedArray {
    static int SIZE = 5;

    public static void main(String[] args) {
        Integer[] numbers = new Integer[SIZE];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length;) { //вивід повного масиву
            System.out.print("Number:");
            numbers[i] = scanner.nextInt();
                    i++;
        }
        System.out.println("Original Array:"+Arrays.toString(numbers));
        Collections.reverse(Arrays.asList(numbers));
        System.out.println("Reversed Array:" + Arrays.asList(numbers));

    }
}
