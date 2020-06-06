package ex2;

import java.util.ArrayList;
public class Course {
	private String name;
	private String description;
	private int credits;
	private ArrayList<Course> prereq;
	
	public Course(String name) {
		this.name = name;
		this.description = "HI!";
		this.credits = 2;
		prereq = new ArrayList<Course>();

	}
	public String toString() {
		return this.name;
	}

}
