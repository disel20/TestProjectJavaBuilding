package main.three;

public class Director {

    public void buildProduct(IProduct product) {
        product.installFirstPart(new Body());
        product.installSecondPart(new Engine(5.0, 1000.0));
        product.installThirdPart(new Tower());
    }
}
