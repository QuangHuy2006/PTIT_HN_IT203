package Session_9.baitap_06;

public class Circle extends  Shape{
    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
