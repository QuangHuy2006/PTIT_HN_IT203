package Session6;

public class ex4 {
    String employeeID;
    String fullName;
    double salary;

    public ex4() {

    }

    public ex4(String employeeID, String fullName, double salary) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.salary = salary;
    }

    public void showEmployee(){
        System.out.println("Id nhan vien: " + employeeID);
        System.out.println("Ten nhan vien: " + fullName);
        System.out.println("Luong: " + salary);
    }

    public static void main(String[] args){
        ex4 employee1 = new ex4();
        ex4 employee2 = new ex4("E01", "Nguyen Dang Quang", 36363636);
        employee2.showEmployee();
        employee1.showEmployee();
    }
}
