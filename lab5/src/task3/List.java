package task3;

public class List implements MyCollectoin {
	int a[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int size = 0;
    @Override
    public void push(int x) {
        a[size] = x;
        size++;
    }

    @Override
    public void delete(int x) {
        if (contains(x)) {
            for(int i = 0; i < a.length; i++) {
                if (a[i] == x) {
                    a[i] = 0;
                    break;
                }
            }
        }
    }

    @Override
    public void deleteNth(int n) {
        a[n - 1] = 0;
    }

    @Override
    public boolean contains(int x) {
        for(int i = 0; i < a.length; i++) {
            if (a[i] == x) return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

}
