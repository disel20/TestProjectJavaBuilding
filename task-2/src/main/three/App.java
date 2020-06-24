package main.three;

public class App {

    public static void main(String[] args) {
        Director director = new Director();
        TankBuilder builder = new TankBuilder();
        director.buildProduct(builder);
        Tank tank = builder.getResult();
        System.out.println("Tank built: " + tank.toString());
    }
}
