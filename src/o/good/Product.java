package o.good;

/**
 * O
 * Принцип открытости/закрытости (The Open Closed Principle)
 * «программные сущности … должны быть открыты для расширения, но закрыты для модификации.»
 */
public abstract class Product {


    private double basePrice;

    public abstract double calculateTaxIncludedPrice();

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

}
