package labs.OOP.Calculator;

public class CalculatorService {

    private final Calculator myCalculator = new Calculator();

    public void myCalcFunc()
    {
        myCalculator.add(5, 5);
        myCalculator.add(5.5, 5.5);
    }
}
