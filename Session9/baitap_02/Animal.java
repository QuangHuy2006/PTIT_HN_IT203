package Session_9.baitap_02;

public class Animal {
    public void sound(){
        System.out.println("Tạo tiếng kêu");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}
