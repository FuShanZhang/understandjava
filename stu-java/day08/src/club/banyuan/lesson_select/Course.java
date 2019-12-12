package club.banyuan.lesson_select;

public class Course {

    private Integer number;
    private String CourseName;

    public Course() {
    }

    public Course(Integer number, String courseName) {
        this.number = number;
        CourseName = courseName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                ", CourseName='" + CourseName + '\'' +
                '}';
    }

    public String show(){
        return number + " " + CourseName;
    }
}
