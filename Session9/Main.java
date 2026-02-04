package Session9;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        MamalAnimal mamal = new MamalAnimal();

        System.out.println("=== NHẬP THÔNG TIN CHIM ===");
        bird.input();

        System.out.println("\n=== NHẬP THÔNG TIN ĐỘNG VẬT CÓ VÚ ===");
        mamal.input();

        System.out.println("\n=== THÔNG TIN CHIM ===");
        bird.display();

        System.out.println("\n=== THÔNG TIN ĐỘNG VẬT CÓ VÚ ===");
        mamal.display();
    }
}
