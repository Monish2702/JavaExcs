// Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
// Name        Year of joining        Address
// Robert            1994                64C- WallsStreat
// Sam               2000                68D- WallsStreat
// John              1999                26B- WallsStreat
package Programs.QuestionsSolved;
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, "26B- WallsStreat");
        System.out.println("Name        Year of joining        Address");
        System.out.println(emp1.getName() + "         " + emp1.getYear() + "             " + emp1.getAddress());
        System.out.println(emp2.getName() + "            " + emp2.getYear() + "             " + emp2.getAddress());
        System.out.println(emp3.getName() + "           " + emp3.getYear() + "             " + emp3.getAddress());
    }
}

class Employee{
    private String name;
    private int yearOfJoining;
    private String address;

    Employee(String name, int yearOfJoining,String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Year of joining: "+yearOfJoining);
        System.out.println("Address: "+address);
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return yearOfJoining;
    }
    public String getAddress(){
        return address;
    }

}