package Session1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách 4 chữ số : ");
        int bookID = sc.nextInt();
        int thousands = bookID / 1000;
        int hundreds = (bookID / 100) % 10;
        int dozens = (bookID / 10) % 10;
        int units = bookID % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;

        int expectedCheckDigit = sumOfFirstThreeNumber % 10;

        boolean isValid = (expectedCheckDigit == units);

        System.out.println("Chữ số kiểm tra kỳ vọng : 6");
        System.out.println("Mã hợp lệ: " + isValid);
    }
}