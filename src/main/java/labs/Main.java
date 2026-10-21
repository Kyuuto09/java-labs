package labs;

import labs.OOP.Animal.AnimalService;
import labs.OOP.Calculator.CalculatorService;
import labs.OOP.Car.CarService;
import labs.OOP.Person.PersonService;
import labs.OOP.Rectangle.RectangleService;

public class Main {

    static void main(String[] args) {
        CarService carService = new CarService();
        CalculatorService myCalculator = new CalculatorService();
        PersonService person = new PersonService();
        RectangleService myRectangle = new RectangleService();
        AnimalService myAnimal = new AnimalService();

        carService.myCarFunc();
        IO.println("---------");
        myCalculator.myCalcFunc();
        IO.println("---------");
        person.personFunc();
        IO.println("---------");
        myRectangle.myRectangleFunc();
        IO.println("---------");
        myAnimal.myAnimalFunc();
    }
}