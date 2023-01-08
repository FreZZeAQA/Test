package Lesson1;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        double m;
//        int n;
        double n;
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Money Sum:");
        m = scanner.nextDouble();
        System.out.print("Interest Rate in %:");
        n = scanner.nextDouble();
        System.out.print("Number of Years:");
        k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
//            m += m * n;
        m += m * n / 100;
        }
        System.out.println("Contribution for " + k + " years is:" + m);
    }
}
