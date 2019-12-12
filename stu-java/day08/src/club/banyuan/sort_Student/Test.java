package club.banyuan.sort_Student;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            students.add(new Students(i+180201,"学生"+i+1,50.0+Math.random()*100%51));
        }

        students.sort(Students::compareTo);

        System.out.println(students);
    }
}
