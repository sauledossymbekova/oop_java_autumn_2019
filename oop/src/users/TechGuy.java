package users;

import java.lang.*;

/**
 */
public class TechGuy extends user {
    /**
     */
    private static Queue<String> orders;

    /**
     */
    private String currentOrder;

    /**
     */
    private int ordersDone;

    /**
     * @param order 
     * @return 
     */
    public boolean receiveOrder(String order) {
        return false;
    }
}

