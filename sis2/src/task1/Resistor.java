package task1;

public class Resistor extends Circuit  {
	double resistance;
	double v;
	public Resistor(double a) {
		resistance = a;
		v=10;
	}
	public void setResistance(double a){
		resistance= a;
		
	}
	public String toString() {
		return resistance + "Ohms";
	}
	@Override
	public double getResistance() {
		return resistance;
	}
	@Override
	public double getPotentialDifference() {
		return v;
	}
	@Override
	public void applyPotentialDifference(double v) {
		this.v=v;
	}
	
	
}
