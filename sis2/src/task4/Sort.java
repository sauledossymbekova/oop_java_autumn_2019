package task4;
import java.util.Comparator;
public class Sort {
	static <E> void  swap(E [] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    static <E extends Comparable<E>> void bubbleSort(E[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (array[j].compareTo(array[i]) == 1 && j < i) {
                    swap(array, i, j);
                }
    }

}
