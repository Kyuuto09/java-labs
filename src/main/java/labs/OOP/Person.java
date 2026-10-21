package labs.OOP;

public class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getPersonInfo() {
        IO.println("Name: " + getName() + " | Age: " + getAge());
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
