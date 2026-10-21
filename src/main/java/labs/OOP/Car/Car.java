package labs.OOP.Car;

enum EngineStatus {
    ACTIVATED,
    OFF
}

public class Car {
    private String make;
    private String model;
    private int year;
    private EngineStatus engineStatus = EngineStatus.OFF;

    // -- Constructor --
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // -- Members --
    public void getCarInfo() {
        IO.println("Make: " + getMake() + " | Model: " + getModel() + " | Year: " + getYear() + " | ENGINE: " + engineStatus);
    }

    public void start() {
        engineStatus = EngineStatus.ACTIVATED;
        IO.println("[" + getMake() + " " + getModel() + "]" + " is starting.");
    }

    public void stop() {
        engineStatus = EngineStatus.OFF;
        IO.println("[" + getMake() + " " + getModel() + "]" + " is stopping.");
    }

    // -- getters --
    public String getMake() { return make; }

    public String getModel() { return model; }

    public int getYear() { return year; }
}
