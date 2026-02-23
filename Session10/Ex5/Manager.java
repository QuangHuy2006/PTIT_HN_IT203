package Session10.Ex5;

public class Manager extends Employee implements IBonusCalculator{
    @Override
    double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public double getBonus() {
        return getBaseSalary() + 500;
    }
}