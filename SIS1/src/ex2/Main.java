package ex2;
import lab2.Student;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Saule", 1);
		Student s1 = new Student("VVV", 2);
		Student s3 = new Student("ASA", 3);
		Course c = new Course("Saule");
		GradeBook gr = new GradeBook(c);
		gr.displayMessage();
		
		gr.adddGrade(s3, 90);
		gr.adddGrade(s, 100);
		gr.adddGrade(s1, 100);
		
		
		System.out.println("Average:" + gr.determineClassAverage());
		System.out.println("Min" + gr.getMin());
		System.out.println("Min" + gr.getMin());
		gr.outputBarChart();
		System.out.println(" ");

	}

}
