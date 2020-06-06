package task2;

public class Manager extends Employee implements Comparable {
	double bonus;
    public Manager() {
    }
    public Manager(String name, int salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
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

}
