package lab2_3;

public class Data {
	private double max; //needed 3 type of variable //for maximum
	private double sum; //for general sum
	private int numberOfInput; // is for n 
	
	public Data() {
		this.max = 0; //give them initial value as 0
		this.sum = 0;
		this.numberOfInput = 0;
	}
	public void addToSet(double x) { //
		if (max < x) max = x;
		sum += x;
		numberOfInput++;
	}
	public double Average() {
		return sum / numberOfInput; //formula for average
	}
	public double Largest() {
		return max; //gave max
	}
	/*public String Output() {
		return Largest() + " "+ "\n" + Average(); 
	}*/
}
