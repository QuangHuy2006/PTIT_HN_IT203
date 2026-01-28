package Session4;

public class ex1 {
    static String title = "    lập TRÌNH JAVA   CƠ bản   ";
    static String author = "nguyễn văn  a";

    public static String fixString(String str, String role) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] arr = str.split(" ");
        String result = "";

        if (role.equals("name")) {

            for (int i = 0; i < arr.length; i++) {
                String x = arr[i];
                result += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            }
        }else{
            for (int i = 0; i < arr.length; i++){
                String x = arr[i];
                result += x.toUpperCase() + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.print(fixString(author, "name"));
        System.out.print(fixString(title, "a"));
    }
}
