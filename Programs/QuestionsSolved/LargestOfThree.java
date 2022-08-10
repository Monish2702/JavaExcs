// find the largest among three numbers x,y, and z.
//  You should use if-then-else construct in Java
package QuestionsSolved;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        if (x > y) {
            if (x > z)
                System.out.print(x);
            else
                System.out.print(z);
        } else if (y > z)
            System.out.print(y);
        else
            System.out.print(z);
        s.close();
    }
}
