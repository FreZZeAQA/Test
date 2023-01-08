package Lesson4;

public class Rose extends Flower{
    public Rose(String color,double price) {
        super.color=color;
        super.price=price;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
