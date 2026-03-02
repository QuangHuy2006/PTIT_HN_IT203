package Session14;

import java.util.TreeSet;

public class Bài5 {
    public static void main(String[] args) {
        TreeSet<Patient> patients = new TreeSet<>();
        patients.add(new Patient("Nguyen Van A", 2, "20-1-2026"));
        patients.add(new Patient("Le Thi B", 1, "20-1-2026"));
        patients.add(new Patient("Nguyen Van C", 3, "20-1-2026"));


        // Sắp xếp danh sách bệnh nhân theo tuổi, nếu bằng nhau thì sắp xếp theo ngày tới
//        patients.stream().sorted();

        for (Patient p : patients){
            System.out.println(p.toString());
        }
    }
}