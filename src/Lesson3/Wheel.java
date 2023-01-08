package Lesson3;

import java.util.Objects;
import java.util.Scanner;

public class Wheel {
    private double wheelRadius;

    public Wheel(double wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public double getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(double wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public void increaseWheelRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the number to operate with wheelRadius:");
        double numeric = scanner.nextDouble();
        System.out.print("Choose the operation +/* u want your numeric increases:");
        Scanner scanner2 = new Scanner(System.in);
        switch (scanner2.nextLine()) {
            case "+" -> setWheelRadius(getWheelRadius() + numeric);
            case "*" ->  setWheelRadius(getWheelRadius() * numeric);
            default -> System.out.println("no operations like this");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.wheelRadius, wheelRadius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelRadius);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelRadius=" + wheelRadius +
                '}';
    }
}
