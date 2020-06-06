package task2;
import java.util.ArrayList;
public class Course {
    private String name;
    private String description;
    private int credits;
    private ArrayList<Course> prerequisites;
    public Course(String name) {
        this.name = name;
        this.description = "This is the important in your future life";
        this.credits = 3;
        prerequisites = new ArrayList<Course>();
    }
    public String toString() {
        return this.name;
    }

}
