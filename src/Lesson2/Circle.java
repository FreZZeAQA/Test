package Lesson2;

import java.util.Objects;
import java.util.Scanner;

public class Circle  {
    private static final Double PI=3.14;
    private double radius;
    private double diameter;


    void outputCircleSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a Circle diameter to find Square:");
        diameter=scanner.nextDouble();
        double S = PI/4*diameter*diameter;
        System.out.println("Square is:"+S);
    }

    void outputCircuit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a Circle radius to find Circuit:");
        radius=scanner.nextDouble();
        double C = 2*PI*radius;
        System.out.println(C);

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Double.compare(circle.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, diameter);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }



}
