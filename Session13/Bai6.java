package Session13;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai6 {
    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;

    public Bai6(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    static ArrayList<Bai6> listBai6 = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.print("""
                    \n--- CHƯƠNG TRÌNH QUẢN LÝ ĐƠN THUỐC ---
                    1. Thêm thuốc vào đơn
                    2. Điều chỉnh số lượng
                    3. Xóa thuốc
                    4. In hóa đơn
                    5. Tìm thuốc giá rẻ (Dưới 50.000 VNĐ)
                    6. Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addBai6();
                    break;
                case 2:
                    adjustQuantity();
                    break;
                case 3:
                    removeBai6();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapBai6();
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);
    }

    public static void addBai6() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();
        for (Bai6 m : listBai6) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Thuốc đã tồn tại. Nhập số lượng cộng thêm: ");
                int extra = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + extra);
                System.out.println("Đã cập nhật số lượng.");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        int qty = Integer.parseInt(sc.nextLine());

        listBai6.add(new Bai6(id, name, price, qty));
        System.out.println("Thêm thuốc mới thành công.");
    }

    public static void adjustQuantity() {
        System.out.print("Nhập mã thuốc cần chỉnh: ");
        String id = sc.nextLine();
        for (int i = 0; i < listBai6.size(); i++) {
            if (listBai6.get(i).getDrugId().equals(id)) {
                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());
                if (newQty <= 0) {
                    listBai6.remove(i);
                    System.out.println("Số lượng bằng 0, đã xóa thuốc khỏi đơn.");
                } else {
                    listBai6.get(i).setQuantity(newQty);
                    System.out.println("Cập nhật số lượng thành công.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy mã thuốc.");
    }

    public static void removeBai6() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();
        for (Bai6 element : listBai6) {
            if (element.getDrugId().equals(id)) {
                listBai6.remove(element);
                System.out.println("Xoá thuốc thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy mã thuốc.");
    }

    public static void printInvoice() {
        if (listBai6.isEmpty()) {
            System.out.println("Đơn thuốc trống.");
            return;
        }
        System.out.println("\n--- HÓA ĐƠN ĐƠN THUỐC ---");
        System.out.printf("%-10s %-20s %-10s %-10s %-15s\n", "Mã", "Tên thuốc", "Giá", "SL", "Thành tiền");
        double total = 0;
        for (Bai6 m : listBai6) {
            double subTotal = m.getUnitPrice() * m.getQuantity();
            total += subTotal;
            System.out.printf("%-10s %-20s %-10.2f %-10d %-15.2f\n",
                    m.getDrugId(), m.getDrugName(), m.getUnitPrice(), m.getQuantity(), subTotal);
        }
        System.out.println("----------------------------------------------------------");
        System.out.printf("TỔNG TIỀN: %.2f VNĐ\n", total);

        listBai6.clear();
        System.out.println("Đã làm mới đơn thuốc cho bệnh nhân tiếp theo.");
    }

    public static void findCheapBai6() {
        System.out.println("\n--- DANH SÁCH THUỐC GIÁ RẺ (< 50.000 VNĐ) ---");
        boolean found = false;
        for (Bai6 m : listBai6) {
            if (m.getUnitPrice() < 50000) {
                System.out.printf("%-15s %-25s %-15.2f\n", m.getDrugId(), m.getDrugName(), m.getUnitPrice());
                found = true;
            }
        }
        if (!found) System.out.println("Không có thuốc nào dưới 50.000 VNĐ.");
    }
}
