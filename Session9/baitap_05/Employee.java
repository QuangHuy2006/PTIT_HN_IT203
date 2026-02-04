package Session_9.baitap_05;

public class Employee {
    public String fullName;
    public double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary;
    }

    public static void main(String[] args) {
        double total = 0;
        Employee[] arr = new Employee[3];
        arr[0] = new OfficeEmployee("Nguyễn Văn A", 1000);
        arr[1] = new OfficeEmployee("Trần Thị B", 1200);
        arr[2] = new ProductionEmployee("Hoàng Văn C", 1500);

        for(int i = 0; i < 3; i++){
            total += arr[i].calculateSalary();
        }

        System.out.printf("Tổng lương: %.1f", total);
    }
}
