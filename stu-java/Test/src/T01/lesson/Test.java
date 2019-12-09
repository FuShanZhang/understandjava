package T01.lesson;

public class Test {

    public static void main(String[] args) {
        LaoLi laoLi  = new Lesson("laoli",23);

        laoLi.teach(laoLi.getName(),"javaSE");

        LaoZhou laoZhou = new Lesson("laozhou",21);

        laoZhou.teach(laoZhou.getName(),"javaEE");
    }


}
