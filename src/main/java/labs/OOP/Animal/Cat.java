package labs.OOP.Animal;

public class Cat extends Animal{
    private String name;

    public Cat (String type, String name) {
        super(type);
        this.name = name;
    }

    @Override
    public void sound() {
        super.sound();
        IO.println("[" + getType() + "]" + " " + getName() + ": Meow!");
    }

    public String getName() {
        return name;
    }
}
