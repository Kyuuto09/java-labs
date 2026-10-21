package labs;

import labs.OOP.Animal.Cat;
import labs.OOP.Animal.Dog;
import labs.OOP.Calculator;
import labs.OOP.Car;
import labs.OOP.Person;
import labs.OOP.Rectangle;

public class Main {
    static void myCar() {
        Car myCar = new Car("Audi", "Q8", 2026);

        myCar.getCarInfo();
        myCar.start();
        myCar.getCarInfo();
        myCar.stop();
    }

    static void myCalc()
    {
        Calculator myCalculator = new Calculator();

        myCalculator.add(5, 5);
        myCalculator.add(5.5, 5.5);
    }

    static void personClass() {
        Person john = new Person("John", 20);

        john.getPersonInfo();
    }

    static void myRectangle() {
        Rectangle myRectangle = new Rectangle(5, 5);

        myRectangle.calculateArea();
        myRectangle.calculatePerimeter();
    }

    static void myAnimal() {
        Dog myDog = new Dog("Dog", "Tommy");
        Cat myCat = new Cat("Cat", "Lilly");

        myDog.sound();
        myCat.sound();
    }

    static void main(String[] args) {
        myCar();
        IO.println("---------");
        myCalc();
        IO.println("---------");
        personClass();
        IO.println("---------");
        myRectangle();
        IO.println("---------");
        myAnimal();
    }
}