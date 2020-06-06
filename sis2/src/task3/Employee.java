package task3;
import java.util.Date;
public class Employee implements Comparable, Cloneable {
	String name;
    Integer salary;
	public Date hireDate;
	String insuranceNumber;

    
    public Employee() {
    }
    public Employee(String name, int salary, Date hireDate, String insuranceNumber) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
    }
    
    public Object clone() throws CloneNotSupportedException {
		Employee clone = (Employee)super.clone();
		clone.hireDate = (Date) this.hireDate.clone();
		return clone;
	}   
    
    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
    	
        return this.salary.compareTo(((Employee) o).salary);
    }
    
    public String toString() {
		return "name" + name + " salary - " + salary + " hireDate - " + hireDate;
		
	}
    public String getName() {
    	return this.name;
    }
    public double getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Date getHireDate() {
		return (Date) hireDate;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
}
