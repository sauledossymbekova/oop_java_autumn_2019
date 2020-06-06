package task3;
import java.util.Comparator;
public class HireDateComparator implements Comparator<Manager>{

	@Override
	public int compare(Manager o1, Manager o2) {
		if(o1.getHireDate().before(o2.getHireDate()))
			return -1;
			else if(o1.getHireDate().after(o2.getHireDate()))
			return 1;
		else return 0;
	}

}
