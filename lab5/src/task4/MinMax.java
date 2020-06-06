package task4;

public class MinMax {
	
	static class Pair{
        int a, b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public String toString() {
            return a + " " + b;
        }
}
    static Pair minmax(int values[]) {
        int max = 0;
        int min = 10000000;
        for(int i = 0; i < values.length; i++) {
            max = Math.max(max, values[i]);
            min = Math.min(min, values[i]);
        }
        return new Pair(max, min);
    }

}
