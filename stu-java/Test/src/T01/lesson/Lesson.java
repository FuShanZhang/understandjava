package T01.lesson;

public class Lesson extends LaoZhou {

    public Lesson() {
    }

    public Lesson(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(String name,String lesson) {
        System.out.println(name+"在上"+lesson);
    }


}
