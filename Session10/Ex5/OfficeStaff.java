package Session10.Ex5;

public class OfficeStaff extends Employee{
    @Override
    double calculateSalary() {
        return getBaseSalary();
    }

}