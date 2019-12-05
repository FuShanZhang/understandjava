public class Rectangle {
    private Double rLong;
    private Double rWidth;

    public Rectangle() {
    }

    public Rectangle(Double rLong, Double rWidth) {
        this.rLong = rLong;
        this.rWidth = rWidth;
    }

    public double getrLong() {
        return rLong;
    }

    public void setrLong(Double rLong) {
        this.rLong = rLong;
    }

    public double getrWidth() {
        return rWidth;
    }

    public void setrWidth(Double rWidth) {
        this.rWidth = rWidth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "rLong=" + rLong +
                ", rWidth=" + rWidth +
                '}';
    }

    public Double area(Double a , Double b){
        return a*b;
    }


}

