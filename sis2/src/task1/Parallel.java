package task1;

public class Parallel extends Circuit {
	double r,v;
	public Parallel(Circuit a, Circuit b) {
		r = (a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance());
		v = a.getPotentialDifference();
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
