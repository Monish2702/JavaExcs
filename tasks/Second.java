package tasks;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        String para="";
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()){

            para +=cin.nextLine();
        }
        // count number of characters in the line excluding newline character
        int count = para.length();
        System.out.println("\nThe number of characters in the line is: " + count);
        System.out.println("The line you entered is:\n"+para);
        cin.close();
    }
}