package task1b;

public class Student {
    private int score;
    public Student(int score) {
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
