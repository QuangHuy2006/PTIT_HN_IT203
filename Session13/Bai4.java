package Session13;

import java.util.LinkedList;

public class Bai4 {
    private LinkedList<String> linkedList = new LinkedList<>();
    static int countEmergency = 0;

    public void patientCheckin(String name){
        linkedList.addLast(name);
    }

    public  void emergencyCheckIn(String name){
        linkedList.addFirst(name);
        countEmergency++;
    }

    public  void treatPatient(){
        if (linkedList.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào trong hàng đợi.");
            return;
        }
        String name = linkedList.removeFirst();
        if(countEmergency >= 1){
            System.out.printf("Đang cấp cứu: %s\n", name);
            countEmergency--;
        }
        else{
            System.out.printf("Đang khám: %s\n", name);
        }
    }

    public static void main(String[] args) {
        Bai4 er = new Bai4();
        er.patientCheckin("A");
        er.patientCheckin("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}
