package Lesson2;

import java.util.Objects;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 10;
        this.width = 15;
        }

    public Rectangle(int length, int width) {
        if (length > width) {
            this.length = length;
            this.width = width;
        } else {
            System.out.println("Rectangle with such values can't exist!!!");
        }

    }

    void rectangleSquare() {
        int square;
        square = length * width;
        System.out.println("Rectangle's square is:" + square);
    }

    void rectanglePerimeter() {
        int perimeter;
        perimeter = length + length + width + width;
        System.out.println("Rectangle's perimeter is:" + perimeter);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wide=" + width +
                '}';
    }
}
