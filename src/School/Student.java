package School;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String studentName;
    private String studentSurname;
    private int studentAge;

    public HashMap<Subject, Double> marksPerSubject = new HashMap<>();

    public Student(String studentName, String studentSurname, int studentAge) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
    }

    public boolean addSubjectResults(Subject subject, Double marks) {

        if (subject != null) {
            marksPerSubject.put(subject, marks);
            return true;
        } else return false;
    }

    public String getStudentFullName() {
        return "" + studentName + " " + studentSurname;
    }

    public String getStudentName() {
        return studentName;
    }


    public String getStudentSurname() {
        return studentSurname;
    }


    public int getStudentAge() {
        return studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentAge=" + studentAge +
                ", marksPerSubject=" + marksPerSubject +
                '}';
    }
}
