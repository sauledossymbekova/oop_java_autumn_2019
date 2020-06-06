package lab3_3;

import java.util.Vector;


public class Main {

	public static void main(String[] args) {

		Vector<Person> v = new Vector<Person>();
        v.add(new Person ("Lay", "Katayeva 53"));
        v.add(new Employee ("ms Swift", "Kamzina 68", 21, 70000.0 ));
        v.add(new Manager ( 4.5));
        
        for(int i = 0; i<v.size(); i++);
          System.out.println((v.elementAt(0)).toString());
          System.out.println("\n");
          System.out.println((v.elementAt(1)).toString());
          System.out.println("\n");
          System.out.println((v.elementAt(2)).toString());
	}

}
