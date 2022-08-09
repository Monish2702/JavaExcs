// Complete the code segment to help Ragav ,
//  find the highest mark and average mark secured by him in "s" number of subjects.
package QuestionsSolved;

import java.util.Scanner;

public class AvgAndHighestMark {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double mark_avg;
            int result;
            int i;
            int s;
            // define size of array
            s = input.nextInt();
            // The array is defined "arr" and inserted marks into it.
            int[] arr = new int[s];
            for (i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int max = 0;
            mark_avg = 0;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
                mark_avg += arr[i];
            }
            result = max;
            mark_avg /= arr.length;

            System.out.println(result);
            System.out.print(mark_avg);
            input.close();
        }
    }
}
