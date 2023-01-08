package Lesson3;

import java.util.Objects;
import java.util.Scanner;

public class CarBody {
    private double weightCarBody;

    public CarBody(double weightCarBody) {
        this.weightCarBody = weightCarBody;
    }

    public double getWeightCarBody() {
        return weightCarBody;
    }

    public void setWeightCarBody(double weightCarBody) {
        this.weightCarBody = weightCarBody;
    }
    public void changeWeightCarBody() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the number to operate with weight:");
        double numeric = scanner.nextDouble();
        System.out.print("Choose the operation {+}{-}{/}{*} u want your numeric do with weight:");
        Scanner scanner2 = new Scanner(System.in);
        switch (scanner2.nextLine()) {
            case "+" -> setWeightCarBody(getWeightCarBody() + numeric);
            case "-" -> setWeightCarBody(getWeightCarBody() - numeric);
            case "*" -> setWeightCarBody(getWeightCarBody() * numeric);
            case "/" -> setWeightCarBody(getWeightCarBody() / numeric);
            default -> System.out.println("no operations like this");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBody carBody = (CarBody) o;
        return Double.compare(carBody.weightCarBody, weightCarBody) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightCarBody);
    }

    @Override
    public String toString() {
        return "CarBody{" +
                "weightCarBody=" + weightCarBody +
                '}';
    }
}
