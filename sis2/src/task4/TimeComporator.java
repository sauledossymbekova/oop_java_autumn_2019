package task4;

import java.util.Comparator;

public class TimeComporator implements Comparator<Time>{
	 public int compare(Time t1, Time t) {
	        if (t1.hour == t.hour) {
	            if (t1.minute == t.minute) {
	                if (t1.second > t.second) return 1;
	                else if (t1.second == t.second) return 0;
	                return -1;
	            }
	            else if (t1.minute > t.minute) return 1;
	            return -1;
	        }
	        if (t1.hour > t.hour) return 1;
	        return -1;
	    }

}
