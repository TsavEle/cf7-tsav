package gr.aueb.cf.lef.ch7;

import java.util.Scanner;

/**
 * Μετατρέπει ένα String σε ακέραιο
 */

public class ParseIntApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert an integer");
        s = in.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);

    }
}
