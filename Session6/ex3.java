package Session6;

public class ex3 {
    private String productID;
    private String productName;
    private double price;


    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public boolean setPrice(double price) {
        if(price > 0)
        this.price = price;
        else return false;
        return true;
    }

    public ex3(String productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
    public void showProduct(){
        System.out.println("Id san pham: " + productID );
        System.out.println("Ten san pham: " + productName);
        System.out.println("Gia: " + price);
    }

    public static void main(String[] args){
        ex3 product1 = new ex3("PR01", "But chi", 0);
        if(product1.setPrice(product1.price)){
            product1.showProduct();
        }else{
            System.out.println("Gia khong hop le");
        }
    }
}
