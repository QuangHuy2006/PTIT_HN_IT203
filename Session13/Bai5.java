package Session13;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Bai5 {
    private String id;
    private String fullName;
    private int age;
    private String diagnosis;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Bai5(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }
    static ArrayList<Bai5> listBai5 = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.print("""
                    1.Tiếp nhận bệnh nhân.
                    2.Cập nhật chuẩn đoán.
                    3.Xuất viện
                    4.Sắp xếp danh sách bệnh nhân
                    5.Hiển thị danh sách bệnh nhân
                    6.Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Nhập id: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập chẩn đoán: ");
                    String diagnosis = sc.nextLine();

                    addBai5(new Bai5(id, name, age, diagnosis));
                    break;
                case 2:
                    System.out.print("Nhập ID bệnh nhân để cập nhật chẩn đoán: ");
                    String Id = sc.nextLine();
                    updateDiagnosis(Id);
                    break;
                case 3:
                    System.out.print("Nhập ID bệnh nhân để xuất viện: ");
                    String ID = sc.nextLine();
                    dischargedHospital(ID);
                    break;
                case 4:
                    sortBai5s();
                    break;
                case 5:
                    displayBai5();
                    break;
                case 6:
                    break;

            }
        }while(choice != 6);
    }

    public static void addBai5(Bai5 newBai5){
        if(newBai5.getFullName().isBlank() || newBai5.getAge() <= 0 || newBai5.getDiagnosis().isBlank()){
            System.out.println("Thông tin bệnh nhân không hợp lệ");
            return;
        }
        listBai5.add(newBai5);
        System.out.println("Thêm bệnh nhân thành công.");
    }

    public static void updateDiagnosis(String id){
        for(Bai5 element : listBai5){
            if(element.getId().equals(id)){
                System.out.print("Nhập chuẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                element.setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân có ID: " + id);
    }

    public static void dischargedHospital(String id){
        for(Bai5 element : listBai5){
            if(element.getId().equals(id)){
                listBai5.remove(element);
                System.out.println("Bệnh nhân đã xuất viện thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân có ID: " + id);
    }

    public static void sortBai5s() {
        if (listBai5.isEmpty()) {
            System.out.println("Danh sách trống, không thể sắp xếp.");
            return;
        }

        // Sử dụng bộ so sánh kết hợp (Chaining Comparators)
        listBai5.sort(
                Comparator.comparingInt(Bai5::getAge).reversed() // Tuổi cao xuống thấp
                        .thenComparing(Bai5::getFullName)      // Nếu tuổi bằng nhau, tên A-Z
        );

        System.out.println("Danh sách bệnh nhân đã được sắp xếp");
    }

    public static void displayBai5(){
        if(listBai5.size() == 0){
            System.out.println("Danh sách bệnh nhân trống");
            return;
        }
        for(Bai5 element : listBai5){
            System.out.printf("ID: %s - Full name: %s - Age: %d - Diagnosis: %s\n", element.getId(), element.getFullName(), element.getAge(), element.getDiagnosis());
        }
    }
}
