package Session5;

import java.util.Scanner;

public class btth {

    static final int max = 100;
    static final String regex = "^B[0-9]{7}$";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = new String[max];
        int size = 0;
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hiển thị danh sách MSSV");
            System.out.println("2. Thêm mới MSSV");
            System.out.println("3. Cập nhật MSSV theo index");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    printStudent(students, size);
                    break;

                case 2:
                    if (size == max) {
                        System.out.println("Danh sách sinh viên full");
                        break;
                    }

                    System.out.print("Nhập mã sinh viên cần thêm: ");
                    String id = sc.nextLine();

                    size = addStudent(students, size, id);
                    break;

                case 3:
                    if (size == 0) {
                        System.out.println("Danh sách trống");
                        break;
                    }

                    System.out.print("Nhập index cần sửa: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập mã sinh viên mới: ");
                    String newId = sc.nextLine();

                    updateStudent(students, size, index, newId);
                    break;

                case 4:
                    if (size == 0) {
                        System.out.println("Danh sách trống");
                        break;
                    }

                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String deleteId = sc.nextLine();

                    size = deleteStudent(students, size, deleteId);
                    break;

                case 5:
                    if (size == 0) {
                        System.out.println("Danh sách trống");
                        break;
                    }

                    System.out.print("Nhập chuỗi cần tìm: ");
                    String key = sc.nextLine();

                    searchStudent(students, size, key);
                    break;

                case 6:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 6);
    }

    public static void printStudent(String[] students, int size) {
        if (size == 0) {
            System.out.println("Danh sách sinh viên trống");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.printf("Index %d : %s%n", i, students[i]);
        }
    }

    public static int addStudent(String[] students, int size, String id) {
        if (!id.matches(regex)) {
            System.out.println("Mã sinh viên không hợp lệ");
            return size;
        }

        students[size++] = id;

        System.out.println("Thêm thành công");
        return size;
    }

    public static void updateStudent(String[] students, int size, int index, String newId) {
        if (index < 0 || index >= size) {
            System.out.println("Index không hợp lệ");
            return;
        }

        if (!newId.matches(regex)) {
            System.out.println("Mã sinh viên không đúng định dạng");
            return;
        }

        students[index] = newId;
        System.out.println("Cập nhật thành công");
    }

    public static int deleteStudent(String[] students, int size, String id) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (students[i].equalsIgnoreCase(id)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên");
            return size;
        }

        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }

        students[size - 1] = null;
        size--;

        System.out.println("Xóa thành công");
        return size;
    }

    public static void searchStudent(String[] students, int size, String key) {
        boolean count = false;
        key = key.toLowerCase();

        for (int i = 0; i < size; i++) {
            if (students[i].toLowerCase().contains(key)) {
                System.out.printf("Index %d : %s%n", i, students[i]);
                count = true;
            }
        }

        if (!count) {
            System.out.println("Không tìm thấy mã sinh viên phù hợp");
        }
    }
}