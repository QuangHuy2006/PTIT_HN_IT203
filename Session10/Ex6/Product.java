package Ex6;

import java.util.Arrays;
import java.util.Comparator;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name='" + name + "', price=" + price + "";
    }

    public static void main(String[] args) {
        Product[] arr = new Product[3];
        arr[0] = new Product("Laptop", 1500);
        arr[1] = new Product("Phone", 800);
        arr[2] = new Product("Tablet", 1200);
        Arrays.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        System.out.println("Sắp xếp theo giá: " + Arrays.toString(arr));
        Arrays.sort(arr, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("Sắp xếp theo tên: " + Arrays.toString(arr));
    }
}