package Session6;

public class ex1 {
    String studentID;
    String fullName;
    int dob;
    double average;

    public ex1(String studentID, String fullName, int dob, double average) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.dob = dob;
        this.average = average;
    }

    public void showStudent() {
        System.out.println("Ma sinh vien: " + studentID);
        System.out.println("Ho va ten sinh vien: " + fullName);
        System.out.println("Nam sinh: " + dob);
        System.out.println("Diem trung binh: " + average);
    }
    public static void main(String[] args){
        ex1 student1 = new ex1("ST01", "Nguyen Van A", 2004, 8.3);
        ex1 student2 = new ex1("ST02", "Hoang Van B", 2001, 8);
        student1.showStudent();
        student2.showStudent();
    }
}
