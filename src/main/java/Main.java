import School.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {


       /* //info.printSchoolCities();
        //info.printMarksPerSubject();
       *//* info.printMarksPerStudentID(0, 1);
        info.printMarksPerStudentID(1, 1);
        info.printMarksPerStudentID(2, 2);
        info.printMarksPerStudentID(3, 0);*//*
        System.out.println(info.getSchoolStudents());
        info.printMarksPerStudentID(1,5);
        info.printMarksforSubjectID(4);
        info.printMarksforSubjectID(6);
        //info.printMarksPerSchool(2);
        info.printMarksAllSubjects();
*/


    }


    public static ArrayList<School> addingSchools() {
        School harvard = new School("Harvard", "Boston, Massachusetts, USA", addingStudents());
        School stanford = new School("Stanford", "Palo Alto, California, USA", addingStudents());
        School oxford = new School("Oxford",  "Oxford, London, UK", addingStudents());
        School cambridge = new School("Cambridge", "Cambridge, UK", addingStudents());
        School[] result = {harvard, stanford, oxford, cambridge};
        return (ArrayList<School>) Arrays.asList(result);
    }

    public static ArrayList<Student> addingStudents() {
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

        Student[] students = {john, bill, mary, james, mike, tom, yev, rocky, toni, lio, jen, lew};


        return (ArrayList<Student>) Arrays.asList(students);
    }

    public static ArrayList<Subject> addingSubjects() {
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
        Subject[] result = {physicsI, physicsIi, algebraI, philosophyI, mathsI, mathIi, geometryI, aeronauticalBasic, aeronauticalAdvanced, statistics};
        return (ArrayList<Subject>) Arrays.asList(result);


    }

    public static HashMap<Subject, Double> setRandomMarks( ArrayList<Subject> randomMarks) {
        HashMap<Subject,Double> result = new HashMap<>();

        Random rand = new Random(10000);
        long timeSeed;
        timeSeed = System.nanoTime();
        rand.setSeed(timeSeed);


        for (int i = 0; i < randomMarks.size(); i++) {
            result.put(randomMarks.get(i), (double) (Math.round(rand.nextDouble(10)*100)/100));
        }

        return result;
    }


}
