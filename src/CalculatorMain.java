import CalculatorOperations.first.second.MyCalculator;

public class CalculatorMain {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.plus(150.5, 25));
        System.out.println(myCalculator.minus(1235, 235.9));
        System.out.println(myCalculator.devide(15, 5));
        System.out.println(myCalculator.multiply(10.5, 2));

    }
}
