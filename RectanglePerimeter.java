package Rect;

public class RectanglePerimeter {
    double length;
    double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        RectangleArea area = new RectangleArea(10, 5);
        RectanglePerimeter perimeter = new RectanglePerimeter(10, 5);

        System.out.println("Rectangle Area: " + area.calculateArea());
        System.out.println("Rectangle Perimeter: " + perimeter.calculatePerimeter());
    }
}
