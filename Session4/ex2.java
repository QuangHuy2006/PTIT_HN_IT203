package Session4;

public class ex2 {
    public static void main(String[] args) {
        String descreption = "Sách giáo khoa toán lớp 12, Kệ: A1-102, tình trạng mới";
        boolean isCheck = descreption.contains("Kệ:");
        if (isCheck) {
            int start = descreption.indexOf("Kệ: ");
            int end = descreption.indexOf(",", start);
            String str;

            str = descreption.substring(start, end).trim();
            System.out.printf("Vị trí tìm thấy: %s\n", str);
            System.out.printf("Sách giáo khoa toán lớp 12, Vị trí lưu trữ: A1-102, tình trạng mới");
        } else {
            System.out.print("Không tìm thấy kệ");
        }
    }
}