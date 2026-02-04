package Session9;

import java.util.Scanner;

public class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor,
                       int everageLifeExpectancy, String foodType,
                       boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean isLiveWithHuman) {
        this.isLiveWithHuman = isLiveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        super.input();

        System.out.print("Kiểu thức ăn: ");
        setFoodType(sc.nextLine());

        System.out.print("Sống với con người (true/false): ");
        setLiveWithHuman(Boolean.parseBoolean(sc.nextLine()));

        System.out.print("Tiếng kêu: ");
        setMamalSound(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("kiểu thức ăn : " +this.foodType);
        System.out.println("sống với con người : " +this.isLiveWithHuman);
        System.out.println("tiếng keu : " +this.mamalSound);
    }
}
