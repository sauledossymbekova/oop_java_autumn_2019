package task2;

public class Employee implements Comparable {
	String name;
    Integer salary;
    public Employee() {

    }
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
    	
        return this.salary.compareTo(((Employee) o).salary);
    }

}
