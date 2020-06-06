package task2;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("/Macintosh HD⁩/Users⁩/sauledosymbekova⁩/⁨Documents⁩/⁨workspace⁩/⁨lab4/src/⁩task2/admin.txt");
        FileReader fr = new FileReader(f);
        String username = "", password = "";
        try{
            BufferedReader br = new BufferedReader(fr);
            username = br.readLine().split(" ")[1];
            password = br.readLine().split(" ")[1];
        }
        catch (IOException e) {

        }
        System.out.println(username);
        System.out.println(password);
        boolean admin = username.equals("admin") && password.equals("admin");
    }
}
