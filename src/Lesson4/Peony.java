package Lesson4;

public class Peony extends Flower{
    public Peony(String color,double price) {
        super.color=color;
        super.price=price;
    }

    @Override
    public String toString() {
        return "Peony{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
