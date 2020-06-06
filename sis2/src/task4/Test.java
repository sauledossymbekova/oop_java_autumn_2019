package task4;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
        Time[] a = new Time [6];
       // Random r = new Random();
        
        for(int i = 0; i < 6; i++) {
            a[i] = new Time(6 - i, 6 - i, 6 - i);
        }
        Sort.bubbleSort(a);
        for(int i = 0; i < 6; i++) {
            System.out.println(a[i].hour + " " + a[i].minute + " " + a[i].second);
        }
    }

}
