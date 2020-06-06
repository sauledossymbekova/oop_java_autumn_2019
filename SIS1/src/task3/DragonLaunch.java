package task3;

import java.util.Stack;
import java.util.Vector;

public class DragonLaunch {
    Vector<Person> vp;
    public DragonLaunch() {
        vp = new Vector<Person>();
    }
    public void kidnap(Person p) {
        vp.add(p);
    }
    public boolean willDragonEatOrNot() {
        Stack<Person> st = new Stack<Person>();
        for(int i = 0; i < vp.size(); i++) {
            if (st.isEmpty()) {
                st.push(vp.elementAt(i));
            }
            else if (st.peek().equals(new Person('B')) && vp.elementAt(i).equals(new Person('G'))) {
                st.pop();
            }
            else {
                st.push(vp.elementAt(i));
            }
        }
        return !st.isEmpty();
    }

}
