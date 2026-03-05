package Bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> Imap = new HashMap<>();
        Scanner s = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.print("nhap so luong phan tu trong mang: ");
            n = s.nextInt();
            if (n <= 0) System.out.println("So luong phai > 0");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            Imap.put(arr[i], count);
        }

        for (Map.Entry<Integer, Integer> map : Imap.entrySet()) {
            System.out.println(map.getKey() + " xuat hien: " + map.getValue() + " lan");
        }
        int max = 0;
        int maxPos = 0;
        for (Map.Entry<Integer, Integer> map : Imap.entrySet()) {
            if (max < map.getValue()) {
                max = map.getValue();
                maxPos = map.getKey();
            }
        }
        System.out.print("So xuat hien nhieu nhat: " + maxPos + " (" + max + " lan" + ")");
    }
}
