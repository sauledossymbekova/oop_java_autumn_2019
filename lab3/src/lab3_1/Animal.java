package lab3_1;

public class Animal {
    private String sound;
    private String name;
    private int amountOfLegs;
    public Animal() {
        this.sound = "";
        this.name = "";
        this.amountOfLegs = 0;
    }
    public Animal(String name, String sound, int amountOfLegs) {
        this.name = name;
        this.sound = sound;
        this.amountOfLegs = amountOfLegs;
    }

    public String getSound() {
        return sound;
    }
}
/*Create class Animal and a derived class of Animal at your choice (Cat, dog, crocodile, etc...). In a subclass (or derived class) demonstrate :
§ the methods overriding and overloading of the base class methods.
§ The use of super() keyword with and without parameters.*/