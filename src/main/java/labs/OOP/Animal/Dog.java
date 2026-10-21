package labs.OOP.Animal;

public class Dog extends Animal{
    private String name;

    public Dog (String type, String name) {
        super(type);
        this.name = name;
    }

    @Override
    public void sound() {
        super.sound();
        IO.println("[" + getType() + "]" + " " + getName() + ": Bark!");
    }

    public String getName() {
        return name;
    }
}
