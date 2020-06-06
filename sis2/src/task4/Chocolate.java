package task4;

public class Chocolate implements Comparable{
	private double weight;
    private String name;
    public Chocolate(double w, String n) {
        name = n;
        weight = w;
    }
	@Override
	public int compareTo(Object o) {
		Chocolate c = (Chocolate)o;
        if (c.weight == this.weight) return 0;
        if (c.weight > this.weight) return -1;
        else return 1;
	}
}
