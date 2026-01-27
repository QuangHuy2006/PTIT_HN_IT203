package Session3;

public class ex5 {
    static int[] books = {101,102,103,104,105};
    public static void deleteBook(int[] arr, int bookId){
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            if(arr[i] == bookId){
                for(int j = i; j < n - 1;j++){
                    arr[j] = arr[j + 1];
                }
                n--;
            }
        }
        for(int i = 0 ; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void main(String[] args){
        deleteBook(books, 103);
    }
}
