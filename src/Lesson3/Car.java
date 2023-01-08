package Lesson3;

import java.util.Scanner;

public class Car {
   private Color color;
   private CarBody carBody;
   private Helm helm;
   private Wheel wheel;

    public Car(Color color, CarBody carBody, Helm helm, Wheel wheel) {
        this.color = color;
        this.carBody = carBody;
        this.helm = helm;
        this.wheel = wheel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    void changeColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose color u want change in {WHITE,BLACK,BLUE,RED,GREY,GREEN,YELLOW}:");
        switch (scanner.nextLine()) {
            case "BLACK" -> setColor(Color.BLACK);
            case "WHITE" -> setColor(Color.WHITE);
            case "BLUE" -> setColor(Color.BLUE);
            case "RED" -> setColor(Color.RED);
            case "YELLOW" -> setColor(Color.YELLOW);
            case "GREEN" -> setColor(Color.GREEN);
            case "GREY" -> setColor(Color.GREY);
            default -> System.out.println("Nc colors like this");
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", carBody=" + carBody +
                ", helm=" + helm +
                ", wheel=" + wheel +
                '}';
    }
}
