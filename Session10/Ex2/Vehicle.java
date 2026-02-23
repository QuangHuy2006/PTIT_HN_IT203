package Session10.Ex2;

public abstract class Vehicle {
    protected String brand;

    public Vehicle() {
        this.brand = "Honda";
    }

    abstract void move();
}
