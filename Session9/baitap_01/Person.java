package Session_9.baitap_01;

public class Person {
    private String name;
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void display(){
        System.out.printf("Họ và tên: %s - Tuổi: %d\n", fullName, age);
    }

    public void display(Student student){
        System.out.printf("Họ và tên: %s - Tuổi: %d - MSSV: %s - Điểm tb: %.1f\n", student.fullName, student.age, student.studentId, student.avg);
    }
}
