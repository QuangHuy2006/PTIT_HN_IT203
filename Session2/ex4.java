package Session2;

import java.util.Scanner;

public class ex4 {
    public static int id = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Nhap ma ID sach moi(phai > 0): ");
            id = s.nextInt();
            if(id < 0){
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
            }
        } while (id <= 0);
            System.out.print("Xac nhan: Ma sach " + id + " da duoc ghi nhan");
    }
}
