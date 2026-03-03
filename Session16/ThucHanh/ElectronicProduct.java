package Session16.ThucHanh;

public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    double calculateFinalPrice(){
        if(this.warrantyMonths > 12){
            return this.getPrice() + 1000000;
        }else{
            return this.getPrice();
        }
    }
    @Override
    void displayInfo(){
        System.out.println("So thang bao hanh: " + this.warrantyMonths);
    }
}
