// Write a program by creating an 'Employee' class having the following methods and print the final salary.
// 1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
// 2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
// 3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
package QuestionsSolved;
import java.util.Scanner;

public class EmpSalary {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary of the employee: ");
        float salary = sc.nextFloat();
        System.out.println("Enter the number of hours of work per day of employee: ");
        int hours = sc.nextInt();
        emp.getInfo(salary, hours);
        emp.printSalary();
        sc.close();
    }

}

class Employee {
    private float salary;
    private int no_of_hours;

    void getInfo(float salary, int no_of_hours) {
        this.salary = salary;
        this.no_of_hours = no_of_hours;

        if (this.salary < 500) {
            AddSal();
        }
        if (this.no_of_hours > 6) {
            AddWork();
        }
    }

    void AddSal() {
        salary = salary + 10;
    }

    void AddWork() {
        salary = salary + 5;
    }

    void printSalary() {
        System.out.println("Updated Salary: " + salary);
    }
    
}
