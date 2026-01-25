package Session1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();

        int keSach = (stt - 1) / 25 + 1;
        int viTri = (stt - 1) % 25 + 1;

        String khuVuc = (keSach <= 10) ? "Khu Cận" : "Khu Viễn";

        System.out.println("\n--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.printf("Địa chỉ: Kệ số %d - Vị trí %d\n", keSach, viTri);
        System.out.printf("Phân khu : %s\n",khuVuc);
    }
}