package Session3;

public class ex2 {
    static String[] books = {"Quang anime", "Dương Anime", "Trần Trí Anime", "Mynato", "Toàn Anime"};
    public static int searchBooks(String[] arr, String search, int i){
        if(i == arr.length) return -1;
        if(search.equalsIgnoreCase(arr[i])) return i;
        return searchBooks(arr, search, i + 1);
    }
    public static void main(String[] args){
        if(searchBooks(books, "Trần Trí Anime", 0) < 0){
            System.out.println("Không tìm thấy sách!");
        }else
        System.out.print("Tìm thấy sách ở vị trí: " + searchBooks(books, "Trần Trí Anime", 0));
    }
}
