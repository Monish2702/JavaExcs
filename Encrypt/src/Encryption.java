import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Encryption {
    private Scanner cin;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private char[] letters;
    private char[] secretLetters;
    Encryption() {
        cin = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<Character>();
        shuffledList = new ArrayList<Character>();
        character = ' ';

        newKey();
        askChoice();
    }

    private void askChoice() {
        System.out.println("\n1.Encrypt\n2.Decrypt\n3.Generate new key\n4.Get key\n5.Exit");
        System.out.print("\nEnter your choice: ");
        int choice = cin.nextInt();
        switch (choice) {
            case 1:
                encrypt();
                break;
            case 2:
                decrypt();
                break;
            case 3:
                newKey();
                break;
            case 4:
                getKey();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("\nInvalid choice!");
                askChoice();
        }
    }
    private void newKey() {
        character = ' ';
        list.clear();
        shuffledList.clear();

        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }
        
        shuffledList = new ArrayList(list);
        Collections.shuffle(shuffledList); 
    }
    private void getKey(){
        //now here
        System.out.println("\nThe key is: ");
        for(Character c : list){
            System.out.print(c);
        }
        System.out.println();
        for(Character c : shuffledList){
            System.out.print(c);
        }
        System.out.println();
    }
    private void encrypt() {
        System.out.println("\nEnter the message to be encrypted: ");
        String message = cin.nextLine();
        letters = message.toCharArray();
        System.out.println("\nThe encrypted message is: ");
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }
        for(char c : letters){
            System.out.print(c);
        }
        System.out.println();
        askChoice();
    }

    private void decrypt() {
    }

    private void exit() {
    }
}