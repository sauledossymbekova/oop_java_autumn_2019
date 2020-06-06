package task4;

public class Main {

	public static void main(String[] args) {
		int a[] = {0, 9, 10, 15, -2, -6};
        MinMax m = new MinMax();
        MinMax.Pair p = m.minmax(a);
        System.out.println(p.toString());
	}

}