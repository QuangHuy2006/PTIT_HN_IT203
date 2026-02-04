package Session_9.baitap_06;

public class Rectangle extends  Shape{
    double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
