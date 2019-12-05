public class Cuboid extends Rectangle {
    private Double cHigh;

    public Cuboid() {
    }

    public Cuboid(Double rLong, Double rWidth, Double cHigh) {
        super(rLong, rWidth);
        this.cHigh = cHigh;
    }

    public Double getcHigh() {
        return cHigh;
    }

    public void setcHigh(Double cHigh) {
        this.cHigh = cHigh;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "cHigh=" + cHigh +
                '}';
    }

    public double volume(double rLong , double rWidth , double cHigh){
        return rLong*rWidth*cHigh;
    }
}
