package Session2;
import java.util.Scanner;
public class ex2 {
    public static char code;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma khu vuc(A,B,C,D): ");
        code = s.next().charAt(0);
        switch(code){
            case 'A':
                System.out.print("Vi tri: Tầng 1: Sách Văn học");
                break;
            case 'B':
                System.out.print("Vi tri: Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.print("Vi tri: Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.print("Vi tri: Tầng 4: Sách Tin học");
                break;
            default:
                System.out.print("Khong hop le");
        }
    }
}
