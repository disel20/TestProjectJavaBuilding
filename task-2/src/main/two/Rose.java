package main.two;

public class Rose extends Flower {
    private double price;
    private final static String name = "Rose";

    public Rose(double price, Color color) {
        super(price, name, color);
    }
}
