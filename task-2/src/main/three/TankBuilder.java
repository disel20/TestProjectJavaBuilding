package main.three;

public class TankBuilder implements IProduct {
    private IProductPart productPart1;
    private IProductPart productPart2;
    private IProductPart productPart3;


    @Override
    public void installFirstPart(IProductPart productPart1) {
        this.productPart1 = productPart1;
    }

    @Override
    public void installSecondPart(IProductPart productPart2) {
        this.productPart2 = productPart2;
    }

    @Override
    public void installThirdPart(IProductPart productPart3) {
        this.productPart3 = productPart3;
    }

    public Tank getResult() {
        return new Tank(productPart1, productPart2, productPart3);
    }
}
