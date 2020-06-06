package ex2;

import java.util.ArrayList;
import java.util.HashMap;

import lab2.Student;
public class GradeBook {
	
	Course course;
	ArrayList<Student> students;
	HashMap<Student, Integer> grades;
	
	public GradeBook(Course c){
		course = c;
		students = new ArrayList<Student>();
		grades = new HashMap<Student, Integer>();
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + course.toString() + "!");
        System.out.println("Please, input the grades for students:");
	}
	
	public void adddGrade(Student s, int grade) {
		students.add(s);
		grades.put(s, grade);
	}
	
	public double determineClassAverage() {
		int sum = 0;
		for(int i = 0; i< students.size(); i++) {
			sum += grades.get(students.get(i));
		}
		return sum * 1.0 / students.size();
	}
	
	public void outputBarChart() {
		System.out.println("Grades distribution:");
		int count[] = new int [11];
		
		for (int i = 0; i< 11; i++) count[i] =0;
		
		for (int i=0; i< students.size(); i++) {
			int temp = grades.get(students.get(i));
			count [temp /10]++;
		}
		
		for (int i=0; i< 10; i++) {
			
			System.out.print(String.format("%d0-%d9:", i, i));
			
			while(count[i]>0) {
				System.out.print('*');
				count[i]--;
			}
			System.out.println();
		}
		System.out.print("100: ");
		while(count[10]> 0){
			System.out.print('*');
			count[10]--;
		}
	}
	public Student getMin() {
        int min = 100;
        Student s = null;
        for(int i = 0; i < students.size(); i++) {
            int temp = grades.get(students.get(i));
            if (temp <= min) {
                min = temp;
                s = students.get(i);
            }
        }
        return s;
    }
	public Student getMax() {
        int min = 100;
        Student s = null;
        for(int i = 0; i < students.size(); i++) {
            int temp = grades.get(students.get(i));
            if (temp >= min) {
                min = temp;
                s = students.get(i);
            }
        }
        return s;
    }
}
