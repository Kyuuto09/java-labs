package labs.OOP.Animal;

public class AnimalService {
    private final Dog myDog = new Dog("Dog", "Tommy");
    private final Cat myCat = new Cat("Cat", "Lilly");

    public void myAnimalFunc() {
        myDog.sound();
        myCat.sound();
    }
}
