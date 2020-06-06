package ex3;

import java.util.Vector;
import java.util.Stack;
import java.util.Scanner;

public class DragonLaunch {
	Vector<Person> v;
	public DragonLaunch(){
		  v =  new Vector<Person>();
	  }
	
	public void kidnap(Person p) {
        v.add(p);
      }
	
	public boolean willDragonEatOrNot() {
        Stack<Person> st = new Stack<Person>();
        for(int i = 0; i < v.size(); i++) {
          if (st.isEmpty()) {
            st.push(v.elementAt(i));
          }
          else if (st.peek().equals(new Person('B')) && v.elementAt(i).equals(new Person('G'))) {
          st.pop();
          }
          else st.push(v.elementAt(i));
        }

        return !st.empty();
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    
	    DragonLaunch dl = new DragonLaunch();
	    
	    for(int i = 0; i < s.length(); i++) {
	    	Person p = new Person(s.charAt(i));
	      dl.kidnap(p);
	    }
	    System.out.print(dl.willDragonEatOrNot());
	    sc.close();
	}
}
