package lab3_3;

public class Person {
    protected String name;
    protected String insuranceNumber;
    public Person() {
    }
    public Person(String name, String insuranceNumber) {
        this.name = name;
        this.insuranceNumber = insuranceNumber;
    }
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return p.name.equals(this.name) && p.insuranceNumber.equals(this.insuranceNumber);
    }
}
