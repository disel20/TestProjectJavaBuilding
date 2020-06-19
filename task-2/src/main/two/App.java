package main.two;

public class App {
    public static void main(String[] args) {
        Сhamomile chamomile = new Сhamomile(0.5, Color.Yellow);
        Rose rose1 = new Rose(2.5, Color.Red);
        Rose rose2 = new Rose(2.5, Color.Pink);
        Tulip tulip = new Tulip(1.5, Color.Red);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(chamomile);
        bouquet.addFlower(rose1).addFlower(rose2).addFlower(tulip);
        System.out.println("Price of bouquet will be " +  bouquet.getPrice() + "$");
    }
}
