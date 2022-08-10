package tasks;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                i++;
                continue;
            }
            int j = i + 1;
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }
            System.out.println(s.substring(i, j));
            i = j;
        }
        cin.close();
    }
}
