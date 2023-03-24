import DataSchool.InfoCollector;
import School.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {


        InfoCollector info = new InfoCollector( addingSchools());

        info.getSchoolNames().forEach(System.out::println);
        info.printSchoolCities();
        info.printMarksAllStudents();

    }


    public static List<School> addingSchools() {
        School harvard = new School("Harvard", "Boston, Massachusetts, USA", addingStudents());
        School stanford = new School("Stanford", "Palo Alto, California, USA", addingStudents());
        School oxford = new School("Oxford",  "Oxford, London, UK", addingStudents());
        School cambridge = new School("Cambridge", "Cambridge, UK", addingStudents());
        School[] result = {harvard, stanford, oxford, cambridge};
        List<School> result2 = new ArrayList<>();
        result2 = Arrays.asList(result);
        return result2;
    }

    public static List<Student> addingStudents() {
        Student john = new Student("John", "Nash", 25, setRandomMarks(addingSubjects()));
        Student bill = new Student("Bill", "Gates", 25, setRandomMarks(addingSubjects()));
        Student mary = new Student("Mary", "Garcia", 20, setRandomMarks(addingSubjects()));
        Student james = new Student("James", "Bond", 99, setRandomMarks(addingSubjects()));
        Student mike = new Student("Michael", "Jordan", 19, setRandomMarks(addingSubjects()));
        Student tom = new Student("Tommy", "Rodriguez", 45, setRandomMarks(addingSubjects()));
        Student yev = new Student("Yevhenii", "Ostashko", 22, setRandomMarks(addingSubjects()));
        Student rocky = new Student("Sylvester", "Rocky", 52, setRandomMarks(addingSubjects()));
        Student toni = new Student("Toni", "Kroos", 37, setRandomMarks(addingSubjects()));
        Student lio = new Student("Lionel", "Messi", 36, setRandomMarks(addingSubjects()));
        Student jen = new Student("Jenson", "Button", 45, setRandomMarks(addingSubjects()));
        Student lew = new Student("Lewis", "Hamilton", 35, setRandomMarks(addingSubjects()));

        Student[] students = {john, bill, mary, james, mike, tom, yev, rocky, toni, lio, jen, lew};
        List<Student> students2 = new ArrayList<Student>();
        students2 =  Arrays.asList(students);

        return students2;
    }

    public static List<Subject> addingSubjects() {
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
        List<Subject> result2 = new ArrayList<Subject>();
        result2 = Arrays.asList(result);
        return result2;


    }

    public static Map<Subject, Double> setRandomMarks(List<Subject> randomMarks) {

        HashMap<Subject,Double> result = new HashMap<>();

        Random rand = new Random(10000);
        long timeSeed;
        timeSeed = System.nanoTime();
        rand.setSeed(timeSeed);


        for (int i = 0; i < randomMarks.size(); i++) {
            result.put(randomMarks.get(i), (double) (Math.round(rand.nextDouble(3,10)*100)/100));
        }

        return result;
    }


}
