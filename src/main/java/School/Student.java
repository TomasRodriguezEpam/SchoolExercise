package School;

import lombok.*;

import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student {

    private String name;
    private String surname;
    private int age;
    public Map<Subject, Double> marksPerSubject = new HashMap<>();

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean addSubjectResults(Subject subject, Double marks) {
        if (subject != null) {
            marksPerSubject.put(subject, marks);
            return true;
        } else return false;
    }

}
