package Session8.HN_K24_CNTT1_TonPhamQuangHuy;

public class Student {
    private String studentID;
    public String fullName;
    public double score;

    public Student(String studentID, String fullName, double score) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.score = score;
    }

    public Student() {
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
            this.studentID = studentID;
    }

    public String getRank(double score){
        if(score >= 8.0){
            return "Gioi";
        }else if(score >= 6.5){
            return "Kha";
        } return "Trung Binh";
    }
    @Override
    public String toString(){
        return "ID: " + studentID + " Name: " + fullName + " Rank: " + getRank(score);
    }
}
