package task1;

public class Temperature {
	private double value;
	private char c;
	  
	  public Temperature(double value, char c){
	    this.value = value;
	    this.c = c;
	  }
	  public Temperature(double value){
	    this.value = value;
	    c= 'C';
	  }
	  public Temperature(char c){
	    this.c = c;
	    value = 0;
	    
	  }
	  public Temperature(){ //DEFAULT
	    value = 0;
	    c ='C';
	  }
	  
	  public double getInC(){
		  if (this.c == 'C') return this.value;
		    else {
		    	this.value = 5 * (this.value - 32)/9;
		    	return this.value;
		    }
		  }
	  public double getInF(){
		  if (this.c == 'F') return this.value;
		  else {
			  this.value = 9 * (this.value / 5) + 32;
			  return this.value;
		  }
	  }
	  
	  public void setValue(double value){
		  this.value = value;
	  }
	  public void setScale(char c){
		  if (c == 'C') {
			  this.value = getInC();
		  }
		  else {
			  this.value = getInF();
		  }
		  this.c = c;
	  }
	  public void setBoth(double value, char c){
	    this.value = value;
	    this.c = c;
	  }
	  public char getScale(){
		  return c;
	  }
}
