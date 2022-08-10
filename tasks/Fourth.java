package tasks;

import java.lang.ArithmeticException;
import java.util.Scanner;

public class Fourth {
    // fibonacci series using recursion
    public static void main(String[] args) {
        int length;
        int n1 = 0, n2 = 1;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter length of fibonacci series: ");
        length = cin.nextInt();
        System.out.println("The fibonacci series is: ");
        if (length > 2) {
            System.out.print(n1 + " , " + n2 + " , ");
            fibonacci(length - 2, n1, n2);
        } else if (length == 2) {
            System.out.println(n1 + " , " + n2);
        } else if (length == 1) {
            System.out.println(n1);
        } else {
            System.out.println("~~~Nothing to print~~~");
        }
        System.out.println();
        cin.close();
    }

    static void fibonacci(int length, int n1, int n2) {
        int n3 = n1 + n2;
        if (n3 <= Integer.MAX_VALUE && n3>0) {
            if (length == 0) {
                return;
            }
            System.out.print(n3 + " , ");
            n1 = n2;
            n2 = n3;
            fibonacci(length - 1, n1, n2);
        }
        else{
            throw new ArithmeticException("Integer Overflow!");
        }
    }
}
