package tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter source file name: ");
        String sourceFile = cin.next();
        System.out.println("Enter destination file name: ");
        String destinationFile = cin.next();
        File f1 = new File(sourceFile);
        File f2 = new File(destinationFile);
        copyData(f1,f2);
        cin.close();
    }

    public static void copyData(File source, File destination) throws FileNotFoundException{
        FileInputStream inputStream = new FileInputStream (source);  
        FileOutputStream outputStream = new FileOutputStream(destination);
        try{
            int data;
            while((data = inputStream.read()) != -1){
                outputStream.write(data);
            }
        } 
        catch(IOException e){
            System.out.println("Error: " + e);
        }
        finally{
            try{
                inputStream.close();
                outputStream.close();
            }
            catch(IOException e){
                System.out.println("Error: " + e);
            }
        } 
    }
}




// try (FileWriter writer = new FileWriter(sourceFile)) {
//     writer.append("hi hello vanakkam");
//     writer.close();
// } catch (IOException e) {
//     e.printStackTrace();
// }