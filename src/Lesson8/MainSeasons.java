/*
 *Developer's name:Yurii Stakhiv;
 *Date:03.01.2023;
 *The(@code MainSeason)class can use every developer;
 *This program has console menu where contains different manipulations with enums:@Months and @Seasons;
 */

package Lesson8;

import java.util.Locale;
import java.util.Scanner;

public class MainSeasons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice = "";

        //Looped menu where u choose a manipulation by number or end program by pressing<ENTER>;
        do {
            System.out.println("1.Does the month contain");
            System.out.println("2.Output all month of certain season");
            System.out.println("3.Output all months with same quantity");
            System.out.println("4.Output all months more than certain number");
            System.out.println("5.Output all months less than certain number");
            System.out.println("6.Output next season by certain season");
            System.out.println("7.Output previous season by certain season");
            System.out.println("8.Output months with pair number of days");
            System.out.println("9.Output months with no pair number of days");
            System.out.println("10.Does month has pair amount of days");
            System.out.println("If you want to end press <ENTER> ");
            System.out.print("Write choice and press <ENTER>:");
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println(contains());
                    break;
                case "2":
                    outputAllMonthsOfCertainSeason();
                    break;
                case "3":
                    outputAllMonthsWithSameQuantity();
                    break;
                case "4":
                    outputAllMonthsMoreThanCertainNumber();
                    break;
                case "5":
                    outputAllMonthsLessThanCertainNumber();
                    break;
                case "6":
                    System.out.println(nextSeason());
                    break;
                case "7":
                    System.out.println(prevSeason());
                    break;
                case "8":
                    pairAmountOfDays();
                    break;
                case "9":
                    noPairAmountOfDays();
                    break;
                case "10":
                    System.out.println(isMonthHasPairAmountOfDays());
                    break;
                default:
                    System.out.println("You left the program");
                    break;
            }
        } while (!choice.isEmpty());
    }

    //method which check scanned value if it exists in enum "Months" and returns true or false;
    public static boolean contains() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a month to check if is it:");
        String test = scanner.nextLine();
        for (Months months : Months.values()) {
            if (months.name().equals(test.toUpperCase(Locale.ROOT))) {
                return true;
            }
        }

        return false;
    }

    //method which output all values of scanned season;
    public static void outputAllMonthsOfCertainSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a season to get months:");
        Seasons season = Seasons.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        System.out.println("Months of:" + season);
        for (Months months : Months.values()) {
            if (months.seasons.equals(season))
                System.out.println(months);
        }
    }

    //method which output all values with the same quantity parameter you scanned
    public static void outputAllMonthsWithSameQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number to get Months with such days:");
        int scannerNumber = scanner.nextInt();
        for (Months months : Months.values()) {
            if (months.getDays() == scannerNumber)
                System.out.println(months);
        }
    }

    //method which output all values parameter of which is more than scanned number
    public static void outputAllMonthsMoreThanCertainNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number to get months with more days than the certain number:");
        int scannerNumber = scanner.nextInt();
        for (Months months : Months.values()) {
            if (months.getDays() > scannerNumber)
                System.out.println(months);
        }
    }

    //method which output all values parameter of which is less than scanned number
    public static void outputAllMonthsLessThanCertainNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number to get months with less days than the certain number:");
        int scannerNumber = scanner.nextInt();
        for (Months months : Months.values()) {
            if (months.getDays() < scannerNumber)
                System.out.println(months);
        }
    }

    //method which returns the next value of enum "Months"
    public static Seasons nextSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a season to get the next one:");
        Seasons season = Seasons.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        System.out.print("Next season of " + season + " is:");
        return Seasons.values()[(season.ordinal() + 1) % Seasons.values().length];
    }

    //method which returns the previous value of enum "Months"
    public static Seasons prevSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a season to get the previous one:");
        Seasons season = Seasons.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        System.out.print("Previous season of " + season + " is:");
        return Seasons.values()[(season.ordinal() - 1) % Seasons.values().length];
    }

    //method which output values whose parameters are paired
    public static void pairAmountOfDays() {
        System.out.println("\nPair amount of Days:");
        for (Months months : Months.values()) {
            if (months.getDays() % 2 == 0)
                System.out.println(months);
        }
    }

    //method which output values whose parameters are not paired
    public static void noPairAmountOfDays() {
        System.out.println("\nNo Pair amount of Days:");
        for (Months months : Months.values()) {
            if (months.getDays() % 2 > 0)
                System.out.println(months);
        }
    }

    //method which checks scanned value if its parameter is pair or not
    public static boolean isMonthHasPairAmountOfDays() {
        System.out.print("Write a month to check pair or not:");
        Scanner scanner = new Scanner(System.in);
        Months months = Months.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
        return months.getDays() % 2 == 0;
    }
}





