package Session3;

import java.util.Scanner;

public class ex3 {
    public static void maxQuantityOfBooks(String[] names ,int[] quantities ){
        int max = quantities[0];
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > max){
                max = quantities[i];
            }
        }
        System.out.println("Sách có số lượng nhiều nhất :");

        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.printf("%s : %d\n", names[i], quantities[i]);
            }
        }
    }

    public static void minQuantityOfBooks (String[] names ,int[] quantities ){
        int min = quantities[0];

        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] < min){
                min = quantities[i];
            }
        }
        System.out.println("sách có số lượng ít nhất : ");
        for (int i = 0; i < quantities.length; i++) {
            if(quantities[i] == min){
                System.out.printf("%s : %d \n", names[i] , quantities[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"sách 1" , "sách 2" , "sách 3", "sách 4" , "sách 5" };

        int[] quantities = { 5 , 6 , 7 ,8 ,9 };

        maxQuantityOfBooks(names , quantities );
        minQuantityOfBooks(names , quantities);

    }
}
