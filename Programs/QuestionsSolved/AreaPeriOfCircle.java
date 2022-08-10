//Find the perimeter and area of a circle given a value of radius.
//You should use Math.PI constant in your program. If radius is zero or less than zero 
//then print " please enter non zero positive number 
package Programs.QuestionsSolved;

import java.util.Scanner;

public class AreaPeriOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter;
        double area;
        // Calculate the perimeter
        // Calculate the area
        if (radius != 0) {
            perimeter = 2 * Math.PI * radius;
            area = Math.PI * radius * radius;
            System.out.println(perimeter);
            System.out.print(area);
        }

        else {
            System.out.println("please enter non zero positive number");
        }
        s.close();
    }
}