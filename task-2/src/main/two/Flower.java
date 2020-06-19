package main.two;

public abstract class Flower {
    private final double price;
    private final String name;
    private final Color color;

    protected Flower(double price, String name, Color color) {
        this.price = price;
        this.name = name;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
