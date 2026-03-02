package Session15;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Bai4 {


    public static class EmergencyPatient {
        String id;
        String name;
        int priority;
        long arrivalOrder;

        public EmergencyPatient(String id, String name, int priority, long arrivalOrder) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.arrivalOrder = arrivalOrder;
        }

        public int getPriority() {
            return priority;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            String type = (priority == 1) ? "CẤP CỨU" : "THƯỜNG";
            return String.format("Bệnh nhân [ID=%s, Tên=%s, Loại=%s]", id, name, type);
        }
    }


    public static class EmergencyQueue {

        private static long counter = 0;


        private PriorityQueue<EmergencyPatient> queue = new PriorityQueue<>(
                Comparator.comparingInt(EmergencyPatient::getPriority)
                        .thenComparingLong(p -> p.arrivalOrder)
        );

        public void addPatient(String id, String name, int priority) {
            EmergencyPatient p = new EmergencyPatient(id, name, priority, counter++);
            queue.add(p);
            System.out.println("-> Đã tiếp nhận: " + p.getName() + " (" + (priority == 1 ? "Cấp cứu" : "Thường") + ")");
        }

        public EmergencyPatient callNextPatient() {
            if (queue.isEmpty()) {
                System.out.println("Hiện không có bệnh nhân nào đang chờ.");
                return null;
            }
            return queue.poll();
        }

        public void displayQueue() {
            if (queue.isEmpty()) {
                System.out.println("Hàng đợi trống.");
                return;
            }
            System.out.println("\nDANH SÁCH CHỜ KHÁM (Theo thứ tự ưu tiên):");


            Object[] patients = queue.toArray();
            java.util.Arrays.sort(patients, (Comparator) queue.comparator());
            for (Object p : patients) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        EmergencyQueue emergencyRoom = new EmergencyQueue();


        emergencyRoom.addPatient("BN01", "Nguyễn Văn A", 2);
        emergencyRoom.addPatient("BN02", "Trần Thị B", 1);
        emergencyRoom.addPatient("BN03", "Lê Văn C", 2);
        emergencyRoom.addPatient("BN04", "Phạm Văn D", 1);


        emergencyRoom.displayQueue();

        System.out.println("\n--- BẮT ĐẦU GỌI TÊN KHÁM ---");

        while (true) {
            EmergencyPatient next = emergencyRoom.callNextPatient();
            if (next == null) break;
            System.out.println("Mời bệnh nhân: " + next);
        }
    }
}
