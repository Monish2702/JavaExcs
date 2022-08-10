// Complete the code segment to check whether the number is an Armstrong number or not.
package Programs.QuestionsSolved;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int temp = n, output = 0, digit = 0;

        while (temp != 0) {
            temp /= 10;
            digit++;
        }
        temp = n;
        while (temp != 0) {
            int quotient = temp % 10, q;
            q = quotient;
            temp /= 10;
            for (int i = 2; i <= digit; i++) {
                quotient *= q;
            }
            output += quotient;
        }

        if (output == n)
            result = 1;
        System.out.print(result);
        sc.close();
    }
}