package main.three;

public class Tank {

    private final IProductPart productPart1;
    private final IProductPart productPart2;
    private final IProductPart productPart3;

    public Tank(IProductPart productPart1, IProductPart productPart2, IProductPart productPart3) {
        this.productPart1 = productPart1;
        this.productPart2 = productPart2;
        this.productPart3 = productPart3;
    }

    public IProductPart getProductPart1() {
        return productPart1;
    }

    public IProductPart getProductPart2() {
        return productPart2;
    }

    public IProductPart getProductPart3() {
        return productPart3;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "productPart1=" + productPart1 +
                ", productPart2=" + productPart2 +
                ", productPart3=" + productPart3 +
                '}';
    }
}
