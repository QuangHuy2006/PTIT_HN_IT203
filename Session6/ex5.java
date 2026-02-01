package Session6;

public class ex5 {
    String bookID;
    String bookName;
    int publishYear;

    public ex5(String bookID, String bookName, int publishYear) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.publishYear = publishYear;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void showBook(){
        System.out.println("ID sach: " + bookID);
        System.out.println("Ten sach: " + bookName);
        System.out.println("Nam san xuat: " + publishYear);
    }

    public static void main(String[] args){
        ex5 book1 = new ex5("B01", "Ai biet duoc", 2025);
        book1.showBook();
    }
}

