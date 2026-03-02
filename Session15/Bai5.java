package Session15;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Bai5 {


    public static class TreatmentStep {
        String description;
        String time;

        public TreatmentStep(String description, String time) {
            this.description = description;
            this.time = time;
        }

        @Override
        public String toString() {
            return "[" + time + "] " + description;
        }
    }


    public static class EmergencyCase {
        String patientName;
        Stack<TreatmentStep> steps;

        public EmergencyCase(String patientName) {
            this.patientName = patientName;
            this.steps = new Stack<>();
        }


        public void addStep(String desc, String time) {
            TreatmentStep step = new TreatmentStep(desc, time);
            steps.push(step);
            System.out.println("-> Thêm bước: " + desc + " cho bệnh nhân " + patientName);
        }


        public TreatmentStep undoStep() {
            if (steps.isEmpty()) {
                System.out.println("! Không còn bước nào để hoàn tác cho bệnh nhân " + patientName);
                return null;
            }
            TreatmentStep undone = steps.pop();
            System.out.println("<- Đã HOÀN TÁC: " + undone.description);
            return undone;
        }


        public void displaySteps() {
            System.out.println("Lịch sử điều trị của " + patientName + ":");
            if (steps.isEmpty()) {
                System.out.println("  (Chưa có bản ghi)");
            } else {

                for (int i = steps.size() - 1; i >= 0; i--) {
                    System.out.println("  - " + steps.get(i));
                }
            }
        }
    }


    public static class EmergencyCaseQueue {
        private Queue<EmergencyCase> cases = new ArrayDeque<>();

        public void addCase(EmergencyCase c) {
            cases.add(c);
            System.out.println("=> Đã đưa bệnh nhân " + c.patientName + " vào hàng đợi cấp cứu.");
        }

        public EmergencyCase getNextCase() {
            return cases.poll();
        }

        public boolean isEmpty() {
            return cases.isEmpty();
        }
    }
    public static void main(String[] args) {
        EmergencyCaseQueue hospitalQueue = new EmergencyCaseQueue();

        EmergencyCase case1 = new EmergencyCase("Bệnh nhân A");
        EmergencyCase case2 = new EmergencyCase("Bệnh nhân B");

        hospitalQueue.addCase(case1);
        hospitalQueue.addCase(case2);

        System.out.println("\n--- BẮT ĐẦU XỬ LÝ CA 1 ---");
        EmergencyCase currentCase = hospitalQueue.getNextCase();


        currentCase.addStep("Tiếp nhận tại sảnh", "08:00");
        currentCase.addStep("Đo huyết áp", "08:05");
        currentCase.addStep("Xét nghiệm máu", "08:15");


        System.out.println("\n(Phát hiện nhầm lẫn trong xét nghiệm...)");
        currentCase.undoStep();


        System.out.println("");
        currentCase.displaySteps();

        System.out.println("\n--- XỬ LÝ CA TIẾP THEO ---");
        if (!hospitalQueue.isEmpty()) {
            EmergencyCase nextCase = hospitalQueue.getNextCase();
            nextCase.addStep("Cấp cứu khẩn cấp", "08:30");
            nextCase.displaySteps();
        }
    }
}
