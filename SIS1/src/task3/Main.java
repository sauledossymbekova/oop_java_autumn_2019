package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DragonLaunch dr = new DragonLaunch();
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            Person p = new Person(s.charAt(i));
            dr.kidnap(p);
        }
        System.out.println(dr.willDragonEatOrNot());
    }
}

