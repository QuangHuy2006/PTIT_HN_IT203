package Session1;

import java.util.Scanner;

public class ex2 {
    public int delay;
    public int amount;
    public float money;
    public float afterMoney;
    public boolean lock;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ex2 a = new ex2();
        System.out.print("Nhap so ngay cham tre: ");
        a.delay = sc.nextInt();
        System.out.print("Nhap luong sach: ");
        a.amount = sc.nextInt();
        a.money = a.delay * a.amount * 5000;
        System.out.println("Tien phat goc: " + a.money);
        if (a.delay > 7 && a.amount >= 3) {
            a.afterMoney = a.money + (a.money * 20 / 100);
            System.out.println("Tien phat sau dieu chinh: " + a.afterMoney);
            if(a.afterMoney > 50000){
                a.lock = true;
                System.out.println("Yeu cau khoa the: " + a.lock);
            }else{
                a.lock = false;
            }
        }else{
            System.out.println("Tien phat goc: " + a.money);
            System.out.println("Yeu cau khoa the: " + a.lock);
        }
    }
}
