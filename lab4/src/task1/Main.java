package task1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {


        
        Vector<Student> students = new Vector<Student>();
  
        int maxGrade = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
            String line = br.readLine();
            while(line != null) {
                String[] sp = line.split(" ");
                int grade = Integer.parseInt(sp[2]);
                maxGrade = Math.max(maxGrade, grade);
                students.add(new Student(sp[0] + " " + sp[1], grade));
                line = br.readLine();
            }
        }
        catch(IOException e) {

        }
        File fw = new File("grades.txt");
        FileWriter w = new FileWriter(fw);
        for(int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            String line = (i + 1) + ") " + s.name + " - " + s.getGrade(maxGrade) + '\n';
            w.write(line);
            w.flush();
        }
    }
}
