package Session_9.baitap_05;

public class ProductionEmployee extends Employee{
    public ProductionEmployee(String fullName, double salary) {
        super(fullName, salary);
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + 600;
    }
}
