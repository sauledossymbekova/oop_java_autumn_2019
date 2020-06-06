package lab3_1;

public class Cat extends Animal {
    public Cat() {
        super();
    }
    public Cat(String name, String sound, int legs) {
        super(name, sound, legs);
    }

    @Override
    public String getSound() {
        return super.getSound();
    }

    public String getSound(String danger) {
        if (danger.equals("Dog")) {
            return "Myaaaaaaaaaaau";
        }
        else {
            return "Myau";
        }
    }
}
