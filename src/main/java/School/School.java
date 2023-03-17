package School;

import java.util.*;

import DataSchool.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class School {

    private String name;
    private String city;
    public ArrayList<Student> studentsList = new ArrayList<>();


    //constructor

    public School(String name, String city){
        this.name = name;
        this.city = city;
    };

    public void addStudent(Student student) {
        boolean isValidCheck = isValid(student) ? studentsList.add(student) : false;
           }

    private static boolean isValid(Student student) {
        if (Objects.nonNull(student)) {
            return true;
        } else {
            return false;
        }
    }
}
