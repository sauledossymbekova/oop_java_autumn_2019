package task3;
//import java.util.Collection;

public interface MyCollectoin { //unsorted and contains duplicates
	void push(int x);
    void delete(int x);
    void deleteNth(int n);
    boolean contains(int x);
    boolean isEmpty();
    int size();
}
