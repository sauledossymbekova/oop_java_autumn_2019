package task1;
import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public char getGrade(int maxGrade) {
        if (maxGrade - this.score <= 10) return 'A';
        if (maxGrade - this.score <= 20) return 'B';
        if (maxGrade - this.score <= 30) return 'C';
        if (maxGrade - this.score <= 40) return 'D';
        return 'F';
    }
}