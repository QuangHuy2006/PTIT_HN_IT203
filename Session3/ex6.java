package Session3;

import java.util.Arrays;

public class ex6 {
    static int[] first = {1, 3, 5, 7, 9};
    static int[] second = {2, 3, 4, 5, 6, 8, 9, 10};

    public static void mergeBooks(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int n = c.length;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        ;
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = n / 2; j < n; j++) {
                if (c[i] == c[j]) {
                    for (int k = i; k < n - 1; k++) {

                        c[k] = c[k + 1];
                    }
                    n--;
                }
            }
        }
        for(int i = 0 ; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(c[j] > c[j + 1]){
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", c[i]);
        }
    }

    public static void main(String[] args) {
        mergeBooks(first, second);
    }
}
