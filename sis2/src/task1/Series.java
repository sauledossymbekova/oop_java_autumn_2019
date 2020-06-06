package task1;

public class Series extends Circuit{
	double r,v;
	public Series(Circuit a, Circuit b) {
		r = a.getResistance()+b.getResistance();
		v = a.getPotentialDifference()+b.getPotentialDifference();
	}
	@Override
	public double getResistance() {
		return r;
	}
	@Override
	public double getPotentialDifference() {
		return v;
	}
	@Override
	public void applyPotentialDifference(double v) {
		this.v = v;
	}
}
