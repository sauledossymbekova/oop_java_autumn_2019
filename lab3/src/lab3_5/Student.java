package lab3_5;

public class Student extends Person {
	String program;
    int year;
    double fee;
    
    Student(String name, String address, String program, int year, double fee) {
      super(name, address);
      this.year =year;
      this.program = program;
      this.fee = fee;
    }
    
    public String getProgram(){
      return program;
    }
    
    public int getYear(){
      return year;
    }
    
    public double getFee(){
      return fee;
    }
    public void setProgram(String program){
      this.name = program;
    }
    public void setFee(double fee){
      this.fee = fee;
    }
    public void setYear(int year){
      this.year = year;
    }
    
    public String toString(){
      return "name: " + name + "\n" + " address: " + address + " program: " + program + "\n" + "year: " + year + "\n" + "fee: " +fee;
    }
}
