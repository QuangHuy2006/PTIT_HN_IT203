package Session4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex6 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc. " +
                "Tôi cảm thấy rất bực mình vì đã phí tiền mua nó...";

        String[] blacklist = {"tệ", "ngu ngốc", "bực mình"};

        String regex = "(?i)" + String.join("|", blacklist);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        StringBuilder sbFiltered = new StringBuilder();
        while (matcher.find()) {
            String word = matcher.group();
            String stars = "*".repeat(word.length());
            matcher.appendReplacement(sbFiltered, stars); // sao chép các từ mà matcher chạy qua và chuỗi thay thế vào chuỗi
        }
        matcher.appendTail(sbFiltered); // sao chép các chuỗi còn lại sau chuỗi kiểm tra regex cuối cùng vào chuỗi

        String result = sbFiltered.toString();

        if (result.length() > 200) {
            int cutIndex = result.substring(0, 200).lastIndexOf(" ");
            result = result.substring(0, cutIndex) + "...";
        } else if (result.length() > 50) {
            int cutIndex = result.substring(0, 45).lastIndexOf(" ");
            result = result.substring(0, cutIndex) + "...";
        }

        System.out.println("Review sau khi xử lý: " + result);
    }
}