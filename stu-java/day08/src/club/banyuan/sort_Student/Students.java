package club.banyuan.sort_Student;


public class Students implements Comparable{

    private Integer id;
    private String name;
    private Double Score;

    public Students() {
    }

    public Students(Integer id, String name, Double score) {
        this.id = id;
        this.name = name;
        Score = score;
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

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int number1 =  (int)(((Students) o).getScore() - this.getScore());
        return number1==0 ? (((Students) o).getId() - this.getId()) : number1;
    }
}
