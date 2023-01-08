package Lesson4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tulip tulip = new Tulip("YELLOW",15);
        Rose rose = new Rose("RED",40);
        Peony peony = new Peony("PINK",100);
        List<Flower>bouquet=new ArrayList<>();
        bouquet.add(tulip);
        bouquet.add(tulip);
        bouquet.add(tulip);
        bouquet.add(tulip);
        bouquet.add(rose);
        bouquet.add(rose);
        bouquet.add(rose);
        bouquet.add(peony);
        bouquet.add(peony);
        double sum=0;

        for (Flower flower : bouquet) {
            double price = flower.getPrice();
            sum+=price;
        }
        System.out.println(sum);

    }



}
