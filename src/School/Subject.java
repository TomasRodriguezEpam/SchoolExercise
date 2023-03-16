package School;

public class Subject {

    private String subjectName;
    private Integer marks;

    public Subject (String subjectName){
        this.subjectName = subjectName;
    }


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "\n" +
                subjectName + "";}

}
