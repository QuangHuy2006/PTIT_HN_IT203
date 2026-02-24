package Session11;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee(0, "Bac siu", 30000, true);
        drinks[1] = new FruitJuice(1, "Nuoc Cam", 40000, 10);
        drinks[2] = null;
        for(int i = 0 ; i < 3; i++){
            if(drinks[i] == null){
                continue;
            }
            drinks[i].displayInfo();
            drinks[i].setPrice((int) drinks[i].calculatePrice());
            if(drinks[i] instanceof IMixable){
                ((IMixable) drinks[i]).mix();
            }
        }
    }
}
