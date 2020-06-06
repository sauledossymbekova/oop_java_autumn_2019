package lab3_5;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Vector<Person> v = new Vector<Person>();
        
        v.add(new Student ("Lay", "Katayeva 53", "high", 10, 3.5));
        v.add(new Staff ("ms Swift", "Kamzina 68", "NIS", 256000 ));
        v.add(new Student ("Tom", "Bekturova 33", "high", 11, 4.5));
        
        for(int i = 0; i<v.size(); i++);
          System.out.println((v.elementAt(0)).toString());
          System.out.println("\n");
          System.out.println((v.elementAt(1)).toString());
          System.out.println("\n");
          System.out.println((v.elementAt(2)).toString());
      }
	
}
