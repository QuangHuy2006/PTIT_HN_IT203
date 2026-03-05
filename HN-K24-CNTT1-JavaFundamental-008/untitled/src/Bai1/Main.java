package Bai1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> list =new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int tc = 0;
        while (tc <= 0) {
            System.out.print("Nhap so luong: ");
            tc = s.nextInt();
            if (tc <= 0) System.out.println("So luong phai > 0");
        }
        for(int i = 0 ; i < tc; i++){
            System.out.printf("Nhap ten nguoi thu %d: ", i + 1);
            String name = s.next();
            list.add(name);
        }
        int longestNameIndex = list.get(0).length();
        String LongestName = "";
        for(int i = 0 ; i < tc ; i++){
                if(longestNameIndex < list.get(i).length()){
                    longestNameIndex = list.get(i).length();
                    LongestName = list.get(i);
                }
        }
        System.out.printf("Longest name: %s\n", LongestName);
        for(int i = 0; i < tc; i++){
            for(int j = 0; j < tc - i - 1; j++){
                if(list.get(j).charAt(0) > list.get(j + 1).charAt(0)){
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.print("Sorted list: ");
        for(int i = 0; i < tc ; i++){
            System.out.printf("%s ", list.get((i)));
        }
        int count = 0;
        for(int i = 0 ; i < tc; i++){
            if(list.get(i).startsWith("A")) count++;
        }
        System.out.println("\nNumber of names starting with A: "+ count);
    }
}
