package School;

import java.util.*;

import DataSchool.*;

public class School {

    private String schoolName;
    private int schoolMaxStudents;
    private String schoolCity;

    public ArrayList<Student> studentsList = new ArrayList<>();

    public School(String schoolName, int schoolMaxStudents, String schoolCity) {
        this.schoolName = schoolName;
        this.schoolMaxStudents = schoolMaxStudents;
        this.schoolCity = schoolCity;
    }

    public void addStudent(Student student) {

        if (student != null && studentsList.size() < schoolMaxStudents) {
            studentsList.add(student);
        } else {
            System.out.println("School does not admit any more students");
        }
    }

        public String getSchoolName () {
            return schoolName;
        }

        public void setSchoolName (String schoolName){
            this.schoolName = schoolName;
        }

        public int getSchoolMaxStudents () {
            return schoolMaxStudents;
        }

        public void setSchoolMaxStudents ( int schoolMaxStudents){
            this.schoolMaxStudents = schoolMaxStudents;
        }

        public String getSchoolCity () {
            return schoolCity;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (!(o instanceof School school)) return false;
            return getSchoolMaxStudents() == school.getSchoolMaxStudents() && getSchoolName().equals(school.getSchoolName()) && getSchoolCity().equals(school.getSchoolCity()) && Objects.equals(studentsList, school.studentsList);
        }

        @Override
        public int hashCode () {
            return Objects.hash(getSchoolName(), getSchoolMaxStudents(), getSchoolCity());
        }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolMaxStudents=" + schoolMaxStudents +
                ", schoolCity='" + schoolCity + '\'' +
                ", studentsList=" + studentsList.toArray().toString() +
                '}';
    }
}
