public class Students {

    private Integer number;
    private String name;
    private Integer age;
    private Integer classNo;
    private Integer score;

    public Students() {
    }

    public Students(Integer number, String name, Integer age, Integer classNo, Integer score) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.classNo = classNo;
        this.score = score;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classNo=" + classNo +
                ", score=" + score +
                '}';
    }
}
