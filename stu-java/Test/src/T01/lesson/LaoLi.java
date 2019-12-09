package T01.lesson;

public abstract class LaoLi {
    private String name;
    private int age;

    public LaoLi() {
    }

    public LaoLi(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "LaoLi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void teach(String name,String lesson);
}
