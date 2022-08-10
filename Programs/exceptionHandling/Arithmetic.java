package Programs.exceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = 1;
            int b;
            System.out.println("Enter b: ");
            b = sc.nextInt();
            sc.nextLine();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
        catch (InputMismatchException e) {
            System.out.println("Input mismatch");
        }
        catch (Exception e) {
            System.out.println("Some Exception occured");
        }
        // finally {
        //     System.out.println("Always executed");
        // }

        try {// string out of bounds exception
            String s = "Hello";
            System.out.println("\"Hello\" Enter index: ");
            int index = sc.nextInt();
            System.out.println(s.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds");

        }
        catch (InputMismatchException e) {
            System.out.println("Input mismatch");
        }
        sc.close();
    }
}
