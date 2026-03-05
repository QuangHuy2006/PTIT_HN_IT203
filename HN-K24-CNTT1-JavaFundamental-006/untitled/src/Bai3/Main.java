package Bai3;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner s = new Scanner(System.in);
        int tc = 0;
        while (tc <= 0) {
            System.out.print("Nhap testcase: ");
            tc = s.nextInt();
            if (tc <= 0) System.out.println("Khong hop le input phai > 0");
        }
        while (tc >= 1) {
            st.push(Math.round((float) tc) % 2);
            tc /= 2;
        }
        String result = "";
        while (!st.isEmpty()) {
            result += st.pop();
        }
        System.out.print(result);
    }
}
