package Session13;

import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {

        ArrayList<Double> temparatures = new ArrayList<>();
        temparatures.add(36.5);
        temparatures.add(40.2);
        temparatures.add(37.0);
        temparatures.add(12.5);
        temparatures.add(39.8);
        temparatures.add(99.9);
        temparatures.add(36.8);
        Iterator<Double> Ilerator = temparatures.iterator();
        while (Ilerator.hasNext()) {
            Double temp = Ilerator.next();
            if (temp < 34.0 || temp > 42.0) {
                Ilerator.remove();
            }
        }
        System.out.println(temparatures);
        Double sum = 0.0;
        for (Double x : temparatures) {
            sum += x;
        }
        System.out.println(sum / temparatures.size());
    }
}
