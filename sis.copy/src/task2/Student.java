package task2;

public class Student {
	private String name;
    private int id;
    private int yearOfStudy;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Student %s, id: %d", this.name, this.id);
    }

}
