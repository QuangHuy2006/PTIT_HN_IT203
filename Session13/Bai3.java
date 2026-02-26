package Session13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer> danhSachIntA = new ArrayList<>(Arrays.asList(101, 102, 105));
        List<Integer> danhSachIntB = new ArrayList<>(Arrays.asList(102, 105, 108));
        List<Integer> result1 = findCommonPatients(danhSachIntA, danhSachIntB);
        System.out.println(result1);

        List<String> danhSachStrtA = new ArrayList<>(Arrays.asList("DN01", "DN02", "DN03"));
        List<String> danhSachStrB = new ArrayList<>(Arrays.asList("DN02", "DN04"));
        List<String> result2 = findCommonPatients(danhSachStrtA, danhSachStrB);
        System.out.println(result2);
    }

    public static <T> List<T> findCommonPatients(List<T> danhSachA, List<T> danhSachB){
        List<T> result = new ArrayList<>();
        for(T element : danhSachA){
            if(danhSachB.contains(element)){
                result.add(element);
            }
        }
        return result;
    }
}
