package Session16.ThucHanh;

public class FoodProduct extends Product {
    private int discountPercent;

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculateFinalPrice() {
        return this.getPrice() - (this.getPrice() * this.discountPercent / 100);
    }

    @Override
    void displayInfo() {
        System.out.println("Phan tram giam gia: " + this.discountPercent);
    }
}
