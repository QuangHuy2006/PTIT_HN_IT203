package Session8.HN_K24_CNTT1_TonPhamQuangHuy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static int choice;
    static Student st = new Student();
    public static Student[] students = new Student[100];
    public static int amountStudent = 0;

    public static void addStudent() {
        System.out.print("Nhập số lượng sinh viên muốn thêm: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap ID sinh vien thu %d: ", i + 1);
            String id = s.next();
            String regex = "^SV[a-zA-Z0-9]{3}$";
            if (!id.matches(regex)) {
                System.out.println("Id khong hop le");
                return;
            }
            System.out.printf("Nhap ten sinh vien thu %d: ", i + 1);
            String name = s.next();
            System.out.printf("Nhap diem sinh vien thu %d: ", i + 1);
            double score = s.nextDouble();
            Student st = new Student(id, name, score);
            students[amountStudent] = st;
            amountStudent++;
        }
    }

    public static void showStudent() {
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("Thông tin sinh vien: " + students[i].toString());
        }
    }

    public static void findByRank(String rank) {
        for (int i = 0; i < amountStudent; i++) {
            if (students[i].getRank(students[i].score).equals(rank)) {
                System.out.println("Thông tin sinh viên: " + students[i].toString());
            }
        }
    }

    public static void sortByRank() {
        for (int i = 0; i < amountStudent - 1; i++) {
            for (int j = 0; j < amountStudent - i - 1; j++) {
                if (students[j].score < students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        showStudent();
    }

    public static void main(String[] args) {
        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudent();
                    break;
                case 3:
                    findByRank("Gioi");
                    break;
                case 4:
                    sortByRank();
                    break;
                default:
                    System.out.println("Khon hop le!");
                    break;
            }
        } while (choice != 5);

    }
}
