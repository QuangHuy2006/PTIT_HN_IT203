package Session_9.baitap_06;

public class Shape {
    public double area(){
        return 1.0;
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4, 5);

        for(int i = 0; i < 2; i++){
            System.out.printf("Diện tích %s = %.1f\n", shapes[i].getClass().getSimpleName(), shapes[i].area());
        }
    }
}
