import DataSchool.InfoCollector;
import School.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {


        Subject[] subjects = addingSubjects();
        School[] schools = addingSchools();
        Student[] students = addingStudents();
        distributeData(schools, students, subjects);


        InfoCollector info = new InfoCollector(schools, students, subjects);
        info.printSchoolCities();
        //info.printMarksPerSubject();
        info.printMarksPerStudentID(0, 1);
        info.printMarksPerStudentID(1, 1);
        info.printMarksPerStudentID(2, 2);
        info.printMarksPerStudentID(3, 0);
        info.printMarksforSubjectID(4);


    }


    public static School[] addingSchools() {
        School harvard = new School("Harvard", 20, "Boston, Massachusetts, USA");
        School stanford = new School("Stanford", 30, "Palo Alto, California, USA");
        School oxford = new School("Oxford", 10, "Oxford, London, UK");
        School cambridge = new School("Cambridge", 40, "Cambridge, UK");
        return new School[]{harvard, stanford, oxford, cambridge};

    }

    public static Student[] addingStudents() {
        Student john = new Student("John", "Nash", 25);
        Student bill = new Student("Bill", "Gates", 25);
        Student mary = new Student("Mary", "Garcia", 20);
        Student james = new Student("James", "Bond", 99);
        Student mike = new Student("Michael", "Jordan", 19);
        Student tom = new Student("Tommy", "Rodriguez", 45);
        Student yev = new Student("Yevhenii", "Ostashko", 22);
        Student rocky = new Student("Sylvester", "Rocky", 52);
        Student toni = new Student("Toni", "Kroos", 37);
        Student lio = new Student("Lionel", "Messi", 36);
        Student jen = new Student("Jenson", "Button", 45);
        Student lew = new Student("Lewis", "Hamilton", 35);
        return new Student[]{john, bill, mary, james, mike, tom, yev, rocky, toni, lio, jen, lew};

    }

    public static Subject[] addingSubjects() {
        Subject physicsI = new Subject("Physics I");
        Subject physicsIi = new Subject("Physics II");
        Subject algebraI = new Subject("Algebra I");
        Subject philosophyI = new Subject("Philosophy I");
        Subject mathsI = new Subject("Maths I");
        Subject mathIi = new Subject("Math II");
        Subject geometryI = new Subject("Geometry I");
        Subject aeronauticalBasic = new Subject("Aeronautical Basic");
        Subject aeronauticalAdvanced = new Subject("Aeronautical Advanced");
        Subject statistics = new Subject("Statistics");
        return new Subject[]{physicsI, physicsIi, algebraI, philosophyI, mathsI, mathIi, geometryI, aeronauticalBasic, aeronauticalAdvanced, statistics};


    }

    public static void distributeData(School[] schools, Student[] students, Subject[] subjects) {
        Random rand1 = new Random(200987);

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subjects.length; j++) {
                students[i].addSubjectResults(subjects[j], (double) Math.round(rand1.nextDouble(3, 10) * 100) / 100);
            }
        }

        for (int i = 0; i < students.length; i++) {
            schools[(i + schools.length) % schools.length].addStudent(students[i]);
        }
    }


}
