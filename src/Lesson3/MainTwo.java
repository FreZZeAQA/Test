package Lesson3;

public class MainTwo {
    public static void main(String[] args) {
        Car car = new Car(Color.BLACK,new CarBody(2100),new Helm(11),new Wheel(16));
        System.out.println(car);
        car.changeColor();
        car.getCarBody().changeWeightCarBody();
        car.getWheel().increaseWheelRadius();
        car.getHelm().reduceHelmDiameter();
        System.out.println(car);


    }
}
