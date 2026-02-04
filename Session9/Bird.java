package Session9;

public class Bird extends Animal {
    private boolean isFly;
    private String birdSound;

    public Bird() {
    }

    public Bird(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        super.input();

        System.out.print("Có bay được không (true/false): ");
        setFly(Boolean.parseBoolean(sc.nextLine()));

        System.out.print("Tiếng hót: ");
        setBirdSound(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("có bay được : " +this.isFly);
        System.out.println("tiếng hót : " +this.birdSound);
    }
}
