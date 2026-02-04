package Session_9.baitap_04;

public class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("Con chó đang ăn");
    }

    public void bark(){
        System.out.println("Woof woof");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        // animal.bark(); -> LỖI BIÊN DỊCH (Compile-time Error)
        // Vì trình biên dịch chỉ nhìn vào kiểu dữ liệu khai báo (Animal),
        // mà Animal thì không có phương thức bark().
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }
}
