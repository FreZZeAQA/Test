package Lesson3;

import java.util.Objects;
import java.util.Scanner;

public class Helm {
    private double helmDiameter;

    public Helm(double helmDiameter) {
        this.helmDiameter = helmDiameter;
    }

    public double getHelmDiameter() {
        return helmDiameter;
    }

    public void setHelmDiameter(double helmDiameter) {
        this.helmDiameter = helmDiameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helm helm = (Helm) o;
        return Double.compare(helm.helmDiameter, helmDiameter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(helmDiameter);
    }

    public void reduceHelmDiameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the number to operate with helm diameter:");
        double numeric = scanner.nextDouble();
        System.out.print("Choose the operation {-}or{/} u want your numeric increases:");
        Scanner scanner2 = new Scanner(System.in);
        switch (scanner2.nextLine()) {
         case "-" -> setHelmDiameter(getHelmDiameter() - numeric);
         case "/" ->  setHelmDiameter(getHelmDiameter() / numeric);
            default -> System.out.println("no operations like this");
        }

    }
    @Override
    public String toString() {
        return "Helm{" +
                "helmDiameter=" + helmDiameter +
                '}';
    }
}
