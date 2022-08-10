// Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.

// Example:
// Input: n = 5
// -------
// 0 2 4 6 8
// Even number divisible by 3:0 6
//sum:6

package Programs.QuestionsSolved;
import java.util.Scanner;
public class SumOfNosDivisibleBy3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
      for(int i=0;i<n*2;i++)
{
  if(i%2==0 && i%3==0)
      sum+=i;
}
System.out.print(sum);
sc.close();
}
}