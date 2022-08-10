// Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
// First method named as 'setDim' takes length and breadth of rectangle as parameters 
// and the second method named as 'getArea' returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.

package Programs.QuestionsSolved;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area();
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();
        area.setDim(length, breadth);
        System.out.println("Area of rectangle is: " + area.getArea());
        sc.close();
    }
}

class Area{
    private int length, breadth;
    void setDim(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int getArea(){
        return length * breadth;
    }
}