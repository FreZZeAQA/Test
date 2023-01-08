package Lesson2;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.rectangleSquare();
        rectangle.rectanglePerimeter();
        Rectangle rectangle1 = new Rectangle(10,11);
        rectangle1.rectangleSquare();
        rectangle1.rectanglePerimeter();

    }
}
