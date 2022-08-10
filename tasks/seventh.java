package tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = cin.next();

        // read and print the file content
        try (Scanner reader = new Scanner(new File(fileName))) {
            int lineNo=0;
            while (reader.hasNextLine()) {
                System.out.println((1+lineNo++)+". "+reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        cin.close();
    }
}
