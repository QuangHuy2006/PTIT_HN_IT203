package Session10.Ex3;

public class Duck extends Animal implements ISwimmable, IFlyable{
    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }


}
