package models;

public class Floor {
    private double width;
    private double length;

    public Floor() {}

    public Floor(double width, double length) {
        if (width < 0) {
            width = 0d;
        } else {
            this.width = width;
        }
        if (length < 0) {
            length = 0d;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return(width * length);
    }


}
