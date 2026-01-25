package Session1;

import java.util.Scanner;

public class ex1 {
    public String bookID;
    public String bookName;
    public int publishYear;
    public double price;
    public boolean isAvailable;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex1 a = new ex1();
        System.out.print("Nhap ma sach: ");
        a.bookID = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        a.bookName = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        a.publishYear = sc.nextInt();

        System.out.print("Nhap gia sach: ");
        a.price = sc.nextDouble();

        System.out.print("Sach con khong? (true/false): ");
        a.isAvailable = sc.nextBoolean();

        System.out.println("Ma sach: " + a.bookID);
        System.out.println("Ten sach: " + a.bookName);
        System.out.println("Nam XB: " + a.publishYear);
        System.out.println("Gia: " + a.price);
        System.out.println("Con sach: " + a.isAvailable);
    }
}
