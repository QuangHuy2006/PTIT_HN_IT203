package Session_9.baitap_01;

public class Student extends Person {
    public String studentId;
    public float avg;

    public Student(String fullName, int age, String studentId, float avg) {
        super(fullName, age);
        this.studentId = studentId;
        this.avg = avg;
    }

    public static void main(String[] args) {
        Student student = new Student("Hoàng Minh Quang", 20, "SV001", 8.0F);
        student.display();
        student.display(student);
    }
}
