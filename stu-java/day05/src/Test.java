public class Test {

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        cuboid.setcHigh(10.0);
        cuboid.setrLong(10.0);
        cuboid.setrWidth(10.0);

        double volume = cuboid.volume(cuboid.getrLong(),cuboid.getcHigh(),cuboid.getrWidth());

        double area = cuboid.area(cuboid.getrLong(),cuboid.getrWidth());

        System.out.println(volume);
        System.out.println(area);
    }
}
