package task3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Vector;
import java.util.*;
public class Test {
	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
	    
	    Vector<Employee> employees = new Vector<Employee>(); 
	    employees.add(new Employee("Luis",250000, Date("25-12-2018"),"15698" ));
	    employees.add(new Employee("Sam", 185000, Date("16-08-2019"), "165478"));
	    employees.add(new Employee("Alice", 468900, Date("14-06-2016"), "5478"));
	    
	    //For clone
	    Employee e1 = new Employee("John", 360000, Date("28-04-2019"), "65782");
	    Employee e2 = (Employee) e1.clone();
	    
	    Manager m1 = new Manager("Johana", 415980, Date("19-05-2017"), "48", 25000);
	    Manager m2 = (Manager)m1.clone();
	    
	    
	    
	    Vector<Manager> managers = new Vector <Manager>();
	    managers.add(new Manager("Luna", 260000,  Date("19-12-2017"), "25", 18000));
	    managers.add(new Manager("Nick", 312000,  Date("03-08-2018"), "36", 12000));
	    managers.add(new Manager("Hannah", 15240, Date("13-10-2018"), "42", 3000));
	    
			 for(Employee e: employees) {
				 System.out.println(e.toString());
			 }
			 
			 Collections.sort(employees, new NameComparator());
			 System.err.println("Sorting by name...");
			 
			 for(Employee e: employees) {
				 System.out.println(e.toString());
			 }
			 System.out.println("\n");
			 
			 for(Employee m: managers) {
				 System.out.println(m.toString());
			 }
			 
			 Collections.sort(managers, new HireDateComparator());
			 System.err.println("Sorting by hireDate...");
			 
			 for(Employee m: managers) {
				 System.out.println(m.toString());
			 }
			 
			 System.out.println("\n");
			 System.out.println(e1);
			 System.err.println("Making a clone e2 of employee e1...");
			 System.out.println(e2);
			 
			 System.out.println("\n");
			 System.out.println(m1);
			 System.err.println("Making a clone m2 of manager m1...");
			 System.out.println(m2);
		 }
		 public static java.util.Date Date(String string) throws ParseException {
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			    Date date = formatter.parse(string);
			//    System.out.println(formatter.format(date));
				return date;
			}
		
}
