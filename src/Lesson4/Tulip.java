package Lesson4;

public class Tulip extends Flower{
    public Tulip(String color,double price) {
        super.color=color;
        super.price=price;
    }



    @Override
    public String toString() {
        return "Tulip{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

