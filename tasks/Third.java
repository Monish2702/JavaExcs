package tasks;

import java.util.Random;

public class Third {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Random r = new Random();
        int array[][][] = new int[4][5][8]; // naalu(4) 5x8 array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 8; k++) {
                    array[i][j][k] = r.nextInt(1000);
                    System.out.print(array[i][j][k] + " ");
                    //max and min values for each element in the array
                    if(array[i][j][k] > max){
                        max = array[i][j][k];
                    }
                    if(array[i][j][k] < min){
                        min = array[i][j][k];
                    }
                }
                System.out.println();
            }
            System.out.println("~"+(i+1)+"~"+"(5x8)\n");
        }
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);

        
    }
}
