package labs.OOP.Rectangle;

public class RectangleService {

    private final Rectangle myRectangle = new Rectangle(5, 5);

    public void myRectangleFunc() {
        myRectangle.calculateArea();
        myRectangle.calculatePerimeter();
    }

}
