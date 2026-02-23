package Session10.Ex3;

public class Fish extends Animal implements ISwimmable{
    @Override
    public void swim() {
        System.out.println("Fish can only swim, not fly");
    }


}
