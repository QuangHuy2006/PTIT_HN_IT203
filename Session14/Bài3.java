package Session14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bài3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo các danh sách thành phần thuốc và các thành phần dị ứng
        Set<String> ingredients = new HashSet<>(Set.of("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> allergens = Set.of("Penicillin", "Aspirin", "Pollen");

        // Tạo 1 bản sao của danh sách thành phần
        Set<String> mapIngredients = new HashSet<>(ingredients);

        // Sử dụng phép giao retail để kiểm tra (Giữ lại) các thành phần dị ứng mà có chứa trong thành phần thuốc
        boolean retainIngredient = mapIngredients.retainAll(allergens);

        // Sử dụng hiệu để loại bỏ những thành phần giao (thành phần dị ứng có trong thuốc)
        boolean result = ingredients.removeAll(mapIngredients);

        // Output
        System.out.println("Cảnh báo dị ứng: " + mapIngredients);
        System.out.println("Thành phần an toàn: " + ingredients);

    }
}