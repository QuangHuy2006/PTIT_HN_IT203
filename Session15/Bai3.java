package Session15;

import java.util.Stack;

public class Bai3 {

    public static class Action {
        String type;

        public Action(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static class MedicationProcessChecker {
        private Stack<String> stack = new Stack<>();

        public boolean checkProcess(String[] actions) {
            System.out.println("--- Bắt đầu kiểm tra quy trình ---");

            for (String actionStr : actions) {
                if (actionStr.equalsIgnoreCase("PUSH")) {
                    stack.push("Medicine Unit");
                    System.out.println("[PUSH]: Đã phát thuốc. (Trong kho còn: " + stack.size() + ")");
                }
                else if (actionStr.equalsIgnoreCase("POP")) {
                    if (stack.isEmpty()) {
                        System.out.println(">>> LỖI: Cố gắng hoàn tất (POP) khi chưa phát thuốc!");
                        return false;
                    }
                    stack.pop();
                    System.out.println("[POP]: Đã hoàn tất 1 đơn thuốc. (Đang chờ: " + stack.size() + ")");
                }
            }

            if (!stack.isEmpty()) {
                System.out.println(">>> LỖI: Kết thúc ca trực nhưng vẫn còn " + stack.size() + " đơn chưa hoàn tất!");
                return false;
            }

            return true;
        }

        public void reset() {
            stack.clear();
        }
    }

    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("Kịch bản 1: PUSH, PUSH, POP, POP");
        boolean result1 = checker.checkProcess(process1);
        System.out.println("Kết quả quy trình 1: " + (result1 ? "HỢP LỆ" : "KHÔNG HỢP LỆ"));

        System.out.println("---------------------------------");
        checker.reset();

        String[] process2 = {"PUSH", "POP", "POP"};
        System.out.println("Kịch bản 2: PUSH, POP, POP");
        boolean result2 = checker.checkProcess(process2);
        System.out.println("Kết quả quy trình 2: " + (result2 ? "HỢP LỆ" : "KHÔNG HỢP LỆ"));

        System.out.println("---------------------------------");
        checker.reset();

        String[] process3 = {"PUSH", "PUSH", "POP"};
        System.out.println("Kịch bản 3: PUSH, PUSH, POP");
        boolean result3 = checker.checkProcess(process3);
        System.out.println("Kết quả quy trình 3: " + (result3 ? "HỢP LỆ" : "KHÔNG HỢP LỆ"));
    }
}