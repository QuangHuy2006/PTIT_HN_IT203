package Session2;
import java.util.Scanner;
public class ex3 {
    public static int loop;
    public static int delay;
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong sach tra muon: ");
        loop = s.nextInt();
        int total = 0;
        for(int i = 1; i <= loop; i++){
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            delay = s.nextInt();
            total += delay * 5000;
        }
        System.out.print("===> Tong tien phat: " + total + " VND");
    }
}
