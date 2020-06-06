package lab3_3;

public class Employee extends Person {
    private double salary;
    private int year;
    public Employee() {
    }
    public Employee(String name, String insuranceNumber, int year, double salary) {
        super(name, insuranceNumber);
        this.year = year;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.year + " " + this.salary;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ok = super.equals(obj);
        if (ok) {
            if (!(obj instanceof Employee)) return false;
            Employee e = (Employee) obj;
            return this.salary == e.salary && this.year == e.year;
        }
        return false;
    }
}
