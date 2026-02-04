package Session_9.baitap_03;

public class Manager extends  Employee{
    public String department;

    public Manager(String fullName, double salary, String department){
        super(fullName, salary);
        this.department = department;
    }

    public void display(){
        System.out.printf("Tên: %s - Lương: %.1f - Phòng ban: %s\n", fullName, salary, department);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Quang", 1000, "DEV");
        manager.display();
    }
}
