package task3;
import java.util.Date;
public class Manager extends Employee implements Comparable, Cloneable{
	double bonus;
    public Manager() {
    }
    public Manager(String name, int salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
    }
    public Object clone() throws CloneNotSupportedException{
		Manager clone = (Manager)super.clone();
		return clone;
	}
    @Override
    public int compareTo(Object o) {
        if (super.compareTo(o) == 0) {
            Manager m = (Manager) o;
            if (this.bonus > m.bonus) {
                return 1;
            }
            else if (this.bonus < m.bonus) {
                return -1;
            }
            else return 0;
        }
        return super.compareTo(o);
    }
    public double getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String toString() {
		return super.toString() + " bonus - " + bonus;
	}
}

