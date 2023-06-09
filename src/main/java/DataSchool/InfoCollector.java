package DataSchool;

import School.*;


import java.util.*;
import java.util.stream.Collectors;


public class InfoCollector {

    public static List<School> schools;
    public Subject[] subjects;
    public Student[] students;

    public InfoCollector(List<School> schools) {
        this.schools  = schools;
    }

    public List<String> getSchoolNames() {

        return schools.stream().map(school -> school.getName()).collect(Collectors.toList());

    }

    public void printSchoolCities() {

        for(School sch : schools){
            System.out.println("--- University --- \n" + sch.getName() + " in : \n" + sch.getCity());
        }

    }

    public List<List<String>> getSchoolStudents() {

        // schools.stream().map(school -> school.getSchoolName()).forEach(System.out::println);
        List<List<String>> result = schools.stream().map(school -> school.studentsList.stream().map(student -> student.getName()).collect(Collectors.toList())).collect(Collectors.toList());
        //List<String> ggg = result.stream().flatMap(Collection::stream).toList();
        return result.stream().collect(Collectors.toList());
    }

 /* public void printMarksAllStudents() {

        try {

                    System.out.println
                            ("\n\nStudent : " + student1 + " in " + school1 +
                                    " received this marks:" + map1 +
                                    "\n Average Result: " +
                                    (double) Math.round(getAverageMark(j) * 100) / 100 + " \n\n\n");

            }
         catch (IndexOutOfBoundsException | NullPointerException npe) {
            System.out.println("index, out of bounds");
            return;
        }
    }*/
 /*
    public void printMarksPerSchool(int schoolID) {

        try {
            for (int j = 0; j < 3; j++) {
                String school1 = getSchoolNames().get(schoolID);
                List<String> student1 = Collections.singletonList(getSchoolStudents().get(schoolID).get(j));
                HashMap<Subject, Double> map1 = getSubjectsAndMarks().get(schoolID).get(j);
                System.out.println("\n\nStudent : " + student1 + " in " + school1 + " received this marks:" + map1 + "\n Average Result: " + (double) Math.round(getAverageMark(j) * 100) / 100 + " \n\n\n");
            }
        } catch (IndexOutOfBoundsException | NullPointerException ne) {
            System.out.println("No Identified School");
            return;
        }
    }


    public void printMarksPerStudentID(int schoolID, int studentID) {
        try {
            String school1 = getSchoolNames().get(schoolID);
            List<String> student1 = Collections.singletonList(getSchoolStudents().get(schoolID).get(studentID));
            HashMap<Subject, Double> map1 = getSubjectsAndMarks().get(schoolID).get(studentID);
            System.out.println("\n\nStudent : " + student1 + " in " + school1 + " received this marks:" + map1 + "\n Average Result: " + (double) Math.round(getAverageMark(studentID) * 100) / 100 + " \n\n\n");

        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("No Such Student");
            return;
        }
    }

*/
    public static double getAverageMark(int studentID) {

        Map<Subject, Double> map1 = getSubjectsAndMarks().get(0).get(studentID);
        List<Double> marks = map1.values().stream().collect(Collectors.toList());
        int numberOfSubjects = marks.size();
        if (numberOfSubjects == 0) return 0;
        return marks.stream()
                .mapToDouble(Double::doubleValue)
                .sum() / numberOfSubjects;

    }
/*
    public void printMarksAllSubjects() {
        ArrayList<Double> marksSubject = new ArrayList<>();
        List<Double> mark = new ArrayList<>();
        for (int k = 0; k < subjects.length; k++) {
            for (int i = 0; i < schools.size(); i++) {
                for (int j = 0; j < students.length / schools.size(); j++) {
                    Double subject1 = getSubjectsAndMarks().get(i).get(j).get(subjects[k]);
                    mark.add(subject1);
                }
            }
            System.out.println(mark);
            double averagePerSubject = mark.stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();
            System.out.println("Subject : " + subjects[k].getName() + " average marks are : " + mark + " \n Average is : " + (double) Math.round(averagePerSubject / students.length * 100) / 100 + " ");
            mark.clear();
        }
    }


    public void printMarksforSubjectID(int subjectID) {
        ArrayList<Double> marksSubject = new ArrayList<>();
        List<Double> mark = new ArrayList<>();
        try {
            for (int i = 0; i < schools.size(); i++) {
                for (int j = 0; j < students.length / schools.size(); j++) {
                    Double subject1 = getSubjectsAndMarks().get(i).get(j).get(subjects[subjectID]);
                    mark.add(subject1);
                }
            }

            double averagePerSubject = mark.stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();
            System.out.println("Subject : " + subjects[subjectID].getName() + " marks are : " + mark + " \n Average is : " + (double) Math.round(averagePerSubject / students.length * 100) / 100 + " ");
            mark.clear();
        }catch(IndexOutOfBoundsException | NullPointerException i){
            System.out.println("No such Subject ID exists");
            return;
        }
    }



*/
    public static List<List<Map<Subject, Double>>> getSubjectsAndMarks() {

        List<List<Map<Subject, Double>>> result =
              schools
                      .stream()
                      .map(school -> school.studentsList.stream()
                              .map(student -> student
                                      .marksPerSubject)
                              .collect(Collectors.toList()))
                      .collect(Collectors.toList());
        return result.stream().collect(Collectors.toList());
    }


}
