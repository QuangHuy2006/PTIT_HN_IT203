
package Session5;

import java.util.Arrays;
import java.util.Scanner;

public class miniproject {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = getInt("Nhập lựa chọn: ");

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    // ================= MENU =================
    static void showMenu() {
        System.out.println("\n========= MENU =========");
        System.out.println("1. Two Sum");
        System.out.println("2. Move Zeroes");
        System.out.println("3. Valid Palindrome");
        System.out.println("4. Reverse Words");
        System.out.println("5. Happy Number");
        System.out.println("0. Thoát");
        System.out.println("========================");
    }

    // ================= UTILS =================
    static int getInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Nhập số hợp lệ: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static int[] inputArray() {
        int n = getInt("Nhập số phần tử: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = getInt("arr[" + i + "] = ");
        }
        return arr;
    }

    // ================= FR1: TWO SUM =================
    // Logic: Tìm 2 phần tử trong mảng có tổng bằng target
    // Sử dụng vòng lặp lồng nhau để kiểm tra tất cả cặp phần tử
    // Time complexity: O(n²), Space complexity: O(1)
    static void twoSum() {
        int[] arr = inputArray();
        int target = getInt("Nhập target: ");

        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.printf("Tìm thấy cặp chỉ số: [%d, %d] (giá trị: %d + %d = %d)\n", i, j, arr[i], arr[j],
                            arr[i] + arr[j]);
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy cặp nào");
        }
    }

    static void moveZeroes() {
        int[] arr = inputArray();
        int index = 0; // Con trỏ để đánh dấu vị trí ghi phần tử khác 0

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println("Mảng sau khi dồn 0:");
        System.out.println(Arrays.toString(arr));
    }

    static void validPalindrome() {
        System.out.print("Nhập chuỗi: ");
        scanner.nextLine(); // Clear buffer
        String s = scanner.nextLine();
        // s = "  a21 bc cb a      "
        // Sử dụng regex để loại bỏ tất cả ký tự không phải chữ cái hoặc số
        // [^a-zA-Z0-9] = phủ định của [a-zA-Z0-9] (tức là tất cả ký tự KHÔNG phải chữ
        // và số)
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Tạo chuỗi đảo ngược
        String reversed = new StringBuilder(filtered).reverse().toString();

        if (filtered.equals(reversed)) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println("Chuỗi không phải Palindrome");
        }
    }

    static void reverseWords() {
        System.out.print("Nhập câu: ");
        scanner.nextLine(); // Clear buffer
        String s = scanner.nextLine();

        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Câu sau khi đảo ngược từ:");
        System.out.println(reversed.toString());
    }

    static void happyNumber() {
        int n = getInt("Nhập số n: ");

        int count = 0; // đếm số lần lặp

        while (n != 1 && count < 100) {
            n = sumOfSquares(n);
            count++;
        }

        if (n == 1) {
            System.out.println("Là số hạnh phúc");
        } else {
            System.out.println("Không phải số hạnh phúc");
        }
    }

    static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}


    