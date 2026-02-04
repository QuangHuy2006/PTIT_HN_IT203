package Session_9.baitap_05;

public class OfficeEmployee extends Employee{
    public OfficeEmployee(String fullName, double salary) {
        super(fullName, salary);
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + 500;
    }
}
