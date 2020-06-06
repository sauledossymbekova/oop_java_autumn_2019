package lab2;

public class Student {
	private String name;
	private int id;
	private int yearOfStudy;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.yearOfStudy = 1;
	}
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public int getYearOfStudy() {
		return this.yearOfStudy;
	}
	public String toString() {
		return String.format("Student: %s, id: %d .", this.name, this.id);
}
}
