public class Square extends Rectangle{

    public Square() {
    }

    public Square(String color, boolean filled, double width, double lenght) {
        super(color, filled, width, lenght);
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}