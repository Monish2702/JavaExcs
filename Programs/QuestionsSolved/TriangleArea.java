// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
// by creating a class named 'Triangle' without any parameter in its constructor.

// Write a program to print the area and perimeter of a triangle having sides of 5, 5 and 5 units by creating a class named 'Triangle' 
//  with constructor having the three sides as its parameters.

//Let's use constructor overloading and combine the above two questions
package QuestionsSolved;

public class TriangleArea {
    public static void main(String[] args) {
        Area area1 = new Area();
        Area area2 = new Area(5,5,5);
        System.out.println("For default sides: "+ area1.getArea());
        System.out.println("For sides passsed into constructor: "+ area2.getArea());

    }
}

class Area{
    private float side1, side2, side3,perimeter,area;
    Area(){
        side1=3;
        side2=4;
        side3=5;
    }
    Area(float side1, float side2, float side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public float getArea(){
        perimeter = (side1 + side2 + side3) / 2;
        area = (float) Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
        return area;
    }
}