import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生人数：");

        int sunStu = s.nextInt();
        Students[] students = new Students[sunStu];
        for(int i = 0 ; i<sunStu ; i++){
            students[i] = new Students();
        }

        for(int i = 0 ; i< sunStu ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("第" + (i+1) + "个学生的学号:");
            Integer tempNumber = sc.nextInt();
            students[i].setNumber(tempNumber);
            System.out.println("第" + (i+1) + "个学生的姓名:");
            students[i].setName(s.next());
            System.out.println("第" + (i+1) + "个学生的年龄:");
            students[i].setAge(s.nextInt());
            System.out.println("第" + (i+1) + "个学生的班级号:");
            students[i].setClassNo(s.nextInt());
            System.out.println("第" + (i+1) + "个学生的分数:");
            students[i].setScore(s.nextInt());
        }


        for(int i = 0 ; i< sunStu - 1 ; i++){
            for(int j = i+1 ; j< sunStu  ; j++){
                if(students[i].getAge() > students[j].getAge()){
                    Students temp;
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        for(int i = 0 ; i<sunStu ; i++){
            System.out.println(students[i].toString());
        }

    }
}
