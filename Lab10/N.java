/* April 27, 2020
  Author: Patrick Hynes
  CMPT 220 –Software Development
  Lab 10  */

/* Sum numbers from 1 to N in a recursive manner */

  import java.util.*;

  public class N {
    static int runningSum = 0; // initialize the runningSum

    public static void main(String[] args) {
      /* This first part of the main method we will prove the first formula:
                  Sum(N)= 1 + 2 + 3 + ... + N                        */
      System.out.println("Please enter value for N: ");
      Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      for (int i = 1; i <= N; i++)
        runningSum = recursiveAdd(i);
      System.out.println(runningSum);

      /* Resetting the runningSum so we can prove the second formula */
      runningSum = 0;

      /* This second part of the main method we will prove the second formula:
                  Sum(N) = Sum(N-1) + N                             */
      for (int i = 1; i <= N-1; i++)
        runningSum = recursiveAdd(i);
      
      runningSum = runningSum + N;
      System.out.println(runningSum);                             
    }

    public static int recursiveAdd(int num) {
      return runningSum + num;                                 
    }
  }