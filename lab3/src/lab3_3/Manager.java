package lab3_3;

import java.util.Vector;

public class Manager extends Employee {
    Vector<Employee> employees;
    double bonus;
    public Manager(double bonus) {
        employees = new Vector<Employee>();
        this.bonus = bonus;
    }
    public String toString() {
        return super.toString() + " " + bonus;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ok = super.equals(obj);
        if (!ok) {
            return false;
        }
        if (!(obj instanceof Manager)) return false;
        Manager m = (Manager) obj;
        return this.bonus == m.bonus && this.employees.equals(m.employees);
    }
}
