package Session10.Ex1;

public class MainEx1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.printf("Chu vi hình tròn = %.1f\n", circle.getPerimeter());
        System.out.printf("Diện tích hinh tròn = %.1f\n", circle.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(2);
        System.out.printf("Chu vi hình chữ nhật = %.1f\n", rectangle.getPerimeter());
        System.out.printf("Diện tích hình chữ nhật = %.1f\n", rectangle.getArea());
    }
}
