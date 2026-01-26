package Session2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soLuotMuonSach;
        int max = -1;
        int min = -1;
        int tong = 0;
        int demNgayMoCua = 0;

        for (int i = 2; i <= 8; i++) {
            System.out.printf("Nhập số lượt mượn sách của ngày thứ %d: ", i);
            soLuotMuonSach = scanner.nextInt();

            // Ngày đóng cửa
            if (soLuotMuonSach == 0) {
                continue;
            }

            tong += soLuotMuonSach;
            demNgayMoCua++;

            if (max == -1) {
                max = soLuotMuonSach;
                min = soLuotMuonSach;
            } else {
                if (soLuotMuonSach > max) {
                    max = soLuotMuonSach;
                }
                if (soLuotMuonSach < min) {
                    min = soLuotMuonSach;
                }
            }
        }
        if (demNgayMoCua == 0) {

            System.out.println("Tuần này thư viện không mở cửa ngày nào");
        } else {

            int trungBinh = tong / demNgayMoCua;

            System.out.printf("Lượt mượn cao nhất: %d \n" ,max);
            System.out.printf("Lượt mượn thấp nhất: %d \n" , min );
            System.out.printf("Lượt mượn trung bình: %d \n" , trungBinh);
        }
    }
}