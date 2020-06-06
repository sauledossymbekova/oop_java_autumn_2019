package task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Saule", 1);
		Student s1 = new Student("VVV", 2);
		Course c = new Course("Saule");
		GradeBook gr = new GradeBook(c);
		gr.displayMessage();
		gr.addGrade( s, 100);
		gr.addGrade( s1, 100);
		gr.determineClassAverage();
		gr.outputBarChart();
		System.out.println(gr.getMin());
		
	}

}
