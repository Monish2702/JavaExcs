// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
package Programs.QuestionsSolved;

import java.util.Scanner;

public class StudentRollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll no: ");
        int roll_no = sc.nextInt();
        Student student = new Student(name, roll_no);
        System.out.println("Name: " + student.getName());
        System.out.println("Roll no: " + student.getRollNo());
        sc.close();
    }
}

class Student {
    private String name;
    private int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return roll_no;
    }
}
