package main.two;

public class Tulip extends Flower {
    private double price;
    private final static String name = "Tulip";

    public Tulip(double price, Color color) {
        super(price, name, color);
    }
}
