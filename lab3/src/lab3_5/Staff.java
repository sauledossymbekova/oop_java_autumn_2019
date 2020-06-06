package lab3_5;

public class Staff extends Person{
	String school;
    double pay;
    Staff(String name, String address, String school, double pay) {
      super(name, address);
      this.school = school;
      this.pay = pay;
      
    }
     
    String getSchool(){
      return school;
    }
    
    double getPay(){
      return pay;
    }
    
    void setPay(double pay){
      this.pay = pay;
    }
    
    void setSchool(String school){
      this.school = school;
    }
    
    public String toString(){
      return "name:" + name + "\n" + "address:" + address + "\n" +  "school: " +  school + " \n" + " pay: " + pay;
    }
}
