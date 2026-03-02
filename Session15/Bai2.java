package Session15;

import java.util.ArrayDeque;
import java.util.Queue;

public class Bai2 {
    public static class Patient {
        String id;

        String name;

        int age;

        public Patient(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Patient [id=" + id + ", name=" + name + ", age=" + age + "]";
        }
    }

    public static class PatientQueue{
        public static Queue<Patient> queue = new ArrayDeque<>();

        void addPatient(Patient p){
            queue.add(p);
        }

        Patient callNextPatient(){
            return queue.poll();
        }

        Patient peekNextPatient(){
            return queue.peek();
        }

        boolean isEmpty(){
            return queue.isEmpty();
        }

        void displayQueue(){
            if(queue.isEmpty()){
                System.out.println("No patients in queue");
                return;
            }
            int i = 1;
            while(!queue.isEmpty()){
                Patient p = queue.poll();
                System.out.println(p.toString());
            }
        }
    }

    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();
        patientQueue.addPatient(new Patient("1", "A", 30));
        patientQueue.addPatient(new Patient("2", "B", 30));
        System.out.println(patientQueue.callNextPatient().toString());
        patientQueue.addPatient(new Patient("3", "C", 30));
        patientQueue.addPatient(new Patient("4", "D", 30));
        System.out.println(patientQueue.peekNextPatient().toString());
        patientQueue.displayQueue();
    }
}