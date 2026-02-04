package Session9;

import java.util.Scanner;

public class Animal {

    private String animalName;
    private int numberOfLegs;
    private String furColor;
    private int everageLifeExpectancy;

    public Animal() {
    }

    public Animal(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }

    public void setEverageLifeExpectancy(int everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.print("Tên động vật: ");
        setAnimalName(sc.nextLine());

        System.out.print("Số chân: ");
        setNumberOfLegs(Integer.parseInt(sc.nextLine()));

        System.out.print("Màu lông: ");
        setFurColor(sc.nextLine());

        System.out.print("Tuổi thọ trung bình: ");
        setEverageLifeExpectancy(Integer.parseInt(sc.nextLine()));
    }

    public void display() {
        System.out.println("Tên: " + this.animalName);
        System.out.println("Số chân: " + this.numberOfLegs);
        System.out.println("Màu lông: " + this.furColor);
        System.out.println("Tuổi thọ TB: " + this.everageLifeExpectancy);
    }


}
