package club.banyuan.lesson_select;

import java.util.Iterator;
import java.util.Set;

public class Student {
    private Integer id;
    private String name;
    private Set<Course> course;

    public Student() {
    }


    public Student(Integer id, String name, Set<Course> course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourse() {
        return course;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public void insertCourse(Course course){
        this.course.add(course);
    }

    public void deleteCourseById(Integer id){
        Iterator<Course> iterator = course.iterator();
        while(iterator.hasNext()){
            if(id.equals(iterator.next().getNumber())){
                iterator.remove();
            }
        }
    }

    public void deleteCourseByName(String name){
        Iterator<Course> iterator = course.iterator();
        while(iterator.hasNext()){
            if(name.equals(iterator.next().getCourseName())){
                iterator.remove();
            }
        }
    }


}
