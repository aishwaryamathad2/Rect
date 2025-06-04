package Rect;

public class RectangleArea {
    double length;
    double breadth;

    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}
