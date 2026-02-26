package Session13;

import java.util.ArrayList;
import java.util.Iterator;

public class Bai2 {
    public static void main(String[] args) {

        ArrayList<String> medicines = new ArrayList<>();
        medicines.add("Paracetamol");
        medicines.add("Ibuprofen");
        medicines.add("Panadol");
        medicines.add("Paracetamol");
        medicines.add("Aspirin");
        medicines.add("Ibuprofen");
        Iterator<String> Ilerator = medicines.iterator();
        ArrayList<String> medicines2 = new ArrayList<>();
        for(String x : medicines){
            if(!medicines2.contains(x)){
                medicines2.add(x);
            }
        }
        System.out.println(medicines2);
    }
}
