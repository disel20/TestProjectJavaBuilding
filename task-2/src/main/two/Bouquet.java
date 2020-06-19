package main.two;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private double price;
    List<Flower> flowerList = new ArrayList<>();

    public double getPrice() {
        return price;
    }

    public Bouquet addFlower(Flower flower) {
        flowerList.add(flower);
        price += flower.getPrice();
        return this;
    }
}
