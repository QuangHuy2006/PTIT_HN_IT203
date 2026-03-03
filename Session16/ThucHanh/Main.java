package Session16.ThucHanh;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepository productRepository = new ProductRepository();
        ElectronicProduct ep1 = new ElectronicProduct("P01", "Máy rửa bát", 20000000, 24);
        ElectronicProduct ep2 = new ElectronicProduct("P02", "Điện thoại", 12000000, 36);
        FoodProduct fp1 = new FoodProduct("F01", "Khô gà", 36000, 0);
        FoodProduct fp2 = new FoodProduct("F02", "Khô heo", 56000, 5);

        productRepository.arrayList.add(ep1);
        productRepository.arrayList.add(ep2);
        productRepository.arrayList.add(fp1);
        productRepository.arrayList.add(fp2);

        for (Product product : productRepository.arrayList) {
            if (product instanceof ElectronicProduct) {
                ((ElectronicProduct) product).displayInfo();
                System.out.printf(" - Thành tiền: %.2f\n", product.calculateFinalPrice());
            }

            if (product instanceof FoodProduct) {
                ((FoodProduct) product).displayInfo();
                System.out.printf("Thành tiền: %.2f\n", product.calculateFinalPrice());
            }
        }

        System.out.print("Mời nhập id sản phẩm cần tìm: ");
        String id = sc.nextLine();

        for (Map.Entry<String, Product> entry : productRepository.hashMap.entrySet()) {
            if (entry.getKey().equals(id)) {
                if (entry.getValue() instanceof ElectronicProduct)
                    ((ElectronicProduct) entry.getValue()).displayInfo();
            }

            if (entry.getKey().equals(id)) {
                if (entry.getValue() instanceof FoodProduct)
                    ((FoodProduct) entry.getValue()).displayInfo();
            }
        }
    }
}
