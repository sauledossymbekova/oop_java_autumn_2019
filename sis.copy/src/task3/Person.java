package task3;

public class Person {
	private Gender g;
    public Person(char c) {
        if (c == 'B') g = Gender.B;
        else g = Gender.G;
    }
    public String toString() {
        if (g == Gender.B) return "B";
        else return "G";
    }
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.g == p.g;
    }
}

enum Gender{
    B,
    G
}

