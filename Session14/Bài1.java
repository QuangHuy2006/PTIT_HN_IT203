package Session14;

import java.util.LinkedHashSet;
import java.util.Set;

public class Bài1 {
    public static void main(String[] args) {
        Set<String> abc = new LinkedHashSet<>();
        abc.add("Nguyễn Văn A - Yên Bái");
        abc.add("Trần Thị B - Thái Bình");
        abc.add("Nguyễn Văn A - Yên Bái");
        abc.add("Lê Văn C - Hưng Yên");

        System.out.println("danh sách gọi khám");
        for(String ele : abc){
            System.out.println(ele);
        }
    }
}