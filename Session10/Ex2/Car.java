package Session10.Ex2;

public class Car extends Vehicle{
    @Override
    void move() {
        System.out.printf("[%s] - Cách di chuyển: [Di chuyển bằng động cơ]\n", brand);
    }
}