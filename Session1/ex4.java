package Session1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá sách (usd) : ");
        double priceUSD = sc.nextDouble();
        System.out.println("Nhập tỷ giá (vnd) : ");
        float rate = sc.nextFloat();

        // tính tiền việt
        double priceVND = priceUSD * rate;

        // ép kiểu
        long priceVNDRounded = (long) priceVND;

        System.out.printf("Tổng tiền VNĐ : %d " ,priceVNDRounded);
    }
}