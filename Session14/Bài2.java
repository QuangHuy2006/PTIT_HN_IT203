package Session14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bài2 {
    public static void main(String[] args) {
        Map<String, String> maThuoc = new HashMap<>();
        maThuoc.put("T01" , "Paracetamol1");
        maThuoc.put("T02" , "Paracetamol2");
        maThuoc.put("T03" , "Paracetamol3");
        maThuoc.put("T04" , "Paracetamol4");
        maThuoc.put("T05" , "Paracetamol5");

        System.out.println("Nhập mã thuốc cần tìm : ");
        Scanner sc = new Scanner(System.in);
        String maThuocNhap = sc.nextLine();
        if(maThuoc.containsKey(maThuocNhap)){
            System.out.println("Tên thuốc : "+maThuoc.get(maThuocNhap));
        }else {
            System.out.println("k tìm thấy mã thuốc đó");
        }

    }
}