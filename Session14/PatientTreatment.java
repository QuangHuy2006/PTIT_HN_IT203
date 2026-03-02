package Session14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient implements Comparable<Patient>{

    String name;
    int severity;
    String arrivalTime;

    public Patient(String name, int severity, String arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public LocalDate getArrivalTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyy");
        return LocalDate.parse(arrivalTime, formatter);
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + " | " + severity + " | " + getArrivalTime();
    }

    @Override
    public int compareTo(Patient o) {
        // so sánh mức độ nghiêm trọng
        int ageCompare = Integer.compare(this.getSeverity(), o.getSeverity());
        if(ageCompare != 0){
            return ageCompare;
        }
        // mức độ nghiêm trọng bằng nhau --> so sánh ngày tới
        return this.getArrivalTime().compareTo(o.getArrivalTime());
    }
}