package club.banyuan.sort_fruits;

public class Fruits implements Comparable{
    private String name;

    public Fruits() {
    }

    public Fruits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Fruits)o).getName());
    }
}
