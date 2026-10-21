package labs.OOP.Rectangle;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void calculatePerimeter() {
        IO.println("Perimeter: " + ((length*2) + (width*2)));
    }

    public void calculateArea() {
        IO.println("Perimeter: " + (length*width));
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
