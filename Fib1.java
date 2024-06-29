import java.util.Scanner;

public class Fib1 {
   public static void main(String[] args){
      int n, i, sum;
     
      Scanner my_scanner = new Scanner(System.in);
      
      System.out.println("Enter the value of N: ");
      n = my_scanner.nextInt();
      int fabonacci[] = new int[2 * n + 1];
      fabonacci[0] = 0;
      fabonacci[1] = 1;
      sum = 0;
      for (i = 2; i <= 2 * n; i++) {
         fabonacci[i] = fabonacci[i - 1] + fabonacci[i - 2];
	  
         if (i % 2 == 0)
	    System.out.println(fabonacci[i]);
            sum += fabonacci[i];
	
      }

	System.out.println();
      System.out.printf("Even sum of fibonacci series till number %d is %d" , n, sum);
   }
}