package Session10.Ex5;

public class MainEx5 {
    public static void main(String[] args) {
        OfficeStaff officeStaff = new OfficeStaff();
        officeStaff.setName("Hoàn");
        officeStaff.setBaseSalary(1000);

        Manager manager = new Manager();
        manager.setName("Quang");
        manager.setBaseSalary(2000);

        System.out.printf("%s - Lương: %.1f\n", officeStaff.getName(), officeStaff.calculateSalary());
        System.out.printf("%s - Lương: %.1f\n", manager.getName(), manager.getBonus());
    }
}