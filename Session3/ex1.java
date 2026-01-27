package Session3;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    static int[] arr = new int[5];
    static Scanner s = new Scanner(System.in);
    public static int n;
    public static void addBookToLibraries(int n, int i) {
        if (i == n) return;
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            arr[i] = s.nextInt();
            addBookToLibraries(n, i + 1);
    }
    public static void main(String[] args){
        System.out.print("Nhap so luong sach can quan ly: ");
        n = s.nextInt();
        arr = new int[n];
        addBookToLibraries(n, 0);
        System.out.println("--Ket Qua--");
        System.out.print(Arrays.toString(arr));
    }
}
