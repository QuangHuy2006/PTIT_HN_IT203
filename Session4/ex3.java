package Session4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ex3 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        int iterations = 1000;
        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        long startSB = System.currentTimeMillis();
        StringBuilder reportSB = new StringBuilder();
        reportSB.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportSB.append("Ngày tạo: ").append(currentTime).append("\n");

        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < transactions.length; j++) {
                reportSB.append("Giao dịch: ").append(transactions[j]).append("\n");
            }
        }
        long endSB = System.currentTimeMillis();

        long startS = System.currentTimeMillis();
        String reportS = "";
        reportS += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportS += "Ngày tạo: " + currentTime + "\n";

        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < transactions.length; j++) {
                reportS += "Giao dịch: " + transactions[j] + "\n";
            }
        }
        long endS = System.currentTimeMillis();

        System.out.println("--- BÁO CÁO MƯỢN SÁCH ---");
        System.out.println("Ngày tạo: " + currentTime);
        for (String t : transactions) {
            System.out.println("Giao dịch: " + t);
        }

        System.out.println("\nSố thời gian thực thi đối với StringBuilder: " + (endSB - startSB) + " ms");
        System.out.println("Số thời gian thực thi đối với String: " + (endS - startS) + " ms");
    }
}