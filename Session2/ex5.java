package Session2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diemUyTin = 100;
        int soNgayTre;

        System.out.println("Nhap so ngay tre cua tung lan tra sach (Nhap 999 de thoat):");

        while (true) {

            soNgayTre = scanner.nextInt();

            if (soNgayTre == 999) {
                break;
            }
            if (soNgayTre <= 0) {
                diemUyTin += 5;
                System.out.println("Trả đúng hạn: +5 điểm");
            } else {
                int diemTru = soNgayTre * 2;
                diemUyTin -= diemTru;
                System.out.printf("Trả trễ %d ngày: -%d điểm\n", soNgayTre, diemTru);
            }
        }

        System.out.printf("Tổng điểm uy tín %d ", diemUyTin);

        if (diemUyTin > 120) {
            System.out.println("Độc giả thân thiết");
        } else if (diemUyTin >= 80) {
            System.out.println("độc giả tiêu chuẩn");
        } else {
            System.out.println("độc giả cần lưu ý");
        }
    }
}