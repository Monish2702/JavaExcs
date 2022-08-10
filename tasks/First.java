package tasks;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a Line: ");
        String s = cin.nextLine();
        System.out.println("The line you entered is:\n"+s);
        cin.close();
    }
}
