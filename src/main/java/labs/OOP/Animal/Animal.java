package labs.OOP.Animal;

public class Animal {
    private String type;

    public Animal (String type) {
        this.type = type.toLowerCase();
    }

    public void sound() {}

    public String getType() { return type; }
}
