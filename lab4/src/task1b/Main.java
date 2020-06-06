package task1b;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File f = new File("/Macintosh HD⁩/Users⁩/sauledosymbekova⁩/⁨Documents⁩/⁨workspace⁩/⁨lab4⁩/task1b/scores.txt");
        HashMap<String ,Student> students = new HashMap<String, Student>();
        Reader fr = new FileReader(f);
        int maxGrade = 0, minGrade = 101, sum = 0;
        Vector<String> names = new Vector<String>();
        try{
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null) {
                String[] sp = line.split(" ");
                int grade = Integer.parseInt(sp[2]);
                maxGrade = Math.max(grade, maxGrade);
                minGrade = Math.min(grade, minGrade);
                sum += grade;
                students.put(sp[0] + " " + sp[1], new Student(grade));
                names.add(sp[0] + " " + sp[1]);
                line = br.readLine();
            }
        }
        catch (IOException e) {

        }
        File fw = new File("/Macintosh HD⁩/Users⁩/sauledosymbekova⁩/⁨Documents⁩/⁨workspace⁩/⁨lab4⁩/task1b/grades.txt");
        FileWriter w = new FileWriter(fw);
        for(int i = 0; i < students.size(); i++) {
            String line = (i + 1) + ") " + names.get(i) + " - " + students.get(names.get(i)).getGrade(maxGrade) + '\n';
            System.out.println(line);
            w.write(line);
            w.flush();
        }
        String line = "Maximum - " + maxGrade + '\n';
        w.write(line);
        w.flush();

        line = "Minimum - " + minGrade + '\n';
        w.write(line);
        w.flush();

        line = "Average - " + sum * 1.0 / students.size() + '\n';
        w.write(line);
        w.flush();

    }
}
