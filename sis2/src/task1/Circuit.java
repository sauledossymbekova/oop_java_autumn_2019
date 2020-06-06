package task1;

public abstract class Circuit {
	double potentialDifference, current, power;
	public Circuit() {
	}
	public abstract double getResistance();
	public abstract double getPotentialDifference();
	public abstract void applyPotentialDifference(double v);
	
	public double getPower(){	
		power =  getPotentialDifference()*getPotentialDifference() / getResistance();
		return power;
	} 
	public double getCurrent() {
		current= getPotentialDifference()/getResistance();
		return current;
	}	
}
