package Session11;

public class Coffee extends Drink {
    private boolean hasMilk = false;

    public Coffee(int id, String name, int price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if (hasMilk) {
            return this.getPrice() + 5000;
        } else {
            return this.getPrice();
        }
    }

    @Override
    public void displayInfo() {
        if (hasMilk) {
            System.out.print(",Co sua");
        }
    }
}
