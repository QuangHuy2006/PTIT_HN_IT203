package Session2;
import java.util.Scanner;
public class ex1 {
    public int age;
    public int amount;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ex1 a = new ex1();
        System.out.print("Nhap tuoi cua ban: ");
        a.age = s.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        a.amount = s.nextInt();
        if(a.age >= 18 && a.amount < 3){
            System.out.println("Ket qua: Ban Du Dieu Kien Muon Sach Quy Hiem");
        }else if(a.age < 18){
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("- Ly do: Ban phai tu 18 tuoi tro len.");
        }else if(a.amount > 3){
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("- Ly do: Ban da muon toi da 3 cuon.");
        }
    }
}
