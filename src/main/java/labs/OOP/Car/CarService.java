package labs.OOP.Car;

public class CarService {

    private final Car myCar = new Car("Audi", "Q8", 2026);

    public void myCarFunc() {
        myCar.getCarInfo();
        myCar.start();
        myCar.getCarInfo();
        myCar.stop();
    }
}
