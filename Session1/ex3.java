package Session1;
public class ex3 {
    public static void main(String[] args) {

        String book1 = "java basic";
        String book2 = "Python Intro";

        System.out.printf("Trước khi hoán đổi : Book1 = %s , book2 = %s \n", book1 , book2);

        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.printf("Sau khi hoán đổi : Book1 = %s , book2 = %s", book1 , book2);


    }
}
