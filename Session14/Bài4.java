package Session14;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Bài4 {
    public static void main(String[] args) {
        List<String> diseases = new ArrayList<>(List.of("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết"));
        TreeMap<String, Integer> result = new TreeMap<>();

        for (String e : diseases){
            // Duyệt qua danh sách dịch bệnh và tăng giá trị của dịch bênh có key tương ứng
            result.put(e, result.getOrDefault(e, 0) + 1);
        }
        System.out.println("Kết quả thống kê: ");

        String[] keys = result.keySet().toArray(new String[0]);
        for(String k : keys){
            System.out.println(k + ": " + result.get(k));
        }
    }
}